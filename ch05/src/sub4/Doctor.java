package sub4;

public class Doctor extends Person{
	
	private String specialty;
	
	public Doctor(String name, int age, String specilaty) {
		super(name,age);
		this.specialty = specilaty;
	}
	
	public void work() {
		super.introduce();
		System.out.println("저는 의사이며 전공은 " +specialty + "입니다.");
	}

}
