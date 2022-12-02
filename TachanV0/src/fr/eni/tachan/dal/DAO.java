package fr.eni.tachan.dal;

import java.sql.SQLException;
import java.util.List;

public interface DAO <T> {

    public abstract T selectById (int id) throws DALExceptions, SQLException;
    public abstract List<T> selectAll (int id) throws DALExceptions, SQLException;
    public abstract void update (T objet) throws DALExceptions, SQLException;
    public abstract void insert(T objet) throws DALExceptions, SQLException;
    public abstract  void delete(T objet) throws DALExceptions, SQLException;


}
