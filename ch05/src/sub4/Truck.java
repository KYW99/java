package sub4;

public class Truck extends Car{
	
	private int capacity;
	
	public Truck(String name, String color, int speed, int capacity) {
		super(name,color,speed);
		this.capacity = capacity;
	}
	
	//상속관계 private로 참조 불가능 protected로 바꿔서 참조
	public void show() {
		System.out.println("차량명 : " + name);
		System.out.println("차량색 : " + color);
		System.out.println("현재속도 : " + speed);
		System.out.println("적재용량 : " + capacity);
	}

}
