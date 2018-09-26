/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entite;

import java.util.Objects;

/**
 *
 * @author USER
 */
public class Hotel {
    private int IdHotel;
    private String NomHotel;
    private int NBEtoile;
    private String description;
    private String ChambreType;
    private String Ville;
    private int NombrePlace;
    private int PrixPC;
     private int PrixDP;
      private int PrixLPD;
      private String Photo;

    public Hotel() {
    }

    public Hotel(int IdHotel, String NomHotel, int NBEtoile, String description, String ChambreType, String Ville, int NombrePlace, int PrixPC, int PrixDP, int PrixLPD, String Photo) {
        this.IdHotel = IdHotel;
        this.NomHotel = NomHotel;
        this.NBEtoile = NBEtoile;
        this.description = description;
        this.ChambreType = ChambreType;
        this.Ville = Ville;
        this.NombrePlace = NombrePlace;
        this.PrixPC = PrixPC;
        this.PrixDP = PrixDP;
        this.PrixLPD = PrixLPD;
        this.Photo=Photo;
    }

    public int getIdHotel() {
        return IdHotel;
    }

    public void setIdHotel(int IdHotel) {
        this.IdHotel = IdHotel;
    }

    public String getNomHotel() {
        return NomHotel;
    }

    public void setNomHotel(String NomHotel) {
        this.NomHotel = NomHotel;
    }

    public int getNBEtoile() {
        return NBEtoile;
    }

    public void setNBEtoile(int NBEtoile) {
        this.NBEtoile = NBEtoile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChambreType() {
        return ChambreType;
    }

    public void setChambreType(String ChambreType) {
        this.ChambreType = ChambreType;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    public int getNombrePlace() {
        return NombrePlace;
    }

    public void setNombrePlace(int NombrePlace) {
        this.NombrePlace = NombrePlace;
    }

    public int getPrixPC() {
        return PrixPC;
    }

    public void setPrixPC(int PrixPC) {
        this.PrixPC = PrixPC;
    }

    public int getPrixDP() {
        return PrixDP;
    }

    public void setPrixDP(int PrixDP) {
        this.PrixDP = PrixDP;
    }

    public int getPrixLPD() {
        return PrixLPD;
    }

    public void setPrixLPD(int PrixLPD) {
        this.PrixLPD = PrixLPD;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.IdHotel;
        hash = 61 * hash + Objects.hashCode(this.NomHotel);
        hash = 61 * hash + Objects.hashCode(this.description);
        hash = 61 * hash + Objects.hashCode(this.ChambreType);
        hash = 61 * hash + Objects.hashCode(this.Ville);
        hash = 61 * hash + this.NombrePlace;
        hash = 61 * hash + Float.floatToIntBits(this.PrixPC);
        hash = 61 * hash + Float.floatToIntBits(this.PrixDP);
        hash = 61 * hash + Float.floatToIntBits(this.PrixLPD);
        hash = 61 * hash + Objects.hashCode(this.Photo);
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
        final Hotel other = (Hotel) obj;
        if (this.IdHotel != other.IdHotel) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Hotel{" + "IdHotel=" + IdHotel + ", NomHotel=" + NomHotel + ", NBEtoile=" + NBEtoile + ", description=" + description + ", ChambreType=" + ChambreType + ", Ville=" + Ville + ", NombrePlace=" + NombrePlace + ", PrixPC=" + PrixPC + ", PrixDP=" + PrixDP + ", PrixLPD=" + PrixLPD + ", Photo=" + Photo + '}';
    }
      
    
            
    
}
