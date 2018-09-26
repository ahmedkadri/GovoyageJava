/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entite.OffreHotel;
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

/**
 *
 * @author ahmed
 */
public class OffreHotelDao implements IOffreHotel {
    
    Statement ste;
    Connection connexion;
    
    public OffreHotelDao ()
    {
        try {
            connexion =  bdconnexion.getConnexion();
            ste = connexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(OffreHotelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
      public void AjouterOffreHotel(OffreHotel o) {
        
        
        
        try {
            String req1 = "insert into offre_hotel (`Reduction`,`NomHotel`, `Ville`, `Description`, `Date_Debut`, `Date_Fin`, `PrixPC`, `PrixDP`, `PrixLPD`, `ChambreType`, `NBEtoiles`, `Disponibiliter`) "
             + "values('"+o.getReduction()+"', '"+o.getNomHotel()+"', '"+o.getVille()+"', '"+o.getDescription()+"', '"+o.getDate_Debut()+"', '"+o.getDate_Fin()+"', '"+o.getPrixPC()+"', '"+o.getPrixDP()+"', '"+o.getPrixLPD()+"', '"+o.getChambreType()+"', '"+o.getNBEtoiles()+"', "+o.getDisponibiliter()+")";
            
            ste.executeUpdate(req1);
            
        } catch (SQLException ex) {
            Logger.getLogger(OffreHotelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

   
    public List<OffreHotel> AfficherOffreHotel() {

             OffreHotelDao odao = new OffreHotelDao();
      List<OffreHotel> listOffreHotel = new ArrayList<>();
      String requete = "select * from offre_hotel";
     // Statement statement = connexion.createStatement();
      OffreHotel add;
      
        try {
            ResultSet resultat = ste.executeQuery(requete);
 //PersonneDAO pdao=new PersonneDAO();
            while (resultat.next()) {
                
                 add = new OffreHotel(resultat.getInt("IdHotel")
                         ,resultat.getInt("Reduction")
                         ,resultat.getString("NomHotel")
                         ,resultat.getString("Ville")
                         ,resultat.getString("Description")
                         ,resultat.getDate("Date_Debut")
                         ,resultat.getDate("Date_Fin")
                         ,resultat.getFloat("PrixPC")
                         ,resultat.getFloat("PrixDP")
                         ,resultat.getFloat("PrixLPD")
                         ,resultat.getString("ChambreType")
                         ,resultat.getInt("NBEtoiles")
                         ,resultat.getInt("Disponibiliter"));
                
                
                listOffreHotel.add(add);  
            }
            return listOffreHotel;
         } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des Offre D'Hotel " + ex.getMessage());
            return null;
        }
    
    }


    public void ModifierOffreHotel(OffreHotel o, int IdHotel) {

         String requete = "UPDATE `offre_hotel` SET `Reduction`=?,`NomHotel`=?,`Ville`=?,`Description`=?,`Date_Debut`=?,`Date_Fin`=?,`PrixPC`=?, `PrixDP`=?, `PrixLPD`=?, `ChambreType`=?, `NBEtoiles`=?, `Disponibiliter`=? WHERE IdHotel="+IdHotel;
        
        
        
        try {
            PreparedStatement ps = connexion.prepareStatement(requete);
            ps.setInt(1, o.getReduction());
            ps.setString(2, o.getNomHotel());
            ps.setString(3, o.getVille());
            ps.setString(4, o.getDescription());
            ps.setDate(5, (Date) o.getDate_Debut());
            ps.setDate(6, (Date) o.getDate_Fin());
            ps.setFloat(7, o.getPrixPC());
            ps.setFloat(8, o.getPrixDP());
            ps.setFloat(9, o.getPrixLPD());
            ps.setString(10, o.getChambreType());
            ps.setInt(11, o.getNBEtoiles());
            ps.setInt(12, o.getDisponibiliter());

    

            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    
    
    }


    public void SupprimerOffreHotel(int IdHotel) {
        
      String requete = "delete from offre_hotel where IdHotel=?";

        try {
            PreparedStatement ps = connexion.prepareStatement(requete);
            ps.setInt(1, IdHotel);
            ps.executeUpdate();
            System.out.println("Offre Hotel Supprimee");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }   
    }
    
    
    
}
