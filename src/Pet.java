public class Pet{

	public String petName;
	public String petType;
	public String petBreed;
	public String petColor;
	public String petAge;
	public String petSex;
	public String petOwnersName;

	public Pet(String name, String type) {
		this.petName = name; 
		this.petType = type;
	}

	public Pet(String name, String type, String breed){
		this.petName = name; 
		this.petType = type;
		this.petBreed = breed;
	}

	public Pet(String name, String type, String breed, String color){
		this.petName = name; 
		this.petType = type;
		this.petBreed = breed;
		this.petColor = color; 
	}

	public Pet(String name, String type, String breed, String color, String age){
		this.petName = name; 
		this.petType = type;
		this.petBreed = breed;
		this.petColor = color;
		this.petAge = age;
	}

	public Pet(String name, String type, String breed, String color, String age, String sex){
		this.petName = name; 
		this.petType = type;
		this.petBreed = breed;
		this.petColor = color;
		this.petAge = age;
		this.petSex = sex;
	}

	public Pet(String name, String type, String breed, String color, String age, String sex, String petOwnersName){
		this.petName = name; 
		this.petType = type;
		this.petBreed = breed;
		this.petColor = color;
		this.petAge = age;
		this.petSex = sex;
		this.petOwnersName = petOwnersName;
	}

	public void ShowDetails() {
		System.out.println("Your pet's name is : " + this.petName);
		System.out.println("Your pet's type is : " + this.petType);
		System.out.println("Your pet's breed is : " + this.petBreed);
		System.out.println("Your pet's color is : " + this.petColor);
		System.out.println("Your pet's age is : " + this.petAge);
		System.out.println("Your pet's sex is : " + this.petSex);
		System.out.println("Your pet's owner name is : " + this.petOwnersName);	
	}
}