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
public class User {
    private int IdUser;
    private String Login;
    private String MotDePasse;
    private String Email;
    private String Nom;
    private String Prenom;
    private String TypeOffrant;
    private String Pays;
    private String Ville;

    public User() {
    }

    public int getIdUser() {
        return IdUser;
    }

    public void setIdUser(int IdUser) {
        this.IdUser = IdUser;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getMotDePasse() {
        return MotDePasse;
    }

    public void setMotDePasse(String MotDePasse) {
        this.MotDePasse = MotDePasse;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getTypeOffrant() {
        return TypeOffrant;
    }

    public void setTypeOffrant(String TypeOffrant) {
        this.TypeOffrant = TypeOffrant;
    }

    public String getPays() {
        return Pays;
    }

    public void setPays(String Pays) {
        this.Pays = Pays;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    public User(int IdUser, String Login, String MotDePasse, String Email, String Nom, String Prenom, String TypeOffrant, String Pays, String Ville) {
        this.IdUser = IdUser;
        this.Login = Login;
        this.MotDePasse = MotDePasse;
        this.Email = Email;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.TypeOffrant = TypeOffrant;
        this.Pays = Pays;
        this.Ville = Ville;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.IdUser;
        hash = 43 * hash + Objects.hashCode(this.Login);
        hash = 43 * hash + Objects.hashCode(this.MotDePasse);
        hash = 43 * hash + Objects.hashCode(this.Email);
        hash = 43 * hash + Objects.hashCode(this.Nom);
        hash = 43 * hash + Objects.hashCode(this.Prenom);
        hash = 43 * hash + Objects.hashCode(this.TypeOffrant);
        hash = 43 * hash + Objects.hashCode(this.Pays);
        hash = 43 * hash + Objects.hashCode(this.Ville);
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
        final User other = (User) obj;
        if (this.IdUser != other.IdUser) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "IdUser=" + IdUser + ", Login=" + Login + ", MotDePasse=" + MotDePasse + ", Email=" + Email + ", Nom=" + Nom + ", Prenom=" + Prenom + ", TypeOffrant=" + TypeOffrant + ", Pays=" + Pays + ", Ville=" + Ville + '}';
    }

   
    
}
