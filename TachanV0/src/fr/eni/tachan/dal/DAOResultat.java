package fr.eni.tachan.dal;

import fr.eni.tachan.bo.Resultat;

import java.sql.SQLException;
import java.util.List;

public class DAOResultat implements DAO<Resultat> {
    @Override
    public Resultat selectById(int id) throws DALExceptions, SQLException {
        return null;
    }

    @Override
    public List<Resultat> selectAll(int id) throws DALExceptions, SQLException {
        return null;
    }

    @Override
    public void update(Resultat objet) throws DALExceptions, SQLException {

    }

    @Override
    public void insert(Resultat objet) throws DALExceptions, SQLException {

    }

    @Override
    public void delete(Resultat objet) throws DALExceptions, SQLException {

    }
}
