package com.klu;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory factory;

    static {
        try {
            factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();
            System.out.println("Hibernate SessionFactory Created");
        } catch (Throwable ex) {
            System.err.println("SessionFactory creation failed.");
            throw new ExceptionInInitializerError(ex);
        }
    }

    private HibernateUtil() {
        // prevent object creation
    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }
}

