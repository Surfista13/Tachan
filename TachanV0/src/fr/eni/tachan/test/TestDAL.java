package fr.eni.tachan.test;

import fr.eni.tachan.bo.Couleur;
import fr.eni.tachan.dal.DAO;
import fr.eni.tachan.dal.DAOFactory;

public class TestDAL {

    public static void main(String[] args) {
        DAO<Couleur> couleurDAO = DAOFactory.getDAOCouleurs();
    }
}
