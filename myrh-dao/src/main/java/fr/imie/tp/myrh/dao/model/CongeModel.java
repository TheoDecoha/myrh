package fr.imie.tp.myrh.dao.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//Déclaration des annotations
@Entity
@Table(name = "T_CONGE")
//@NamedQueries({ @NamedQuery(name = "Conge.findAll", query = "SELECT e FROM EmployeModel e"),
	//			@NamedQuery(name = "Conge.find", query = "SELECT e FROM Employe e WHERE e.id=idVar") })

public class CongeModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne // Relation N,1
	@JoinColumn( name="EMPLOYEID" ) //Clé étrangère
	private EmployeModel employe;
	
	@Column(name = "ID")
	@Id // Définir en tant que clé primaire
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrémentation de la clé primaire
	private long id;

	@Column(name = "ASKDEMANDE")
	private Date date_demande;

	@Column(name = "DATEBEGININ")
	private Date date_debut;

	@Column(name = "ENDDATE")
	private Date date_fin;

	@Column(name = "REASON")
	private String motif;

	@Column(name = "STATE")
	private String statut;

	@Column(name = "DAYCOUNT")
	private int nb_jour;

	// GETTERS AND SETTERS
	public EmployeModel getEmploye() {
		return employe;
	}

	public void setEmploye(EmployeModel employe) {
		this.employe = employe;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate_demande() {
		return date_demande;
	}

	public void setDate_demande(Date date_demande) {
		this.date_demande = date_demande;
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

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public int getNb_jour() {
		return nb_jour;
	}

	public void setNb_jour(int nb_jour) {
		this.nb_jour = nb_jour;
	}	
}
