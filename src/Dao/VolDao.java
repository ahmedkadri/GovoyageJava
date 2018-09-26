/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import govoyagefinal.BDConexion.bdconnexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import entite.Vol;
public class VolDao implements IVol {
       Statement ste;
    Connection connexion;
    public VolDao(){
         try {
            connexion = bdconnexion.getConnexion();
            ste = connexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(VolDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void ajouterVol(Vol v) {
//       
          try {
           PreparedStatement ste = connexion.prepareStatement("insert into vol (`Prix`, `NombrePlace`, `DateVol`, `PaysDestination`, `PaysDepart`, `Description`, `NomVol`) "
                    + "values(?,?,?,?,?,?,?)");
            /*String req1 = "insert into hotel (prix,nombreDispo,description,adresseHotel,villeHotel,paysHotel,chambreDispo,Photo,nombreEtoile) "
                    + "values(?,?,?,?,?,?,?,?,?)";*/
            ste.setInt(1,v.getPrix());
            ste.setInt(2,v.getNombrePlace());
            ste.setString(3,v.getDateVol());
            ste.setString(4,v.getPaysDestination());
            ste.setString  (5,v.getPaysDepart());
            ste.setString(6,v.getDescription());
            ste.setString(7,v.getNomVol());
            
            ste.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(HotelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modifierVol(Vol v) {
    try {
            String req2= "update vol set `prix`='"+v.getPrix()+"' where `NomVol`='"+v.getNomVol()+"'";
            ste.executeUpdate(req2);
        } catch (SQLException ex) {
         System.out.println(ex);
        }
    }
       
//To change body of generated methods, choose Tools | Templates.
    

    @Override
    public void supprimerVol(Vol v) {
        
        try {
            PreparedStatement ste = connexion.prepareStatement("delete from vol where NomVol=?");
        ste.setString(1,v.getNomVol());
        
            ste.executeUpdate();
        } catch (SQLException ex) {
         System.out.println(ex);
        }
    } //To change body of generated methods, choose Tools | Templates.
    

    @Override
    public List<Vol> afficherVol() {
       
           List<Vol> vols = new ArrayList<>();
        Vol v ;
        String req4= "select * from Vol";
        try {
            ResultSet res =  ste.executeQuery(req4);
            while (res.next()) {
               v= new Vol(res.getInt("IdVol"),
                       res.getInt("Prix"),
                       res.getInt("NombrePlace"),
                       res.getString("DateVol"),
                       res.getString("PaysDestination"),
                       res.getString("PaysDepart"),
                       res.getString("Description"),
                       res.getString("NomVol"));
               vols.add(v);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(   VolDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vols;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vol chercherVol(Vol v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
