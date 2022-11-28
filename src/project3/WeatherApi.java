package project3;


import java.util.Calendar;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class WeatherApi {
	
	public void weatherjeju() {
		
			Scanner sc = new Scanner(System.in);
			Calendar now = Calendar.getInstance();
			
			WeatherAscii wa = new WeatherAscii();
			
			String wd = null;
			int y,m,d;
	

		try {
			
			
			//��, ��, ��, ���� �� �Է¹ޱ�
			System.out.println("������ �˰� ���� ��¥�� �Է��ϼ���");
			
			do {
				System.out.print("�⵵? [YYYY]: ");//2021
				y = sc.nextInt();
			}while(y<1);
			
			do {
				System.out.print("��? [MM]: ");//5
				m = sc.nextInt();
			}while(m<1||m>12);
			
			do {
				System.out.print("��? [DD]: ");//
				d = sc.nextInt();
			}while(d<1||d>31);
			
			
			//��¥ �Է��ϱ�
			now.set(y, m-1, d);
			

			now.add(Calendar.DATE, -2);	//��(day)�� ���ϱ� > �ش� ��¥�� �ʱ�ȭ ��
			
			y = now.get(Calendar.YEAR);		
			m = now.get(Calendar.MONTH)+1;	
			d = now.get(Calendar.DATE);

			
			if(m<10) {
			
				wd = String.format("%d0%d%d",y,m,d);
			
			}else {
				
				wd = String.format("%d%d%d",y,m,d);
				
			}//if-else

			//System.out.println(wd);
	
			//String url = "http://apis.data.go.kr/1360000/TourStnInfoService/getTourStnVilageFcst?serviceKey=UVqZ826p2Ow%2FUjjkgy2DdHS%2FjmShJ66F2jIffUq1m0o8J3Frmh1yK%2BGRrwNtg5%2FIpJvNdWieEZ1c56qVgm%2BWyg%3D%3D&numOfRows=10&pageNo=4&CURRENT_DATE="+d+"01&HOUR=24&COURSE_ID=166";
			String url = "http://apis.data.go.kr/1360000/TourStnInfoService/getTourStnVilageFcst?serviceKey=UVqZ826p2Ow%2FUjjkgy2DdHS%2FjmShJ66F2jIffUq1m0o8J3Frmh1yK%2BGRrwNtg5%2FIpJvNdWieEZ1c56qVgm%2BWyg%3D%3D&numOfRows=10&pageNo=1&CURRENT_DATE="+wd+"15&HOUR=24&COURSE_ID=166";
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = f.newDocumentBuilder();
			
			Document xmlDoc = parser.parse(url);
			
			xmlDoc.getDocumentElement().normalize();
			//System.out.println("Root element: " + xmlDoc.getDocumentElement().getNodeName());
				
			NodeList nList = xmlDoc.getElementsByTagName("item");
			//System.out.println("�Ľ��� ����Ʈ ��: " + nList.getLength());		//nList: 10��
			
			for(int i=0;i<nList.getLength();i++) {
				
				Node book = nList.item(i);
				
				NodeList nList2 = book.getChildNodes();
				
				//System.out.println("nList2: "+nList2.getLength());		//nList2: 15��
				
				for(int j=0;j<nList2.getLength();j++) {

					Node e = nList2.item(j);

					switch(j) {

						case 0:
							System.out.println("���ؽð�: " + e.getChildNodes().item(i).getNodeValue());						break;
						case 4:
							System.out.println("����: " + e.getChildNodes().item(i).getNodeValue());							break;
						case 12:
							String sky = e.getChildNodes().item(i).getNodeValue();
							String wsky = null;
							
							switch(sky) {
								case "1":	wsky = "����";		wa.sky1();		break;
								case "2":	wsky = "��������";	wa.sky2();		break;
								case "3":	wsky = "��������";	wa.sky3();		break;
								case "4":	wsky = "�帲";		wa.sky4();		break;
								case "5":	wsky = "��";		wa.sky5();		break;
								case "6":	wsky = "��";		wa.sky6();		break;
								case "7":	wsky = "����";		wa.sky6();		break;
								case "8":	wsky = "��";		wa.sky8();		break;
							}//switch
							
							System.out.println("�ϴû���: " + wsky);						break;
	
						case 14:
							System.out.println("����Ȯ��: " + e.getChildNodes().item(i).getNodeValue());						break;
						case 13:
							System.out.println("����: " + e.getChildNodes().item(i).getNodeValue());							break;
/*						case 11:
							System.out.println("�µ�: " + e.getChildNodes().item(i).getNodeValue());							break;
*/						case 9:
							System.out.println("�µ�: " + e.getChildNodes().item(i).getNodeValue());							break;

					}//switch 

				}//for

			}//for

		} catch (Exception e) {
			//System.out.println(e.toString());
		}//try-catch

	}//main

}//WeatherApi
