package user2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import user1.UserDAO;


public class User2main {
	public static void main(String[] args) {
		
		System.out.println("-------------------------");
		System.out.println("User2 회원관리매니저 v1.0");
		System.out.println("-------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.println("선택> ");
			
			int answer = sc.nextInt();
			
			if(answer == 0 ) {
				break;
				
			}else if(answer == 1){
				System.out.print("아이디 입력 : ");
				String uid = sc.next();
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("생년월일 입력 : ");
				String birth = sc.next();
				System.out.print("주소 입력 : ");
				String addr = sc.next();
				
				User2VO vo = new User2VO(uid,name,birth,addr);
				
				User2DAO dao = User2DAO.getInstance();
				
				dao.insertUser2(vo);
				
				
				System.out.println("입력 완료...");
			
				
				
			}else if(answer == 2){
			
				User2DAO dao = User2DAO.getInstance();
				List<User2VO> users = dao.selectUsers2();
				
				for(User2VO user : users) {
					System.out.println(user);
				}
				
				
			
			}else if(answer == 3){
				System.out.println("검색 아이디 : ");
				String searchUid = sc.next();
				
				User2DAO dao = User2DAO.getInstance();
				User2VO user = dao.selectUser2(searchUid);
				
				System.out.println(user);
			
			}else if(answer == 4){
	
				User2VO user = new User2VO();
				
				System.out.print("수정 회원 아이디 입력:");
				user.setUid(sc.next());
				
				System.out.print("수정 회원 이름 입력:");
				user.setName(sc.next());
				
				System.out.print("수정 회원 생년월일 입력:");
				user.setBirth(sc.next());
				
				System.out.print("수정 회원 주소 입력:");
				user.setAddr(sc.next());
				
				int result = User2DAO.getInstance().updateUser(user);
				
				if(result > 0) {
					System.out.println("수정 완료...");
				}else {
					System.out.println("수정 할 회원 아이디가 없습니다.");
				}
				
			
			}else if(answer == 5){
				System.out.println("삭제 회원 아이디 입력 : ");
				String uid = sc.next();
				
				int result = User2DAO.getInstance().deleteUser(uid);
				
				if(result > 0) {
					System.out.println("삭제 완료...");
				}else {
					System.out.println("삭제 할 회원 아이디가 없습니다.");
				}
			}
			}
	}

}