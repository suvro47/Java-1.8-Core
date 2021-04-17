package com.vehicle.showroom;

import java.util.Scanner;

enum Engine 
{ 
	Oil, Gas, Diesel;
}

public class ApplicationClass {
	
	private static Engine funFixed() {

		System.out.println("Choose Vehicle Engine Type:");
		System.out.println("Press 1 : For Oil Engine");
		System.out.println("Press 2 : For Gas Engine");
		System.out.println("Press 3 : For Diesel Engine");

		Scanner scan = new Scanner(System.in);
		int choose = scan.nextInt();

		if( choose == 1 ) return Engine.Oil;
		if( choose == 2 ) return Engine.Gas;
		else return Engine.Diesel;
	}

	public static void main(String[] args) {

		Instruction instruction = new Instruction();
		instruction.showInstructionSet();

		Scanner scan = new Scanner(System.in);
		Showroom showroom = new Showroom();

		while ( true ) {
			
			System.out.println("----- Enter Your Choice ------");
			int choice = scan.nextInt();

			if( choice >= 1 && choice <= 3 ) {
				
				String modelNo; Long enginePower; Double tireSize; String engineType; Boolean hasTurbo; Double weight;
				
				System.out.println("Enter Vehicle Model Number :");
				String skip = scan.nextLine();
				modelNo = scan.nextLine();
				System.out.println("Enter Vehicle Engine Power :");
				enginePower = scan.nextLong();
				System.out.println("Enter Vehicle Tire Size :");
				tireSize = scan.nextDouble();
				
				if( choice == 1 ) {
					engineType = funFixed().name();
					showroom.addVehicle(modelNo, enginePower, tireSize, engineType);
	
				} else if( choice == 2 ) {
					engineType = "Oil";
					System.out.println("If vehicle is a Turbo Sports vehicle then Press 1 otherwise press 2:");
					int input = scan.nextInt(); 
					hasTurbo = input == 1 ? true : false;
					showroom.addVehicle(modelNo, enginePower, tireSize, engineType, hasTurbo);
					showroom.setCountVisitor( showroom.getCountVisitor() + 20);
					
				} else if( choice == 3 ) {
					engineType = "diesel";
					System.out.println("Enter Vehicle Weight : ");
					weight = scan.nextDouble();
					showroom.addVehicle(modelNo, enginePower, tireSize, engineType, weight);
				}
				
			} else if( choice >= 4 && choice <= 6 ) {
				String skip = scan.nextLine();
				System.out.println("Enter Vehicle Model No : ");
				String modelNo = scan.nextLine();
				showroom.removeVehicle(modelNo);
				
			} else if( choice == 7 ) {
				showroom.showVehicleListWithDetails();
				
			} else if( choice == 8 ) {
				showroom.showVehicleListWithExpectedVisitors();
				
			} else break;
			
		}

	}

}
