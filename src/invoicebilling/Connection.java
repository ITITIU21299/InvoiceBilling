/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package invoicebilling;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Anh Huy
 */
public class Connection {
    private static Connection instance;
    private static final String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=books;user=sa;password=huy;encrypt=false";
    private static java.sql.Connection con = null;
    private static Statement stmt = null;
//                String SQL = "Select * FROM Customer";

               

    private Connection() {
    }
 
    public static Connection getInstance() {
        if (instance == null) {
            instance = new Connection();
            try {
                con = DriverManager.getConnection(connectionUrl);
                stmt = con.createStatement();
                System.out.println("Connected");
            } catch (SQLException e) { 
                System.out.print(e);
            }
        }
        return instance;
    }
    
    public ResultSet sqlcode(String SQL) throws SQLException{
        ResultSet rs = stmt.executeQuery(SQL);
        return rs;
    }
    public void close() throws SQLException{
        con.close();
    }
}
