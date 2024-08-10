package ru.markthomas.model;

import jakarta.persistence.*;

@Entity
@Table (name = "TEST")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    @Column(name = "name")
//    private String name;

    public Player() {}

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "model.Player{" +
                "id=" + id +
//                ", name='" + name + '\'' +
                '}';
    }
}
