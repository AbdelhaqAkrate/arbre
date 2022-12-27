package com.example.skillstree.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "competence")
public class Competence implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "title")
    private String title;
    @OneToMany(mappedBy = "competence")
    private Collection<UserCompetence> userCompetences;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Collection<UserCompetence> getUserCompetences() {
        return userCompetences;
    }

    public void setUserCompetences(Collection<UserCompetence> userCompetences) {
        this.userCompetences = userCompetences;
    }
}
