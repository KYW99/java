package ch06.sec10.exam02;

public class Television {
	
	static String Company = "MyCompany";
	static String model = "LDC";
	static String info;
	
	
	static {
		info = Company + "-" + model;
	}

}
