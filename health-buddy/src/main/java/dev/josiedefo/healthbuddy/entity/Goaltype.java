package dev.josiedefo.healthbuddy.entity;

import jakarta.persistence.*;

@Entity
@Table(name ="goaltype")
public class Goaltype {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String goalname;

    @Column(name = "description", nullable = false, length = 255)
    private String goaldescription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoalname() {
        return goalname;
    }

    public void setGoalname(String goalname) {
        this.goalname = goalname;
    }

    public String getGoaldescription() {
        return goaldescription;
    }

    public void setGoaldescription(String goaldescription) {
        this.goaldescription = goaldescription;
    }

    public Goaltype(String goalname, String goaldescription) {
        this.goalname = goalname;
        this.goaldescription = goaldescription;
    }
}
