package project3;

import java.util.Scanner;

public class Adminmain {
	
	public static void adminmain() {
		Scanner sc = new Scanner(System.in);
		int ch;
		Main ob = new Main();
		
		
		while(true) {	
			
			do {	
				
				System.out.println("1.메인 입력 2.업데이트 3.삭제 4.전체출력\n"
						+ "5.장소주변정보 입력 6.장소주변정보 수정 7.장소주변정보 삭제\n"
						+ "8.장소정보 입력 9.장소정보 수정 10. 장소정보 삭제\n"
						+ "11.건의사항 12.유저메인로그인 13.비밀번호 변경");
				ch = sc.nextInt();
				
			}while(ch<1);
			
			switch(ch) {	
			
			case 1: 
				ob.insert();
				break;
				
			case 2:
				ob.update();
				break;
				
			case 3: 
				ob.delete();
				break;
				
			case 4:
				ob.selectAll();
				break;
			
			case 5:
				ob.insertA();
				break;
				
			case 6:
				ob.updateA();
				break;
			case 7:
				ob.deleteA();
				break;
			case 8:
				ob.insertT();
				break;
			case 9:
				ob.updateT();
				break;
			
			case 10:
				ob.deleteT();
				break;
			
			case 11:
				ob.selectRequestall();
				break;
	
			case 12:
			
				return;

			case 13:
				ob.admincsn();
				break;
			
			}
			
			
		}
	}

}
