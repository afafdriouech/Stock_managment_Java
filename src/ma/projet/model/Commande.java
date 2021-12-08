/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.model;

import java.util.Date;

/**
 *
 * @author afaf
 */
public class Commande {
     private String numCmd;
    private Date date;
    private int idCli;

    public Commande(String numCmd, Date date,int idCli) {
        this.numCmd = numCmd;
        this.date = date;
        this.idCli=idCli;
    }

    public Date getDate() {
        return date;
    }

    public String getNumCmd() {
        return numCmd;
    }

    public int getIdCli() {
        return idCli;
    }

    @Override
    public String toString() {
        return "Commande{" + "numCmd=" + numCmd + ", date=" + date + ", idCli=" + idCli + '}';
    }
    
}
