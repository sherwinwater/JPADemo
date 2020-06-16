package com.sherwin.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PointDB {
     public static void insert(Point point) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            if (!em.contains(point)) {
                em.persist(point);
//                em.flush();
            }
            trans.commit();

        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        }
    }
}
