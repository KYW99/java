package step04;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n[] = new int[x];
		int count = 0;
		
		for(int i = 0; i<n.length; i++) {
			n[i] = sc.nextInt();
		}
		int y = sc.nextInt();
		
		for(int i = 0; i<n.length; i++) {

			if(n[i]== y) {
				count++;
			}

		}
		System.out.println(count);
	}

}
