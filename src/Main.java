import java.io.*;
public class Main {

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
				
				char choice2 = rd.readLine().charAt(0);
				
				if(choice2 == '1') {
					System.out.println();
					System.out.println("Enter your pet's name: ");
					String name = rd.readLine();
					
					System.out.println("Enter your pet's type (Dog or Cat): ");
					String type = rd.readLine();
					
					Pet pet1 = new Pet(name, type);
					pet1.ShowDetails();
					
					}else if(choice2 == '2') {
						System.out.println();
						
						System.out.println("Enter your pet's name: ");
						String name = rd.readLine();
						
						System.out.println("Enter your pet's type (Dog or Cat): ");
						String type = rd.readLine();
						
						System.out.println("Enter your pet's breed:");
						String breed = rd.readLine();
						
						Pet pet2 = new Pet(name, type, breed);
						pet2.ShowDetails();
					
					
					
					}else if(choice2 == '3') {
						System.out.println();
						
						System.out.println("Enter your pet's name: ");
						String name = rd.readLine();
						
						System.out.println("Enter your pet's type (Dog or Cat): ");
						String type = rd.readLine();
						
						System.out.println("Enter your pet's breed:");
						String breed = rd.readLine();
						
						System.out.println("Enter your pet's Color :");
						String color = rd.readLine();
						
						Pet pet3 = new Pet(name, type, breed, color);
						pet3.ShowDetails();
						
					}else if(choice2 == '4') {
						System.out.println();
						
						System.out.println("Enter your pet's name: ");
						String name = rd.readLine();
						
						System.out.println("Enter your pet's type (Dog or Cat): ");
						String type = rd.readLine();
						
						System.out.println("Enter your pet's breed:");
						String breed = rd.readLine();
						
						System.out.println("Enter your pet's Color :");
						String color = rd.readLine();
						
						System.out.println("Enter your pet's age:");
						String age = rd.readLine();
						
						Pet pet4 = new Pet(name, type, breed, color, age);
						pet4.ShowDetails();
						
					}else if(choice2 == '5') {
						System.out.println();
						
						System.out.println("Enter your pet's name: ");
						String name = rd.readLine();
						
						System.out.println("Enter your pet's type (Dog or Cat): ");
						String type = rd.readLine();
						
						System.out.println("Enter your pet's breed:");
						String breed = rd.readLine();
						
						System.out.println("Enter your pet's Color :");
						String color = rd.readLine();
						
						System.out.println("Enter your pet's age:");
						String age = rd.readLine();
						
						System.out.println("Enter your pet's sex: ");
						String sex = rd.readLine();
						
						Pet pet5 = new Pet(name, type, breed, color, age, sex);
						pet5.ShowDetails();
						
					}else if(choice2 == '6') {
						System.out.println();
						
						System.out.println("Enter your pet's name: ");
						String name = rd.readLine();
						
						System.out.println("Enter your pet's type (Dog or Cat): ");
						String type = rd.readLine();
						
						System.out.println("Enter your pet's breed:");
						String breed = rd.readLine();
						
						System.out.println("Enter your pet's Color :");
						String color = rd.readLine();
						
						System.out.println("Enter your pet's age:");
						String age = rd.readLine();
						
						System.out.println("Enter your pet's sex: ");
						String sex = rd.readLine();
						
						System.out.println("Enter the Owners name: ");
						String petOwnersName = rd.readLine();
						
						Pet pet6 = new Pet(name, type, breed, color, age, sex, petOwnersName);
						pet6.ShowDetails();
						
					}else {
						System.out.println();
						
						System.out.println("Invalid Input");
					}
				
					
			}else if(choice1 == 'B' || choice1 == 'b') {
				System.out.println();
				
				System.out.println("System Exit");
				
				break;
			}else {
				System.out.println();
				
				System.out.println("Invalid Input \n");
			}
		
		}while(true);

	}

}