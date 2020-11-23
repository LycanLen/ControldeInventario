/*
 * Conexion a MySQL
 */
package CLASES;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ERNESTO
 */
public class conectar {
    //Es necesario cambiar el user y password segun tu configuracion
    //de mySQL
    private static Connection con;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url ="jdbc:mysql://localhost:3306/inventario";
    
    public conectar(){
        con=null;
        try{
            Class.forName(driver);
            con= DriverManager.getConnection(url,user,password);
            if (con!=null){
                System.out.println("Conexion Establecida");
            }
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("error al conectar" + e);
        }
     }
    public Connection getConnection() {
        return con;
    }
    public void Desconectar(){
        con=null;
        if(con==null){
            System.out.println("Conexion Terminada.");
        }
    }
    
}