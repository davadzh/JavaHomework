package dao;

import models.StudentAnswer;
import models.Test;
import models.TestList;
import utils.HibernateSessionFactoryUtil;

import java.util.ArrayList;
import java.util.List;

public class StudentAnswerDao extends GeneralDao<StudentAnswer>{

    public StudentAnswer findById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(StudentAnswer.class, id);
    }

    public List<StudentAnswer> findAll(){
        return (List<StudentAnswer>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From StudentAnswer").list();
    }

    public List<TestList> getTestsByStudentId(int id)
    {
        List<StudentAnswer> studentAnswers = findAll();
        ArrayList<TestList> tests = new ArrayList<>();
        for (StudentAnswer a:
                studentAnswers) {
            if (a.getUser().getRow_id() == id) tests.add(a.getTest());
        }

        return tests;
    }
}