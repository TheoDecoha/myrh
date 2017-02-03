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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

// Déclaration des annotations
@Entity
@Table(name="T_EMPLOYE")
@NamedQueries({
	@NamedQuery( name="Employe.findAll", query="SELECT e FROM EmployeModel e" ),
})


public class EmployeModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	
	@ManyToOne // Relation N,1
	@JoinColumn( name="DEPARTEMENTID" ) //Clé étrangère
	private DepartementModel department;
	
	@ManyToOne // Relation N,1
	@JoinColumn( name="CONGEID" ) //Clé étrangère
	private CongeModel conge;
	
	@ManyToMany
	@JoinTable(
			name="T_JOURNEE",
			joinColumns=@JoinColumn( name="EMPLOYEID", referencedColumnName="ID"),
			inverseJoinColumns=@JoinColumn( name="PROJETID", referencedColumnName="ID") )
	
	private List<ProjetModel> projets;
	
	@Column(name="ID")
	@Id // Définir en tant que clé primaire
	@GeneratedValue( strategy=GenerationType.IDENTITY ) // Auto-incrémentation de la clé primaire
	private long id;
	
	@Column(name="FNAME")
	private String nom;
	
	@Column (name="LNAME")
	private String prenom;
	
	@Column (name="BIRTHDAY")
	private Date date_naissance;
	
	@Column (name="NSS")
	private String numero_secu;
	
	@Column (name="SALARY")
	private Double salaire;
	
	@Column (name="ARRIVAL_DATE")
	private Date date_embauche;
	
	@Column (name="DEPARTURE_DATE")
	private Date date_fin_embauche;
	
	// Getters and Setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getNumero_secu() {
		return numero_secu;
	}
	public void setNumero_secu(String numero_secu) {
		this.numero_secu = numero_secu;
	}
	public Double getSalaire() {
		return salaire;
	}
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	public Date getDate_embauche() {
		return date_embauche;
	}
	public void setDate_embauche(Date date_embauche) {
		this.date_embauche = date_embauche;
	}
	public Date getDate_fin_embauche() {
		return date_fin_embauche;
	}
	public void setDate_fin_embauche(Date date_fin_embauche) {
		this.date_fin_embauche = date_fin_embauche;
	}
	
	// On surcharge
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		String result = "nom : "+this.getNom();
		return result;
	}
	
	
	
}
