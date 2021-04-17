package com.vehicle.showroom;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Showroom {

	Map<String,NormalVehicle> normal = new HashMap<>();
	Map<String,SportsVehicle> sports = new HashMap<>();
	Map<String,HeavyVehicle> heavy = new HashMap<>();

	private long countVisitor = 30; // default 30 

	public long getCountVisitor() {
		return countVisitor;
	}

	public void setCountVisitor(long countVisitor) {
		this.countVisitor = countVisitor;
	}

	// add normal vehicle 
	public void addVehicle(String modelNumber, Long enginePower, Double tireSize, String engineType) {
		NormalVehicle vehicle = new NormalVehicle(modelNumber,enginePower,tireSize,engineType);
		normal.put(vehicle.getModelNumber(), vehicle);  // vehicle added into the vehicle list
		//vehicle.showVehicle();
	}

	// add sports vehicle 
	public void addVehicle(String modelNumber, Long enginePower, Double tireSize, String engineType,Boolean hasTurbo) {
		SportsVehicle vehicle = new SportsVehicle(modelNumber,enginePower,tireSize,engineType,hasTurbo);
		sports.put(vehicle.getModelNumber(), vehicle);  // vehicle added into the vehicle list
		//vehicle.showVehicle();
	}

	// add heavy vehicle
	public void addVehicle(String modelNumber, Long enginePower, Double tireSize, String engineType,Double weight) {
		HeavyVehicle vehicle = new HeavyVehicle(modelNumber,enginePower,tireSize,engineType,weight);
		heavy.put(vehicle.getModelNumber(), vehicle);  // vehicle added into the vehicle list
		//vehicle.showVehicle();
	}

	// remove vehicle based on vehicle model 
	public void removeVehicle(String modelNo) {

		if( this.normal.containsKey(modelNo) ) {
			this.normal.remove(modelNo);
		} else if( this.sports.containsKey(modelNo) ) {
			this.sports.remove(modelNo);
		} else if( this.heavy.containsKey(modelNo) ) {
			this.heavy.remove(modelNo);
		} else {
			System.out.println("This Model Number is incorrect.");
		}
	}

	public void showVehicleListWithDetails() {

		Set<String> normalModel = this.normal.keySet();
		Set<String> sportsModel = this.sports.keySet();
		Set<String> heavyModel = this.heavy.keySet();

		long totalVehicle = normal.size() + sports.size() + heavy.size();

		if( totalVehicle == 0 ) {
			System.out.println("There is no Vehicle in Showroom");
			return;
		}
		
		System.out.println("List of vehicles with details : ");
		for( String key : normalModel ) {
			System.out.println("------------------------------");
			NormalVehicle vehicle = normal.get(key);
			vehicle.showVehicle();
		}

		for( String key : sportsModel ) {
			System.out.println("------------------------------");
			SportsVehicle vehicle = sports.get(key);
			vehicle.showVehicle();
		}

		for( String key : heavyModel ) {
			System.out.println("------------------------------");
			HeavyVehicle vehicle = heavy.get(key);
			vehicle.showVehicle();
		}

	}

	public void showVehicleListWithExpectedVisitors() {
		
		Set<String> normalModel = this.normal.keySet();
		Set<String> sportsModel = this.sports.keySet();
		Set<String> heavyModel = this.heavy.keySet();

		long totalVehicle = normal.size() + sports.size() + heavy.size();

		if( totalVehicle == 0 ) {
			System.out.println("There is no Vehicle in Showroom");
			return;
		}
		
		System.out.println("Expected Visitors : " + this.countVisitor + " And list of vehicles");
		for( String key : normalModel ) {
			NormalVehicle vehicle = normal.get(key);
			System.out.println("Vehicle Model : " + vehicle.getModelNumber());
		}

		for( String key : sportsModel ) {
			SportsVehicle vehicle = sports.get(key);
			System.out.println("Vehicle Model : " + vehicle.getModelNumber());
		}

		for( String key : heavyModel ) {
			HeavyVehicle vehicle = heavy.get(key);
			System.out.println("Vehicle Model : " + vehicle.getModelNumber());
		}

	}


}
