package services;

import dao.TestListDao;
import models.TestList;

public class TestListService {
    private TestListDao testListDao = new TestListDao();

    public TestListService(){}

    public void saveTestList(TestList testList){
        testListDao.save(testList);
    }

    public TestList findTestList(int id){
        return testListDao.findById(id);
    }
}
