package step03;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();

		for(int i = 1; i<=9; i++) {
			System.out.println(x + " * " + i + " = " + (x*i)  );
		}
	}

}