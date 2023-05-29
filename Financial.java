import java.util.Scanner;
public class Financial {
	public static void main(String[] args ) {
	Scanner lucy = new Scanner(System.in);
	
	System.out.println("Enter balance  ");
	float balance = lucy.nextFloat ();
	
	System.out.println("Enter interest  ");
	float interest = lucy.nextFloat ();
	
	float time = 12;
	float value1 = interest / time;
	float value2 = value1 * balance;
	float value3 = value2 / 1200;
	float value4 = value3 * time;
	
	System.out.printf("The interest is %.5f%n", value4);
	
	
	
	}
	
}

