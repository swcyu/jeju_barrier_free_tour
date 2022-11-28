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
		
		System.out.println("���� ���� [y,n]");
		char ch = sc.next().charAt(0);
		
		System.out.println("���ϸ�");
		f = new File(sc.next()); // d:\\doc\\jdbc.txt
		
		
		
		
		switch(ch) {	
		// ����ȭ
		case 'y': 
			System.out.println("����ȭ ���� ���� ����");
			
				
				FileOutputStream fos = new FileOutputStream(f);
				
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(tourlists);
		    System.out.println("����ȭ ���� ���� �Ϸ�!!");
				oos.close();
				fos.close();
				
		
			break;
		
		}
	}
	
		
	// ������ȭ �� ���Ϸ� ��������..?
	public void export() throws Exception{	

	int data= 0;
	System.out.print("������ ���ϸ�");
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
	System.out.println("����Ϸ�");

	
	}
	
	public void export1(ResultSet rs) throws Exception {
		
		InputStream is = rs.getBinaryStream("mtitle");
				
		System.out.print("������ ���ϸ�");
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
