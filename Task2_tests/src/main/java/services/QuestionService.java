package services;

import dao.GroupDao;
import dao.QuestionDao;
import models.Group;
import models.Question;

public class QuestionService {
    private QuestionDao questionDao = new QuestionDao();

    public QuestionService(){}

    public void saveQuestion(Question question){
        questionDao.save(question);
    }

    public Question findQuestion(int id){
        return questionDao.findById(id);
    }
}
