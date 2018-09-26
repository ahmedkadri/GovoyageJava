/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentation;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "hotel", catalog = "govoyage1", schema = "")
@NamedQueries({
    @NamedQuery(name = "Hotel.findAll", query = "SELECT h FROM Hotel h"),
    @NamedQuery(name = "Hotel.findByIdHotel", query = "SELECT h FROM Hotel h WHERE h.idHotel = :idHotel"),
    @NamedQuery(name = "Hotel.findByNomHotel", query = "SELECT h FROM Hotel h WHERE h.nomHotel = :nomHotel"),
    @NamedQuery(name = "Hotel.findByNBEtoile", query = "SELECT h FROM Hotel h WHERE h.nBEtoile = :nBEtoile"),
    @NamedQuery(name = "Hotel.findByDescription", query = "SELECT h FROM Hotel h WHERE h.description = :description"),
    @NamedQuery(name = "Hotel.findByChambreType", query = "SELECT h FROM Hotel h WHERE h.chambreType = :chambreType"),
    @NamedQuery(name = "Hotel.findByVille", query = "SELECT h FROM Hotel h WHERE h.ville = :ville"),
    @NamedQuery(name = "Hotel.findByNombrePlace", query = "SELECT h FROM Hotel h WHERE h.nombrePlace = :nombrePlace"),
    @NamedQuery(name = "Hotel.findByPrixPC", query = "SELECT h FROM Hotel h WHERE h.prixPC = :prixPC"),
    @NamedQuery(name = "Hotel.findByPrixDP", query = "SELECT h FROM Hotel h WHERE h.prixDP = :prixDP"),
    @NamedQuery(name = "Hotel.findByPrixLPD", query = "SELECT h FROM Hotel h WHERE h.prixLPD = :prixLPD"),
    @NamedQuery(name = "Hotel.findByPhoto", query = "SELECT h FROM Hotel h WHERE h.photo = :photo"),
    @NamedQuery(name = "Hotel.findByIdUser", query = "SELECT h FROM Hotel h WHERE h.idUser = :idUser")})
public class Hotel implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdHotel")
    private Integer idHotel;
    @Column(name = "NomHotel")
    private String nomHotel;
    @Column(name = "NBEtoile")
    private Integer nBEtoile;
    @Column(name = "Description")
    private String description;
    @Column(name = "ChambreType")
    private String chambreType;
    @Column(name = "Ville")
    private String ville;
    @Column(name = "NombrePlace")
    private Integer nombrePlace;
    @Column(name = "PrixPC")
    private Integer prixPC;
    @Column(name = "PrixDP")
    private Integer prixDP;
    @Column(name = "PrixLPD")
    private Integer prixLPD;
    @Column(name = "Photo")
    private String photo;
    @Column(name = "IdUser")
    private Integer idUser;

    public Hotel() {
    }

    public Hotel(Integer idHotel) {
        this.idHotel = idHotel;
    }

    public Integer getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Integer idHotel) {
        Integer oldIdHotel = this.idHotel;
        this.idHotel = idHotel;
        changeSupport.firePropertyChange("idHotel", oldIdHotel, idHotel);
    }

    public String getNomHotel() {
        return nomHotel;
    }

    public void setNomHotel(String nomHotel) {
        String oldNomHotel = this.nomHotel;
        this.nomHotel = nomHotel;
        changeSupport.firePropertyChange("nomHotel", oldNomHotel, nomHotel);
    }

    public Integer getNBEtoile() {
        return nBEtoile;
    }

    public void setNBEtoile(Integer nBEtoile) {
        Integer oldNBEtoile = this.nBEtoile;
        this.nBEtoile = nBEtoile;
        changeSupport.firePropertyChange("NBEtoile", oldNBEtoile, nBEtoile);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        String oldDescription = this.description;
        this.description = description;
        changeSupport.firePropertyChange("description", oldDescription, description);
    }

    public String getChambreType() {
        return chambreType;
    }

    public void setChambreType(String chambreType) {
        String oldChambreType = this.chambreType;
        this.chambreType = chambreType;
        changeSupport.firePropertyChange("chambreType", oldChambreType, chambreType);
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        String oldVille = this.ville;
        this.ville = ville;
        changeSupport.firePropertyChange("ville", oldVille, ville);
    }

    public Integer getNombrePlace() {
        return nombrePlace;
    }

    public void setNombrePlace(Integer nombrePlace) {
        Integer oldNombrePlace = this.nombrePlace;
        this.nombrePlace = nombrePlace;
        changeSupport.firePropertyChange("nombrePlace", oldNombrePlace, nombrePlace);
    }

    public Integer getPrixPC() {
        return prixPC;
    }

    public void setPrixPC(Integer prixPC) {
        Integer oldPrixPC = this.prixPC;
        this.prixPC = prixPC;
        changeSupport.firePropertyChange("prixPC", oldPrixPC, prixPC);
    }

    public Integer getPrixDP() {
        return prixDP;
    }

    public void setPrixDP(Integer prixDP) {
        Integer oldPrixDP = this.prixDP;
        this.prixDP = prixDP;
        changeSupport.firePropertyChange("prixDP", oldPrixDP, prixDP);
    }

    public Integer getPrixLPD() {
        return prixLPD;
    }

    public void setPrixLPD(Integer prixLPD) {
        Integer oldPrixLPD = this.prixLPD;
        this.prixLPD = prixLPD;
        changeSupport.firePropertyChange("prixLPD", oldPrixLPD, prixLPD);
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        String oldPhoto = this.photo;
        this.photo = photo;
        changeSupport.firePropertyChange("photo", oldPhoto, photo);
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        Integer oldIdUser = this.idUser;
        this.idUser = idUser;
        changeSupport.firePropertyChange("idUser", oldIdUser, idUser);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHotel != null ? idHotel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hotel)) {
            return false;
        }
        Hotel other = (Hotel) object;
        if ((this.idHotel == null && other.idHotel != null) || (this.idHotel != null && !this.idHotel.equals(other.idHotel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Presentation.Hotel[ idHotel=" + idHotel + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
