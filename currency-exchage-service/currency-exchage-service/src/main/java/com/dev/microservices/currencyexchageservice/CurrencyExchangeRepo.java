package com.dev.microservices.currencyexchageservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.microservices.model.ExchangeValue;

public interface CurrencyExchangeRepo extends JpaRepository<ExchangeValue,Long>{
	
	ExchangeValue findByFromAndTo(String from,String to);

}
