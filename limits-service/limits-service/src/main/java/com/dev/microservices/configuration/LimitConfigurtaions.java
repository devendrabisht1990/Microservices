package com.dev.microservices.configuration;

public class LimitConfigurtaions {
	
	private int maximum;
	
	private int manimum;

	public LimitConfigurtaions(int maximum, int manimum) {
		super();
		this.maximum = maximum;
		this.manimum = manimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getManimum() {
		return manimum;
	}

	public void setManimum(int manimum) {
		this.manimum = manimum;
	}
	
	

}
