package fr.imie.tp.myrh.dao.ifc;

import java.util.Collection;

import fr.imie.tp.myrh.dao.model.CongeModel;

public interface ICongeDAO {
	
	public Collection<CongeModel> getAllCongeFromEmployee();
	public CongeModel getCongeByID();
	public void UpdateConge();
	public void AddConge();
}
