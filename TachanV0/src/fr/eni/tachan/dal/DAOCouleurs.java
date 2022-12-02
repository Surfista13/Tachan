package fr.eni.tachan.dal;

import fr.eni.tachan.bo.Couleur;

import java.sql.SQLException;
import java.util.List;

public class DAOCouleurs implements DAO <Couleur> {
    @Override
    public Couleur selectById(int id) throws DALExceptions, SQLException {
        return null;
    }

    @Override
    public List<Couleur> selectAll(int id) throws DALExceptions, SQLException {
        return null;
    }

    @Override
    public void update(Couleur objet) throws DALExceptions, SQLException {

    }

    @Override
    public void insert(Couleur objet) throws DALExceptions, SQLException {

    }

    @Override
    public void delete(Couleur objet) throws DALExceptions, SQLException {

    }
}
