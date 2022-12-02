package fr.eni.tachan.dal;

import fr.eni.tachan.bo.Player;

import java.sql.SQLException;
import java.util.List;

public class DAOPlayer implements DAO<Player> {
    @Override
    public Player selectById(int id) throws DALExceptions, SQLException {
        return null;
    }

    @Override
    public List<Player> selectAll(int id) throws DALExceptions, SQLException {
        return null;
    }

    @Override
    public void update(Player objet) throws DALExceptions, SQLException {

    }

    @Override
    public void insert(Player objet) throws DALExceptions, SQLException {

    }

    @Override
    public void delete(Player objet) throws DALExceptions, SQLException {

    }
}
