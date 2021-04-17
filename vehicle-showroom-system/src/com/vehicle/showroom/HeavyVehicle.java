package com.vehicle.showroom;

public class HeavyVehicle extends Vehicle {
	
	public HeavyVehicle() {
		super();
	}
	
	public HeavyVehicle(String modelNumber, Long enginePower, Double tireSize, String engineType, Double weight) {
		super(modelNumber,enginePower,tireSize,engineType);
		this.weight = weight;
	}

	private Double weight;

	@Override
	public void showVehicle() {
		System.out.println("Vehicle Type : Heavy Vehicle");
		System.out.println("MODEL NO : " + this.getModelNumber());
		System.out.println("Engine Power : " + this.getEnginePower() + " cc");
		System.out.println("Tire Size : " + this.getTireSize() +" cm");
		System.out.println("Engine Type : " + this.getEngineType());
		System.out.println("Weight : " + this.getWeight() + " KG");
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "HeavyVehicle [weight=" + weight + ", getWeight()=" + getWeight() + ", getModelNumber()="
				+ getModelNumber() + ", getEnginePower()=" + getEnginePower() + ", getTireSize()=" + getTireSize()
				+ ", getEngineType()=" + getEngineType() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	

}
