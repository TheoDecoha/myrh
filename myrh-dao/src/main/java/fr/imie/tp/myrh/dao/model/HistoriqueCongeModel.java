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
@Table(name="T_HISTORIQUE_DEMANDE")
//@NamedQueries({
	//@NamedQuery( name="Historique.findAll", query="SELECT e FROM EmployeModel e" ),
	//@NamedQuery( name="Historique.find", query="SELECT e FROM Employe e WHERE e.id=idVar")
//})

public class HistoriqueCongeModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne // Relation N,1
	@JoinColumn( name="DEMANDECONGEID" ) //Clé étrangère
	private CongeModel conge;
	
	@Column(name="ID")
	@Id // Définir en tant que clé primaire
	@GeneratedValue( strategy=GenerationType.IDENTITY ) // Auto-incrémentation de la clé primaire
	private long id;

	@Column(name="DATE_ASK")
	private Date date_demande;
	
	@Column (name="REASON")
	private String commentaire;

	// GETTERS AND SETTERS
	public CongeModel getConge() {
		return conge;
	}

	public void setConge(CongeModel conge) {
		this.conge = conge;
	}

	public Date getDate_demande() {
		return date_demande;
	}

	public void setDate_demande(Date date_demande) {
		this.date_demande = date_demande;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}	
}
