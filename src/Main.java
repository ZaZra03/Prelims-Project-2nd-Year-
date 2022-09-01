import java.io.*;
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
			else System.out.println("Invalid Input \n");
		
		} while(true);
	}
}
