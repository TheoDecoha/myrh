package fr.imie.tp.myrh.dao.impl;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.imie.tp.myrh.dao.ifc.IDepartementDAO;
import fr.imie.tp.myrh.dao.model.DepartementModel;

public class DepartementDAOImpl implements IDepartementDAO {

	EntityManager em;

	private void DepartementDAOImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myRHPersistenceUnit");
		em = emf.createEntityManager();
		em.getTransaction().begin();
	}

	private void CloseDepartementDAOImpl() {
		this.em.getTransaction().commit();
		this.em.close();
		this.em.close();
	}

	public EntityManager getEm() {
		return em;
	}

	public Collection<DepartementModel> getAllDepartement() {
		// TODO Auto-generated method stub
		DepartementDAOImpl();
		TypedQuery<DepartementModel> query = this.em.createNamedQuery("Department.findAll", DepartementModel.class);
		List<DepartementModel> results = query.getResultList();
		CloseDepartementDAOImpl();
		return results;
	}

	public DepartementModel getDepartementByID(Double ID) {
		// TODO Auto-generated method stub
		DepartementDAOImpl();
		DepartementModel department = this.em.find(DepartementModel.class, ID);
		CloseDepartementDAOImpl();
		return department;
	}

	public void RemoveDepartement(Double ID) {
		// TODO Auto-generated method stub
		DepartementDAOImpl();
		DepartementModel department = this.em.find(DepartementModel.class, ID);
		this.em.remove(department);
		CloseDepartementDAOImpl();
	}

	public DepartementModel UpdateDepartement(Double ID) {
		// TODO Auto-generated method stub
		DepartementDAOImpl();
		DepartementModel department = this.em.find(DepartementModel.class, ID);
		// Variable à modifier
		CloseDepartementDAOImpl();
		return department;
	}

	public DepartementModel getDepartementByID() {
		// TODO Auto-generated method stub
		return null;
	}

	public void RemoveDepartement() {
		// TODO Auto-generated method stub
		
	}

	public void UpdateDepartement() {
		// TODO Auto-generated method stub
		
	}
}
