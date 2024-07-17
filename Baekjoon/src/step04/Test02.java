package step04;

import java.util.Scanner;

public class Test02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int num[] = new int[n];
		
		for(int i =0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i =0; i<num.length; i++) {
			if(num[i]<x) {
				System.out.print(num[i] + " ");
			}
		}
	}

}
