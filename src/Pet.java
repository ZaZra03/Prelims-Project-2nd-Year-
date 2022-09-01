
public class Pet {	
	public String name;
	public String type;
	public String breed;
	public String color;
	public int age;
	public String sex;
	public String ownerName;
	
	/*Constructors for the following:
	 * 1) Pet name and type (Dog or Cat)
	 * 2) Pet name, type (Dog or Cat), and breed
	 * 3) Pet name, type (Dog or Cat), breed, and color
	 * 4) Pet name, type (Dog or Cat), breed, color, and age
	 * 5) Pet name, type (Dog or Cat), breed, color, age and sex
	 * 6) Pet name, type (Dog or Cat), breed, color, age, sex and owner�s name
	 * Respectively.
	 */
	
	Pet(String name, String type){
		this.name = name;
		this.type = type;
	}
	Pet(String name, String type, String breed){
		this.name = name;
		this.type = type;
		this.breed = breed;
	}
	Pet(String name, String type, String breed,String color){
		this.name = name;
		this.type = type;
		this.breed = breed;
		this.color = color;
	}
	Pet(String name, String type, String breed,String color, int age){
		this.name = name;
		this.type = type;
		this.breed = breed;
		this.color = color;
		this.age = age;
	}
	Pet(String name, String type, String breed,String color, int age, String sex){
		this.name = name;
		this.type = type;
		this.breed = breed;
		this.color = color;
		this.age = age;
		this.sex = sex;
	}
	Pet(String name, String type, String breed,String color, int age, String sex,String ownerName){
		this.name = name;
		this.type = type;
		this.breed = breed;
		this.color = color;
		this.age = age;
		this.sex = sex;
		this.ownerName = ownerName;
	}
	
	//Method to show the details the object has
	public void showDetails() {
		if(name != null) {
			System.out.println("Pet name: "+name);
		} 
		if(type != null) {
			System.out.println("Pet type: "+type);
		} 
		if(breed != null) {
			System.out.println("Pet breed: "+breed);	
		}
		if(color != null) {
			System.out.println("Pet color: "+color);
		}
		if(age != 0) {
			System.out.println("Pet age: "+age+" years");
		}
		if(ownerName != null) {
			System.out.println("Pet Owner's Name: "+ownerName);
		}
	}
