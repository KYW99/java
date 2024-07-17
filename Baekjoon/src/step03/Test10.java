package step03;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		for(int i = 1; i<=s; i++) {	
			for(int j = 1; j<=s-i; j++) {
				System.out.print(" ");
				
			}for(int k = 0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
