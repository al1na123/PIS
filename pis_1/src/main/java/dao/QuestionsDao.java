package dao;

import entities.Questions;


import java.sql.SQLException;
import java.util.Optional;

public interface QuestionsDao extends CRUDDao<Questions, Integer> {
    Optional<Questions> get(String question) throws SQLException;
}

