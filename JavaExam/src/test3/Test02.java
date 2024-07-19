package test3;

/*
 * 날짜 : 2024/07/11
 * 이름 : 원기연
 * 내용 : 클래스 생성자 연습문제
 */

class King{
	private String name;
	private int year;
	
	//생성자 명이 같으니 매개변수로 구분
	public King(int year){
		this("정조"); //생성자 호출
		this.year = year;
	}
	
	public King(String name){
		this.name = name;
	}
	public King(String name, int year){
		this.name = name;
		this.year = year;
	}
	
	public void show() {
		System.out.println("name : " + name);
		System.out.println("year : " + year);
	}
		
}
 // 생성자 오버로딩
public class Test02 {
	public static void main(String[] args) {
		King k1 = new King("태조",1392);  //생성자 호출
	    King k2 = new King("세종대왕");
	    King k3 = new King(1776);
	    
	    k1.show();
	    k2.show();
	    k3.show();
	}

}
