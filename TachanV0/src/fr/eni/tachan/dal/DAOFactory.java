package fr.eni.tachan.dal;

public class DAOFactory {

    public static DAO getDAOCouleurs () {
        return new DAOCouleurs();
    }
    public static DAO getDAOSequence () {
        return new DAOSequence();
    }
    public static DAO getDAORound () {
        return new DAORound();
    }
    public static DAO getDAOResultat () {
        return new DAOResultat();
    }
    public static DAO getDAOPlayer () {
        return new DAOPlayer();
    }
    public static DAO getDAOGame () {
        return new DAOGame();
    }
}
