package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "test_list")
public class TestList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int row_id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id")
    private User teacher;

    @OneToMany(mappedBy = "test", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Test> testQuestions;

    @OneToMany(mappedBy = "student_answer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudentAnswer> studentAnswers;

    @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Schedule> schedules;


    public TestList(){}

    public TestList(String name){
        this.name = name;
        this.testQuestions = new ArrayList<Test>();
        this.studentAnswers = new ArrayList<StudentAnswer>();
        this.schedules = new ArrayList<Schedule>();
    }


    public List<StudentAnswer> getStudentAnswers() {
        return studentAnswers;
    }

    public int getRow_id() {
        return row_id;
    }

    public String getName() {
        return name;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public List<Test> getTestQuestions() {
        return testQuestions;
    }

    public Subject getSubject() {
        return subject;
    }

    public User getTeacher() {
        return teacher;
    }


    public void setStudentAnswers(List<StudentAnswer> studentAnswers) {
        this.studentAnswers = studentAnswers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }

    public void setTestQuestions(List<Test> testQuestions) {
        this.testQuestions = testQuestions;
    }

    @Override
    public String toString() {
        return "TestList{" +
                "row_id=" + row_id +
                ", name='" + name + '\'' +
                ", subject=" + subject +
                ", teacher=" + teacher +
                ", testQuestions=" + testQuestions +
                ", studentAnswers=" + studentAnswers +
                ", schedules=" + schedules +
                '}';
    }
}
