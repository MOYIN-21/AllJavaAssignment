import java.util.Scanner;
public class Acceleration {
	public static void main(String[] args) {
		Scanner education = new Scanner(System.in);
		System.out.print("Enter Vo,V1 and t: ");
	
		double endingVelocity = education.nextDouble();
		double startingVelocity = education.nextDouble();
		double time = education.nextDouble();
		
		double acceleration =(startingVelocity - endingVelocity)/time;
		System.out.printf("the average acceleration is %f%n" , acceleration);


	}


}
