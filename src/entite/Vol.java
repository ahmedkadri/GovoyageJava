/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entite;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author USER
 */
public class Vol {
    private int IdVol;
    private int Prix;
    private int NombrePlace;
    private String DateVol;
    private String PaysDestination;
    private String PaysDepart;
    private String Description;
    private String NomVol;

    public Vol() {
    }

    public Vol(int IdVol, int Prix, int NombrePlace, String DateVol, String PaysDestination, String PaysDepart, String Description,String NomVol) {
        this.IdVol = IdVol;
        this.Prix = Prix;
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

    public int getPrix() {
        return Prix;
    }

    public void setPrix(int Prix) {
        this.Prix = Prix;
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
        int hash = 5;
        hash = 29 * hash + this.IdVol;
        hash = 29 * hash + Float.floatToIntBits(this.Prix);
        hash = 29 * hash + this.NombrePlace;
        hash = 29 * hash + Objects.hashCode(this.DateVol);
        hash = 29 * hash + Objects.hashCode(this.PaysDestination);
        hash = 29 * hash + Objects.hashCode(this.PaysDepart);
        hash = 29 * hash + Objects.hashCode(this.Description);
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
        final Vol other = (Vol) obj;
        if (this.IdVol != other.IdVol) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vol{" + "IdVol=" + IdVol + ", Prix=" + Prix + ", NombrePlace=" + NombrePlace + ", DateVol=" + DateVol + ", PaysDestination=" + PaysDestination + ", PaysDepart=" + PaysDepart + ", Description=" + Description + '}';
    }
    
}
