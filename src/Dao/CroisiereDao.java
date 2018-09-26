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
import entite.Croisiere;


public class CroisiereDao implements ICroisiere {
       Statement ste;
    Connection connexion;  
    public CroisiereDao(){
         try {
            connexion = bdconnexion.getConnexion();
            ste = connexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(CroisiereDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void ajouterCroisiere(Croisiere c) {
//          try {
//            String req1 = "insert into Croisiere (Prix,NombrePlace,DateDepart,NbJour,VilleDepart,VilleDestination,Description) "
//                    + "values('"+c.getPrix()+"', "+c.getNombrePlace()+"', "+c.getDateDepart()+"', "+c.getNBJour()+"', "+c.getVilleDepart()+"', "+c.getVilleDestination()+"', "+c.getDescription()+")";
//            
//            ste.executeUpdate(req1);
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(VolDao.class.getName()).log(Level.SEVERE, null, ex);
//        } //To change body of generated methods, choose Tools | Templates.
        
        try {
           PreparedStatement ste = connexion.prepareStatement("insert into croisiere (`Nomcrois`,`Prix`, `NombrePlace`, `DateDepart`, `NbJour`, `VilleDepart`, `VilleDestination`, `Description`) "
                    + "values(?,?,?,?,?,?,?,?)");
            /*String req1 = "insert into hotel (prix,nombreDispo,description,adresseHotel,villeHotel,paysHotel,chambreDispo,Photo,nombreEtoile) "
                    + "values(?,?,?,?,?,?,?,?,?)";*/
            ste.setString(1,c.getNomcrois());
            ste.setString(2,c.getPrix());
            ste.setInt(3,c.getNombrePlace());
            ste.setString(4,c.getDateDepart());
            ste.setInt(5,c.getNBJour());
            ste.setString(6,c.getVilleDepart());
            ste.setString(7,c.getVilleDestination());
            ste.setString(8,c.getDescription());
             
            ste.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(HotelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void modifierCroisiere(Croisiere c) {
         try {
            String req2= "update croisiere set `Prix`='"+c.getPrix()+"' where `Nomcrois`='"+c.getNomcrois()+"'";
            ste.executeUpdate(req2);
        } catch (SQLException ex) {
         System.out.println(ex);
        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void supprimerCroisiere(Croisiere c) {
         try {
          PreparedStatement ste = connexion.prepareStatement("delete from croisiere where Nomcrois=?");
        ste.setString(1,c.getNomcrois());
        
            ste.executeUpdate();
        } catch (SQLException ex) {
         System.out.println(ex);
        }//To change body of generated methods, choose Tools | Templates.
    }

//    @Override
    public List<Croisiere> afficherCroisiere() {
        List<Croisiere> croisieres = new ArrayList<>(); 
        Croisiere c ;
        String req4= "select * from croisiere";
        try {
            ResultSet res =  ste.executeQuery(req4);
            while (res.next()) {
               c= new Croisiere(res.getInt("IdCroisiere"),
                       res.getString("Nomcrois"),
                       res.getString("Prix"),
                       res.getInt("NombrePlace"),
                       res.getString("DateDepart"),
                       res.getInt("NbJour"),
                       res.getString("VilleDepart"),
                       res.getString("VilleDestination"),
                       
                        res.getString("Description"));
               croisieres.add(c);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(   CroisiereDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return croisieres; //To change body of generated methods, choose Tools | Templates.
    }
//
//    @Override
//    public Croisiere chercherCroisiere(Croisiere c) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

 

    @Override
    public Croisiere chercherCroisiere(Croisiere c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
  
    
}
