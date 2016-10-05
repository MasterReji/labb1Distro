/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import database.DBConnector;
import database.DBUser;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Reimondo
 */
public class LookUser {

    private Connection con = null;
    private DBConnector dataBase = null;

    public LookUser() {
        dataBase = new DBConnector("jdbc:mysql://127.0.0.1:3306/webshop", "reimondo", "cuauhtemoc");
        this.con = dataBase.connect();
    }

    public ArrayList<User> getAllUsers() throws SQLException {
        ArrayList<User> wristBands = new ArrayList<User>();
        DBUser dBUser = new DBUser(con);
        wristBands = dBUser.getUsers();
        return wristBands;
    }

    /**
     * *
     * The object must be closed
     */
    public void close() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(LookUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
