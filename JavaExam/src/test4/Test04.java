package test4;
/*
 * 날짜 : 2024/07/19
 * 이름 : 원기연
 * 내용 : 자바 문자열 연습문제
 */
public class Test04 {
	public static void main(String[] args) {
		
		String fileName = "HelloWorld.java";
		
		//맨 뒤 점을 기준으로 자름
		int idx = fileName.lastIndexOf(".");
		
		String title = fileName.substring(0, idx);
		String ext = fileName.substring(idx + 1);
		
		System.out.println("파일명 : " + title);
		System.out.println("확장자 : " + ext);
		
		String strScores = "60, 72, 82, 86, 92";
		String[] scores = strScores.split(","); // 쉼표로 구분된 문자열을 배열로 변환
		
		int total = 0;
		
		for(String score : scores) {
			total += Integer.parseInt(score.trim()); //배열을 숫자로 변환 > parseint trim을 사용하요 공백을 없애줌
		}
		
		System.out.println("strScore 총점 : " + total);
	}

}

//int idx = fileName.lastIndexOf('.'); - 파일명에서 마지막 점(.)의 위치를 찾습니다.
//String title = fileName.substring(0, idx); - 점(.) 이전의 부분을 파일명으로 추출합니다.
//String ext = fileName.substring(idx + 1); - 점(.) 이후의 부분을 확장자로 추출합니다.
//String[] scores = strScores.split(", "); - 쉼표와 공백으로 구분된 문자열을 배열로 변환합니다.
//total += Integer.parseInt(score); - 각 점수를 정수로 변환하여 총점에 더합니다.