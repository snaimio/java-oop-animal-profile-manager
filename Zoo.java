
import java.util.Scanner;

public class Zoo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\nWelcome to the Zoo Management System!");
    System.out.println("(Please enter the following details:)");
    System.out.println("================================\n");

    // prompting user for data input
    System.out.print("Enter the animal's name: ");
    String name = input.nextLine(); 

    System.out.print("Enter animal's color: ");
    String color = input.nextLine();

    System.out.print("Enter animal's age(Years): ");
    int age = input.nextInt();

    if (age < 0) {
      System.out.println("Age cannot be negative. Setting to 0.");
      age = 0;
    }
    input.nextLine(); // consume the leftover newline character

    System.out.print("Enter the animal's favorite food: ");
    String favFood = input.nextLine();

    // creating an instance of Animal (Animal object)

    Animal myAnimal = new Animal(name, color, age, favFood);

    // printing all the details
    System.out.println();
    myAnimal.printDetails();
    myAnimal.printSummary(); // printing a summary

    input.close(); // close the scanner
  } // main

} // class
  

