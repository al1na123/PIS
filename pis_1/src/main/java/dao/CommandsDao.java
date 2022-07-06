package dao;

import entities.Commands;


import java.sql.SQLException;
import java.util.Optional;

public interface CommandsDao extends CRUDDao<Commands, Integer> {
    Optional<Commands> get(String name) throws SQLException;
}
