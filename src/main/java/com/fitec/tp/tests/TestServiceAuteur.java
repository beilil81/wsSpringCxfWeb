package com.fitec.tp.tests;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jca.context.SpringContextResourceAdapter;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fitec.tp.entity.Auteur;
import com.fitec.tp.service.IServiceAuteur;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations ={ "/applicationContext.xml"})
@ContextConfiguration(locations = {"/jpaSpringConf.xml"})
public class TestServiceAuteur {
	@Autowired
	private IServiceAuteur serviceAuteur; // à tester

	// @Before ou @BeforeClass
	// public void init() {
	// SpringContextResourceAdapter ctx= new
	// ClassPathXmlApplicationContext("/applicationContextxml")
	// serviceAuteur= ctx.getBean(IServiceAuteur.class);
	// }

	@Test
	public void testRechercherAuteur() {
		Auteur auteur = serviceAuteur.chercherAuteur(1);
		Assert.assertTrue(auteur.getId()==1);
		System.out.println(auteur.toString());
	}
	@Test
	public void testChercherTousLesAuteurs() {
		System.err.println("coooooooocouuuuuu");
		List<Auteur> auteurs = serviceAuteur.tousLesAuteurs();
		for (Auteur a : auteurs) {
			System.out.println("L'auteur :" +a.toString());
		}
	
	}
}
