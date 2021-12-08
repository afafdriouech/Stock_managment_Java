/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.societe.connexion;

//import com.mysql.jdbc.Connection;
import java.sql.*;


/**
 *
 * @author afaf
 */
public class Connexion {
    private static String login="root";
    private static String password="";
    private static String url="jdbc:mysql://localhost:3306/commande";//
    private static Connection conn;
    
    public static Connection conCommande()
    {
        try {
            //chargement du driver(permet la communication avec mysql)
            Class.forName("com.mysql.jdbc.Driver");
            //authentification
            conn=DriverManager.getConnection(url,login,password);
            //System.out.println("ok");
            return conn;
        } catch (Exception ex)          //on a creer un objet exception ex
          { System.out.println(ex);
                return null;}
    }
          
}
