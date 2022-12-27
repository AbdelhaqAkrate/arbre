package com.example.skillstree.daos.impl;

import com.example.skillstree.entities.Competence;

import java.util.List;

public interface CompetenceDaoInterface {
    public List<Competence> getAllCompetences();
    public Competence getCompetence();
    public boolean validateCompetence(Integer id);
}
