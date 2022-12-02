package fr.eni.tachan.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnexion {


     public static Connection seConnecter() throws DALExceptions {
         Connection cnx = null;
         String url,user,pwd = "";
         url = Settings.getProperties("url");
         user = Settings.getProperties("user");
         pwd = Settings.getProperties("pwd");

         try {
             cnx = DriverManager.getConnection(url, user, pwd);
         } catch (SQLException e) {
             throw new DALExceptions("Erreur de connexion",e);
         }
         return cnx;
     }

     public static void seDeconnecter(Connection cnx, Statement st) throws DALExceptions {
         if(st != null){
             try {
                 st.close();
             } catch (SQLException e) {
                 throw new DALExceptions("Erreur de déconnexion - fermeture de la connexion",e);
             }
         }
         if(cnx != null){
             try {
                 cnx.close();
             } catch (SQLException e) {
                 throw new DALExceptions("Erreur de déconnexion - fermeture du statment",e);
             }
         }
     }
}
