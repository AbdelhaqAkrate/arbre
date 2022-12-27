package com.example.skillstree.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "usercompetence")
public class UserCompetence implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "competenceId", referencedColumnName = "id")
    private Competence competence;
    @Column(name = "niveau")
    private Integer niveau;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Competence getCompetence() {
        return competence;
    }

    public void setCompetence(Competence competence) {
        this.competence = competence;
    }

    public Integer getNiveau() {
        return niveau;
    }

    public void setNiveau(Integer niveau) {
        this.niveau = niveau;
    }
}
