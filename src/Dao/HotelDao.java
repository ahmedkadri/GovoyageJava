/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;
import entite.Hotel;
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

public class HotelDao implements IHotelDao {
      Statement ste;
    Connection connexion;
    public HotelDao(){
         try {
            connexion = bdconnexion.getConnexion();
            ste = connexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(HotelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void ajouterHotel(Hotel h) {
//            try {
//            String req1 = "insert into Hotel (NomHotel, NBEtoile, Description, ChambreType, Ville, NombrePlace,PrixPC, PrixDP, PrixLPD, Photo) "
//                    + "values('"+h.getNomHotel()+"', "+h.getNBEtoile()+"', "+h.getDescription()+"', "+h.getChambreType()+"', "+h.getVille()+"', "+h.getNombrePlace()+"', "+h.getPrixPC()+"', "+h.getPrixDP()+"', "+h.getPrixLPD()+"', "+h.getPhoto()+")";
//            
//            ste.executeUpdate(req1);
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(HotelDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
         try {
           PreparedStatement ste = connexion.prepareStatement("insert into hotel (`NomHotel`, `NBEtoile`, `Description`, `ChambreType`, `Ville`, `NombrePlace`, `PrixPC`, `PrixDP`, `PrixLPD`, `Photo`) "
                    + "values(?,?,?,?,?,?,?,?,?,?)");
            /*String req1 = "insert into hotel (prix,nombreDispo,description,adresseHotel,villeHotel,paysHotel,chambreDispo,Photo,nombreEtoile) "
                    + "values(?,?,?,?,?,?,?,?,?)";*/
            ste.setString(1,h.getNomHotel());
            ste.setInt(2,h.getNBEtoile());
            ste.setString(3,h.getDescription());
            ste.setString(4,h.getChambreType());
            ste.setString  (5,h.getVille());
            ste.setInt(6,h.getNombrePlace());
            ste.setInt(7,h.getPrixPC());
            ste.setInt(8,h.getPrixDP());
            ste.setInt(9,h.getPrixLPD()); 
            ste.setString(10,h.getPhoto()); 
            ste.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(HotelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    } //To change body of generated methods, choose Tools | Templates.
    

    @Override
    public void modifierHotel(Hotel h) {
           try {
            String req2= "update hotel set `NBEtoile`='"+h.getNBEtoile()+"' `PrixPC`='"+h.getPrixPC()+"' `PrixDP`='"+h.getPrixDP()+"' `PrixLPD`='"+h.getPrixLPD()+"' where `NomHotel`='"+h.getNomHotel()+"'";
            ste.executeUpdate(req2);
        } catch (SQLException ex) {
         System.out.println(ex);
        }
    } //To change body of generated methods, choose Tools | Templates.
    

    @Override
    public void supprimerHotel(Hotel h) {
        try {
            PreparedStatement ste = connexion.prepareStatement("delete from hotel where NomHotel=?");
        ste.setString(1,h.getNomHotel());
        
            ste.executeUpdate();
            
        } catch (SQLException ex) {
         System.out.println(ex);
        }
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
//    public List<Hotel> afficherHotel() {
//          List<Hotel> hotels = new ArrayList<>();
//        Hotel h ;
//        String req4= "select * from Hotel";
//        try {
//            ResultSet res =  ste.executeQuery(req4);
//            while (res.next()) {
//               h = new Hotel(res.getInt("IdHotel"),
//                       res.getString("NomHotel"),
//                        res.getInt("NBEtoile"),
//                         res.getString("Description"),
//                        res.getString("ChambreType"),
//                       res.getString("Ville"),
//                       res.getInt("NombrePlace"),
//                                res.getFloat("PrixPC"),
//                             res.getFloat("PrixDP"),
//                             res.getFloat("PrixLPD"),
//                             res.getString("Photo"));
//               hotels.add(h);
//            }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(HotelDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return hotels; //To change body of generated methods, choose Tools | Templates.
//    }


    public Hotel chercherHotel(Hotel h) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public List<Hotel> afficherHotel() {
          
                     HotelDao odao = new HotelDao();
      List<Hotel> ListeHotel = new ArrayList<>();
      String requete = "select * from hotel";
     // Statement statement = connexion.createStatement();
      Hotel add;
      
        try {
            ResultSet resultat = ste.executeQuery(requete);
 //PersonneDAO pdao=new PersonneDAO();
            while (resultat.next()) {
                
                 add = new Hotel(resultat.getInt("IdHotel")
                         ,resultat.getString("NomHotel")
                         ,resultat.getInt("NBEtoile")
                         ,resultat.getString("Description")
                         ,resultat.getString("ChambreType")
                         ,resultat.getString("Ville")
                         ,resultat.getInt("NombrePlace")
                         ,resultat.getInt("PrixPC")
                         ,resultat.getInt("PrixDP")
                         ,resultat.getInt("PrixLPD")
                         ,resultat.getString("Photo"));
                
                
                ListeHotel.add(add);  
            }
            return ListeHotel;
         } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des Offre D'Hotel " + ex.getMessage());
            return null;
        }

    
    
    }
    
}
