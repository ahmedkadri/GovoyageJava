/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entite.OffreVol;
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
public class OffreVolDao implements IOffreVol{
    
      Statement ste;
    Connection connexion;
    
    public OffreVolDao()
    {
        try {
            connexion =  bdconnexion.getConnexion();
            ste = connexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(OffreHotelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void AjouterOffreVil(OffreVol o) {

          try {
            String req1 = "insert into offre_vol (`Reduction`, `Prix`, `Date_Debut`, `Date_Fin`, `NombrePlace`, `DateVol`, `PaysDestination`, `PaysDepart`, `Description`, `NomVol`) "
             + "values('"+o.getReduction()+"',  '"+o.getPrix()+"', '"+o.getDate_Debut()+"', '"+o.getDate_Fin()+"', '"+o.getNombrePlace()+"', '"+o.getDateVol()+"', '"+o.getPaysDestination()+"', '"+o.getPaysDepart()+"',  '"+o.getDescription()+"', '"+o.getNomVol()+"')";
            
            ste.executeUpdate(req1);
            
        } catch (SQLException ex) {
            Logger.getLogger(OffreHotelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<OffreVol> AfficherOffreVol() {

        OffreVolDao odao = new OffreVolDao();
      List<OffreVol> listOffreVol = new ArrayList<>();
      String requete = "select * from offre_vol";
     // Statement statement = connexion.createStatement();
      OffreVol add;
      
        try {
            ResultSet resultat = ste.executeQuery(requete);
 //PersonneDAO pdao=new PersonneDAO();
            while (resultat.next()) {
                
                 add = new OffreVol(resultat.getInt("IdVol")
                         ,resultat.getInt("Reduction")
                       
                         ,resultat.getFloat("Prix")
                         ,resultat.getDate("Date_Debut")
                         ,resultat.getDate("Date_Fin")
                         ,resultat.getInt("NombrePlace")
                         ,resultat.getString("DateVol")
                    
                         ,resultat.getString("PaysDestination")
                         ,resultat.getString("PaysDepart")
                         ,resultat.getString("Description")
                         ,resultat.getString("NomVol"));
                
                
                listOffreVol.add(add);  
            }
            return listOffreVol;
         } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des Offre De Croisiere " + ex.getMessage());
            return null;
        }
        
    }

    @Override
    public void ModifierOffreVol(OffreVol o, int IdVol) {

        String requete = "UPDATE `offre_vol` SET `Reduction`=?,`Prix`=?,`Date_Debut`=?,`Date_Fin`=?,`NombrePlace`=?, `DateVol`=?, `PaysDestination`=?, `PaysDepart`=?,  `Description`=?, `NomVol`=? WHERE IdVol="+IdVol;
        
        
        
        try {
            PreparedStatement ps = connexion.prepareStatement(requete);
            ps.setInt(1, o.getReduction());
            ps.setFloat(2, o.getPrix());
            ps.setDate(3, (Date) o.getDate_Debut());
            ps.setDate(4, (Date) o.getDate_Fin());
            ps.setInt(5, o.getNombrePlace());
            ps.setString(6, o.getDateVol());
            ps.setString(7, o.getPaysDestination());
            ps.setString(8, o.getPaysDepart());
            ps.setString(9, o.getDescription());
            ps.setString(10, o.getNomVol());
            

    

            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }

    @Override
    public void SupprimerOffreVol(int IdVol) {

            String requete = "delete from offre_vol where IdVol=?";

        try {
            PreparedStatement ps = connexion.prepareStatement(requete);
            ps.setInt(1, IdVol);
            ps.executeUpdate();
            System.out.println("Offre Vol Supprimee");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    
    }
    
    
    
}
