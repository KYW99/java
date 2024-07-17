package step04;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int m = sc.nextInt();
		int temp = 0;
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int j = 0;  j<m; j++) {
			int i = sc.nextInt();
			int y = sc.nextInt();
			
			temp = arr[i-1];
			arr[i-1] = arr[y-1];
			arr[y-1] = temp;
		}
		
		for(int k = 0; k <arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
