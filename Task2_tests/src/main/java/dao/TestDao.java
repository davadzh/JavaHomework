package dao;

import models.Test;
import models.TestList;
import models.User;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class TestDao extends GeneralDao<Test>{

    public Test findById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Test.class, id);
    }

    public List<Test> findAll(){
        return (List<Test>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Test").list();
    }
}