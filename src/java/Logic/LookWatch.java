/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import database.DBConnector;
import database.DBWatch;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Reimondo
 */
public class LookWatch {

    private Connection con = null;
    private final DBConnector dataBase;

    public LookWatch() {
        dataBase = new DBConnector("jdbc:mysql://127.0.0.1:3306/webshop", "reimondo", "cuauhtemoc");
        this.con = dataBase.connect();
    }

    public ArrayList<Watch> getAllWatches() throws SQLException {
        ArrayList<Watch> watches = new ArrayList<Watch>();
        DBWatch dBWatch = new DBWatch(con);
        watches = dBWatch.getWatches();
        return watches;
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
