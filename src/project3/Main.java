package project3;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;




public class Main {

	Scanner sc = new Scanner(System.in);
	MainDAO dao = new MainDAO();
	Fileout fo = new Fileout();
	
	//�Է�
	
	public void insert() {	
		
		
		try {
			
			MainDTO dto = new MainDTO();
			
			System.out.print("��ȣ?");
			dto.setId(sc.nextInt());
			
			System.out.print("���?");
			dto.setName(sc.next());
			
			int result = dao.insertData(dto);
			
			if(result!=0) {	
				System.out.println("�߰�����");
			}else {	
				System.out.println("�߰�����");
			}
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	//����
	
	public void update() {	
		
		try {
			
			MainDTO dto = new MainDTO();
			
			System.out.print("��ȣ?");
			dto.setId(sc.nextInt());
			System.out.print("������Ʈ�� ���");
			dto.setName(sc.next());

			int result = dao.updateData(dto);
			
			if(result!=0) {	
				System.out.println("������Ʈ ����");
			}else {	
				System.out.println("������Ʈ ����");
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	
	
	//����
	
	public void delete() {	
		
		try {
			
			int id = 0;
			
			System.out.print("������ ��ȣ");
			id = sc.nextInt();
			
			int result = dao.deleteData(id);
			
			if(result!=0) {	
				System.out.println("������Ʈ ����");
			}else {	
				System.out.println("������Ʈ ����");
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	
	
	//���
	
	public void selectAll() {	
		
		List<MainDTO> lists = dao.getList();
		
		Iterator<MainDTO> it = lists.iterator();
		
		System.out.println("        < ������ ���� > ");
		System.out.println("----------------------------------------");
		while(it.hasNext()) {	
			MainDTO dto = it.next();
			
			System.out.println("��ȣ: " + dto.getId() +" ���: " + dto.getName());
		}
		
		System.out.println("----------------------------------------");
	}
	
	public void selectArea() {	
		
		
		try {
			System.out.println("�˻��� ��Ҹ�");
			String name = sc.next();
			
			
			List<AreaDTO> arealists = dao.areagetList(name);
			
			Iterator<AreaDTO> it = arealists.iterator();
			System.out.println("                   <���  /  ����  /  �̸�  /  ũ��  /  �ּ�  /  ��ȭ��ȣ  /����>\n");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------");
			
			while(it.hasNext()) {	
				
				AreaDTO dti = it.next();
				
				System.out.println(dti.toString());
				System.out.println();
				
				
			}
			
			System.out.println("-----------------------------------------------------------------------------------------------------------------------");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void selectTour() {	
		
		
		try {
			System.out.println("�˻��� ��Ҹ�");
			String name = sc.next();
			
			
			List<TourDTO> tourlists = dao.tourgetList(name);
		
			
			Iterator<TourDTO> it = tourlists.iterator();
			System.out.println("                            <���  /  ��ġ  /  Ư¡1  /  Ư¡2  /  ��õ>\n");
			System.out.println("---------------------------------------------------------------------------------------------------------------------");
			while(it.hasNext()) {	
				TourDTO dtu = it.next();
				
				System.out.println(dtu.toString());
				System.out.println();
			}
			
//			fo.save(tourlists);
//			fo.export();
			
		} catch (Exception e) {
			
			System.out.println(e.toString());
		}
		    System.out.println("---------------------------------------------------------------------------------------------------------------------");
	}
	//MainDTO
	
		public void insertA() {	
			
			
			try {
				
				AreaDTO adto = new AreaDTO();
				
				System.out.print("�̸�? ");
				adto.setName(sc.next());
				
				System.out.print("�ü���? ");
				adto.setMtype(sc.next());
							
				System.out.print("��ȣ��? ");
				adto.setMtitile(sc.next());
				
				System.out.print("�Ÿ�? ");
				adto.setMsize(sc.nextInt());
				
				System.out.print("�ּ�? ");
				adto.setMadd(sc.next());
				
				System.out.print("��ȭ��ȣ? ");
				adto.setMtel(sc.next());
				
				System.out.print("�̿�����? ");
				adto.setMinfo(sc.next());
				
				System.out.print("������ ǰ������? ");
				adto.setMdataq(sc.next());
				
				System.out.print("������ ��������? ");
				adto.setMdatad(sc.next());
				
				System.out.print("idx2? ");
				adto.setIdx2(sc.nextInt());
				
				
				
				int result = dao.insertDataA(adto);
				
				if(result!=0) {	
					System.out.println("�߰�����");
				}else {	
					System.out.println("�߰�����");
				}
				
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		
		//����
		
		public void updateA() {	
			
			try {
				
				AreaDTO adto = new AreaDTO();
				
				System.out.print("�̸�? ");
				adto.setName(sc.next());
				
				System.out.print("�ü���? ");
				adto.setMtype(sc.next());
							
				System.out.print("��ȣ��? ");
				adto.setMtitile(sc.next());
				
				System.out.print("�Ÿ�? ");
				adto.setMsize(sc.nextInt());
				
				System.out.print("�ּ�? ");
				adto.setMadd(sc.next());
				
				System.out.print("��ȭ��ȣ? ");
				adto.setMtel(sc.next());
				
				System.out.print("�̿�����? ");
				adto.setMinfo(sc.next());
				
				System.out.print("������ ǰ������? ");
				adto.setMdataq(sc.next());
				
				System.out.print("������ ��������? ");
				adto.setMdatad(sc.next());
				
				System.out.print("idx2? ");
				adto.setIdx2(sc.nextInt());
				
				int result = dao.updateDataA(adto);
				
				if(result!=0) {	
					System.out.println("������Ʈ ����");
				}else {	
					System.out.println("������Ʈ ����");
				}
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
		}
		
		
		
		//����
		
		public void deleteA() {	
			
			try {
				
				int idx2 = 0;
				
				System.out.print("������ ��ȣ");
				idx2 = sc.nextInt();
				
				int result = dao.deleteDataA(idx2);
				
				if(result!=0) {	
					System.out.println("������Ʈ ����");
				}else {	
					System.out.println("������Ʈ ����");
				}
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}


		
		
	//Tour DTO
		public void insertT() {	
			
			
			try {
				
				TourDTO tdto = new TourDTO();
				
				System.out.println("�̸�? ");
				tdto.setName(sc.next());
				
				System.out.println("����? ");
				tdto.setLat(sc.nextFloat());
				
				System.out.println("�浵? ");
				tdto.setLng(sc.nextFloat());
				
				System.out.println("�ü���? ");
				tdto.setPname(sc.next());
				
				System.out.println("�ü�����? ");
				tdto.setPdinfo(sc.next());
				
				System.out.println("���������? ");
				tdto.setPminfo(sc.next());
				
				System.out.println("��õ����? ");
				tdto.setLiked(sc.next());
				
				System.out.println("idx1? ");
				tdto.setIdx1(sc.nextInt());
				
				
				int result = dao.insertDataT(tdto);
				
				if(result!=0) {	
					System.out.println("�߰�����");
				}else {	
					System.out.println("�߰�����");
				}
				
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		
		//����
		
		public void updateT() {	
			
			try {
				
				TourDTO tdto = new TourDTO();
				
				System.out.println("�̸�? ");
				tdto.setName(sc.next());
				
				System.out.println("����? ");
				tdto.setLat(sc.nextFloat());
				
				System.out.println("�浵? ");
				tdto.setLng(sc.nextFloat());
				
				System.out.println("�ü���? ");
				tdto.setPname(sc.next());
				
				System.out.println("�ü�����? ");
				tdto.setPdinfo(sc.next());
				
				System.out.println("���������? ");
				tdto.setPminfo(sc.next());
				
				System.out.println("��õ����? ");
				tdto.setLiked(sc.next());
				
				System.out.println("idx1? ");
				tdto.setIdx1(sc.nextInt());

				int result = dao.updateDataT(tdto);
				
				if(result!=0) {	
					System.out.println("������Ʈ ����");
				}else {	
					System.out.println("������Ʈ ����");
				}
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
		}
		
		
		
		//����
		
		public void deleteT() {	
			
			try {
				
				int idx1 = 0;
				
				System.out.print("������ ��ȣ");
				idx1 = sc.nextInt();
				
				int result = dao.deleteData(idx1);
				
				if(result!=0) {	
					System.out.println("������Ʈ ����");
				}else {	
					System.out.println("������Ʈ ����");
				}
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}

	//���ǻ��� �Է�
	public void insertRequest() {	
		
		CRequestDTO rdto = new CRequestDTO();
		
		System.out.print("�̸�?");
		rdto.setRname(sc.next());
		System.out.print("����?");
		rdto.setRmail(sc.next());
		System.out.print("��Ҹ�");
		rdto.setRplace(sc.next());
		System.out.print("����?");
		rdto.setRreason(sc.next());
		
		int result = dao.insertRequest(rdto);
		
	}
	
	//���ǻ��� ���
	public void selectRequestall() {	
		
		List<CRequestDTO> requestlists = dao.getRequest();
		
		Iterator<CRequestDTO> it = requestlists.iterator();
		
		while(it.hasNext()) {	
			
			CRequestDTO rdto = it.next();
			System.out.println(rdto.toString());
			
		}
		
	}
	
	
	//������ �α���
		public void adminlogin() {
			try {
				Adminsn.admingetdata();
				System.out.println("��й�ȣ�� �Է��Ͻʽÿ�.(���ڸ�)");
				
				int tsn;
				tsn = sc.nextInt();
				
				if(Adminsn.dbsn==tsn) {
					System.out.println("�α��� ����");
					Adminmain.adminmain();
				}else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
					
				}
			} catch (SQLException e) {
				System.out.println(e.toString());
			}


			

		}
		//������ ��й�ȣ ����
		
		public void admincsn() {
			try {
				Adminsn.admingetdata();
				System.out.println("���� ��й�ȣ�� �Է��Ͻʽÿ�.(���ڸ�)");
				int tsn;
				int tsn2;
				tsn = sc.nextInt();
				if(Adminsn.dbsn==tsn) {
					System.out.println("�� ��й�ȣ�� �Է��Ͻʽÿ�.(���ڸ�)");
					tsn = sc.nextInt();
					System.out.println("��й�ȣ�� �ѹ� �� �Է��Ͻʽÿ�.(���ڸ�)");
					tsn2 = sc.nextInt();
					if(tsn==tsn2) {
						System.out.println("��й�ȣ�� ���� �Ǿ����ϴ�.");
						Adminsn.dbsn = tsn2;
						Adminsn.adminupdatedata();
					}else {
						System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
					}
				}else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
			
		}
}
