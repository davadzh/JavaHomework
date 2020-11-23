package services;

import dao.RoleDao;
import models.Group;
import models.Role;

public class RoleService {
    private RoleDao roleDao = new RoleDao();

    public RoleService(){}

    public void saveRole(Role role){
        roleDao.save(role);
    }

    public Role findRole(int id){
        return roleDao.findById(id);
    }
}
