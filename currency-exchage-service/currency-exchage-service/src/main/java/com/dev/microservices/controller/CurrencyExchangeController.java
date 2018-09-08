package com.dev.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dev.microservices.currencyexchageservice.CurrencyExchangeRepo;
import com.dev.microservices.model.ExchangeValue;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	CurrencyExchangeRepo currencyExchangeRepo;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValue(@PathVariable String from,@PathVariable String to){
		ExchangeValue exchangeValue = currencyExchangeRepo.findByFromAndTo(from, to);
		return exchangeValue;
		
	}

}
