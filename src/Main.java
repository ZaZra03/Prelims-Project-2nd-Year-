import java.io.*;

import java.util.ArrayList;

public class Main {
	
		static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		static ArrayList<Pet> pets =  new ArrayList<Pet>();

	public static void main(String[] args) throws NumberFormatException, IOException {		
		while(true) {
			if(pets.size() == 0) {
				System.out.println("Welcome to my mothafucking Pet Shop!\n What would you like to do?");
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
				System.out.println("Welcome to my mothafucking Pet Shop!\n What would you like to do?");
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
		System.out.print("Enter the Name of the Pet you are finding (Case Sensitive):");
		String name = in.readLine();
		
		/*
		 * Loops through the array of Pets
		 * and then gets the name of each pet.
		 * After that it checks whether it has the same name on what the 
		 * user entered.
		 */
		
		for(int i = 0; i<pets.size();i++) {
			//pets.get(i).name accesses the object in the array list pets using the index i and then it checks the name of that Pet object
			if(name.equals( pets.get(i).name)) {
				System.out.println("Your Pet is found, here are their details:");
				//uses the showDetails method of that Pet object
				pets.get(i).showDetails();
			}
			
			else {
				System.out.println("Pet Not Found.");
			}
		}

public class MainProgram {

	public static void main(String... args) throws IOException {
	
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
				
		do {
			System.out.println("WELCOME TO SUMMONERS RIFT");
			System.out.println();
			System.out.println("Select Your Transaction \n" + "A. Register \n"+ "B. Exit \n");
			System.out.println();
			
			char choice1 = rd.readLine().charAt(0);

			if(choice1 == 'A' || choice1 == 'a') {
				System.out.println("Choose what to record in your pet's Information");
				System.out.println("1. Pet Name and Type (Dog or Cat) ");
				System.out.println("2. Pet Name, Type (Dog or Cat), and Breed");
				System.out.println("3. Pet Name, Type (Dog or Cat), Breed, and Color ");
				System.out.println("4. Pet Name, Type (Dog or Cat), Breed, Color, and Age");
				System.out.println("5. Pet Name, Type (Dog or Cat), Breed, Color, Age, and Sex");
				System.out.println("6. Pet Name, Type (Dog or Cat), Breed, Color, Age, Sex, and Owners Name");				
				int command = Integer.parseInt(rd.readLine());
				
				switch (command) {
				
					case 1:
						System.out.println("Enter your pet's name: ");
						String name1 = rd.readLine();
					
						System.out.println("Enter your pet's type (Dog or Cat): ");
						String type1 = rd.readLine();
					
						Pet pet = new Pet(name1, type1);
						pet.showDetails();
						break;
						
					case 2:
						System.out.println("Enter your pet's name: ");
						String name2 = rd.readLine();
						
						System.out.println("Enter your pet's type (Dog or Cat): ");
						String type2 = rd.readLine();
						
						System.out.println("Enter your pet's breed:");
						String breed2 = rd.readLine();
						
						Pet pet2 = new Pet(name2, type2, breed2);
						pet2.showDetails();
						break;
						
					case 3:
						System.out.println("Enter your pet's name: ");
						String name3 = rd.readLine();
						
						System.out.println("Enter your pet's type (Dog or Cat): ");
						String type3 = rd.readLine();
						
						System.out.println("Enter your pet's breed:");
						String breed3 = rd.readLine();
						
						System.out.println("Enter your pet's Color :");
						String color3 = rd.readLine();
						
						Pet pet3 = new Pet(name3, type3, breed3, color3);
						pet3.showDetails();
						break;
						
					case 4:
						System.out.println("Enter your pet's name: ");
						String name4 = rd.readLine();
						
						System.out.println("Enter your pet's type (Dog or Cat): ");
						String type4 = rd.readLine();
						
						System.out.println("Enter your pet's breed:");
						String breed4 = rd.readLine();
						
						System.out.println("Enter your pet's Color :");
						String color4 = rd.readLine();
						
						System.out.println("Enter your pet's age:");
						String age4 = rd.readLine();
						
						Pet pet4 = new Pet(name4, type4, breed4, color4, age4);
						pet4.showDetails();
						break;
						
					case 5:
						System.out.println("Enter your pet's name: ");
						String name5 = rd.readLine();
						
						System.out.println("Enter your pet's type (Dog or Cat): ");
						String type5 = rd.readLine();
						
						System.out.println("Enter your pet's breed:");
						String breed5 = rd.readLine();
						
						System.out.println("Enter your pet's Color :");
						String color5 = rd.readLine();
						
						System.out.println("Enter your pet's age:");
						String age5 = rd.readLine();
						
						System.out.println("Enter your pet's sex: ");
						String sex5 = rd.readLine();
						
						Pet pet5 = new Pet(name5, type5, breed5, color5, age5, sex5);
						pet5.showDetails();
						break;
					case 6:
						System.out.println("Enter your pet's name: ");
						String name6 = rd.readLine();
						
						System.out.println("Enter your pet's type (Dog or Cat): ");
						String type6 = rd.readLine();
						
						System.out.println("Enter your pet's breed:");
						String breed6 = rd.readLine();
						
						System.out.println("Enter your pet's Color :");
						String color6 = rd.readLine();
						
						System.out.println("Enter your pet's age:");
						String age6 = rd.readLine();
						
						System.out.println("Enter your pet's sex: ");
						String sex6 = rd.readLine();
						
						System.out.println("Enter the Owners name: ");
						String petOwnersName6 = rd.readLine();
						
						Pet pet6 = new Pet(name6, type6, breed6, color6, age6, sex6, petOwnersName6);
						pet6.showDetails();
						break;
						
					default:
						System.out.println("Invalid Input");
						
				}	
			} 
			
			else if (choice1 == 'B' || choice1 == 'b') {			
				System.out.println("System Exit");	
				break;
			} 
			//Comment
			//Comment2
			else System.out.println("Invalid Input \n");
		
		} while(true);

	}
}
