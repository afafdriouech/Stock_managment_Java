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
public class LigneCmd {
    private int idLigneCmd;
    private int qte;
    private int idProd;
    private int idCmd;

    public LigneCmd(int idLigneCmd, int qte, int idProd, int idCmd) {
        this.idLigneCmd = idLigneCmd;
        this.qte = qte;
        this.idProd = idProd;
        this.idCmd = idCmd;
    }

    public int getIdCmd() {
        return idCmd;
    }

    public int getIdLigneCmd() {
        return idLigneCmd;
    }

    public int getIdProd() {
        return idProd;
    }

    public int getQte() {
        return qte;
    }
}
