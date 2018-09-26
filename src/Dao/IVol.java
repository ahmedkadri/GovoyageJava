/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;
import java.util.List;
import entite.Vol;

/**
 *
 * @author USER
 */
public interface IVol {
       public void ajouterVol(Vol v);
    public void modifierVol(Vol v);
    public void supprimerVol(Vol v);
    public List<Vol> afficherVol();
    public Vol chercherVol(Vol v);
    
}
