/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Seid
 */
public abstract class Abstract {
    public Connection connect() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/todolist?serverTimezone=Asia/Baku";
        String username = "root";
        String password = "1234";
        Connection c = DriverManager.getConnection(url, username, password);
        return c;
    }
}
