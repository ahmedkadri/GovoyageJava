/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entite.OffreVol;
import java.util.List;

/**
 *
 * @author ahmed
 */
public interface IOffreVol {
    
    public void AjouterOffreVil(OffreVol o);
    public List<OffreVol> AfficherOffreVol();
    public void ModifierOffreVol(OffreVol o,int IdVol);
    public void SupprimerOffreVol(int IdVol);
    
}
