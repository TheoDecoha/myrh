package fr.imie.tp.myrh.dao.impl;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.imie.tp.myrh.dao.ifc.IProjetDAO;
import fr.imie.tp.myrh.dao.model.ProjetModel;

public class ProjetDAOImpl implements IProjetDAO {

	EntityManager em;

	private void ProjetDAOImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myRHPersistenceUnit");
		em = emf.createEntityManager();
		em.getTransaction().begin();
	}

	private void CloseProjetDAOImpl() {
		this.em.getTransaction().commit();
		this.em.close();
	}

	public EntityManager getEm() {
		return em;
	}

	public Collection<ProjetModel> getAllProjet() {
		// TODO Auto-generated method stub
		ProjetDAOImpl();
		TypedQuery<ProjetModel> query = this.em.createNamedQuery("Projet.findAll", ProjetModel.class);
		List<ProjetModel> results = query.getResultList();
		CloseProjetDAOImpl();
		return results;
	}

	public ProjetModel getProjetByID(Double ID) {
		// TODO Auto-generated method stub
		ProjetDAOImpl();
		ProjetModel projet = this.em.find(ProjetModel.class, ID);
		CloseProjetDAOImpl();
		return projet;
	}

	public void RemoveProjet(Double ID) {
		// TODO Auto-generated method stub
		ProjetDAOImpl();
		ProjetModel projet = this.em.find(ProjetModel.class, ID);
		this.em.remove(projet);
		CloseProjetDAOImpl();
	}

	public ProjetModel UpdateProjet(Double ID) {
		// TODO Auto-generated method stub
		ProjetDAOImpl();
		ProjetModel projet = this.em.find(ProjetModel.class, ID);
		// Variable à modifier
		CloseProjetDAOImpl();
		return projet;
	}

	public ProjetModel getProjetByID() {
		// TODO Auto-generated method stub
		return null;
	}

	public void RemoveProjet() {
		// TODO Auto-generated method stub
		
	}

	public void UpdateProjet() {
		// TODO Auto-generated method stub
		
	}

}
