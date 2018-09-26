/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entite.OffreCroisiere;
import entite.OffreHotel;
import java.util.List;

/**
 *
 * @author ahmed
 */
public interface IOffreCroisiere {
 
        public void AjouterOffreCroisiere(OffreCroisiere o);
    public List<OffreCroisiere> AfficherOffreCroisiere();
    public void ModifierOffreCroisiere(OffreCroisiere o,int IdCroisiere);
    public void SupprimerOffreCroisiere(int IdCroisiere);
    
}
