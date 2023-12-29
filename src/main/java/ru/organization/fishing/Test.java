package ru.organization.fishing;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("fishing");
        EntityManager manager = factory.createEntityManager();

        Vessel vessel = new Vessel("name", "type", 0, LocalDate.now());

        manager.getTransaction().begin();
        manager.merge(vessel);
        manager.find(Vessel.class, 1);
        manager.persist(vessel);
        manager.getTransaction().commit();


    }
}
