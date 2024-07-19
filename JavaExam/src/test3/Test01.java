package test3;

import java.util.jar.Attributes.Name;

/*
 * 날짜 : 2024/07/11
 * 이름 : 원기연
 * 내용 : 자바 클래스 연습문제
 */
public class Test01 {
	
	private String name;
	private int age;
	
	public Test01(String name, int age) { //생성자
		this.name = name;
		this.age = age;
	}
	
	//인스턴트메서드ㄴ
	
	public void show() {
		System.out.println("==================");
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("------------------");
	}
	
	public static void main(String[] args) {
		Test01 kim = new Test01("김유신", 23);
		Test01 lee = new Test01("이순신", 31);
		
		kim.show();
		lee.show();
	}

}
