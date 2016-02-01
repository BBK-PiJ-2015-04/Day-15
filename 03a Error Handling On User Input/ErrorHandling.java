import java.util.Scanner;

public class ErrorHandling {
	
	public static void main(String[] args) {
		
		ErrorHandling dummy = new ErrorHandling();
		
		dummy.Launch();
		
	}
	
	public void Launch() {
		
		System.out.println("Please enter 10 numbers.");
		double sum = 0;
		for(int i = 0; i < 10; i++) {
			double a = getNumber();
			sum = sum + a;
		}
		System.out.println("The mean average is " + sum / 10);
		
	}
	
	public double getNumber() {
		
		Scanner kyb = new Scanner(System.in);
		boolean inputCorrect = false;
		double numb = 0;
		while (inputCorrect == false) {
			try {
				System.out.print("Enter a number: ");
				numb = kyb.nextDouble();
				inputCorrect = true;
			}
			catch (Exception ex){
				System.out.println("Please enter an number!");
				String str = kyb.nextLine();
			}
		}
		return numb;
	}
	
}
