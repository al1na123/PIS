package dao;

import entities.Answers;
import entities.Commands;
import entities.Questions;
import entities.Tips;
import entities.dto.*;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ConvertService {
    public static AnswersDTO getAnswers(ResultSet resultSet) throws SQLException {
        return AnswersDTO.builder()
                .question_id(resultSet.getInt("question_id"))
                .type(resultSet.getString("type"))
                .answer(resultSet.getString("answer"))
                .build();
    }

    public static Commands getCommand(ResultSet resultSet) throws SQLException {
        return Commands.builder()
                .id(resultSet.getInt("id"))
                .name(resultSet.getString("name"))
                .build();
    }

    public static Questions getQuestions(ResultSet resultSet) throws SQLException {
        return Questions.builder()
                .id(resultSet.getInt("id"))
                .pack_num(resultSet.getInt("pack_num"))
                .type(resultSet.getString("type"))
                .question(resultSet.getString("question"))
                .build();
    }


    public static ResultsDTO getResults(ResultSet resultSet) throws SQLException {
        return ResultsDTO.builder()
                .pack_num(resultSet.getInt("pack_num"))
                .command_id(resultSet.getInt("command_id"))
                .grade(resultSet.getInt("grade"))
                .build();
    }

    public static TipDTO getTip(ResultSet resultSet) throws SQLException {
        return TipDTO.builder()
                .question_id(resultSet.getInt("question_id"))
                .type(resultSet.getString("type"))
                .tip(resultSet.getString("tip"))
                .build();
    }

}