package com.vehicle.showroom;

public class NormalVehicle extends Vehicle {
	
	public NormalVehicle() {
		super();
	}

	public NormalVehicle(String modelNumber, Long enginePower, Double tireSize, String engineType) {
		super(modelNumber,enginePower,tireSize,engineType);
	}
	
	@Override
	public void showVehicle() {
		System.out.println("Vechile Type : Normal Vehicle");
		System.out.println("MODEL NO : " + this.getModelNumber());
		System.out.println("Engine Power : " + this.getEnginePower() + " cc");
		System.out.println("Tire Size : " + this.getTireSize() +" cm");
		System.out.println("Engine Type : " + this.getEngineType());
	}
	
	
}
