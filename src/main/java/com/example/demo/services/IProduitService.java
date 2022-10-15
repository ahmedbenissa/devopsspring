package com.example.demo.services;

//import tn.esprit.rh.achat.entities.Produit;

import java.util.List;

import com.example.demo.entities.Produit;

public interface IProduitService {

	List<Produit> retrieveAllProduits();

	Produit addProduit(Produit p);

	void deleteProduit(Long id);

	Produit updateProduit(Produit p);

	Produit retrieveProduit(Long id);

	void assignProduitToStock(Long idProduit, Long idStock);

}
