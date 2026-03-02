public class lesson2_2 {
    public static void main(String[] args) {
// Create a scanner object for input
Scanner scanner = new Scanner(System.in);
// Prompt user to input base and height in inches
System.out.print("Enter the base of the triangle (in inches): ");
double base = scanner.nextDouble();
System.out.print("Enter the height of the triangle (in inches): ");
double height = scanner.nextDouble();
// Calculate the area of the triangle
double areaInSquareInches = 0.5 * base * height;
// Convert height to centimeters, feet, and inches
double heightInCm = height * 2.54; // Convert inches to cm
double heightInFeet = height / 12; // Convert inches to feet
double heightInInches = height; // Height is already in inches
// Display the results
System.out.println("Area of the Triangle: " + areaInSquareInches +
" square inches");
System.out.printf("Your Height in cm is %.2f cm, while in feet is %.2f feet and inches is %.2f inches\n",
heightInCm, heightInFeet, heightInInches);
// Close the scanner to prevent resource leak
scanner.close();
}

}
