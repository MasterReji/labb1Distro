/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import Logic.Watch;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Reimondo
 */
public class DBWatch {

    private ArrayList<Watch> watches = new ArrayList<Watch>();
    private Connection con = null;

    public DBWatch(Connection con) {
        this.con = con;
    }

    public ArrayList<Watch> getWatches() throws SQLException {
        Statement stmt = con.createStatement();
        ResultSet rset = stmt.executeQuery("SELECT * from T_Watch");
        while (rset.next()) {
            watches.add(new Watch(rset.getString("ID"), rset.getString("Model"), rset.getString("Price")));
        }
        stmt.close();
        rset.close();
        return watches;
    }
}
