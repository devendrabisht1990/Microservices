package com.dev.microservices.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeServiceProxy proxy;
	
	@GetMapping("/currency-conversion-service/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable("from") String from, @PathVariable("to") String to, @PathVariable("quantity") String quantity ){
		/*
		Map<String,String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<CurrencyConversionBean> responce = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class, uriVariables);
		CurrencyConversionBean currencyConversionResponce = responce.getBody();
		*/
		CurrencyConversionBean currencyConversionResponce = proxy.retrieveExchangeValue(from, to);
		return new CurrencyConversionBean(currencyConversionResponce.getId(),from,to,currencyConversionResponce.getConversionMultiple()
				,new BigDecimal(quantity),currencyConversionResponce.getConversionMultiple().multiply(new BigDecimal(quantity)),currencyConversionResponce.getPort());
	}

}
