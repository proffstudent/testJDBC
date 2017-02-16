package su.doma_dachi.inno.tables;

import java.sql.*;

/**
 * Created by User on 16.02.2017.
 */
public class Students {
    private String url;
    private String name;
    private String password;

    public Students(String url, String name, String password) {
        this.url = url;
        this.name = name;
        this.password = password;
    }

    public void selectStudetns(){
        try(Connection connection = DriverManager.getConnection(url, name, password) ){
            Statement query = connection.createStatement();
            ResultSet resultSet = query.executeQuery("Select * from main.Student");
            System.out.println("работа метода: selectStudetns()");
            while (resultSet.next()){
                System.out.println("Номер в выборке #" + resultSet.getRow()
                        + "\t Номер в базе #" + resultSet.getInt("id")
                        + "\t" + resultSet.getString("name")
                        + "\t" + resultSet.getString("age"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            //connection.close();
        }
    }

    public void selectStudetns(int id){
        try(Connection connection = DriverManager.getConnection(url, name, password) ){
            Statement query = connection.createStatement();
            ResultSet resultSet = query.executeQuery("Select * from main.Student where id = "+ id);
            System.out.println("работа метода: selectStudetns(int id)");
            while (resultSet.next()){
                System.out.println("Номер в выборке #" + resultSet.getRow()
                        + "\t Номер в базе #" + resultSet.getInt("id")
                        + "\t" + resultSet.getString("name")
                        + "\t" + resultSet.getString("age"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            //connection.close();
        }
    }
    public void selectStudetns(String nameSt){
        try(Connection connection = DriverManager.getConnection(url, name, password) ){
            Statement query = connection.createStatement();
            ResultSet resultSet = query.executeQuery("Select * from main.Student where name='"+nameSt +"'" );
            System.out.println("работа метода: selectStudetns()");
            while (resultSet.next()){
                System.out.println("Номер в выборке #" + resultSet.getRow()
                        + "\t Номер в базе #" + resultSet.getInt("id")
                        + "\t" + resultSet.getString("name")
                        + "\t" + resultSet.getString("age"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            //connection.close();
        }
    }
    public void addStudent(int id, String nameSt, int age){
        try(Connection connection = DriverManager.getConnection(url, name, password) ){
            String sql = "INSERT INTO main.student (id, name, age) values(?,?,?)";
            PreparedStatement query = connection.prepareStatement(sql);
            query.setInt(1, id);
            query.setString(2,nameSt);
            query.setInt(3, age);
            query.executeUpdate();
            System.out.println("работа метода: addStudent(int id, String nameSt, int age)");
            selectStudetns();

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            //connection.close();
        }
    }

    public void delStudent(int id){
        try(Connection connection = DriverManager.getConnection(url, name, password) ){
            String sql = "DELETE FROM main.student WHERE id ="+ id;
            PreparedStatement query = connection.prepareStatement(sql);
            query.executeUpdate();
            System.out.println("работа метода: delStudent(int id)");
            selectStudetns();

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            //connection.close();
        }
    }
    public void delStudent(String nameSt){
        try(Connection connection = DriverManager.getConnection(url, name, password) ){
            String sql = "DELETE FROM main.student WHERE name = '"+ nameSt +"'";
            PreparedStatement query = connection.prepareStatement(sql);
            query.executeUpdate();
            System.out.println("работа метода: delStudent(String nameSt)");
            selectStudetns();

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            //connection.close();
        }
    }
}
