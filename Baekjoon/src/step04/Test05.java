package step04;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //배열길이
		int m = sc.nextInt(); //반복 횟수
		
		int arr[] = new int[n];
		
		for(int x = 0; x < m; x++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			for(int y = i-1; y<j; y++) {
				arr[y] = k;
			}
		}
		
		for(int x = 0; x<n; x++) {
			System.out.print(arr[x] + " ");
		}
	}

}
