package com.vehicle.showroom;

public abstract class Vehicle {
	
	public Vehicle() {
		super();
	}
	
	public Vehicle(String modelNumber, Long enginePower, Double tireSize, String engineType) {
		super();
		this.modelNumber = modelNumber;
		this.enginePower = enginePower;
		this.tireSize = tireSize;
		this.engineType = engineType;
	}
	
	private String modelNumber;
	private Long enginePower;
	private Double tireSize;
	private String engineType;
	
	public abstract void showVehicle();  // abstract method 
	
	public String getModelNumber() {
		return modelNumber;
	}
	
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public Long getEnginePower() {
		return enginePower;
	}

	public void setEnginePower(Long enginePower) {
		this.enginePower = enginePower;
	}

	public Double getTireSize() {
		return tireSize;
	}
	
	public void setTireSize(Double tireSize) {
		this.tireSize = tireSize;
	}
	
	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	
	
}
