package fr.imie.tp.myrh.dao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//Déclaration des annotations
@Entity
@Table(name="T_DEPARTEMENT")

public class DepartementModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//@OneToMany // Relation N,1
	//@JoinColumn( name="EMPLOYEID" ) //Clé étrangère
	//private EmployeModel employe;
	
	@Column(name="ID")
	@Id // Définir en tant que clé primaire
	@GeneratedValue( strategy=GenerationType.IDENTITY ) // Auto-incrémentation de la clé primaire
	private long did;
	
	@Column(name="LIBELLE")
	private String libelle;

	// Getters and Setters
	public long getId() {
		return did;
	}

	public void setId(long id) {
		this.did = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}


