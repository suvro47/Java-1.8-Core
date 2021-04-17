package com.vehicle.showroom;

public class SportsVehicle extends Vehicle {

	public SportsVehicle() {
		super();
	}

	public SportsVehicle(String modelNumber, Long enginePower, Double tireSize, String engineType, Boolean hasTurbo) {
		super(modelNumber,enginePower,tireSize,engineType);
		this.hasTurbo = hasTurbo;
	}

	private boolean hasTurbo;

	@Override
	public void showVehicle() {
		System.out.println("Vehicle Type : Sprots Vehicle");
		System.out.println("MODEL NO : " + this.getModelNumber());
		System.out.println("Engine Power : " + this.getEnginePower() + " cc");
		System.out.println("Tire Size : " + this.getTireSize() +" cm");
		System.out.println("Engine Type : " + this.getEngineType());
		if( this.getHasTurbo() == true ) {
			System.out.println("Turbo Sports Car");
		} else {
			System.out.println("Non-Turbo Sports Car");
		}
	}

	public boolean getHasTurbo() {
		return hasTurbo;
	}

	public void setHasTurbo(boolean hasTurbo) {
		this.hasTurbo = hasTurbo;
	}

	



}
