/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entite.OffreHotel;
import java.util.List;

/**
 *
 * @author ahmed
 */
public interface IOffreHotel {
    
      public void AjouterOffreHotel(OffreHotel o);
    public List<OffreHotel> AfficherOffreHotel();
    public void ModifierOffreHotel(OffreHotel o,int IdHotel);
    public void SupprimerOffreHotel(int IdHotel);
    
}
