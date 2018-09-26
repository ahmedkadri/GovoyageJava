/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package govoyagefinal.BDConexion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class bdconnexion {
      String url="jdbc:mysql://localhost:3306/govoyage";
    String login = "root";
    String pwd = "";
    
    static private Connection connexion;
    
    private bdconnexion()
    {
        try{
            
        connexion = DriverManager.getConnection(url,login,pwd);
        System.out.println("Ok");
        }catch(Exception e)
        {
            Logger.getLogger(bdconnexion.class.getName()).log(Level.SEVERE, null, e);
        }
    
    }
    
    public static Connection getConnexion() // Pseudo Constructeur
    {
        if (connexion == null)
        {
            new bdconnexion();
            return connexion;
            
        }else
        {
            return connexion;
        }
        
    }
        
}
    

