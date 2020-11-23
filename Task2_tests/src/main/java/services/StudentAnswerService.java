package services;

import dao.GroupDao;
import dao.StudentAnswerDao;
import models.Group;
import models.StudentAnswer;
import models.TestList;

import java.util.List;

public class StudentAnswerService {
    private StudentAnswerDao studentAnswerDao = new StudentAnswerDao();

    public StudentAnswerService(){}

    public void saveStudentAnswer(StudentAnswer studentAnswer){
        studentAnswerDao.save(studentAnswer);
    }

    public StudentAnswer findStudentAnswer(int id){
        return studentAnswerDao.findById(id);
    }

    public List<TestList> getTestsByStudentId(int id) {
        return studentAnswerDao.getTestsByStudentId(id);
    }
}
