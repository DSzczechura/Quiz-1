import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Collects and stores user-input for 5 variables
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Enter total touchdowns:");
		double touchdowns = user_input.nextDouble();

		System.out.println("Enter total yards:");
		double yards = user_input.nextDouble();
		
		System.out.println("Enter total interceptions:");
		double interceptions = user_input.nextDouble();
		
		System.out.println("Enter total completions:");
		double completions = user_input.nextDouble();

		System.out.println("Enter total attempted passes:");
		double attempted = user_input.nextDouble();
		
		// Calculations to be used in final QB_rating calculation
		double a = ((completions/attempted)-.3)*5;
		double b = ((yards/attempted)-3)*.25;
		double c = (touchdowns/attempted)*20;
		double d = 2.375-((interceptions/attempted)*25);
		
		// Final QB-rating calculation
		double QB_rating = ((a+b+c+d)/6)*100;
		
		// Outputs Quarterback Rating to the first decimal place
		System.out.printf("Quarterback Rating is %2.1f",QB_rating);
		user_input.close();
	}
}
