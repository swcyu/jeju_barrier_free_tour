package project3;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;




public class Main {

	Scanner sc = new Scanner(System.in);
	MainDAO dao = new MainDAO();
	Fileout fo = new Fileout();
	
	//입력
	
	public void insert() {	
		
		
		try {
			
			MainDTO dto = new MainDTO();
			
			System.out.print("번호?");
			dto.setId(sc.nextInt());
			
			System.out.print("장소?");
			dto.setName(sc.next());
			
			int result = dao.insertData(dto);
			
			if(result!=0) {	
				System.out.println("추가성공");
			}else {	
				System.out.println("추가실패");
			}
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	//수정
	
	public void update() {	
		
		try {
			
			MainDTO dto = new MainDTO();
			
			System.out.print("번호?");
			dto.setId(sc.nextInt());
			System.out.print("업데이트할 장소");
			dto.setName(sc.next());

			int result = dao.updateData(dto);
			
			if(result!=0) {	
				System.out.println("업데이트 성공");
			}else {	
				System.out.println("업데이트 실패");
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	
	
	//삭제
	
	public void delete() {	
		
		try {
			
			int id = 0;
			
			System.out.print("삭제할 번호");
			id = sc.nextInt();
			
			int result = dao.deleteData(id);
			
			if(result!=0) {	
				System.out.println("업데이트 성공");
			}else {	
				System.out.println("업데이트 실패");
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	
	
	//출력
	
	public void selectAll() {	
		
		List<MainDTO> lists = dao.getList();
		
		Iterator<MainDTO> it = lists.iterator();
		
		System.out.println("        < 여행지 정보 > ");
		System.out.println("----------------------------------------");
		while(it.hasNext()) {	
			MainDTO dto = it.next();
			
			System.out.println("번호: " + dto.getId() +" 장소: " + dto.getName());
		}
		
		System.out.println("----------------------------------------");
	}
	
	public void selectArea() {	
		
		
		try {
			System.out.println("검색할 장소명");
			String name = sc.next();
			
			
			List<AreaDTO> arealists = dao.areagetList(name);
			
			Iterator<AreaDTO> it = arealists.iterator();
			System.out.println("                   <장소  /  유형  /  이름  /  크기  /  주소  /  전화번호  /정보>\n");
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
			System.out.println("검색할 장소명");
			String name = sc.next();
			
			
			List<TourDTO> tourlists = dao.tourgetList(name);
		
			
			Iterator<TourDTO> it = tourlists.iterator();
			System.out.println("                            <장소  /  위치  /  특징1  /  특징2  /  추천>\n");
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
				
				System.out.print("이름? ");
				adto.setName(sc.next());
				
				System.out.print("시설명? ");
				adto.setMtype(sc.next());
							
				System.out.print("상호명? ");
				adto.setMtitile(sc.next());
				
				System.out.print("거리? ");
				adto.setMsize(sc.nextInt());
				
				System.out.print("주소? ");
				adto.setMadd(sc.next());
				
				System.out.print("전화번호? ");
				adto.setMtel(sc.next());
				
				System.out.print("이용정보? ");
				adto.setMinfo(sc.next());
				
				System.out.print("데이터 품질정보? ");
				adto.setMdataq(sc.next());
				
				System.out.print("데이터 점검일자? ");
				adto.setMdatad(sc.next());
				
				System.out.print("idx2? ");
				adto.setIdx2(sc.nextInt());
				
				
				
				int result = dao.insertDataA(adto);
				
				if(result!=0) {	
					System.out.println("추가성공");
				}else {	
					System.out.println("추가실패");
				}
				
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		
		//수정
		
		public void updateA() {	
			
			try {
				
				AreaDTO adto = new AreaDTO();
				
				System.out.print("이름? ");
				adto.setName(sc.next());
				
				System.out.print("시설명? ");
				adto.setMtype(sc.next());
							
				System.out.print("상호명? ");
				adto.setMtitile(sc.next());
				
				System.out.print("거리? ");
				adto.setMsize(sc.nextInt());
				
				System.out.print("주소? ");
				adto.setMadd(sc.next());
				
				System.out.print("전화번호? ");
				adto.setMtel(sc.next());
				
				System.out.print("이용정보? ");
				adto.setMinfo(sc.next());
				
				System.out.print("데이터 품질정보? ");
				adto.setMdataq(sc.next());
				
				System.out.print("데이터 점검일자? ");
				adto.setMdatad(sc.next());
				
				System.out.print("idx2? ");
				adto.setIdx2(sc.nextInt());
				
				int result = dao.updateDataA(adto);
				
				if(result!=0) {	
					System.out.println("업데이트 성공");
				}else {	
					System.out.println("업데이트 실패");
				}
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
		}
		
		
		
		//삭제
		
		public void deleteA() {	
			
			try {
				
				int idx2 = 0;
				
				System.out.print("삭제할 번호");
				idx2 = sc.nextInt();
				
				int result = dao.deleteDataA(idx2);
				
				if(result!=0) {	
					System.out.println("업데이트 성공");
				}else {	
					System.out.println("업데이트 실패");
				}
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}


		
		
	//Tour DTO
		public void insertT() {	
			
			
			try {
				
				TourDTO tdto = new TourDTO();
				
				System.out.println("이름? ");
				tdto.setName(sc.next());
				
				System.out.println("위도? ");
				tdto.setLat(sc.nextFloat());
				
				System.out.println("경도? ");
				tdto.setLng(sc.nextFloat());
				
				System.out.println("시설명? ");
				tdto.setPname(sc.next());
				
				System.out.println("시설정보? ");
				tdto.setPdinfo(sc.next());
				
				System.out.println("무장애정보? ");
				tdto.setPminfo(sc.next());
				
				System.out.println("추천여부? ");
				tdto.setLiked(sc.next());
				
				System.out.println("idx1? ");
				tdto.setIdx1(sc.nextInt());
				
				
				int result = dao.insertDataT(tdto);
				
				if(result!=0) {	
					System.out.println("추가성공");
				}else {	
					System.out.println("추가실패");
				}
				
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		
		//수정
		
		public void updateT() {	
			
			try {
				
				TourDTO tdto = new TourDTO();
				
				System.out.println("이름? ");
				tdto.setName(sc.next());
				
				System.out.println("위도? ");
				tdto.setLat(sc.nextFloat());
				
				System.out.println("경도? ");
				tdto.setLng(sc.nextFloat());
				
				System.out.println("시설명? ");
				tdto.setPname(sc.next());
				
				System.out.println("시설정보? ");
				tdto.setPdinfo(sc.next());
				
				System.out.println("무장애정보? ");
				tdto.setPminfo(sc.next());
				
				System.out.println("추천여부? ");
				tdto.setLiked(sc.next());
				
				System.out.println("idx1? ");
				tdto.setIdx1(sc.nextInt());

				int result = dao.updateDataT(tdto);
				
				if(result!=0) {	
					System.out.println("업데이트 성공");
				}else {	
					System.out.println("업데이트 실패");
				}
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
		}
		
		
		
		//삭제
		
		public void deleteT() {	
			
			try {
				
				int idx1 = 0;
				
				System.out.print("삭제할 번호");
				idx1 = sc.nextInt();
				
				int result = dao.deleteData(idx1);
				
				if(result!=0) {	
					System.out.println("업데이트 성공");
				}else {	
					System.out.println("업데이트 실패");
				}
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}

	//건의사항 입력
	public void insertRequest() {	
		
		CRequestDTO rdto = new CRequestDTO();
		
		System.out.print("이름?");
		rdto.setRname(sc.next());
		System.out.print("메일?");
		rdto.setRmail(sc.next());
		System.out.print("장소명");
		rdto.setRplace(sc.next());
		System.out.print("이유?");
		rdto.setRreason(sc.next());
		
		int result = dao.insertRequest(rdto);
		
	}
	
	//건의사항 출력
	public void selectRequestall() {	
		
		List<CRequestDTO> requestlists = dao.getRequest();
		
		Iterator<CRequestDTO> it = requestlists.iterator();
		
		while(it.hasNext()) {	
			
			CRequestDTO rdto = it.next();
			System.out.println(rdto.toString());
			
		}
		
	}
	
	
	//관리자 로그인
		public void adminlogin() {
			try {
				Adminsn.admingetdata();
				System.out.println("비밀번호를 입력하십시오.(숫자만)");
				
				int tsn;
				tsn = sc.nextInt();
				
				if(Adminsn.dbsn==tsn) {
					System.out.println("로그인 성공");
					Adminmain.adminmain();
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
					
				}
			} catch (SQLException e) {
				System.out.println(e.toString());
			}


			

		}
		//관리자 비밀번호 변경
		
		public void admincsn() {
			try {
				Adminsn.admingetdata();
				System.out.println("현재 비밀번호를 입력하십시오.(숫자만)");
				int tsn;
				int tsn2;
				tsn = sc.nextInt();
				if(Adminsn.dbsn==tsn) {
					System.out.println("새 비밀번호를 입력하십시오.(숫자만)");
					tsn = sc.nextInt();
					System.out.println("비밀번호를 한번 더 입력하십시오.(숫자만)");
					tsn2 = sc.nextInt();
					if(tsn==tsn2) {
						System.out.println("비밀번호가 변경 되었습니다.");
						Adminsn.dbsn = tsn2;
						Adminsn.adminupdatedata();
					}else {
						System.out.println("비밀번호가 틀렸습니다.");
					}
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
			
		}
}
