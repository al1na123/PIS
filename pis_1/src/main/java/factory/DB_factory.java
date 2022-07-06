package factory;

import dao.*;
import dao.postgresql.*;
import db.connection_file;

import java.sql.Connection;

public class DB_factory extends dao_factory {
    private final Connection connection;

    public DB_factory() {
        connection = connection_file.getInstance().getConnection();
    }

    @Override
    public CommandsDao getCommandsDao() {
        return new dbCommandsDao(connection);
    }

    @Override
    public QuestionsDao getQuestionsDao() {
        return new dbQuestionDao(connection);
    }

    @Override
    public AnswersDao getAnswersDao() {
        return new dbAnswersDao(connection);
    }

    @Override
    public TipsDao getTipsDao() {
        return new dbTipsDao(connection);
    }

    @Override
    public ResultsDao getResultsDao() {
        return new dbResultsDao(connection);
    }

}