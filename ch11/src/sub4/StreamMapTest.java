package sub4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


/*
 * 날짜 : 2024/07/23
 * 이름 : 원기연
 * 내용 : 자바 컬렉션 스트림 필터 맵 실습하기
 */
class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Person [name =" +name+ ", age=" + age +"]";
	}
	
}

public class StreamMapTest {
	public static void main(String[] args) {
		//Person 리스트 생성
		List<Person> people = new ArrayList<>();
		people.add(new Person("김유신", 23));
		people.add(new Person("김춘추", 21));
		people.add(new Person("장보고", 33));
		people.add(new Person("강감찬", 43));
		people.add(new Person("이순신", 53));
		
		// map 스트림
		List<String> names = people.stream()
									.map((person)->{
										return person.getName(); // 새로운 데이터 변환해서 다음 스트림을 전달
									})
									.collect(Collectors.toList()); // 스트림으로 전송된 데이터 취합해 컬렉션을 변환
		System.out.println(names);
		
		// flatmap 스트림
		List<List<String>> lists = List.of(
							Arrays.asList("apple", "banana"),
							Arrays.asList("cherry", "grape"),
							Arrays.asList("orange", "mango")
						
						);
		System.out.println(lists);
		//[a][b] 2차원 배열 복수형태를 단수로 바꿈
		//[c][g]
		//[o][m]
		
		List<String> fruits = lists.stream()
									.flatMap((list)->{
										return list.stream();
									})
									.collect(Collectors.toList());
		System.out.println(fruits);
	}

}
