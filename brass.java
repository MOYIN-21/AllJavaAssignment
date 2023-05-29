import java.util.Scanner;
public class brass {
	public static void main(String [] args) {
		Scanner luccy = new Scanner(System.in);
		
		System.out.print("Enter feet: ");
		double feet = luccy.nextDouble();
	
		
		double brass = (feet)*0.305;
		
		System.out.printf("the meter is %f%n" ,brass);
		
          }


}
