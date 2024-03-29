package RiplTasks;

public class Dog {
	// public static void main(String[] args) {

	/*
	 * 1. Complete the Dog.java class:
	 * 
	 * Create following class variables. dogName dogWeight static dogBreed=Mutt; For
	 * all methods and variables use proper naming convention.
	 * 
	 * 
	 * Write two constructors: The main constructor(include all the variables as
	 * parameter) A secondary constructor that takes in only Name and Weight 2.
	 * Create a display method to print the values of class variable in Dog class.
	 * 
	 * 2. In Main class Create a Dog object using both Constructors.and they call
	 * display method with each object
	 * 
	 * Output: 1.The main constructor(with all parameters) Expected console output:
	 * Tarzan Mutt 50.0
	 * 
	 * 2.secondary constructor that takes in only Name and Weight (Breed defaults to
	 * "Mutt") Expected console output Tarzan Mutt 50.0
	 */

	String dogName;
	double dogWeight;
	public static String dogBreed = "Mutt";

	Dog(String name,String breed, double weight ) {
		dogName = name;
		dogWeight = weight;
		dogBreed = breed;
	}

	Dog(String name, int weight) {
		dogName = name;
		dogWeight = weight;

	}

	void display() {
		System.out.println(dogName + " " + dogBreed + " " + dogWeight);
	}

}