package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //подключаемся к базе данных
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","admin","adminadmin");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //создаем объект
        try {
            PreparedStatement ps =conn.prepareStatement("SELECT * FROM users");
            ResultSet result = ps.executeQuery (); //если есть Select, используем executeQuery //ResultSet - получаем таблицу, ResultNext - получаем данные из каждой оследующей строки таблицы
            while (result.next()) {
                System.out.println (result.getInt ("id"));
                System.out.println (result.getString ("name")); //подбираем тип в Java, максимально соответствующий типу в MySQL (VARCHAR = String)
                System.out.println (result.getString ("reg_date"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            PreparedStatement ps =conn.prepareStatement("INSERT INTO users (name, login, password, reg_date) VALUES (?, ?, ?,NOW())");
            ps.setString(1,"Vitaliy");//пишем по порядку (номер ?, потом то, что под ним подразум.)
            ps.setString(3,"12345");
            ps.setString(2,"vitalya");
            ps.executeUpdate(); //во всех случаях, кроме SELECT, используем executeUpdate


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
