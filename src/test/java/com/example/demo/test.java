package com.example.demo;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.sql.Date;

import org.apache.tomcat.util.http.parser.MediaType;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.controllers.StockRestController;
import com.example.demo.entities.Produit;
import com.example.demo.entities.Stock;
import com.example.demo.repositories.ProduitRepository;
import com.example.demo.repositories.StockRepository;
import com.example.demo.services.IProduitService;
import com.example.demo.services.IStockService;
import com.example.demo.services.StockServiceImpl;



import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.Silent.class)
@ExtendWith(MockitoExtension.class)
@DataJpaTest 

@SpringBootTest(classes=DemoApplication.class)
public class test {
	@Mock
	StockRepository StockRepo;
	@InjectMocks
	StockServiceImpl ss;
    @Test
    @Order('1')
    public void Add() 
    {
    	StockRepository StockRepo;
    	//StockServiceImpl ss=mock(StockServiceImpl.class);
    	Stock st =  new Stock();
		st.setLibelleStock("gjhgjh");
		st.setQte(180);
		st.setQteMin(10);
		st.setIdStock((long) 4);
		when(ss.addStock(st)).thenReturn(st);
//		assertNotEquals(st.getIdStock(), null);
        //System.out.print(ss.addStock(st).getIdStock());
    }
}
