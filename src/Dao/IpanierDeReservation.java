/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import entite.panierdereservation;
import java.util.List;

/**
 *
 * @author user
 */
public interface IpanierDeReservation {
   public void add(int idcroisiere, int idclient,int quantite) ;
    public List<panierdereservation> afficherPANIER(int id);
    // public void updatepanier(int idcroisiere, int idclient,int quantite);
    
    
}
