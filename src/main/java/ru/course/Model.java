package ru.course;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.sql.*;

public class Model {
    public static void main(String[] args) {

        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

        Session session = sessionFactory.openSession();
        Course courses = session.find(Course.class, 1);
        System.out.println(courses.getName());

        session.close();
        sessionFactory.close();
    }
}



//
//String url = "jdbc:postgresql://localhost:5432/EducationPlatform";
//        String user = "postgres";
//        String password = "yarik2024SON$";
//
//        try {
//            Connection connection = DriverManager.getConnection(url, user, password);
//            Statement statement = connection.createStatement();
//
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM user_pg");
//            ResultSetMetaData metaData = resultSet.getMetaData();
//
//            int columnCount = metaData.getColumnCount();
//            System.out.println("Название столбцов и их типы:");
//            for (int i = 1; i <= columnCount; i++) {
//                String columnName = metaData.getColumnName(i);
//                String columnType = metaData.getColumnTypeName(i);
//                System.out.println(columnName + ": " + columnType);
//            }
//
//            resultSet.close();
//            statement.close();
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}

