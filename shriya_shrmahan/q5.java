import java.util.*;
public class q5 {
	public static void main(String[] args) {
		Integer a[]= new Integer[]{1,4,17,23,3,100};
		int k=2;
		System.out.println("original array:");
		System.out.println(Arrays.toString(a));
		System.out.println("kth largest element:");
		Arrays.sort(a,Collections.reverseOrder());
		System.out.print(a[k-1]+" ");
	}
}
