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
				
				System.out.println("\n1.��ü��� 2.����ֺ����� ���"
						+ " 3.������� ��� 4.���ֵ� ���� ��ȸ 5.���ǻ��� �Է� 6.������ �α��� 7.����");
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
				System.out.println("���α׷� ����");
				System.exit(0);
			
			
			}
			
			
		}

	}

}
