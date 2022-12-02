package fr.eni.tachan.dal;

import fr.eni.tachan.bo.Game;

import java.sql.SQLException;
import java.util.List;

public class DAOGame implements DAO<Game> {
    @Override
    public Game selectById(int id) throws DALExceptions, SQLException {
        return null;
    }

    @Override
    public List<Game> selectAll(int id) throws DALExceptions, SQLException {
        return null;
    }

    @Override
    public void update(Game objet) throws DALExceptions, SQLException {

    }

    @Override
    public void insert(Game objet) throws DALExceptions, SQLException {

    }

    @Override
    public void delete(Game objet) throws DALExceptions, SQLException {

    }
}
