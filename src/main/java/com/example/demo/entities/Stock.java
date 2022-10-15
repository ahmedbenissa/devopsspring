package com.example.demo.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity


public class Stock  {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idStock;
	public Long getIdStock() {
		return idStock;
	}
	public void setIdStock(Long idStock) {
		this.idStock = idStock;
	}
	public String getLibelleStock() {
		return libelleStock;
	}
	public void setLibelleStock(String libelleStock) {
		this.libelleStock = libelleStock;
	}
	public Integer getQte() {
		return qte;
	}
	public void setQte(Integer qte) {
		this.qte = qte;
	}
	public Integer getQteMin() {
		return qteMin;
	}
	public void setQteMin(Integer qteMin) {
		this.qteMin = qteMin;
	}
	public Set<Produit> getProduits() {
		return produits;
	}
	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}
	
	private String libelleStock;
	private Integer qte;
	private Integer qteMin;
	@OneToMany(mappedBy = "stock")
	@JsonIgnore
	private Set<Produit> produits;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idStock == null) ? 0 : idStock.hashCode());
		result = prime * result + ((libelleStock == null) ? 0 : libelleStock.hashCode());
		result = prime * result + ((produits == null) ? 0 : produits.hashCode());
		result = prime * result + ((qte == null) ? 0 : qte.hashCode());
		result = prime * result + ((qteMin == null) ? 0 : qteMin.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stock other = (Stock) obj;
		if (idStock == null) {
			if (other.idStock != null)
				return false;
		} else if (!idStock.equals(other.idStock))
			return false;
		if (libelleStock == null) {
			if (other.libelleStock != null)
				return false;
		} else if (!libelleStock.equals(other.libelleStock))
			return false;
		if (produits == null) {
			if (other.produits != null)
				return false;
		} else if (!produits.equals(other.produits))
			return false;
		if (qte == null) {
			if (other.qte != null)
				return false;
		} else if (!qte.equals(other.qte))
			return false;
		if (qteMin == null) {
			if (other.qteMin != null)
				return false;
		} else if (!qteMin.equals(other.qteMin))
			return false;
		return true;
	}

}
