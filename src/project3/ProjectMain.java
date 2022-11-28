package project3;

import java.util.Scanner;

public class ProjectMain {

	public static void main(String[] args) {
		
		JejuAscii ja = new JejuAscii();
		
		ja.Title();
		
		
		Scanner sc = new Scanner(System.in);
		int ch;
		Main ob = new Main();
		WeatherApi wapi = new WeatherApi();
		
		
		while(true) {	
			
			do {	
				
				System.out.println("\n1.전체출력 2.장소주변정보 출력"
						+ " 3.장소정보 출력 4.제주도 날씨 조회 5.건의사항 입력 6.관리자 로그인 7.종료");
				ch = sc.nextInt();
				
			}while(ch<1);
			
			switch(ch) {	
			
			case 1: 
				ob.selectAll();
				break;
				
			case 2:
				ob.selectArea();
				break;
				
			case 3: 
				ob.selectTour();
				break;
			
			case 4:
				wapi.weatherjeju();
				break;
			case 5:
				ob.insertRequest();
				break;
			
			case 6:
				ob.adminlogin();
				break;
				
			case 7:
				System.out.println("프로그램 종료");
				System.exit(0);
			
			
			}
			
			
		}

	}

}
