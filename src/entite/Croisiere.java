/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entite;


import java.util.Date;
import java.util.Objects;
public class Croisiere {
     private int IdCroisiere;
     private String Nomcrois ;
    private String Prix;
    private int NombrePlace;
    private String DateDepart;
    private int NBJour;
    private String VilleDepart;
    private String VilleDestination;
    private String Description;

    public Croisiere() {
    }

    public Croisiere(String Nomcrois, String Prix, int NombrePlace, String DateDepart, int NBJour, String VilleDepart, String VilleDestination, String Description) {
        this.Nomcrois = Nomcrois;
        this.Prix = Prix;
        this.NombrePlace = NombrePlace;
        this.DateDepart = DateDepart;
        this.NBJour = NBJour;
        this.VilleDepart = VilleDepart;
        this.VilleDestination = VilleDestination;
        this.Description = Description;
    }

    public Croisiere(int IdCroisiere,String Nomcrois, String Prix, int NombrePlace, String DateDepart, int NBJour, String VilleDepart, String VilleDestination, String Description) {
        this.IdCroisiere = IdCroisiere;
        this.Nomcrois = Nomcrois;
        this.Prix = Prix;
        this.NombrePlace = NombrePlace;
        this.DateDepart = DateDepart;
        this.NBJour = NBJour;
        this.VilleDepart = VilleDepart;
        this.VilleDestination = VilleDestination;
        this.Description = Description;
    }

    public int getIdCroisiere() {
        return IdCroisiere;
    }

    public void setIdCroisiere(int IdCroisiere) {
        this.IdCroisiere = IdCroisiere;
    }

    public String getNomcrois() {
        return Nomcrois;
    }

    public void setNomcrois(String Nomcrois) {
        this.Nomcrois = Nomcrois;
    }
    
    

    public String getPrix() {
        return Prix;
    }

    public void setPrix(String Prix) {
        this.Prix = Prix;
    }

    public int getNombrePlace() {
        return NombrePlace;
    }

    public void setNombrePlace(int NombrePlace) {
        this.NombrePlace = NombrePlace;
    }

    public String getDateDepart() {
        return DateDepart;
    }

    public void setDateDepart(String DateDepart) {
        this.DateDepart = DateDepart;
    }

    public int getNBJour() {
        return NBJour;
    }

    public void setNBJour(int NBJour) {
        this.NBJour = NBJour;
    }

    public String getVilleDepart() {
        return VilleDepart;
    }

    public void setVilleDepart(String VilleDepart) {
        this.VilleDepart = VilleDepart;
    }

    public String getVilleDestination() {
        return VilleDestination;
    }

    public void setVilleDestination(String VilleDestination) {
        this.VilleDestination = VilleDestination;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.IdCroisiere;
//        hash = 53 * hash + this.Prix;
        hash = 53 * hash + this.NombrePlace;
        hash = 53 * hash + Objects.hashCode(this.DateDepart);
        hash = 53 * hash + this.NBJour;
        hash = 53 * hash + Objects.hashCode(this.VilleDepart);
        hash = 53 * hash + Objects.hashCode(this.VilleDestination);
        hash = 53 * hash + Objects.hashCode(this.Description);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Croisiere other = (Croisiere) obj;
        if (this.IdCroisiere != other.IdCroisiere) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Croisiere{" + "IdCroisiere=" + IdCroisiere + ", Prix=" + Prix + ", NombrePlace=" + NombrePlace + ", DateDepart=" + DateDepart + ", NBJour=" + NBJour + ", VilleDepart=" + VilleDepart + ", VilleDestination=" + VilleDestination + ", Description=" + Description + '}';
    }
    
    
}
