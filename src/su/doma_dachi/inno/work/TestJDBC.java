package su.doma_dachi.inno.work;
import su.doma_dachi.inno.tables.Students;

import java.sql.*;
import java.util.logging.*;
/**
 * Created by User on 16.02.2017.
 */
public class TestJDBC {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://127.0.0.1:5432/Students";
        //Имя пользователя БД
        String name = "postgres";
        //Пароль
        String password = "hH1508985";

        Students student = new Students(url, name, password);

        student.selectStudetns(1);
        student.selectStudetns("proff");
        student.addStudent(6, "petya", 21);
        student.addStudent(7, "vasya", 20);
        student.delStudent(7);
        student.delStudent("petya");

    }
    public static void Select(String url, String name, String password){
        try(Connection connection = DriverManager.getConnection(url, name, password) ){
            Statement query = connection.createStatement();
            ResultSet resultSet = query.executeQuery("Select * from public.users");
            while (resultSet.next()){
                System.out.println("Номер в выборке #" + resultSet.getRow()
                        + "\t Номер в базе #" + resultSet.getInt("id")
                        + "\t" + resultSet.getString("username"));
            }

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            //connection.close();
        }
    }
    public static void preparedStatement(String url, String name, String password){
        try(Connection connection = DriverManager.getConnection(url, name, password) ){
            String sql = "INSERT INTO public.users (id, email, username, password) values(6,'sfdds','sdfsd','sfs')";
            PreparedStatement query = connection.prepareStatement(sql);
            //query.setString(0, "adfs");
           // query.setString(1, 6);
//            query.setString(2, "adfs");
//            query.setString(3, "adfs");
//            query.setString(4, "adfs");
            System.out.println(query.executeUpdate());

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            //connection.close();
        }
    }

}
