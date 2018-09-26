/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;
import entite.Hotel;
import java.util.List;

/**
 *
 * @author USER
 */
public interface IHotelDao {
     public void ajouterHotel(Hotel h);
    public void modifierHotel(Hotel h);
    public void supprimerHotel(Hotel h);
    public List<Hotel> afficherHotel();
    public Hotel chercherHotel(Hotel h);
    
}
