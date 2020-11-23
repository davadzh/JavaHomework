package services;

import dao.GroupDao;
import dao.ScheduleDao;
import models.Group;
import models.Schedule;

public class ScheduleService {
    private ScheduleDao scheduleDao = new ScheduleDao();

    public ScheduleService(){}

    public void saveSchedule(Schedule schedule){
        scheduleDao.save(schedule);
    }

    public Schedule findSchedule(int id){
        return scheduleDao.findById(id);
    }
}
