package fr.imie.tp.myrh.dao.ifc;

import java.util.Collection;
import fr.imie.tp.myrh.dao.model.EmployeModel;

public interface IEmployeDAO {
	public Collection<EmployeModel> getAllEmploye();
	public EmployeModel getEmployeByID();
	public void RemoveEmploye();
	public void UpdateEmploye();
}
