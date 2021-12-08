/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.ResultSet;
import ma.societe.connexion.*;
import ma.societe.service.*;
import ma.projet.model.*;
/**
 *
 * @author afaf
 */
public class test {
    public static void main(String []args){
        //Connexion.conCommande();
        clientTransaction L=new clientTransaction();
        
        //Client A=new Client("driouech","afaf","F","branes");
        //Client E=new Client("nom1","nadia","F","val fleuri");
        //Client C=new Client("","afaf","F","branes");
        //L.Create(E);
        //L.Update(E);
        //L.delete(3);
        //for(Client C: L.recuperer())
            //System.out.println(C.toString());
         //L.Update(E);
        
       L.rechercher("manal");
       //ResultSet A;
       //System.out.println(A.getInt(1));     
         
    }
}
