/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author ahmed
 */
public class OffreCroisiere {
    
    private int IdCroisiere;
    private int Reduction;
    private String Nomcrois ;
    private float Prix;
    private Date Date_Debut;
    private Date Date_Fin;
    private int NombrePlace;
    private String DateDepart;
    private int NBJour;
    private String VilleDepart;
    private String VilleDestination;
    private String Description;
    
   public OffreCroisiere() {

    }
    
    
       public OffreCroisiere(int IdCroisiere,int Reduction,String Nomcrois, float Prix,Date Date_Debut,Date Date_Fin, int NombrePlace, String DateDepart, int NBJour, String VilleDepart, String VilleDestination, String Description) 
       {
        this.IdCroisiere = IdCroisiere;
        this.Reduction = Reduction;
        this.Nomcrois = Nomcrois;
        this.Prix = Prix;
        this.Date_Debut = Date_Debut;
        this.Date_Fin = Date_Fin;
        this.NombrePlace = NombrePlace;
        this.DateDepart = DateDepart;
        this.NBJour = NBJour;
        this.VilleDepart = VilleDepart;
        this.VilleDestination = VilleDestination;
        this.Description = Description;
       }

    public OffreCroisiere(float Prix,String Nomcrois) {

      
        this.Prix = Prix;
         this.Nomcrois = Nomcrois;
    }

    public int getIdCroisiere() {
        return IdCroisiere;
    }

    public void setIdCroisiere(int IdCroisiere) {
        this.IdCroisiere = IdCroisiere;
    }

    public int getReduction() {
        return Reduction;
    }

    public void setReduction(int Reduction) {
        this.Reduction = Reduction;
    }

    public String getNomcrois() {
        return Nomcrois;
    }

    public void setNomcrois(String Nomcrois) {
        this.Nomcrois = Nomcrois;
    }

    public float getPrix() {
        return Prix;
    }

    public void setPrix(float Prix) {
        this.Prix = Prix;
    }

    public Date getDate_Debut() {
        return Date_Debut;
    }

    public void setDate_Debut(Date Date_Debut) {
        this.Date_Debut = Date_Debut;
    }

    public Date getDate_Fin() {
        return Date_Fin;
    }

    public void setDate_Fin(Date Date_Fin) {
        this.Date_Fin = Date_Fin;
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
        int hash = 7;
        hash = 19 * hash + this.IdCroisiere;
        hash = 19 * hash + this.Reduction;
        hash = 19 * hash + Objects.hashCode(this.Nomcrois);
        hash = 19 * hash + Objects.hashCode(this.Prix);
        hash = 19 * hash + Objects.hashCode(this.Date_Debut);
        hash = 19 * hash + Objects.hashCode(this.Date_Fin);
        hash = 19 * hash + this.NombrePlace;
        hash = 19 * hash + Objects.hashCode(this.DateDepart);
        hash = 19 * hash + this.NBJour;
        hash = 19 * hash + Objects.hashCode(this.VilleDepart);
        hash = 19 * hash + Objects.hashCode(this.VilleDestination);
        hash = 19 * hash + Objects.hashCode(this.Description);
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
        final OffreCroisiere other = (OffreCroisiere) obj;
        if (this.IdCroisiere != other.IdCroisiere) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OffreCroisiere{" + "IdCroisiere=" + IdCroisiere + ", Reduction=" + Reduction + ", Nomcrois=" + Nomcrois + ", Prix=" + Prix + ", Date_Debut=" + Date_Debut + ", Date_Fin=" + Date_Fin + ", NombrePlace=" + NombrePlace + ", DateDepart=" + DateDepart + ", NBJour=" + NBJour + ", VilleDepart=" + VilleDepart + ", VilleDestination=" + VilleDestination + ", Description=" + Description + '}';
    }
 
       
}
