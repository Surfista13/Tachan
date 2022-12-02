package fr.eni.tachan.dal;

import fr.eni.tachan.bo.Round;

import java.sql.SQLException;
import java.util.List;

public class DAORound implements DAO<Round> {
    @Override
    public Round selectById(int id) throws DALExceptions, SQLException {
        return null;
    }

    @Override
    public List<Round> selectAll(int id) throws DALExceptions, SQLException {
        return null;
    }

    @Override
    public void update(Round objet) throws DALExceptions, SQLException {

    }

    @Override
    public void insert(Round objet) throws DALExceptions, SQLException {

    }

    @Override
    public void delete(Round objet) throws DALExceptions, SQLException {

    }
}
