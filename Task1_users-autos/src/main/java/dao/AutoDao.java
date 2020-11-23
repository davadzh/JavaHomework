package dao;

import models.Auto;
import models.User;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class AutoDao extends GeneralDao<Auto>{

    public Auto findById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Auto.class, id);
    }

    public List<Auto> findAll(){
        return (List<Auto>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Auto").list();
    }

    public User getUserByAutoId(int id){
        var auto = findById(id);
        if (auto == null){
            throw new NullPointerException();
        }
        return auto.getUser();
    }
}
