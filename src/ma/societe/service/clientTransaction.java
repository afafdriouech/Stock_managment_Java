/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.societe.service;
import ma.societe.connexion.*;
import ma.projet.model.*;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author afaf
 */
public class clientTransaction {
    
    private Connection cn=null;
    public boolean Create(Client C)
    {
        String req="insert into client (nom,prenom,sexe,adresse) values(?,?,?,?)";
        try{
        cn=Connexion.conCommande();
        PreparedStatement ps=cn.prepareStatement(req);
        ps.setString(1,C.getNom());
        ps.setString(2,C.getPrenom());
        ps.setString(3,C.getSexe());
        ps.setString(4,C.getAdresse());
        ps.executeUpdate();
        return true;
        }catch(Exception ex)
        {
            System.out.println(ex);
            return false;
        }   
    }
    public boolean Update(Client C)
    {
        String req="update client set nom =?, prenom =? ,sexe=? , adresse=? where idCli=? ";
        try{
        cn=Connexion.conCommande();
        PreparedStatement ps=cn.prepareStatement(req);
        ps.setString(1,C.getNom());
        ps.setString(2,C.getPrenom());
        ps.setString(3,C.getSexe());
        ps.setString(4,C.getAdresse());
        ps.setInt(5,C.getIdCli());
        ps.executeUpdate();
        return true;
        }catch(Exception ex)
        {
            System.out.println(ex);
            return false;
        }
    }
      public boolean delete(String idn)
    {
        String req="delete from client where idCli=?";
        try{
        cn=Connexion.conCommande();
        PreparedStatement ps=cn.prepareStatement(req);
        ps.setString(1,idn);
        ps.executeUpdate();
        return true;
        }catch(Exception ex)
        {
            System.out.println(ex);
            return false;
        } 
    }
      
      public ResultSet rechercher(String nom)
    {
        String req="select * from client where nom=?";
        try{
        cn=Connexion.conCommande();
        PreparedStatement ps=cn.prepareStatement(req);
        ps.setString(1,nom);    
        ResultSet res;
        res=ps.executeQuery();
        res.last();
        int nbr=res.getRow();
        if(nbr==1)
          //System.out.println("trouve");
        return res;
            //System.out.println("non");
         }catch(Exception ex)
        {
            System.out.println(ex);
        } 
        return null;
    }
      public ArrayList <Client> recuperer()
      {
        ArrayList <Client> T=new ArrayList<Client>(); 
        String req="select * from client";
        try{
            cn=Connexion.conCommande();
            Statement st=cn.createStatement();
            ResultSet res=st.executeQuery(req);
            while(res.next())
            {
                T.add(new Client(res.getInt("idCli"),res.getString("nom"),res.getString("prenom"),res.getString("sexe"),res.getString("adresse")));
            }
            return T;
        }catch(Exception ex)
        {
            System.out.println(ex);
            return null;
        }
      }
      
}
