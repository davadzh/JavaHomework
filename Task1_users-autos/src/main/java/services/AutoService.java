package services;

import dao.AutoDao;
import models.Auto;
import models.User;

public class AutoService {
    private AutoDao autoDao = new AutoDao();

    public AutoService(){}

    public void saveAuto(Auto auto){
        autoDao.save(auto);
    }

    public Auto findAuto(int id){
        return autoDao.findById(id);
    }

    public User findOwnerByAutoId(int auto_id){
        return autoDao.getUserByAutoId(auto_id);
    }
}
