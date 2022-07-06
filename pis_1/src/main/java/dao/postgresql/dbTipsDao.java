package dao.postgresql;

import dao.ConvertService;
import dao.TipsDao;
import entities.dto.TipDTO;
import exception.ExceptionDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public record dbTipsDao(Connection connection) implements TipsDao {
    private static final int SUCCESSFUL_UPDATE = 1;

    private String getSelectAllQuery() {
        return "SELECT * FROM tips;";
    }

    private String getSelectByIdQuery() {
        return "SELECT * FROM tips WHERE (question_id = ?);";
    }

    private String getCreateQuery() {
        return "INSERT INTO tips (question_id,type,tip) VALUES (?,?,?);";
    }

    private String getUpdateQuery() {
        return "UPDATE tip SET question_id = ?, type = ?, tip = ? WHERE" +
                " (question_id = ?);";
    }

    private String getDeleteQuery() {
        return "DELETE FROM tips WHERE (question_id = ?) ;";
    }

    private TipDTO readObject(ResultSet resultSet) throws SQLException {
        return ConvertService.getTip(resultSet);
    }

    private List<TipDTO> readObjects(ResultSet resultSet) throws SQLException {
        List<TipDTO> objects = new ArrayList<>();

        while (resultSet.next()) {
            TipDTO object = readObject(resultSet);
            objects.add(object);
        }
        return objects;
    }


    @Override
    public List<TipDTO> getAll() throws SQLException {
        String query = getSelectAllQuery();

        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();

        return readObjects(resultSet);
    }
    @Override
    public Optional<TipDTO> get(Integer question_id) throws SQLException {
        String query = getSelectByIdQuery();

        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, question_id().qetQuestionsId);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            TipDTO object = readObject(resultSet);
            return Optional.of(object);
        } else
            return Optional.empty();
    }

    @Override
    public void save(TipDTO tipDTO) throws SQLException, ExceptionDao {
        String query = getCreateQuery();
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, tipDTO.getId().getQuestionId());

        if (statement.executeUpdate() < SUCCESSFUL_UPDATE)
            throw new ExceptionDao("Can't create the object");
    }

    @Override
    public void update(TipDTO tipDTO) throws SQLException, ExceptionDao {
        String query = getUpdateQuery();
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, tipDTO.getId().getQuestionId());

        if (statement.executeUpdate() < SUCCESSFUL_UPDATE)
            throw new ExceptionDao("Can't update the object");
    }

    @Override
    public void delete(Integer question_id) throws SQLException, ExceptionDao {
        String query = getDeleteQuery();
        PreparedStatement statement = connection.prepareStatement(query);

        statement.setInt(1, question_id.getQuestionId());
        if (statement.executeUpdate() < SUCCESSFUL_UPDATE)
            throw new DaoException("Can't delete the object");
    }
}







