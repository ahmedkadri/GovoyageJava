/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entite.OffreCroisiere;
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
public class OffreCroisiereDao implements IOffreCroisiere{
    
    Statement ste;
    Connection connexion;
    
    public OffreCroisiereDao ()
    {
        try {
            connexion =  bdconnexion.getConnexion();
            ste = connexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(OffreHotelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void AjouterOffreCroisiere(OffreCroisiere o) {

        try {
            String req1 = "insert into offre_croisiere (`Reduction`,`Nomcrois`, `Prix`, `Date_Debut`, `Date_Fin`, `NombrePlace`, `DateDepart`, `NBJour`, `VilleDepart`, `VilleDestination`, `Description`) "
             + "values('"+o.getReduction()+"', '"+o.getNomcrois()+"', '"+o.getPrix()+"', '"+o.getDate_Debut()+"', '"+o.getDate_Fin()+"', '"+o.getNombrePlace()+"', '"+o.getDateDepart()+"', '"+o.getNBJour()+"', '"+o.getVilleDepart()+"', '"+o.getVilleDestination()+"', '"+o.getDescription()+"')";
            
            ste.executeUpdate(req1);
            
        } catch (SQLException ex) {
            Logger.getLogger(OffreHotelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    @Override
    public List<OffreCroisiere> AfficherOffreCroisiere() {

        OffreCroisiereDao odao = new OffreCroisiereDao();
      List<OffreCroisiere> listOffreCroisiere = new ArrayList<>();
      String requete = "select * from offre_croisiere";
     // Statement statement = connexion.createStatement();
      OffreCroisiere add;
      
        try {
            ResultSet resultat = ste.executeQuery(requete);
 //PersonneDAO pdao=new PersonneDAO();
            while (resultat.next()) {
                
                 add = new OffreCroisiere(resultat.getInt("IdCroisiere")
                         ,resultat.getInt("Reduction")
                         ,resultat.getString("Nomcrois")
                         ,resultat.getFloat("Prix")
                         ,resultat.getDate("Date_Debut")
                         ,resultat.getDate("Date_Fin")
                         ,resultat.getInt("NombrePlace")
                         ,resultat.getString("DateDepart")
                         ,resultat.getInt("NBJour")
                         ,resultat.getString("VilleDepart")
                         ,resultat.getString("VilleDestination")
                         ,resultat.getString("Description"));
                
                
                listOffreCroisiere.add(add);  
            }
            return listOffreCroisiere;
         } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des Offre De Croisiere " + ex.getMessage());
            return null;
        }
    
    }

    @Override
    public void ModifierOffreCroisiere(OffreCroisiere o, int IdCroisiere) {

        String requete = "UPDATE `offre_croisiere` SET `Reduction`=?,`Nomcrois`=?,`Prix`=?,`Date_Debut`=?,`Date_Fin`=?,`NombrePlace`=?, `DateDepart`=?, `NBJour`=?, `VilleDepart`=?, `VilleDestination`=?, `Description`=? WHERE IdCroisiere="+IdCroisiere;
        
        
        
        try {
            PreparedStatement ps = connexion.prepareStatement(requete);
            ps.setInt(1, o.getReduction());
            ps.setString(2, o.getNomcrois());
            ps.setFloat(3, o.getPrix());
            ps.setDate(4, (Date) o.getDate_Debut());
            ps.setDate(5, (Date) o.getDate_Fin());
            ps.setInt(6, o.getNombrePlace());
            ps.setString(7, o.getDateDepart());
            ps.setInt(8, o.getNBJour());
            ps.setString(9, o.getVilleDepart());
            ps.setString(10, o.getVilleDestination());
            ps.setString(11, o.getDescription());

    

            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }

    @Override
    public void SupprimerOffreCroisiere(int IdCroisiere) {

    
           String requete = "delete from offre_croisiere where IdCroisiere=?";

        try {
            PreparedStatement ps = connexion.prepareStatement(requete);
            ps.setInt(1, IdCroisiere);
            ps.executeUpdate();
            System.out.println("Offre Croisiere Supprimee");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
        
    }

   
    
    
    
}
