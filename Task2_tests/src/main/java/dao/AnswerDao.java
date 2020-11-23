package dao;

import models.Answer;
import models.User;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class AnswerDao extends GeneralDao<Answer>{

    public Answer findById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Answer.class, id);
    }

    public List<Answer> findAll(){
        return (List<Answer>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Auto").list();
    }

}
