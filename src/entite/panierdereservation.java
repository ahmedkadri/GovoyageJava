/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author user
 */
public class panierdereservation {
    private int id;
    private Croisiere idCroisiere;
    private Client idclient;
    private int quantite;
    private Hotel hotel;
    public panierdereservation() {
    }

    public panierdereservation(Croisiere idCroisiere, Client idclient, int quantite) {
        this.idCroisiere = idCroisiere;
        this.idclient = idclient;
        this.quantite = quantite;
    }

    public Client getIdclient() {
        return idclient;
    }

    public void setIdclient(Client idclient) {
        this.idclient = idclient;
    }

  
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Croisiere getIdCroisiere() {
        return idCroisiere;
    }

    public void setIdCroisiere(Croisiere idCroisiere) {
        this.idCroisiere = idCroisiere;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    
    
    
}
