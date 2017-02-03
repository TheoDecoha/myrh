package fr.imie.tp.myrh.dao.ifc;

import java.util.Collection;

import fr.imie.tp.myrh.dao.model.HistoriqueCongeModel;

public interface IHistoriqueDAO {
	
	public Collection<HistoriqueCongeModel> getHistoric();
	public void UpdateHistoric();
}
