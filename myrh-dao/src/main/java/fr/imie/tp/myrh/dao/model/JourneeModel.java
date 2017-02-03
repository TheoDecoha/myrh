package fr.imie.tp.myrh.dao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Déclaration des annotations
@Entity
@Table(name = "T_JOURNEE")

public class JourneeModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "ID")
	@Id // Définir en tant que clé primaire
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrémentation
														// de la clé primaire
	private long id;

	@Column(name = "DATE")
	private Date date;

	@Column(name = "TIME")
	private int durée;

	@Column(name = "COMMENT")
	private String comment;

	@Column(name = "PROJETID")
	private long id_projet;

	@Column(name = "EMPLOYEID")
	private long id_employe;

	// GETTERS AND SETTERS
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getDurée() {
		return durée;
	}

	public void setDurée(int durée) {
		this.durée = durée;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public long getId_projet() {
		return id_projet;
	}

	public void setId_projet(long id_projet) {
		this.id_projet = id_projet;
	}

	public long getId_employe() {
		return id_employe;
	}

	public void setId_employe(long id_employe) {
		this.id_employe = id_employe;
	}

}
