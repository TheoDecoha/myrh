package fr.imie.tp.myrh.dao.impl;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.imie.tp.myrh.dao.ifc.IHistoriqueDAO;
import fr.imie.tp.myrh.dao.model.HistoriqueCongeModel;

public class HistoriqueDAOImpl implements IHistoriqueDAO {

	EntityManager em;

	private void HistoriqueDAOImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myRHPersistenceUnit");
		em = emf.createEntityManager();
		em.getTransaction().begin();
	}

	private void CloseHistoriqueDAOImpl() {
		this.em.getTransaction().commit();
		this.em.close();
		this.em.close();
	}

	public EntityManager getEm() {
		return em;
	}

	public Collection<HistoriqueCongeModel> getHistoric() {
		// TODO Auto-generated method stub
		HistoriqueDAOImpl();
		TypedQuery<HistoriqueCongeModel> query = this.em.createNamedQuery("Historique.findAll",
				HistoriqueCongeModel.class);
		List<HistoriqueCongeModel> results = query.getResultList();
		CloseHistoriqueDAOImpl();
		return results;
	}

	public HistoriqueCongeModel UpdateHistoric(Double ID) {
		// TODO Auto-generated method stub
		HistoriqueDAOImpl();
		HistoriqueCongeModel historique = this.em.find(HistoriqueCongeModel.class, ID);
		// Variable à modifier
		CloseHistoriqueDAOImpl();
		return historique;
	}

	public void UpdateHistoric() {
		// TODO Auto-generated method stub
		
	}

}
