package dao;

import entities.dto.ResultsDTO;

import java.sql.SQLException;
import java.util.List;

public interface ResultsDao extends CRUDDao<ResultsDTO, Integer>{
    List<ResultsDTO> get(int grade) throws SQLException;
}