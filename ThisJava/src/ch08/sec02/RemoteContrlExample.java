package ch08.sec02;

public class RemoteContrlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		
		rc = new Audio();
		rc.turnOn();
	}

}
