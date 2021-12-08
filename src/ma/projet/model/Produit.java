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
public class Produit {
    private int idProd;
    private String nom;
    private double prixU;

    public Produit(String nom, double prixU) {
        this.nom = nom;
        this.prixU = prixU;
    }

    public String getNom() {
        return nom;
    }

    public double getPrixU() {
        return prixU;
    }

    public int getIdProd() {
        return idProd;
    }

    @Override
    public String toString() {
        return "Produit{" + "idProd=" + idProd + ", nom=" + nom + ", prixU=" + prixU + '}';
    }
}
