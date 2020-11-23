package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int row_id;

    private String first_name;
    private String last_name;
    private String middle_name;
    private String login;
    private String password_hash;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private Group group;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private Role role;

    @OneToMany(mappedBy = "test_list", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TestList> testLists;

    @OneToMany(mappedBy = "student_answer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudentAnswer> studentAnswers;


    public User() {
    }

    public User(String first_name, String last_name, String middle_name, String login, String password_hash) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_name = middle_name;
        this.login = login;
        this.password_hash = password_hash;
        this.testLists = new ArrayList<TestList>();
        this.studentAnswers = new ArrayList<StudentAnswer>();
    }


    public List<TestList> getTestLists() {
        return testLists;
    }

    public int getRow_id() {
        return row_id;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public String getLogin() {
        return login;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public Role getRole() {
        return role;
    }

    public Group getGroup() {
        return group;
    }

    public List<StudentAnswer> getStudentAnswers() {
        return studentAnswers;
    }


    public void setTestLists(List<TestList> testLists) {
        this.testLists = testLists;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setStudentAnswers(List<StudentAnswer> studentAnswers) {
        this.studentAnswers = studentAnswers;
    }

    @Override
    public String toString() {
        return "User{" +
                "row_id=" + row_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", login='" + login + '\'' +
                ", password_hash='" + password_hash + '\'' +
                ", group=" + group +
                ", role=" + role +
                ", testLists=" + testLists +
                ", studentAnswers=" + studentAnswers +
                '}';
    }
}
