package com.example.skillstree.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "referentiel")
public class Referentiel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "title")
    private String title;
    @OneToMany
    @JoinColumn(name = "referentielId", referencedColumnName = "id")
    private Collection<Competence> competences;
}
