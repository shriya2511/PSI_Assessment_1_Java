import java.util.Scanner;
	public class q4 {
		public static void main(String[] args) {
		int[][]array  = {{10, 20, 30},{40, 50, 60}};
		System.out.print("Original Array:\n");
		print_array(array);
		System.out.print("After changing the rows and columns:");
		transpose(array);
	}

	private static void transpose(int[][] array) {
		int i,j;		
		int[][] newarray = new int[array[0].length][array.length];

		for ( i = 0; i < array.length; i++) {
		for (j = 0; j < array[0].length; j++) {
		array[j][i] = array[i][j];
			}
		}
		print_array(array);
	}
	private static void print_array(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
				}
			System.out.println();
		}

	}
}
