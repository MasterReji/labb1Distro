/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import Logic.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Reimondo
 */
public class DBUser {

    private ArrayList<User> users = new ArrayList<User>();
    private Connection con = null;

    public DBUser(Connection con) {
        this.con = con;
    }

       
    public ArrayList<User> getUsers() throws SQLException{
        Statement stmt = con.createStatement();// = con.createStatement();
        ResultSet rset = stmt.executeQuery("SELECT ID, UserName, UserPassword from T_Users");
        while(rset.next()){
            users.add(new User(rset.getString("ID"), rset.getString("UserName"), rset.getString("UserPassword")));
        }
        stmt.close();
        rset.close();
        return users;
    }
    
}
