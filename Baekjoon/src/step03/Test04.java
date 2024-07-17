package step03;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count = sc.nextInt();
		
		int total = 0;
		
		for(int i =1; i<=count; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			total += (a*b);
		}
		
		if(total == n) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
