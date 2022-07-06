import dao.CommandsDao;
import dao.QuestionsDao;
import entities.Questions;
import entities.Commands;
import enums.database;
import exception.UnimplementedDB;
import factory.dao_factory;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String args[]) throws UnimplementedDB, SQLException {
        dao_factory factory = dao_factory.getDaoFactory(database.PostgreSQL);
        CommandsDao commandsDao = factory.getCommandsDao();
        List<Comannds> commands = commandsDao.getAll();

        System.out.println("Get all commands:");

        for(Comands command:commands){
            System.out.println(String.format("Command with %d, name -> %s",command.getId(),
                   command.getName());
        }

        QuestionsDao questionsDao = factory.getQuestionsDao();
        List<Questions> questions = questionsDao.getAll();

        System.out.println("Get all questions:");

        for(Questions question : questions){
            System.out.println(String.format("Question with %d, pack_num -> %d, questtion -> %s", question.getId(),
                    question.getType(), question.getName()));
        }
    }
}