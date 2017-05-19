package com.fitec.tp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.fitec.tp.entity.Auteur;

@Component
@Transactional
public class DaoAuteurJpa implements IDaoAuteur {

	// injection + initialisation connexion base
	@PersistenceContext(unitName = "myPersistenceUnit") // fait référence au
														// fichier persistance
	private EntityManager entityManager; // de JPA

	@Override
	public Auteur selectById(int id) {

		return entityManager.find(Auteur.class, id);
	}

	@Override
	public List<Auteur> selectAll() {

		/**
		 * sans namedQuery .... return entityManager.createQuery("SELECT a FROM
		 * Auteur a", Auteur.class) .getResultList();
		 */

		// et avec namedQuery
		return entityManager.createNamedQuery("auteur.all", Auteur.class)
				// .setParametres(........)
				.getResultList();
	}

	@Override
	public Auteur insertAuteur(Auteur a) {
		// la clef primaire auto incrémenté par mysql
		// remonte dans l'objet java lors du .presist()
		entityManager.persist(a);
		return a;

	}

	@Override
	public void delete(int id) {
		Auteur a = entityManager.find(Auteur.class, id);
		entityManager.remove(a);

	}

	@Override
	public void updateAuteur(Auteur a) {
		// entityManager.getTransaction().begin(); effectué via @Transaction
		entityManager.merge(a);
		// entityManager.getTransaction().commit(); effectué via @Transaction
	}

}
