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
public class OffreHotel {
    
    private int IdHotel;
    private int Reduction;
    private String NomHotel;
    private String Ville;
    private String Description;
    private Date Date_Debut;
    private Date Date_Fin;
    private float PrixPC;
    private float PrixDP;
    private float PrixLPD;
    private String ChambreType;
    private int NBEtoiles;
    private int Disponibiliter;

   
      
      
        public OffreHotel() 
        {
        }

    public OffreHotel(int IdHotel,int Reduction ,String NomHotel, String Ville, String Description,Date Date_Debut,Date Date_fin, float PrixPC, float PrixDP, float PrixLPD, String ChambreType, int NBEtoile, int Disponibiliter) 
    {
       
        this.IdHotel = IdHotel;
        this.Reduction = Reduction;
        this.NomHotel = NomHotel;
        this.Ville = Ville;
        this.Description = Description;
        this.Date_Debut = Date_Debut;
        this.Date_Fin = Date_fin;
        this.PrixPC = PrixPC;
        this.PrixDP = PrixDP;
        this.PrixLPD = PrixLPD;
        this.ChambreType = ChambreType;
        this.NBEtoiles = NBEtoile;
        this.Disponibiliter = Disponibiliter;
    
    }

    
    
    
    public int getIdHotel() {
        return IdHotel;
    }

    public void setIdHotel(int IdHotel) {
        this.IdHotel = IdHotel;
    }

    public int getReduction() {
        return Reduction;
    }

    public void setReduction(int Reduction) {
        this.Reduction = Reduction;
    }

    public String getNomHotel() {
        return NomHotel;
    }

    public void setNomHotel(String NomHotel) {
        this.NomHotel = NomHotel;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
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

    public float getPrixPC() {
        return PrixPC;
    }

    public void setPrixPC(float PrixPC) {
        this.PrixPC = PrixPC;
    }

    public float getPrixDP() {
        return PrixDP;
    }

    public void setPrixDP(float PrixDP) {
        this.PrixDP = PrixDP;
    }

    public float getPrixLPD() {
        return PrixLPD;
    }

    public void setPrixLPD(float PrixLPD) {
        this.PrixLPD = PrixLPD;
    }
    
    


    public String getChambreType() {
        return ChambreType;
    }

    public void setChambreType(String ChambreType) {
        this.ChambreType = ChambreType;
    }

    public int getNBEtoiles() {
        return NBEtoiles;
    }

    public void setNBEtoiles(int NBEtoiles) {
        this.NBEtoiles = NBEtoiles;
    }

    public int getDisponibiliter() {
        return Disponibiliter;
    }

    public void setDisponibiliter(int Disponibiliter) {
        this.Disponibiliter = Disponibiliter;
    }

    @Override
    public String toString() {
        return "OffreHotel{" + "IdHotel=" + IdHotel + ", Reduction=" + Reduction + ", NomHotel=" + NomHotel + ", Ville=" + Ville + ", Description=" + Description + ", Date_Debut=" + Date_Debut + ", Date_Fin=" + Date_Fin + ", PrixPC=" + PrixPC + ", PrixDP=" + PrixDP + ", PrixLPD=" + PrixLPD + ", ChambreType=" + ChambreType + ", NBEtoiles=" + NBEtoiles + ", Disponibiliter=" + Disponibiliter + '}';
    }

  

   

   

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + this.IdHotel;
        hash = 73 * hash + this.Reduction;
        hash = 73 * hash + Objects.hashCode(this.NomHotel);
        hash = 73 * hash + Objects.hashCode(this.Ville);
        hash = 73 * hash + Objects.hashCode(this.Description);
        hash = 73 * hash + Objects.hashCode(this.Date_Debut);
        hash = 73 * hash + Objects.hashCode(this.Date_Fin);
        hash = 73 * hash + Float.floatToIntBits(this.PrixPC);
        hash = 73 * hash + Float.floatToIntBits(this.PrixDP);
        hash = 73 * hash + Float.floatToIntBits(this.PrixLPD);
        hash = 73 * hash + Objects.hashCode(this.ChambreType);
        hash = 73 * hash + this.NBEtoiles;
        hash = 73 * hash + this.Disponibiliter;
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
        final OffreHotel other = (OffreHotel) obj;
        if (this.IdHotel != other.IdHotel) {
            return false;
        }
        return true;
    }


    
    
    
    
    
}



