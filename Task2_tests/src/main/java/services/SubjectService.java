package services;

import dao.StudentAnswerDao;
import dao.SubjectDao;
import models.StudentAnswer;
import models.Subject;

public class SubjectService {
    private SubjectDao subjectDao = new SubjectDao();

    public SubjectService(){}

    public void saveSubject(Subject subject){
        subjectDao.save(subject);
    }

    public Subject findSubject(int id){
        return subjectDao.findById(id);
    }
}
