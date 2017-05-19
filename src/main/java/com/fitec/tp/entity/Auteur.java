package com.fitec.tp.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Entity
@Table(name = "Auteur")
@NamedQueries({ @NamedQuery(name = "auteur.all", query = "SELECT a FROM Auteur a") })
@XmlType(namespace="http://entity.tp.fitec.copm/") //pour bien renseigner le wdsl pour bien séparer les entités de services au niveau de package
@XmlRootElement(name="auteur")
public class Auteur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private String Prenom;

	// get et set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	// constructeur sans paramètres
	public Auteur() {
		super();
	}

	// constructeur avec paramètres
	public Auteur(String nom, String prenom) {
		super();
		this.nom = nom;
		Prenom = prenom;
	}

	@Override
	public String toString() {
		return "Auteur [id=" + id + ", nom=" + nom + ", Prenom=" + Prenom + "]";
	}

}
