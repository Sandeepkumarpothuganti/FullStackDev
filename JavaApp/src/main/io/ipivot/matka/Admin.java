package io.ipivot.matka;

import java.text.ParseException;
import java.util.Scanner;

public class Admin {

	public static void main(String[] args) throws ParseException {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter change to make");
		String input = scanner.nextLine();

		commandAdmin(input);
	}

	private static void commandAdmin(String input) throws ParseException {
		PakageManager packageManager = new PakageManager();
		TravelPackage travelPackage = new TravelPackage();
		switch (input.toLowerCase()) {
		case "all":packageManager.getAllPackages();
					break;
		case "add":packageManager.addPackage(travelPackage);
					break;
		case "delete":System.out.println("enter Id to delete");
//			package2.getAllPackages();
		Scanner scanner=new Scanner(System.in);
		String deleteCommandId=scanner.nextLine();
		
			packageManager.deletePackage(deleteCommandId);
			
//			package2.getPackages(travelPackage.getId());
			break;
		case "update":Scanner scanner1=new Scanner(System.in);
		String updateCommandId=scanner1.nextLine();
		System.out.println("enter Id to update");
			packageManager.updatePackageById(updateCommandId);
			break;
		default:
			System.err.println("enter what you want to do add/delete/update");
			break;
		}
	}

}
