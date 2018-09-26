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
public class OffreVol {
    
    
    private int IdVol;
    private int Reduction;
    private float Prix;
    private Date Date_Debut;
    private Date Date_Fin;
    private int NombrePlace;
    private String DateVol;
    private String PaysDestination;
    private String PaysDepart;
    private String Description;
    private String NomVol;

    public OffreVol() {
    }

    public OffreVol(int IdVol,int Reduction , float Prix,Date Date_Debut,Date Date_Fin, int NombrePlace, String DateVol, String PaysDestination, String PaysDepart, String Description,String NomVol) {
        this.IdVol = IdVol;
        this.Reduction = Reduction;
        this.Prix = Prix;
        this.Date_Debut = Date_Debut;
        this.Date_Fin = Date_Fin;
        this.NombrePlace = NombrePlace;
        this.DateVol = DateVol;
        this.PaysDestination = PaysDestination;
        this.PaysDepart = PaysDepart;
        this.Description = Description;
        this.NomVol = NomVol;
    }

    public int getIdVol() {
        return IdVol;
    }

    public void setIdVol(int IdVol) {
        this.IdVol = IdVol;
    }

    public int getReduction() {
        return Reduction;
    }

    public void setReduction(int Reduction) {
        this.Reduction = Reduction;
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

    public String getDateVol() {
        return DateVol;
    }

    public void setDateVol(String DateVol) {
        this.DateVol = DateVol;
    }

    public String getPaysDestination() {
        return PaysDestination;
    }

    public void setPaysDestination(String PaysDestination) {
        this.PaysDestination = PaysDestination;
    }

    public String getPaysDepart() {
        return PaysDepart;
    }

    public void setPaysDepart(String PaysDepart) {
        this.PaysDepart = PaysDepart;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getNomVol() {
        return NomVol;
    }

    public void setNomVol(String NomVol) {
        this.NomVol = NomVol;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + this.IdVol;
        hash = 43 * hash + this.Reduction;
        hash = 43 * hash + Float.floatToIntBits(this.Prix);
        hash = 43 * hash + Objects.hashCode(this.Date_Debut);
        hash = 43 * hash + Objects.hashCode(this.Date_Fin);
        hash = 43 * hash + this.NombrePlace;
        hash = 43 * hash + Objects.hashCode(this.DateVol);
        hash = 43 * hash + Objects.hashCode(this.PaysDestination);
        hash = 43 * hash + Objects.hashCode(this.PaysDepart);
        hash = 43 * hash + Objects.hashCode(this.Description);
        hash = 43 * hash + Objects.hashCode(this.NomVol);
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
        final OffreVol other = (OffreVol) obj;
        if (this.IdVol != other.IdVol) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OffreVol{" + "IdVol=" + IdVol + ", Reduction=" + Reduction + ", Prix=" + Prix + ", Date_Debut=" + Date_Debut + ", Date_Fin=" + Date_Fin + ", NombrePlace=" + NombrePlace + ", DateVol=" + DateVol + ", PaysDestination=" + PaysDestination + ", PaysDepart=" + PaysDepart + ", Description=" + Description + ", NomVol=" + NomVol + '}';
    }
    
    
    
    
}
