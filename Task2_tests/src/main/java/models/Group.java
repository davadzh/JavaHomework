package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "group")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int row_id;

    private String name;
    private String year;
    private String semester;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<User> users;

    @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Schedule> schedules;

    public Group(){}

    public Group(String name, String year, String semester){
        this.name = name;
        this.year = year;
        this.semester = semester;
        this.users = new ArrayList<User>();
        this.schedules = new ArrayList<Schedule>();
    }


    public int getRow_id() {
        return row_id;
    }

    public List<User> getUsers() {
        return users;
    }

    public String getName() {
        return name;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public String getYear() {
        return year;
    }

    public String getSemester() {
        return semester;
    }


    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }


    @Override
    public String toString() {
        return "Group{" +
                "row_id=" + row_id +
                ", name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", semester='" + semester + '\'' +
                ", users=" + users +
                ", schedules=" + schedules +
                '}';
    }
}
