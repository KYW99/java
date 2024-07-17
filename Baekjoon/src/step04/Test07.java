package step04;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[31];
		
		for(int i = 1; i<=29; i++) {
			int success = sc.nextInt();
			arr[success] = 1;
		}
		
		for(int j = 0; j<=arr.length; j++) {
			if(arr[j] != 1)
					System.out.println(j);
		}
	}

}
