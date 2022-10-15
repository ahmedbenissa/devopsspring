package com.example.demo.services;

//import tn.esprit.rh.achat.entities.Operateur;

import java.util.List;

import com.example.demo.entities.Operateur;


public interface IOperateurService {

	List<Operateur> retrieveAllOperateurs();

	Operateur addOperateur(Operateur o);

	void deleteOperateur(Long id);

	Operateur updateOperateur(Operateur o);

	Operateur retrieveOperateur(Long id);

}
