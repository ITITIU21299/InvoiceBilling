/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invoicebilling;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author nguye
 */
public class main {

    /**
     * @param args the command line arguments
     */static String dbUsername = "";
        static String dbPassword = "";

        static String jdbcUrl = "jdbc:sqlserver://sql.bsite.net\\MSSQL2016;databaseName=...;user=...;password=...;encrypt=true;trustServerCertificate=true;";
    public static void main(String[] args) throws SQLException {
            Frame Frame = new Frame();
            Frame.setVisible(true);
            Frame.setLocationRelativeTo(null);
        Connection con = Connection.getInstance();
        ResultSet rs = con.sqlcode("Select * FROM authors WHERE firstName = 'Tem'");
        while (rs.next()){
            System.out.println(rs.getString("firstName"));
        }
        }
    }
    
