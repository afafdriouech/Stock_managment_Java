/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.model;

/**
 *
 * @author afaf
 */
public class Client {
       private int idCli;
    private String nom;
    private String prenom;
    private String sexe;
    private String adresse;

    public Client(int idCli,String nom, String prenom, String sexe, String adresse) {
        this.idCli=idCli;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.adresse = adresse;
    }
    
     public Client(String nom, String prenom, String sexe, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.adresse = adresse;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Client{" + "idCli=" + idCli + ", nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe + ", adresse=" + adresse + '}';
    }

   
}
