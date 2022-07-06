package dao;

import exception.ExceptionDao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface CRUDDao<T, K> {
    List<T> getAll() throws SQLException;

    Optional<T> get(K id) throws SQLException;

    void save(T t) throws SQLException, ExceptionDao;

    void update(T t) throws SQLException, ExceptionDao;

    void delete(K id) throws SQLException, ExceptionDao;
}