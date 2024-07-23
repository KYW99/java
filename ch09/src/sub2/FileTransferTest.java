package sub02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2024/07/18
 * 이름 : 원기연
 * 내용 : 파일 메서드를 이용한 파일 복사 실습하기
 * 
 */
public class FileTransferTest {
	public static void main(String[] args) {

		String source = "C:\\Users\\lotte4\\Desktop\\workspace.zip"; 
		String target = "C:\\Users\\lotte4\\Desktop\\workspace3.zip"; 
		
		
		//버퍼로 이용한 byte 배열
		byte[] buffer = new byte[1024]; //1kb
		
		try {
			//입력스트림 연결
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			// 파일복사
			fis.transferTo(fos);
												
			//스트림 해제
			
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
		
		
	}

}

