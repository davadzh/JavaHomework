package services;

import dao.AnswerDao;
import models.Answer;

public class AnswerService {
    private AnswerDao answerDao = new AnswerDao();

    public AnswerService(){}

    public void saveAnswer(Answer answer){
        answerDao.save(answer);
    }

    public Answer findAnswer(int id){
        return answerDao.findById(id);
    }
}
