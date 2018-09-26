/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;
import java.util.List;
import entite.User;
/**
 *
 * @author USER
 */
public interface IUser {
      public void ajouterUser(User u);
    public void modifierUser(User u);
    public void supprimerUser(User u);
    public List<User> afficherUser();
    public User chercherUser(User u);
    
}
