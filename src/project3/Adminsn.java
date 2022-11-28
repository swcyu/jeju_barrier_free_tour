package project3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.print.attribute.SetOfIntegerSyntax;

import com.db.DBConn;

public class Adminsn {

	public static int dbsn;

	public static int admingetdata() throws SQLException {
		Connection conn = DBConn.getConnection();
		String sql = "select sn from admin";
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			dbsn = rs.getInt("sn");
		}
		DBConn.close();
		
		return dbsn;
	}
	
	public static void adminupdatedata() throws SQLException{
		Connection conn = DBConn.getConnection();
		String sql = "update admin set sn=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setInt(1, dbsn);
		pstmt.executeQuery();
		
		DBConn.close();
		
	}
	

}
