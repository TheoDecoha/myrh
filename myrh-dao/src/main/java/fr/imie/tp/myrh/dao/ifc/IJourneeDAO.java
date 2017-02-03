package fr.imie.tp.myrh.dao.ifc;

import java.util.Collection;

import fr.imie.tp.myrh.dao.model.JourneeModel;

public interface IJourneeDAO {
	public Collection<JourneeModel> getJournee();
	public void AddJournee();
}
