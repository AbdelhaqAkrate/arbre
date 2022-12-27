package com.example.skillstree.config;

import jakarta.persistence.*;

public class Config {
    private static EntityManagerFactory managerFactory ;
    public static EntityManagerFactory getEntityManagerFactory() {
        if(managerFactory == null) {
            managerFactory = Persistence.createEntityManagerFactory("skillTree");
        }
        return managerFactory;
    }
    public static void shutdown() {
        if(managerFactory != null) {
            managerFactory.close();
        }
    }
}
