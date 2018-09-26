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
import entite.User;
public class UserDao implements IUser {
        Statement ste;
    Connection connexion;
    public UserDao(){
         try {
            connexion = bdconnexion.getConnexion();
            ste = connexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void ajouterUser(User u) {
//         try {
//            String req1 = "insert into user (login,MotDePasse,Email,Nom,Prenom,TypeOffrant) "
//                    + "values('"+u.getLogin()+"', "+u.getMotDePasse()+"', "+u.getEmail()+"', "+u.getNom()+"', "+u.getPrenom()+"', "+u.getTypeOffrant()+")";
//            
//            ste.executeUpdate(req1);
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //To change body of generated methods, choose Tools | Templates.
        try {
           PreparedStatement ste = connexion.prepareStatement("insert into user (login,MotDePasse,Email,Nom,Prenom,TypeOffrant) "
                    + "values(?,?,?,?,?,?)");
            /*String req1 = "insert into hotel (prix,nombreDispo,description,adresseHotel,villeHotel,paysHotel,chambreDispo,Photo,nombreEtoile) "
                    + "values(?,?,?,?,?,?,?,?,?)";*/
            ste.setString(1,u.getLogin());
            ste.setString(2,u.getMotDePasse());
            ste.setString(3,u.getEmail());
            ste.setString(4,u.getNom());
            ste.setString(5,u.getPrenom());
            ste.setString(6,u.getTypeOffrant());
            
             
            ste.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(HotelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifierUser(User u) {
        try {
            String req2= "update User set "
                    + "login='"+u.getLogin()+"' where IdUser="+u.getIdUser();
            ste.executeUpdate(req2);
        } catch (SQLException ex) {
         System.out.println(ex);
        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void supprimerUser(User u) {
         try {
            String req3= "delete from user"
                    + " where IdUser="+u.getIdUser();
            ste.executeUpdate(req3);
        } catch (SQLException ex) {
         System.out.println(ex);
        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> afficherUser() {
             List<User> users = new ArrayList<>();
        User u ;
        String req4= "select * from user";
        try {
            ResultSet res =  ste.executeQuery(req4);
            while (res.next()) {
               u= new User(res.getInt("IdUser"),
                       res.getString("login"),
                       res.getString("MotDePasse"),
                       res.getString("Email"),
                       res.getString("Nom"),
                       res.getString("Prenom"),
                       res.getString("Pays"),
                       res.getString("Ville"),
                       
                        res.getString("TypeOffrant"));
               users.add(u);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(   UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User chercherUser(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public int Authentification(String login,String motDePasse)
    {
        int count=0;
    
        
        try {
            String req="Select * from user where login='"+login+"' and MotDePasse='"+motDePasse+"'";
          ResultSet res=   ste.executeQuery(req);
          
          while(res.next())
          {
          count++;
          }
          
          
          
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        
           
    
    }
         return count;
}
    public void findbyone(int id)
    {
        try {
             String req="Select * from user where login='"+id+"'";
         ResultSet res=   ste.executeQuery(req);
    
        
            
        } catch (Exception e) {
        
        
      }
    
    }
}
