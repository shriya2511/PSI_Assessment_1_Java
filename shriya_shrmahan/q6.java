import java.util.Scanner;
public class q6 {
	public static int count(int n) {
	int c = 0;
	String binaryNumber = Integer.toBinaryString(n);
	System.out.print("Binary representation "+n+" is: "+binaryNumber);
	for (char ch : binaryNumber.toCharArray()) {
	c += ch == '0' ? 1 : 0;
		}
	 return c;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input first number: ");
		int n = in.nextInt();
		System.out.println("\nNumber of zero bits: " + count(n));
	}
}
