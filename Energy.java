import java.util.Scanner;
public class Energy {
	public static void main(String[] args) {
	Scanner duck =new Scanner(System.in);
	
	System.out.print("Enter the amount water in Kg");
	double amountOfWater = duck.nextDouble();
	
	System.out.print("Enter the initial temperation: ");
	double initialTemperature = duck.nextDouble();
	
	System.out.print("Enter the final temperature: ");
	double finalTemperature = duck.nextDouble();
	
	double energy = amountOfWater*(finalTemperature - initialTemperature)*4184;
	
	System.out.printf("The energy needed is %f%n " ,energy);	
	
	
	
	
	
	}





}
