package fr.badiiix.project.persistence;

import fr.badiiix.project.entities.Client;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PersistenceBuilder {

    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mysql-persistence-unit");
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();

    public Client registerClient(String nom, String ville) {
        Client c = new Client(nom, ville);

        EntityTransaction trx = this.entityManager.getTransaction();
        trx.begin();
        this.entityManager.persist(c);
        trx.commit();

        return c;
    }

}
