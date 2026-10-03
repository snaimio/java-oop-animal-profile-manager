
public class Animal {
  
  //fields
  private String name; 
  private String color;
  private int ageInYears;
  private String favFood;

  // constructor to initialize all fields
  public Animal (String name, String color, int ageInYears, String favFood) {
    this.name = name;
    this.color = color;
    this.ageInYears = ageInYears;
    this.favFood = favFood;
  } // constructor

  // getter & setter for all fields
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

   public String getColor() {
    return color;
   }
  public void setColor(String color) {
    this.color = color;
  }

  public int getAgeInYears() {
    return ageInYears;
  }
  public void setAgeInYears(int ageInYears) {
    this.ageInYears = ageInYears;
  }

  public String getFavFood() {
    return favFood;
  }
  public void setFavFood(String favFood) {
    this.favFood = favFood;
  }

  // method printDetails (using printf) that will print all details about the animal
  public void printDetails() {

    System.out.println("===============================");
    System.out.println("       Zoo Animal Profile       ");
    System.out.println("===============================\n");
    System.out.printf("%-15s : %s%n", "Name", name);
    System.out.printf("%-15s : %s%n", "Color", color);
    System.out.printf("%-15s : %d%n", "Age", ageInYears);
    System.out.printf("%-15s : %s%n%n", "Favourite Food", favFood);
    System.out.println("===============================\n");

  }

  // print summary in one line
  public void printSummary() {
    System.out.printf("Summary: %s is %s in color, %d years old, and likes to eat %s.%n", name, color, ageInYears, favFood);
    System.out.println(); // adds an empty line after the summary
  }

} // class