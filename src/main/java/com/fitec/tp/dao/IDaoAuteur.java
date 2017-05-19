package com.fitec.tp.dao;

import java.util.List;

import com.fitec.tp.entity.Auteur;

public interface IDaoAuteur {
	public Auteur selectById(int id);

	public List<Auteur> selectAll();
	public Auteur insertAuteur(Auteur a); //en retour a avec auto_incr pk
	public void delete(int id);
	public void updateAuteur(Auteur a);
	

}
