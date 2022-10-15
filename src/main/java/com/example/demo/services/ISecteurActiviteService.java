package com.example.demo.services;

//import tn.esprit.rh.achat.entities.SecteurActivite;

import java.util.List;

import com.example.demo.entities.SecteurActivite;

public interface ISecteurActiviteService {

	List<SecteurActivite> retrieveAllSecteurActivite();

	SecteurActivite addSecteurActivite(SecteurActivite sa);

	void deleteSecteurActivite(Long id);

	SecteurActivite updateSecteurActivite(SecteurActivite sa);

	SecteurActivite retrieveSecteurActivite(Long id);

}
