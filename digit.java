import java.util.Scanner;
	public class digit {
		public static void main(String[] args) {
		Scanner cartoon = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 100: ");
		int action = cartoon.nextInt();
		int sumOfAction	= (action%10) + ((action/10)%10) + ((action/100)%10);
		System.out.printf("The sum of the action is %d%n" ,sumOfAction);
			
	}


}
