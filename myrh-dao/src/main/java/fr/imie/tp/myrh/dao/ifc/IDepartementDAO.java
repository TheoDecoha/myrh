package fr.imie.tp.myrh.dao.ifc;

import java.util.Collection;

import fr.imie.tp.myrh.dao.model.DepartementModel;

public interface IDepartementDAO {
	public Collection<DepartementModel> getAllDepartement();
	public DepartementModel getDepartementByID();
	public void RemoveDepartement();
	public void UpdateDepartement();
}
