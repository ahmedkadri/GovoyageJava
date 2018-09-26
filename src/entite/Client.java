/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entite;

import java.util.Objects;

public class Client {
    private int IdUser;
    private String Login;
    private String MotDePasse;
    private int estBlock;
    private String Email;
    private String Nom;
    private String Prenom;
    private int age;
    private String sexe;
     private String TypeOffrant;
      private String RoleUsers;
    private String Pays;
    private String Ville;

    
    public Client() {
    }

    public Client(int IdUser, String Login, String MotDePasse, int estBlock, String Email, String Nom, String Prenom, int age, String sexe, String TypeOffrant, String RoleUsers, String Pays, String Ville) {
        this.IdUser = IdUser;
        this.Login = Login;
        this.MotDePasse = MotDePasse;
        this.estBlock = estBlock;
        this.Email = Email;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.age = age;
        this.sexe = sexe;
        this.TypeOffrant = TypeOffrant;
        this.RoleUsers = RoleUsers;
        this.Pays = Pays;
        this.Ville = Ville;
  
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

    public int getEstBlock() {
        return estBlock;
    }

    public void setEstBlock(int estBlock) {
        this.estBlock = estBlock;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getTypeOffrant() {
        return TypeOffrant;
    }

    public void setTypeOffrant(String TypeOffrant) {
        this.TypeOffrant = TypeOffrant;
    }

    public String getRoleUsers() {
        return RoleUsers;
    }

    public void setRoleUsers(String RoleUsers) {
        this.RoleUsers = RoleUsers;
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


    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.IdUser;
        hash = 73 * hash + Objects.hashCode(this.Login);
        hash = 73 * hash + Objects.hashCode(this.MotDePasse);
        hash = 73 * hash + this.estBlock;
        hash = 73 * hash + Objects.hashCode(this.Email);
        hash = 73 * hash + Objects.hashCode(this.Nom);
        hash = 73 * hash + Objects.hashCode(this.Prenom);
        hash = 73 * hash + this.age;
        hash = 73 * hash + Objects.hashCode(this.sexe);
        hash = 73 * hash + Objects.hashCode(this.TypeOffrant);
        hash = 73 * hash + Objects.hashCode(this.RoleUsers);
        hash = 73 * hash + Objects.hashCode(this.Pays);
        hash = 73 * hash + Objects.hashCode(this.Ville);
       
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
        final Client other = (Client) obj;
        if (this.IdUser != other.IdUser) {
            return false;
        }
        return true;
    }

    @Override

   
    public String toString() {
        return "Client{" + "IdUser=" + IdUser + ", Login=" + Login + ", MotDePasse=" + MotDePasse + ", estBlock=" + estBlock + ", Email=" + Email + ", Nom=" + Nom + ", Prenom=" + Prenom + ", age=" + age + ", sexe=" + sexe + ", TypeOffrant=" + TypeOffrant + ", RoleUsers=" + RoleUsers + ", Pays=" + Pays + ", Ville=" + Ville + '}';
    }
 

   
   
   
    
    
}
