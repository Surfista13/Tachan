package fr.eni.tachan.dal;

import fr.eni.tachan.bo.Sequence;

import java.sql.SQLException;
import java.util.List;

public class DAOSequence implements DAO <Sequence> {

    @Override
    public Sequence selectById(int id) throws DALExceptions, SQLException {
        return null;
    }

    @Override
    public List<Sequence> selectAll(int id) throws DALExceptions, SQLException {
        return null;
    }

    @Override
    public void update(Sequence objet) throws DALExceptions, SQLException {

    }

    @Override
    public void insert(Sequence objet) throws DALExceptions, SQLException {

    }

    @Override
    public void delete(Sequence objet) throws DALExceptions, SQLException {

    }
}
