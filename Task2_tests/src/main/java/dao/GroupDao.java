package dao;

import models.Group;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class GroupDao extends GeneralDao<Group>{

    public Group findById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Group.class, id);
    }

    public List<Group> findAll(){
        return (List<Group>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Group").list();
    }

}
