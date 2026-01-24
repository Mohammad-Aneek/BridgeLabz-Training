package com.daynine.BirdSanctuary;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		EcoWingSanctuary sanctuary = new EcoWingSanctuary();
		Scanner scanner = new Scanner(System.in);

		// Pre-populating some data
		sanctuary.addBird(new Eagle("E001", "Eddie"));
		sanctuary.addBird(new Penguin("P001", "Penny"));
		sanctuary.addBird(new Duck("D001", "Daffy"));
		sanctuary.addBird(new Ostrich("O001", "Ozzy"));

		while (true) {
			System.out.println("\n--- EcoWing Bird Sanctuary ---");
			System.out.println("1. Add Bird");
			System.out.println("2. Display All Birds");
			System.out.println("3. Display Flying Birds");
			System.out.println("4. Display Swimming Birds");
			System.out.println("5. Remove Bird");
			System.out.println("6. Sanctuary Report");
			System.out.println("7. Exit");
			System.out.print("Select an option: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // consume newline

			switch (choice) {
			case 1:
				System.out.println("Enter Type (1.Eagle, 2.Penguin, 3.Duck, 4.Ostrich): ");
				int type = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter ID: ");
				String id = scanner.nextLine();
				System.out.print("Enter Name: ");
				String name = scanner.nextLine();

				if (type == 1)
					sanctuary.addBird(new Eagle(id, name));
				else if (type == 2)
					sanctuary.addBird(new Penguin(id, name));
				else if (type == 3)
					sanctuary.addBird(new Duck(id, name));
				else if (type == 4)
					sanctuary.addBird(new Ostrich(id, name));
				break;
			case 2:
				sanctuary.displayAllBirds();
				break;
			case 3:
				sanctuary.displayByAbility("Fly");
				break;
			case 4:
				sanctuary.displayByAbility("Swim");
				break;
			case 5:
				System.out.print("Enter Bird ID to remove: ");
				sanctuary.removeBird(scanner.nextLine());
				break;
			case 6:
				sanctuary.generateReport();
				break;
			case 7:
				System.out.println("Exiting system...");
				return;
			default:
				System.out.println("Invalid option.");
			}
		}
	}
}
