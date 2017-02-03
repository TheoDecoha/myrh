package fr.imie.tp.myrh.dao.impl;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.imie.tp.myrh.dao.ifc.IJourneeDAO;
import fr.imie.tp.myrh.dao.model.JourneeModel;

public class JourneeDAOImpl implements IJourneeDAO {

	EntityManager em;

	private void JourneeDAOImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myRHPersistenceUnit");
		em = emf.createEntityManager();
		em.getTransaction().begin();
	}

	private void CloseJourneeDAOImpl() {
		this.em.getTransaction().commit();
		this.em.close();
		this.em.close();
	}

	public EntityManager getEm() {
		return em;
	}

	public Collection<JourneeModel> getJournee() {
		// TODO Auto-generated method stub
		JourneeDAOImpl();
		TypedQuery<JourneeModel> query = this.em.createNamedQuery("Journee.findAll", JourneeModel.class);
		List<JourneeModel> results = query.getResultList();
		CloseJourneeDAOImpl();
		return results;
	}

	public void AddJournee() {
		// TODO Auto-generated method stub

	}

}
