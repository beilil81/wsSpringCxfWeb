package com.fitec.tp.service;

import javax.jws.WebService;

import org.springframework.stereotype.Service;
@Service //par défault id= calculateurImpl
//(nom de la classe avec minuscule au début)
@WebService(endpointInterface = "com.fitec.tp.service.ICalculateur")
public class CalculateurImpl implements ICalculateur {

	@Override
	public double tva(double ht, double tauxPct) {

		return ht * tauxPct / 100;
	}

	@Override
	public String getAuteur() {

		return "MohamedB";
	}

}
