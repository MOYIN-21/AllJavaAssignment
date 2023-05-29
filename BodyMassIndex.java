import java.util.Scanner;
public class BodyMassIndex { 
	public static void main(String[] args) {
	Scanner Joy = new Scanner(System.in);
	
	System.out.print("Enter your weight in pounds: ");
	double weight = Joy.nextDouble();
	
	System.out.print("Enter your height in inches: ");
	double height = Joy.nextDouble();
	
	double bodyMassIndex = (weight*0.45359237)/((height*0.0254)*(height*0.0254));
	
	System.out.printf("BMI is %.4f%n",bodyMassIndex);
	
	}


}
