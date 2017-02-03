package fr.imie.tp.myrh.dao.impl;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.imie.tp.myrh.dao.ifc.ICongeDAO;
import fr.imie.tp.myrh.dao.model.CongeModel;

public class CongeDAOImpl implements ICongeDAO {

	EntityManager em;

	private void CongeDAOImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myRHPersistenceUnit");
		em = emf.createEntityManager();
		em.getTransaction().begin();
	}

	private void CloseCongeDAOImpl() {
		this.em.getTransaction().commit();
		this.em.close();
		this.em.close();
	}

	public EntityManager getEm() {
		return em;
	}

	public Collection<CongeModel> getAllCongeFromEmployee() {
		// TODO Auto-generated method stub
		CongeDAOImpl();
		TypedQuery<CongeModel> query = this.em.createNamedQuery("conge.findAll", CongeModel.class);
		List<CongeModel> results = query.getResultList();
		CloseCongeDAOImpl();
		return results;
	}

	public CongeModel getCongeByID(Double ID) {
		// TODO Auto-generated method stub
		CongeDAOImpl();
		CongeModel conge = this.em.find(CongeModel.class, ID);
		CloseCongeDAOImpl();
		return conge;
	}

	public CongeModel UpdateConge(Double ID) {
		// TODO Auto-generated method stub
		CongeDAOImpl();
		CongeModel conge = this.em.find(CongeModel.class, ID);
		// Variable à modifier
		CloseCongeDAOImpl();
		return conge;
	}

	public void AddConge() {
		// TODO Auto-generated method stub

	}

	public CongeModel getCongeByID() {
		// TODO Auto-generated method stub
		return null;
	}

	public void UpdateConge() {
		// TODO Auto-generated method stub
		
	}

}
