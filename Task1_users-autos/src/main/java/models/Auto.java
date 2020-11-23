package models;

import javax.persistence.*;

@Entity
@Table(name = "autos")
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String model;

    private String color;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;


    public Auto(){}

    public Auto(String name, String color){
        this.model = model;
        this.color = color;
    }

    public String getModel(){
        return model;
    }

    public int getId(){
        return id;
    }

    public String getColor(){
        return color;
    }

    public User getUser() {
        return user;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", user=" + user +
                '}';
    }
}
