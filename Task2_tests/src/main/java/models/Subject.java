package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int row_id;

    private String name;

    @OneToMany(mappedBy = "test_list", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TestList> testLists;

    public Subject(){}

    public Subject(String name){
        this.name = name;
        this.testLists = new ArrayList<TestList>();
    }


    public int getRow_id() {
        return row_id;
    }

    public String getName() {
        return name;
    }

    public List<TestList> getTestLists() {
        return testLists;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setTestLists(List<TestList> testLists) {
        this.testLists = testLists;
    }


    @Override
    public String toString() {
        return "Subject{" +
                "row_id=" + row_id +
                ", name='" + name + '\'' +
                ", testLists=" + testLists +
                '}';
    }
}
