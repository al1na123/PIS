package dao;

import entities.dto.TipDTO;

import java.sql.SQLException;
import java.util.List;

public interface TipsDao extends CRUDDao<TipDTO, Integer>{
    List<TipDTO> get(String tip) throws SQLException;
}