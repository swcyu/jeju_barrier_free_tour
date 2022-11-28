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
			
			
			//연, 월, 일, 몇일 후 입력받기
			System.out.println("날씨를 알고 싶은 날짜를 입력하세요");
			
			do {
				System.out.print("년도? [YYYY]: ");//2021
				y = sc.nextInt();
			}while(y<1);
			
			do {
				System.out.print("월? [MM]: ");//5
				m = sc.nextInt();
			}while(m<1||m>12);
			
			do {
				System.out.print("일? [DD]: ");//
				d = sc.nextInt();
			}while(d<1||d>31);
			
			
			//날짜 입력하기
			now.set(y, m-1, d);
			

			now.add(Calendar.DATE, -2);	//일(day)에 더하기 > 해당 날짜로 초기화 됨
			
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
			//System.out.println("파싱할 리스트 수: " + nList.getLength());		//nList: 10개
			
			for(int i=0;i<nList.getLength();i++) {
				
				Node book = nList.item(i);
				
				NodeList nList2 = book.getChildNodes();
				
				//System.out.println("nList2: "+nList2.getLength());		//nList2: 15개
				
				for(int j=0;j<nList2.getLength();j++) {

					Node e = nList2.item(j);

					switch(j) {

						case 0:
							System.out.println("기준시각: " + e.getChildNodes().item(i).getNodeValue());						break;
						case 4:
							System.out.println("지역: " + e.getChildNodes().item(i).getNodeValue());							break;
						case 12:
							String sky = e.getChildNodes().item(i).getNodeValue();
							String wsky = null;
							
							switch(sky) {
								case "1":	wsky = "맑음";		wa.sky1();		break;
								case "2":	wsky = "구름조금";	wa.sky2();		break;
								case "3":	wsky = "구름많음";	wa.sky3();		break;
								case "4":	wsky = "흐림";		wa.sky4();		break;
								case "5":	wsky = "비";		wa.sky5();		break;
								case "6":	wsky = "비눈";		wa.sky6();		break;
								case "7":	wsky = "눈비";		wa.sky6();		break;
								case "8":	wsky = "눈";		wa.sky8();		break;
							}//switch
							
							System.out.println("하늘상태: " + wsky);						break;
	
						case 14:
							System.out.println("강수확률: " + e.getChildNodes().item(i).getNodeValue());						break;
						case 13:
							System.out.println("습도: " + e.getChildNodes().item(i).getNodeValue());							break;
/*						case 11:
							System.out.println("온도: " + e.getChildNodes().item(i).getNodeValue());							break;
*/						case 9:
							System.out.println("온도: " + e.getChildNodes().item(i).getNodeValue());							break;

					}//switch 

				}//for

			}//for

		} catch (Exception e) {
			//System.out.println(e.toString());
		}//try-catch

	}//main

}//WeatherApi
