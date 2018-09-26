/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import entite.panierdereservation;
import entite.Client;
import entite.Croisiere;
import entite.OffreCroisiere;
import govoyagefinal.BDConexion.bdconnexion;
/**
 *
 * @author user
 */
public class panierdereservationDAO implements IpanierDeReservation{
     Statement ste;
     Connection connexion;

    public panierdereservationDAO() {
        try {
            connexion= bdconnexion.getConnexion();
            ste = connexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(CroisiereDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     
    @Override
    public void add(int idcroisiere, int idclient, int quantite) {
       try {
        String req1="insert into panierdereservation ( `idClient`, `id_CroisiereR`, `Quantite`)"+ 
               "values( '"+idcroisiere+"','"+idclient+"','"+quantite+"')";
               System.out.println(req1);
               ste.executeUpdate(req1);
         } catch (SQLException ex) {
             Logger.getLogger(panierdereservationDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    @Override
    public List<panierdereservation> afficherPANIER(int id) {
         List<panierdereservation> paniers = new ArrayList<>();
        panierdereservation PA;
       OffreCroisiere cr;
        Client cl;
       // String req2="select cr.nom , cr.prix ,PA.`idClient`,PA.`id_Croisiere` ,PA.`Quantite` from panierdereservation PA inner join croisiere cr on PA.`id_Croisiere`=PA.id where PA.`idClient`='"+id+"'"; 
    String req2="select cr.nom , cr.prix ,PA.`Quantite` from panierdereservation PA inner join croisiere cr on PA.`id_Croisiere`=PA.id where PA.`idClient`='"+id+"'"; 
        System.out.println(req2);
            ResultSet res = null  ;
        try {
            System.out.println(req2);
            res = ste.executeQuery(req2);
        } catch (SQLException ex) {
            Logger.getLogger(panierdereservationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (res.next()) {
                
                cl=new Client();
                res.getInt("PA.idClient"); /////
                cr=new OffreCroisiere(res.getFloat("cr.prix"), res.getString("cr.nom"));
                System.out.println(cr);
                PA= new panierdereservation(cr, cl,res.getInt("PA.quantite"));
                paniers.add(PA);
                
                
            }   } catch (SQLException ex) {
            Logger.getLogger(panierdereservationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(paniers);
         return paniers;}
    }

   
   
    

