package models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int row_id;

    private int duration;
    private Date start_dt;
    private Time start_time;
    private Date end_dt;
    private boolean active;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "test_id")
    private TestList test;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private Group group;


    public Schedule(){}

    public Schedule(int duration,
                    Date start_dt,
                    Time start_time,
                    Date end_dt,
                    boolean active){

        this.duration = duration;
        this.start_dt = start_dt;
        this.start_time = start_time;
        this.end_dt = end_dt;
        this.active = active;
    }


    public TestList getTest() {
        return test;
    }

    public int getRow_id() {
        return row_id;
    }

    public Group getGroup() {
        return group;
    }

    public Date getEnd_dt() {
        return end_dt;
    }

    public Date getStart_dt() {
        return start_dt;
    }

    public int getDuration() {
        return duration;
    }

    public Time getStart_time() {
        return start_time;
    }


    public void setTest(TestList test) {
        this.test = test;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setEnd_dt(Date end_dt) {
        this.end_dt = end_dt;
    }

    public void setStart_dt(Date start_dt) {
        this.start_dt = start_dt;
    }

    public void setStart_time(Time start_time) {
        this.start_time = start_time;
    }


    @Override
    public String toString() {
        return "Schedule{" +
                "row_id=" + row_id +
                ", duration=" + duration +
                ", start_dt=" + start_dt +
                ", start_time=" + start_time +
                ", end_dt=" + end_dt +
                ", active=" + active +
                ", test=" + test +
                ", group=" + group +
                '}';
    }
}
