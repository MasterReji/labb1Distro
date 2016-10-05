/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Reimondo
 */
public class DBConnector {

    String DBURL = null;
    String DBUserName = null;
    String DBUserPassword = null;
    Connection connection = null;

    public DBConnector(String DBURL, String DBUserName, String DBUserPassword) {
        this.DBURL = DBURL;
        this.DBUserName = DBUserName;
        this.DBUserPassword = DBUserPassword;
    }

    public Connection connect() {
        try {
            connection = DriverManager.getConnection(DBURL, DBUserName, DBUserPassword);
            System.out.println("Databasen uppkopplad");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            return connection;
        }
    }

    public void close() {
        try {
            connection.close();
            System.out.println("Databasen nedkopplad");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
