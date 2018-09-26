/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;
import java.util.List;
import entite.Croisiere;
/**
 *
 * @author USER
 */
public interface ICroisiere {
      public void ajouterCroisiere(Croisiere c);
    public void modifierCroisiere(Croisiere c);
    public void supprimerCroisiere(Croisiere c);
    public List<Croisiere> afficherCroisiere();
    public Croisiere chercherCroisiere(Croisiere c);
    
}
