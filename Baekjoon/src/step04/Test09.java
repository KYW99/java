package step04;

import java.util.Arrays;
import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double Score[] = new double[x];
		
		for(int i = 0; i<Score.length; i++) {
			Score[i] = sc.nextDouble();
		}
		
		double sum = 0;
		
		Arrays.sort(Score);
		
		for(int i = 0; i<Score.length; i++) {
			sum += ((Score[i] / Score[Score.length-1]) * 100 );
		}
		System.out.println(sum/Score.length);
	}

}
