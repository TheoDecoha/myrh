package fr.imie.tp.myrh.dao.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//Déclaration des annotations
@Entity
@Table(name="T_HISTORIQUE_DEMANDE")
//@NamedQueries({
	//@NamedQuery( name="Projet.findAll", query="SELECT e FROM EmployeModel e" ),
	//@NamedQuery( name="Projet.find", query="SELECT e FROM Employe e WHERE e.id=idVar")
//})

public class ProjetModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToMany
	@JoinTable(
			name="T_JOURNEE",
			joinColumns=@JoinColumn( name="PROJETID", referencedColumnName="ID"),
			inverseJoinColumns=@JoinColumn( name="EMPLOYEID", referencedColumnName="ID") )
	
	private List<EmployeModel> employe;

	@Column(name = "ID")
	@Id // Définir en tant que clé primaire
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrémentation de la clé primaire
	private long id;

	@Column(name = "CODE")
	private String code_projet;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "DATEBEGINING")
	private Date date_debut;

	@Column(name = "ENDDATE")
	private Date date_fin;

	// GETTERS AND SETTERS
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode_projet() {
		return code_projet;
	}

	public void setCode_projet(String code_projet) {
		this.code_projet = code_projet;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
}
