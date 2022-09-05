import java.io.*;
import java.util.ArrayList;

public class Main {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<Pet> pets = new ArrayList<Pet>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		while (true) {
			/*
			 * If there are no pets yet, only the options add pet and exit is available. The
			 * find pet option is only shown when there are pets already stored in the
			 * program or when the first pet is added.
			 */
			if (pets.size() == 0) {
				System.out.println("\nWelcome to the Pet Shop!\nWhat would you like to do?");
				System.out.println("1. Add Pet");
				System.out.println("2. Exit\n");

				// Method call for runSelection()
				int command = runSelection(2);

				switch (command) {
				case 1:
					addPet();
					break;
				case 2:
					System.out.println("Thank you, see you again!");
					System.exit(0);
					break;
				}
			} else {
				System.out.println("\nWelcome to the Pet Shop!\n What would you like to do?");
				System.out.println("1. Add Pet");
				System.out.println("2. Find Pet");
				System.out.println("3. Exit\n");

				// Method call for runSelection()
				int response = runSelection(3);
				
				switch (response) {
				case 1:
					addPet();
					break;
				case 2:
					findPet();
					break;
				case 3:
					System.out.println("Thank you, see you again!");
					System.exit(0);
					break;
				}
			}
		}
	}

	static void addPet() throws NumberFormatException, IOException {
		Pet currentPet;
		String name;
		String type;
		String breed;
		String color;
		int age;
		String sex;
		String ownerName;

		// Asks the user which information do they have on the pet
		System.out.println("\nWhich information do you have on your Pet?");
		System.out.println("1) Pet name and type (Dog or Cat)");
		System.out.println("2) Pet name, type (Dog or Cat), and breed");
		System.out.println("3) Pet name, type (Dog or Cat), breed, and color");
		System.out.println("4) Pet name, type (Dog or Cat), breed, color, and age");
		System.out.println("5) Pet name, type (Dog or Cat), breed, color, age and sex");
		System.out.println("6) Pet name, type (Dog or Cat), breed, color, age, sex and owner's name\n");

		// Method call for runSelection()
		int response = runSelection(6);

		// Takes advantage of the numeric response to identify which informations are
		// selected
		if (true) {
			System.out.println();
			System.out.print("Enter your pet's name: ");
			name = in.readLine();
			System.out.print("Enter your pet's type (Dog or Cat): ");
			type = in.readLine();

			currentPet = new Pet(name, type);
		}

		if (response > 1) {
			System.out.print("Enter your pet's breed:");
			breed = in.readLine();

			currentPet = new Pet(name, type, breed);
		}

		if (response > 2) {
			System.out.print("Enter your pet's Color :");
			color = in.readLine();

			currentPet = new Pet(name, type, breed, color);
		}
		
		if (response > 3) {
			while (true) {
				try {
					System.out.print("Enter your pet's age:");
					age = Integer.parseInt(in.readLine());

					currentPet = new Pet(name, type, breed, color, age);
					break;

				} catch (Exception e) {
					System.out.println("Invalid input. Please try again!\n");
				}
			}
		}
		
		if (response > 4) {
			System.out.print("Enter your pet's sex: ");
			sex = in.readLine();

			currentPet = new Pet(name, type, breed, color, age, sex);
		}

		if (response > 5) {
			System.out.print("Enter the Owners name: ");
			ownerName = in.readLine();

			currentPet = new Pet(name, type, breed, color, age, sex, ownerName);
		}

		pets.add(currentPet);
		System.out.println("\nPet added successfully!\n");
	}

	static void findPet() throws IOException {
		System.out.print("\nEnter the Name of the Pet you are finding:");
		String name = in.readLine(); 	

		/*
		 * Loops through the array of Pets and then gets the name of each pet. After
		 * that it checks whether it has the same name on what the user entered.
		 */

		for (int i = 0; i < pets.size(); i++) {
			// pets.get(i).name accesses the object in the array list pets using the index i
			// and then it checks the name of that Pet object
			if (name.equalsIgnoreCase(pets.get(i).name)) {
				System.out.println("\nYour Pet is found, here are their details:");
				// uses the showDetails method of that Pet object
				pets.get(i).showDetails();
			}

			else {
				System.out.println("Pet Not Found.");
			}
		}
	}
	
	/**
	 * Run a console input command that only accepts values on to how many numbers
	 * (from 1) are in the selection
	 */
	static int runSelection(int numberOfSelection) {
		// Uses a while-loop with try-catch statement to make the program accept only
		// specific answers
		int command;
		while (true) {
			try {
				System.out.print("Input the number of your command:");
				command = Integer.parseInt(in.readLine());
				if (command < (numberOfSelection + 1) && command > 0) {
					break;
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Invalid Input. Please try again.\n");
			}
		}
		return command;
	}
}
