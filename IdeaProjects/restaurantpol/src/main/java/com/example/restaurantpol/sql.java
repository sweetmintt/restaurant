package com.example.restaurantpol;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;

public class sql {
    private Connection connection;

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://std-mysql.ist.mospolytech.ru:3306/std_2282_restaurant", "std_2282_restaurant", "polina2810");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void regist(register user) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO Staff(username,password,access) VALUES (?,?,?)";
        try {
            Connection con = getConnection();
            PreparedStatement bd = con.prepareStatement(query);
            String hashedPassword = hashPassword(user.getPassword());
            bd.setString(1, user.getUsername());
            bd.setString(2, hashedPassword);
            bd.setString(3, user.getAccess());
            bd.executeUpdate();
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    protected String hashPassword(String password) {
        if (password == null) {
            return null;
        }

        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    public ResultSet getuser(register user) {
        ResultSet get = null;
        String query1 = "SELECT * FROM Staff WHERE username=?";
        try {
            Connection con = getConnection();
            PreparedStatement bd = con.prepareStatement(query1);
            bd.setString(1, user.getUsername());
            get = bd.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return get;
    }
}

