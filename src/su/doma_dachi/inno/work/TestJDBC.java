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
}
