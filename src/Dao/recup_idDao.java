/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import govoyagefinal.BDConexion.bdconnexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahmed
 */
public class recup_idDao {
    
    Statement ste;
    Connection connexion;
    public recup_idDao(){
         try {
            connexion = bdconnexion.getConnexion();
            ste = connexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(VolDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void findmail()
    {
        String req4= "select Email from Vol";
    }
    
    
    
}
