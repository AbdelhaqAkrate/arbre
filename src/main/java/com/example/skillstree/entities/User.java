package com.example.skillstree.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = -7788619177798333712L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "fullName")
    private String fullName;
    @Column(name = "avatar")
    private String avatar;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "role")
    private int role;
    @OneToMany(mappedBy = "user")
    private Collection<UserCompetence> userCompetences;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public Collection<UserCompetence> getUserCompetences() {
        return userCompetences;
    }

    public void setUserCompetences(Collection<UserCompetence> userCompetences) {
        this.userCompetences = userCompetences;
    }
}
