package sub2;

/*
 * 날짜 : 2024/07/08
 * 이름 : 원기연
 * 내용 : 캡슐화 실습하기
 */
public class EncapsTest {
	
	public static void main(String[] args) {
		
		// Car 객체 생성
		Car sonata = new Car("소나타","흰색",0);

		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.setColor("은색");
		sonata.show();
		
		Car avante = new Car("아반테", "검정", 0);
		
		avante.speedUp(100);
		avante.speedDown(40);
		avante.show();
		

		//Account 객체 생성
		Account kb = new Account("국민은행", "101-21-1001", "김유신", 10000 );

		//객체 활용
		kb.deposit(40000);
		kb.withdraw(30000);
		kb.setName("김유진");
		kb.show();
		
		//Account 객체 생성
		Account wr = new Account("우리은행", "101-22-1001", "김춘추", 10000 );

		//객체 활용
		wr.deposit(20000);
		wr.withdraw(15000);
		wr.setBank("유리은행");
		wr.show();
		
		// 클래스 연습문제
		
		Book java = new Book("이것이 자바다","신용권", "121-11-1001", 3);
		Book sql = new Book("혼자 공부하는 SQL", "우재남", "112-10-1102", 2);
		
		System.out.println("--------------------");

		if(java.borrowBook()) {
			System.out.println("대출 성공");
		}else {
			System.out.println("대출 실패");
		}
		
		System.out.println("남은 도서 수: " +java.getAvailableCopies());
		java.show();
		
		System.out.println("--------------------");

		if(sql.borrowBook()) {
			System.out.println("대출 성공");
		}else {
			System.out.println("대출 실패");
		}
		
		System.out.println("남은 도서 수: " +sql.getAvailableCopies());
		sql.show();
		
	}

}
