package step04;

import java.util.Scanner;
import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int num[] = new int[n];
		
		for(int i = 0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num);
		System.out.println(num[0] + " " + num[n-1]);
	}

}
