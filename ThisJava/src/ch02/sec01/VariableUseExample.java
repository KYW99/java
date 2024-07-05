package ch02.sec01;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour = 3;
		int miniut = 5;
		System.out.println(hour +"시간" + miniut + '분');
		
		int totalMinute = (hour * 60) + miniut;
		System.out.println("총" + totalMinute + "분");
	}

}
