package com.fpd.filter;

import java.util.Map;

class AdaptiveBinary extends GeneralBinary {

	public AdaptiveBinary(double thresoldValue, double kernelSize, String name, String type) {
		super(thresoldValue, name, type);
		this.kernelSize = kernelSize;
	}

	private double kernelSize;
}

class GeneralBinary extends Filter {

	public GeneralBinary(double thresoldValue,String name, String type) {
		super(name, type);
		this.thresoldValue = thresoldValue;
	}

	private double thresoldValue;
}

class RGB extends Filter {
	
	public RGB(double r, double g, double b,String name, String type) {
		super(name,type);
		R = r;
		G = g;
		B = b;
	}
	
	private double R;
	private double G;
	private double B;
}

class Filter {
	
	public Filter(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	private String name;
	private String type;
		
}

class FPD {
	
	public Map<String,Filter> filter;
	public double filterCurrentSize = 30;
	
	// add RGB filter
	public void addFilter(double r, double g, double b,String name, String type) {
		RGB rgb = new RGB(b, b, b, type, type);
		filter.put(name, rgb);
	}
	
	// add General Binary filter
	public void addFilter(double thresoldValue,String name, String type) {
		
	}
	
	// add Binary Adaptive filter
	public void addFilter(double thresoldValue, double kernelSize, String name, String type) {
		
	}
	
	public void removeFilter() {
		
	}
	
}


public class MyApp {
	
	public static void main(String[] args ) {
		
		FPD fpd = new FPD();
		fpd.addFilter(0, 0, 0, null, null);
		fpd.filterCurrentSize += 5;
		
	}
	
}

