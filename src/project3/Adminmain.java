package project3;

import java.util.Scanner;

public class Adminmain {
	
	public static void adminmain() {
		Scanner sc = new Scanner(System.in);
		int ch;
		Main ob = new Main();
		
		
		while(true) {	
			
			do {	
				
				System.out.println("1.���� �Է� 2.������Ʈ 3.���� 4.��ü���\n"
						+ "5.����ֺ����� �Է� 6.����ֺ����� ���� 7.����ֺ����� ����\n"
						+ "8.������� �Է� 9.������� ���� 10. ������� ����\n"
						+ "11.���ǻ��� 12.�������ηα��� 13.��й�ȣ ����");
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
