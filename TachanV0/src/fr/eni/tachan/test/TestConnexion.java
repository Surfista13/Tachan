package fr.eni.tachan.test;

import fr.eni.tachan.dal.DALExceptions;
import fr.eni.tachan.dal.DBConnexion;

import java.sql.Connection;

public class TestConnexion {

    public static void main(String[] args) {
        try{
            Connection cnx = DBConnexion.seConnecter();
            System.out.println("Connexion OK");
        } catch (DALExceptions e) {
            System.out.println("Connexion KO");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
}
