package javacourse;

import java.time.LocalDate;

public class JRamsingh_Module01Project_040724 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	
	// Prompt user for patient details
	System.out.println("Enter patient details:");
	
	// Input patient name
	System.out.print("Enter Patient Name: ");
	String name = scanner.nextLine();
	
	// Input patient weight 
	System.out.print("Enter Patient Weight (in kg): ");
	double weight = scanner.nextDouble();
	
	// Consume the newline character after reading the double
	scanner.nextLine();
	
	// Input patient birth date 
	System.out.print("Enter Patient Birthdate (YYYY-MM-DD): ");
	String birthdateStr = scanner.nextLine();
	LocalDate birthdate = LocalDate.parse(birthdateStr);
	
	// Input patient height 
	System.out.print("Enter Patient Height (meters) :");
	double height = scanner.nextDouble();
	
	// Calculate BMI
	double bmi = calculateBMI(weight, height);
	
	// Determine BMI category
	String bmiCategory = determineBMICategory(bmi);
	
	// Display the entered information, BMI, and BMI category
	
	
	
	
	
	// Display collected information
	System.out.println("/nPatient Information:");
	System.out.println("Name: " + name);
	System.out.println("Weight: " + weight + "kg");
	System.out.println("Birthdate: " + birthdate);
	System.out.println("Height: " + height + "meters" );
	System.out.println("BMI: " + bmi);
	System.out.println("BMI Category: " + bmiCategory);
	
	// Close the Scanner
	scanner.close(); 	
	
}
	
// Method to calculate BMI
public static double calculateBMI(double weight, double height) {
	return weight / (height * height);
}

// Method to determine BMI category based on BMI score
public static String determineBMICategory(double bmi) {
	if (bmi < 18.5) {
		return "Underweight";
	} else if (bmi >= 18.5 && bmi <= 24.9) {
		return "Normal weight";
	} else if (bmi >= 25 && bmi <= 29.9) {
		return "Overweight";
	} else {
		return "Obesity";
		
	}
  }
}

  
