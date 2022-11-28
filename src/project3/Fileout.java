package project3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

public class Fileout {

	Scanner sc = new Scanner(System.in);
	
	File f;
	
	public void save(List<TourDTO> tourlists) throws Exception {
		
		System.out.println("파일 저장 [y,n]");
		char ch = sc.next().charAt(0);
		
		System.out.println("파일명");
		f = new File(sc.next()); // d:\\doc\\jdbc.txt
		
		
		
		
		switch(ch) {	
		// 직렬화
		case 'y': 
			System.out.println("직렬화 파일 저장 시작");
			
				
				FileOutputStream fos = new FileOutputStream(f);
				
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(tourlists);
		    System.out.println("직렬화 파일 저장 완료!!");
				oos.close();
				fos.close();
				
		
			break;
		
		}
	}
	
		
	// 역직렬화 후 파일로 내보내기..?
	public void export() throws Exception{	

	int data= 0;
	System.out.print("내보낼 파일명");
	File f1 = new File(sc.next());
	FileInputStream fis = new FileInputStream(f);	
	ObjectInputStream ois = new ObjectInputStream(fis);
	FileOutputStream fos = new FileOutputStream(f1);
	
	while((data=ois.read())!=-1) {	
		
		fos.write(data);
//		System.out.print(data);
		fos.flush();
	}
	
	fis.close();
	fos.close();
	System.out.println("복사완료");

	
	}
	
	public void export1(ResultSet rs) throws Exception {
		
		InputStream is = rs.getBinaryStream("mtitle");
				
		System.out.print("내보낼 파일명");
		File f1 = new File(sc.next());
		FileOutputStream fos = new FileOutputStream(f1);
		
	
		int data =0;
		byte[] buffer = new byte[1024];
		
		while((data=is.read(buffer))!=-1) {
			
			fos.write(buffer,0,data);
			fos.flush();
		}
		
		fos.close();
		is.close();
		rs.close();
	}
	
}
