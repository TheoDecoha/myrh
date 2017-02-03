package fr.imie.tp.myrh.dao.ifc;

import java.util.Collection;

import fr.imie.tp.myrh.dao.model.ProjetModel;

public interface IProjetDAO {
	public Collection<ProjetModel> getAllProjet();
	public ProjetModel getProjetByID();
	public void RemoveProjet();
	public void UpdateProjet();
}
