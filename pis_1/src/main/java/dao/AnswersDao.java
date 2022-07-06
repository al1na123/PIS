package dao;

import entities.dto.AnswersDTO;

import java.sql.SQLException;
import java.util.List;

public interface AnswersDao extends CRUDDao<AnswersDTO, Integer>{
    List<AnswersDTO> get(String answer) throws SQLException;
}