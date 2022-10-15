package com.example.demo.services;

//import tn.esprit.rh.achat.entities.Stock;

import java.util.List;

import com.example.demo.entities.Stock;

public interface IStockService {

	List<Stock> retrieveAllStocks();

	Stock addStock(Stock s);

	void deleteStock(Long id);

	Stock updateStock(Stock u);

	Stock retrieveStock(Long id);

	String retrieveStatusStock();
}
