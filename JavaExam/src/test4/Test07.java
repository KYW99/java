package test4;
/*
 * 날짜 : 2024/07/19
 * 이름 : 원기연
 * 내용 : 로또번호 연습문제
 * 
 */
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test07 {
	public static void main(String[] args) {
		
		for(int count = 1; count<=5; count++) {
			System.out.println(makeLotto());
		}
	}
	public static Set<Integer> makeLotto() {
		
		Set<Integer> lottoSet = new HashSet<>();
		
		// ;; 무한루프라는 뜻
		for(;;) {
			int num = (int)Math.ceil(Math.random() * 45);
			lottoSet.add(num);
					
			if(lottoSet.size() == 6) {
				break;
			}
		}
		
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		return treeSet;
	}

}
