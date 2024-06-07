/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invoicebilling;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author nguye
 */
public class main {

    /**
     * @param args the command line arguments
     */static String dbUsername = "sa";
        static String dbPassword = "huy";

        //static String jdbcUrl = "jdbc:sqlserver://sql.bsite.net\\MSSQL2016;databaseName=...;user=...;password=...;encrypt=true;trustServerCertificate=true;";
    public static String jdbcUrl = "jdbc:sqlserver://localhost:1433;databaseName=INVOICEBILLING;user=sa;password=h=huy";


    public static void main(String[] args) throws SQLException {            
        Connection conn = null;
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433;databaseName=INVOICEBILLING;user=sa;password=huy";
                conn = DriverManager.getConnection(url);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
           }
        
            Frame Frame = new Frame();
            Frame.setVisible(true);
            Frame.setLocationRelativeTo(null);        

        // Connection con = Connection.getInstance();
        // ResultSet rs = con.sqlcode("Select * FROM authors WHERE firstName = 'Tem'");
        //while (rs.next()){
            //System.out.println(rs.getString("firstName"));
        //}
        }
    }
    
