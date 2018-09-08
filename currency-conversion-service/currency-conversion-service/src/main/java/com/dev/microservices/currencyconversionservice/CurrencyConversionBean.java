package com.dev.microservices.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversionBean {
	
	private Long id;
	
	private String from;
	
	private String to;
	
	private BigDecimal conversionMultiple; 
	
	private BigDecimal quantity;
	
	private BigDecimal totalCalculatedQuantity;
	
	private String port;
	
	public CurrencyConversionBean(){
		
	}
	
	public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
			BigDecimal totalCalculatedQuantity, String port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalculatedQuantity = totalCalculatedQuantity;
		this.port = port;
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal coversionMultiple) {
		this.conversionMultiple = coversionMultiple;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalCalculatedQuantity() {
		return totalCalculatedQuantity;
	}

	public void setTotalCalculatedQuantity(BigDecimal totalCalculatedQuantity) {
		this.totalCalculatedQuantity = totalCalculatedQuantity;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	

}