package com.fitec.tp.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.fitec.tp.entity.Auteur;

@WebService
//@WebService elle est plus pris en compte pour un web service soap
//et ingnoré sur un service interne (ici spring ) injecté dans l'adaptateur REST
public interface IServiceAuteur {
	public Auteur chercherAuteur(@WebParam(name ="id") int id);

	public List<Auteur> tousLesAuteurs();
	
	public Auteur ajouterAuteur(@WebParam(name ="auteur")Auteur auteur);
	public void majAuteur(@WebParam(name ="auteur")Auteur auteur);
	public void supprimerAuteur(@WebParam(name ="idAuteur")int idAuteur);
	

}
