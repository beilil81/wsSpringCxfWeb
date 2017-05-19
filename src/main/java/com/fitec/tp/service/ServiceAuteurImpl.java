package com.fitec.tp.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fitec.tp.dao.IDaoAuteur;
import com.fitec.tp.entity.Auteur;

@WebService(endpointInterface = "com.fitec.tp.service.IServiceAuteur")
@Service
@Transactional
public class ServiceAuteurImpl implements IServiceAuteur {
	@Autowired
	private IDaoAuteur daoAuteur;

	@Override
	public Auteur chercherAuteur(int id) {

		return daoAuteur.selectById(id);
	}

	@Override
	public List<Auteur> tousLesAuteurs() {

		return daoAuteur.selectAll();
	}

	public Auteur ajouterAuteur(@WebParam(name = "auteur") Auteur auteur) {

		return daoAuteur.insertAuteur(auteur);

	}

	public void majAuteur(@WebParam(name = "auteur") Auteur auteur) {
		daoAuteur.updateAuteur(auteur);
	}

	public void supprimerAuteur(@WebParam(name = "idAuteur") int idAuteur) {
		daoAuteur.delete(idAuteur);

	}

}
