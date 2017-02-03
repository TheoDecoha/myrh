package fr.imie.tp.myrh.dao.impl;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.imie.tp.myrh.dao.ifc.IEmployeDAO;
import fr.imie.tp.myrh.dao.model.EmployeModel;

public class EmployeDAOImpl implements IEmployeDAO {
	
	EntityManager em;

	private void EmployeDAOImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myRHPersistenceUnit");
		em = emf.createEntityManager();
		em.getTransaction().begin();
	}
	
	private void CloseEmployeDAOImpl(){
		this.em.getTransaction().commit();
		this.em.close();
	}
	
	public EntityManager getEm() {
		return em;
	}

	public EmployeModel getEmployeByID(Double ID) {
		EmployeDAOImpl();
		EmployeModel employee = this.em.find( EmployeModel.class, ID );
		CloseEmployeDAOImpl();
		return employee;
	}

	public void RemoveEmploye(Double ID) {
		EmployeDAOImpl();
		EmployeModel employee = this.em.find( EmployeModel.class, ID );
	    this.em.remove( employee );
		CloseEmployeDAOImpl();
	}

	public EmployeModel UpdateEmploye(Double ID) {
		EmployeDAOImpl();
		EmployeModel employee = this.em.find( EmployeModel.class, ID );
		//employee.setSalary( 46000 );
		CloseEmployeDAOImpl();
		return employee;		
	}

	public Collection<EmployeModel> getAllEmploye() {
		// TODO Auto-generated method stub
		//Collection<EmployeModel> emps = em.createNamedQuery("Employe.findAll", EmployeModel.class);
		EmployeDAOImpl();
		TypedQuery<EmployeModel> query = this.em.createNamedQuery("Employe.findAll", EmployeModel.class);
		List<EmployeModel> results = query.getResultList();
		CloseEmployeDAOImpl();
		return results;
	}

	public EmployeModel getEmployeByID() {
		// TODO Auto-generated method stub
		return null;
	}

	public void RemoveEmploye() {
		// TODO Auto-generated method stub
		
	}

	public void UpdateEmploye() {
		// TODO Auto-generated method stub
		
	}

}
