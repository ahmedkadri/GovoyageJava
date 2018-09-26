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
import entite.Client;
import java.awt.Image;
import javax.swing.ImageIcon;
public class ClientDao implements IClient{
         Statement ste;
    Connection connexion;
     Statement step;
    
    public ClientDao(){
         try {
            connexion = bdconnexion.getConnexion();
            ste = connexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public ImageIcon retriveIcon(int id) {
        try {
            Image img;
            byte[] imgBytes;
            connexion = bdconnexion.getConnexion();
            step = connexion.createStatement();
            PreparedStatement ps = connexion.prepareStatement("select `img` from user where `id`=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                System.out.println(rs.getString("img"));

                ImageIcon image = new ImageIcon(rs.getString("img"));
                ImageIcon image2 = new ImageIcon(image.getImage().getScaledInstance(152, 152, Image.SCALE_SMOOTH), rs.getString("img"));

                System.out.println("reading image -*****----");
                System.out.println(image2.getIconWidth());
                return image2;

            }
        } catch (Exception e) {
            
            System.out.println("---------- exception in img selecting");
        }
        return null;
    }
    
    
    public void verifierLogin(boolean cc) {
        ResultSet res = null;
        Client c = new Client();
        cc = false;
        String sql = "select login,motDePasse from user where login= '" + c.getLogin() + "'";
        try {
            res = ste.executeQuery(sql);
            int count = 0;
            while (res.next()) {
                count = count + 1;

            }
            if (count == 1) {
                cc = true;
            } else {
                cc = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(cc);

        }

    }

    @Override
    public void ajouterClient(Client C) {
          try {
           PreparedStatement ste = connexion.prepareStatement("insert into user (loginC,MDPC,EmailC,NomC,PrenomC) "
                    + "values(?,?,?,?,?)");
            /*String req1 = "insert into hotel (prix,nombreDispo,description,adresseHotel,villeHotel,paysHotel,chambreDispo,Photo,nombreEtoile) "
                    + "values(?,?,?,?,?,?,?,?,?)";*/
            ste.setString(1,C.getLogin());
            ste.setString(2,C.getMotDePasse());
            ste.setString(3,C.getEmail());
            ste.setString(4,C.getNom());
            ste.setString(5,C.getPrenom());
      
            
             
            ste.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
        }//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modifierClient(Client C) {
          try {
            String req2= "update user set "
                    + "loginC='"+C.getLogin()+"' where IdUser="+C.getIdUser();
            ste.executeUpdate(req2);
        } catch (SQLException ex) {
         System.out.println(ex);
        } //To change body of generated methods, choose Tools | Templates.
     //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void supprimerClient(Client C) {
         try {
            String req3= "delete from user"
                    + " where IDclient="+C.getIdUser();
            ste.executeUpdate(req3);
        } catch (SQLException ex) {
         System.out.println(ex);
        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Client> afficherClient() {
            List<Client> users = new ArrayList<>();
        Client u ;
        String req4= "select * from user";
        try {
            ResultSet res =  ste.executeQuery(req4);
            while (res.next()) {
               u= new Client(res.getInt("IdUser"),
                       res.getString("Login"),
                       res.getString("MotDePasse"),
                       res.getInt("estBlock"),
                       res.getString("Email"),
                       res.getString("Nom"),       
                       res.getString("Prenom"),
                       res.getInt("age"),    
                       res.getString("sexe"),
                       res.getString("TypeOffrant"),
                       res.getString("RoleUsers"),
                       res.getString("Pays"),
                       res.getString("Ville"));
                       
                        
               users.add(u);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(   UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Client chercherClient(Client C) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public int Authentificationcl(String loginC,String MDPC)
    {
        int count=0;
    
        
        try {
            String req="Select * from user where loginC='"+loginC+"' and MDPC='"+MDPC+"'";
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

    @Override
    public void Authentificationcl(Client C) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
     public int researchid(String a) {
        int resultat = 0;
        String req4 = "SELECT IdUser FROM  user  where login='" + a + "'  ";

        ResultSet res = null;
        try {
            System.out.println(req4);
            res = ste.executeQuery(req4);
        } catch (SQLException ex) {
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (res.next()) {
                resultat = res.getInt("ID");

            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(resultat);
        return resultat;
    }

     public Client chercherClientLoginPassword(String c, String pwd) {
        int resultat = 0;
        Client cc = null;
        String reqqq = "SELECT * FROM  user  where Login='" + c + "' and MotDePasse ='" + pwd + "'";
        ResultSet res = null;

        try {
            res = ste.executeQuery(reqqq);
            while (res.next()) {
           

                //System.out.println(res.getDate("DateDeNaissance"));

                cc = new Client(res.getInt("IdUser"),
                       res.getString("Login"),
                       res.getString("MotDePasse"),
                       res.getInt("estBlock"),
                       res.getString("Email"),
                       res.getString("Nom"),       
                       res.getString("Prenom"),
                       res.getInt("age"),    
                       res.getString("sexe"),
                       res.getString("TypeOffrant"),
                       res.getString("RoleUsers"),
                       res.getString("Pays"),
                       res.getString("Ville"));               
         
                return cc;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(resultat);
        System.out.println(c);
        return null;
    }
    
    
       public Client chercherClientLogin(String a) {
        int resultat = 0;
        Client c = null;
        String reqqq = "SELECT * FROM  user  where login='" + a + "'  ";
        ResultSet res = null;

        try {
            res = ste.executeQuery(reqqq);
            while (res.next()) {
                //Date DateDeNaissance, String sexe, Image img, String nom, String prenom,
                // int id, String login, String password, String email, String Pays, String Ville

                Client cc = new Client(res.getInt("IdUser"),
                       res.getString("Login"),
                       res.getString("MotDePasse"),
                       res.getInt("estBlock"),
                       res.getString("Email"),
                       res.getString("Nom"),       
                       res.getString("Prenom"),
                       res.getInt("age"),    
                       res.getString("sexe"),
                       res.getString("TypeOffrant"),
                       res.getString("RoleUsers"),
                       res.getString("Pays"),
                       res.getString("Ville")
                    
                );
                //cc.setImg(retriveIcon(cc.getIdUser()));
                // cc.setF(res.getString("img"));
                return cc;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(resultat);
        System.out.println(c);
        return null;
    }
       
          public void updateClient(Client c) {
        int resultat = 0;
        try {
            
        } catch (Exception e) {
        }
        String req4 = "UPDATE `user` SET `login`='" + c.getLogin() + "',`motDePasse`='"
                + c.getMotDePasse() + "',`email`='" + c.getEmail() + "',`sexe`='" + c.getSexe() + "'"
                + ",`nom`='" + c.getNom() + "' " + ",`prenom`='" + c.getPrenom() + "'"
                + ",`pays`='" + c.getPays() + "' " + ",`ville`='" + c.getVille() + "' "
                + ", WHERE id=" + c.getIdUser();

    
        //ResultSet res = null  ;
        try {

            ste.executeUpdate(req4);

        } catch (SQLException ex) {
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
