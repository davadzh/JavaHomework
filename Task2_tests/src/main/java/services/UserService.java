package services;

import dao.TestDao;
import dao.UserDao;
import models.Test;
import models.User;

import java.util.List;

public class UserService {
    private UserDao userDao = new UserDao();

    public UserService(){}

    public void saveUser(User user){
        userDao.save(user);
    }

    public User findUser(int id){
        return userDao.findById(id);
    }

    public List<User> getTeachers() { return userDao.getTeachers(); }

    public List<User> getStudents() { return userDao.getStudents(); }
}
