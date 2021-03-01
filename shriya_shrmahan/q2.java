import java.util.Scanner;
public class q2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("input first number:");
		double num1= in.nextDouble();
		System.out.println("input second number:");
		double num2= in.nextDouble();
		if(num1>0 && num1<1 && num2>0 && num2<1) {
			System.out.println(num1>0 && num1<1 && num2>0 && num2<1); }
		else
			System.out.println("false");
	}
}