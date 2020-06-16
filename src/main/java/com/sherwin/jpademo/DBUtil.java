package com.sherwin.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {

    private static final EntityManagerFactory emf
            = Persistence.createEntityManagerFactory("pointPU");

    public static EntityManagerFactory getEmFactory() {
        return emf;
    }
}
