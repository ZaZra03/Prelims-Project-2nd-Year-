import java.io.*;

import java.util.ArrayList;

public class Main {
	
		static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		static ArrayList<Pet> pets =  new ArrayList<Pet>();

	public static void main(String[] args) throws NumberFormatException, IOException {		
		while(true) {
			/*
			 * If there are no pets yet, only the options add pet and 
			 * exit is available. The find pet option is only shown when there 
			 * are pets already stored in the program or when the first pet is
			 * added.
			 */
			if(pets.size() == 0) {
				System.out.println("Welcome to the Pet Shop!\nWhat would you like to do?");
				System.out.println("1. Add Pet"); 
				System.out.println("2. Exit");
				System.out.print("Input the number of your command:");
				int command = Integer.parseInt(in.readLine());
				
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
				System.out.println("Welcome to the Pet Shop!\n What would you like to do?");
				System.out.println("1. Add Pet"); 
				System.out.println("2. Find Pet");
				System.out.println("3. Exit");
				System.out.print("Input the number of your command:");
				int command = Integer.parseInt(in.readLine());
				
				switch (command) {
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
		String name;
		String type;
		String breed;
		String color;
		int age;
		String sex;
		String ownerName;
		
		//asks the user which information do they have on the pet
		System.out.println("Which information do you have on your Pet?");
		System.out.println("1) Pet name and type (Dog or Cat)");
		System.out.println("2) Pet name, type (Dog or Cat), and breed");
		System.out.println("3) Pet name, type (Dog or Cat), breed, and color");
		System.out.println("4) Pet name, type (Dog or Cat), breed, color, and age");
		System.out.println("5) Pet name, type (Dog or Cat), breed, color, age and sex");
		System.out.println("6) Pet name, type (Dog or Cat), breed, color, age, sex and owner�s name");
		System.out.print("Input the number of your command:");
		
		//reads the command of the user
		int command = Integer.parseInt(in.readLine());
		
		//selects which scenario happens depending on the informations available
		switch(command) {
		/*Things the code below does:
		 * it first looks on which informations the user have on the pet
		 * it has 6 available outcomes which depends on the information provided
		 * it gathers those informations and then adds the pet into an array
		 * which stores up all the pets created
		 */
		case 1:
			System.out.print("Enter the name of your Pet:");
			name = in.readLine();
			System.out.print("Enter the type of your Pet (Dog or Cat):");
			type = in.readLine();
			pets.add(new Pet(name,type));
			System.out.println("Pet added successfully!");
			break;
			
		case 2:
			System.out.print("Enter the name of your Pet:");
			name = in.readLine();
			System.out.print("Enter the type of your Pet (Dog or Cat):");
			type = in.readLine();
			System.out.print("Enter the breed of your Pet:");
			breed = in.readLine();
			pets.add(new Pet (name,type,breed));
			System.out.println("Pet added successfully!");
			break;
			
		case 3:
			System.out.print("Enter the name of your Pet:");
			name = in.readLine();
			System.out.print("Enter the type of your Pet (Dog or Cat):");
			type = in.readLine();
			System.out.print("Enter the breed of your Pet:");
			breed = in.readLine();
			System.out.print("Enter the color of your Pet:");
			color = in.readLine();
			pets.add(new Pet (name,type,breed,color));
			System.out.println("Pet added successfully!");
			break;
			
		case 4:
			System.out.print("Enter the name of your Pet:");
			name = in.readLine();
			System.out.print("Enter the type of your Pet (Dog or Cat):");
			type = in.readLine();
			System.out.print("Enter the breed of your Pet:");
			breed = in.readLine();
			System.out.print("Enter the color of your Pet:");
			color = in.readLine();
			System.out.print("Enter the age of your Pet:");
			age = Integer.parseInt(in.readLine());
			pets.add(new Pet (name,type,breed,color,age));
			System.out.println("Pet added successfully!");
			break;
			
		case 5:
			System.out.print("Enter the name of your Pet:");
			name = in.readLine();
			System.out.print("Enter the type of your Pet (Dog or Cat):");
			type = in.readLine();
			System.out.print("Enter the breed of your Pet:");
			breed = in.readLine();
			System.out.print("Enter the color of your Pet:");
			color = in.readLine();
			System.out.print("Enter the age of your Pet:");
			age = Integer.parseInt(in.readLine());
			System.out.print("Enter the sex of your Pet:");
			sex = in.readLine();
			pets.add(new Pet (name,type,breed,color,age,sex));
			System.out.println("Pet added successfully!");
			break;
			
		case 6:
			System.out.print("Enter the name of your Pet:");
			name = in.readLine();
			System.out.print("Enter the type of your Pet (Dog or Cat):");
			type = in.readLine();
			System.out.print("Enter the breed of your Pet:");
			breed = in.readLine();
			System.out.print("Enter the color of your Pet:");
			color = in.readLine();
			System.out.print("Enter the age of your Pet:");
			age = Integer.parseInt(in.readLine());
			System.out.print("Enter the sex of your Pet:");
			sex = in.readLine();
			System.out.print("Enter the Name of the Owner of your Pet:");
			ownerName = in.readLine();
			pets.add(new Pet (name,type,breed,color,age,sex,ownerName));
			System.out.println("Pet added successfully!");
			break;
			
		}
	}

	static void findPet() throws IOException {
		System.out.print("Enter the Name of the Pet you are finding:");
		String name = in.readLine();
		
		/*
		 * Loops through the array of Pets
		 * and then gets the name of each pet.
		 * After that it checks whether it has the same name on what the 
		 * user entered.
		 */
		
		for(int i = 0; i<pets.size();i++) {
			//pets.get(i).name accesses the object in the array list pets using the index i and then it checks the name of that Pet object
			if(name.equalsIgnoreCase(pets.get(i).name)) {
				System.out.println("Your Pet is found, here are their details:");
				//uses the showDetails method of that Pet object
				pets.get(i).showDetails();
			}
			
			else {
				System.out.println("Pet Not Found.");
			}
		}
	}
}
