
class Animal {
	private static int age = 0;
	private String name = "";

	private Animal() {
		age = 1;
		name = "Loser";

		System.out.println("Age: " + age + " Name: " + name + "  ");
	}

	public Animal(int ageGiven, String nameGiven) {
		age = ageGiven;
		name = nameGiven;

		System.out.println("Age2: " + age + " Name: " + name + "  ");
	}

	public static Animal tworzAnimal() {
		Animal animal = new Animal();
		return animal;
	}

	public static void setAge(int newAge) {
		age = newAge;
	}

	public static int getAge() {
		return age;
	}
}

//=====================================================
public class Constructor {

	public static void main(String[] args) {
		for (int o = 0; o < 5; o++) {
			Animal.tworzAnimal();
			System.out.println("Current age: " + Animal.getAge());
			if (o == 3)
				Animal.setAge(4);
		}
		Animal animal2 = new Animal(2, "Winner");
	}
}