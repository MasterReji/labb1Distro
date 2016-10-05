/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import Logic.WristBand;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Reimondo
 */
public class DBWristBand {

    private Connection con = null;
    private ArrayList<WristBand> wristBands = new ArrayList<WristBand>();

    public DBWristBand(Connection con) {
        this.con = con;
    }

    public ArrayList<WristBand> getWristbands() throws SQLException {
        Statement stmt = con.createStatement();
        ResultSet rset = stmt.executeQuery("SELECT * from T_Wrist_Band");
        while (rset.next()) {
            wristBands.add(new WristBand(rset.getString("ID"), rset.getString("Model"), rset.getString("Price")));
        }
        stmt.close();
        rset.close();
        return wristBands;
    }

}
