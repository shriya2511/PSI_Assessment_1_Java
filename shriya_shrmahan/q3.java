import java.util.Scanner;
public class q3 {
	public static void main(String[] args) {
		int i,j;
		boolean [][]array={{true,false,true},{false,true,false}};
		int row_length=array.length;
		int column_length=array[0].length;
		for(i=0;i<row_length;i++) {
			for(j=0;j<column_length;j++) {
				if(array[i][j]) {
					System.out.print("t");
				}
				else {
					System.out.print("f");
				}
			}	
			System.out.println();
		}
	}
}