package factory;

import dao.*;
import enums.databese;
import exception.UnimplementedDB;

public abstract class DaoFactory {
    public static DaoFactory getDaoFactory(database db) throws UnimplementedDB {
        switch (db) {
            case PostgreSQL -> {
                return new PostgreSQLFactory();
            }
            case MySQL, MongoDB -> {
                throw new UnimplementedDB();
            }
            default -> {
                return null;
            }
        }
    }

    public abstract CommandsDao getCommandsDao();

    public abstract QuestionsDao getQuestionsDao();

    public abstract AnswersDao getAnswersDao();

    public abstract TipsDao getTipsDao();

    public abstract ResultsDao getResultsDao();

}