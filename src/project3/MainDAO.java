package project3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;


public class MainDAO {

	Fileout fo = new Fileout();

	//입력
	public int insertData(MainDTO dto) {	
		
		int result=0;
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			
			sql = "insert into main(id,name) values (?,?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dto.getId());
			pstmt.setString(2, dto.getName());
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
		
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		return result;
	}
	//ma 입력
	public int insertDataA(AreaDTO adto) {	
		
		int result=0;
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			
			sql = "insert into mainareainfo(mname,mtype,mtitle,msize,madd,mtel,minfo,mdataq,mdatad,idx2) values (?,?,?,?,?,?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, adto.getName());
			pstmt.setString(2, adto.getMtype());
			pstmt.setString(3, adto.getMtitile());
			pstmt.setInt(4, adto.getMsize());
			pstmt.setString(5, adto.getMadd());
			pstmt.setString(6, adto.getMtel());
			pstmt.setString(7, adto.getMinfo());
			pstmt.setString(8, adto.getMdataq());
			pstmt.setString(9, adto.getMdatad());
			pstmt.setInt(10, adto.getIdx2());
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
		
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		return result;
	}

	//t 입력
	public int insertDataT(TourDTO tdto) {	
		
		int result=0;
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			
			sql = "insert into tourinfo(pname,lat,lng,pname,pdinfo,pminfo,liked,idx1) values (?,?,?,?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, tdto.getName());
			pstmt.setFloat(2, tdto.getLat());
			pstmt.setFloat(3, tdto.getLng());
			pstmt.setString(4, tdto.getPname());
			pstmt.setString(5, tdto.getPdinfo());
			pstmt.setString(6, tdto.getPminfo());
			pstmt.setString(7, tdto.getLiked());
			pstmt.setInt(8, tdto.getIdx1());
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		return result;
	}
	
	//수정
	
	public int updateData(MainDTO dto) {	
		
	  int result = 0;
		
	  Connection conn = DBConn.getConnection();
	  PreparedStatement pstmt = null;
	  String sql;
	  
	  try {
		
		  sql = "update main set name='";
		  sql+= dto.getName() +"'" + "where id = ";
		  sql+= dto.getId();
		  
		  pstmt = conn.prepareStatement(sql);
		  
		  result = pstmt.executeUpdate();
		  
		  pstmt.close();
		  
		  
	} catch (Exception e) {
		System.out.println(e.toString());
	}
	  
	  
	  
	  return result;
	}
	//A수정
	
		public int updateDataA(AreaDTO adto) {	
			
		  int result = 0;
			
		  Connection conn = DBConn.getConnection();
		  PreparedStatement pstmt = null;
		  String sql;
		  
		  try {
			
			  sql = "update mainareainfo set mname=?,mtype=?,mtitle=?,msize=?,madd=?,mtel=?,minfo=?,mdataq=?,mdatad=?,idx2=?";

			  
			  pstmt = conn.prepareStatement(sql);
			  
				pstmt.setString(1, adto.getName());
				pstmt.setString(2, adto.getMtype());
				pstmt.setString(3, adto.getMtitile());
				pstmt.setInt(4, adto.getMsize());
				pstmt.setString(5, adto.getMadd());
				pstmt.setString(6, adto.getMtel());
				pstmt.setString(7, adto.getMinfo());
				pstmt.setString(8, adto.getMdataq());
				pstmt.setString(9, adto.getMdatad());
				pstmt.setInt(10, adto.getIdx2());

			  
			  result = pstmt.executeUpdate();
			  
			  pstmt.close();
			  
			  
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		  
		  
		  
		  
		  return result;
		}


		//T 수정
		
		public int updateDataT(TourDTO tdto) {	
			
		  int result = 0;
			
		  Connection conn = DBConn.getConnection();
		  PreparedStatement pstmt = null;
		  String sql;
		  
		  try {
			
			  sql = "update main set pname=?,lat=?,lng=?,pname=?,pdinfo=?,pminfo=?,liked=?,idx1=?";
				  
			  pstmt = conn.prepareStatement(sql);
			  
				pstmt.setString(1, tdto.getName());
				pstmt.setFloat(2, tdto.getLat());
				pstmt.setFloat(3, tdto.getLng());
				pstmt.setString(4, tdto.getPname());
				pstmt.setString(5, tdto.getPdinfo());
				pstmt.setString(6, tdto.getPminfo());
				pstmt.setString(7, tdto.getLiked());
				pstmt.setInt(8, tdto.getIdx1());

			  
			  result = pstmt.executeUpdate();
			  
			  pstmt.close();
			  
			  
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		  
		  
		  
		  return result;
		}
	
	
	//삭제
	
	public int deleteData(int id) {	
		
		int result = 0;
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			sql = "delete main where id = " + id;
			
			pstmt = conn.prepareStatement(sql);
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		return result;
		
	}
	//A삭제
	
	public int deleteDataA(int idx1) {	
		
		int result = 0;
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			sql = "delete mainareainfo where idx2 = " + idx1;
			
			pstmt = conn.prepareStatement(sql);
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		return result;
		
	}

	//T삭제
	
	public int deleteDataT(int idx2) {	
		
		int result = 0;
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			sql = "delete tourinfo where idx1 = " + idx2;
			
			pstmt = conn.prepareStatement(sql);
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		return result;
		
	}
	
	//출력
	
	public List<MainDTO> getList(){	
		
		List<MainDTO> lists = new ArrayList<MainDTO>();
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;
		
		try {
			
			sql = "select id,name from main order by id";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {	
				
				MainDTO dto = new MainDTO();
				
				dto.setId(rs.getInt("id"));
				dto.setName(rs.getString("name"));
				
				lists.add(dto);
				
			}
			
			rs.close();
			pstmt.close();
			
		
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return lists;
	}
	
	public List<AreaDTO> areagetList(String name){	
		
		List<AreaDTO> arealists = new ArrayList<AreaDTO>();
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;
		
		try {
			
			sql = "select a.name,b.mtype,b.mtitle,b.msize,b.madd,b.mtel,b.minfo,b.mdataq,b.mdatad from main a, mainareainfo B";
			sql+= " where a.id = b.id and b.mname like ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + name + "%");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {	
				
				AreaDTO dti = new AreaDTO();
				
				dti.setName(rs.getString("name"));
				dti.setMtype(rs.getString("mtype"));
				dti.setMtitile(rs.getString("mtitle"));
				dti.setMsize(rs.getInt("msize"));
				dti.setMadd(rs.getString("madd"));
				dti.setMtel(rs.getString("mtel"));
				dti.setMinfo(rs.getString("minfo"));
				
				arealists.add(dti);
				
			}
			
			rs.close();
			pstmt.close();
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		return arealists;
		
	}
	
	public List<TourDTO> tourgetList(String name){	
		
	
	
		List<TourDTO> tourlists = new ArrayList<>();
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;
		
		try {
			
			sql = "select a.name,b.lat,b.lng,b.pname,b.pdinfo,b.pminfo,b.liked,b.dataq,b.datad";
			sql+= " from main a, tourinfo b";  
			sql+= " where a.id = b.id and a.id in (select id from main where name like ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + name + "%");
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {	
				
				TourDTO dtu = new TourDTO();
								
				dtu.setName(rs.getString("name"));
				dtu.setLat(rs.getFloat("lat"));
				dtu.setLng(rs.getFloat("lng"));
				dtu.setPname(rs.getString("pname"));
				dtu.setPdinfo(rs.getString("pdinfo"));
				dtu.setPminfo(rs.getString("pminfo"));
				dtu.setLiked(rs.getString("liked"));
				
				tourlists.add(dtu);
				
				
			}
			
			rs.close();
			pstmt.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return tourlists;
	}
	

	
	public int insertRequest(CRequestDTO rdto) {	
		
		int result = 0;
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			
			sql = "insert into crequest(rname,rmail,rplace,rreason) values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, rdto.getRname());
			pstmt.setString(2, rdto.getRmail());
			pstmt.setString(3, rdto.getRplace());
			pstmt.setString(4, rdto.getRreason());
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	
	public List<CRequestDTO> getRequest(){	
		
		List<CRequestDTO> requestlists = new ArrayList<CRequestDTO>();
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;
		
		try {
			
			sql = "select rname, rmail, rplace, rreason, rdate, NVL(rnote,'없음') rnote";
			sql+= " from crequest";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {	
				
				CRequestDTO rdto = new CRequestDTO();
				
				rdto.setRname(rs.getString("rname"));
				rdto.setRmail(rs.getString("rmail"));
				rdto.setRplace(rs.getString("rplace"));
				rdto.setRreason(rs.getString("rreason"));
				rdto.setRdate(rs.getString("rdate"));
				rdto.setRnote(rs.getString("rnote"));
				
				requestlists.add(rdto);
				
				
			}
			
			pstmt.close();
			rs.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		return requestlists;
		
		
	}
}
