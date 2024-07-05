package step02;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if(A!=B && B!=C && C!=A){
            int max;
            if(A>B){
                if (C>A){
                    max = C;
                }else {
                    max = A;
                }
            }else {
                if(C>B){
                    max = C;
                }else {
                    max = B;
                }
            }
            	System.out.println(max * 100);
        	}else {
        		if (A==B && B==C && A==C){
             
        			System.out.println(10000 + A * 1000);
        		
        		}else {
        			if (A==B || A==C){
        				System.out.println(1000 + A * 100);
        			}else {
        				System.out.println(1000 + B * 100);
                }
            }
        }

    }
}


