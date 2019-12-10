package java_20191210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelectDemo {
	public static void main(String[] args) {
		// 1. 드라이버 로딩한다
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// 2. 데이터 베이스와 연결을 시도한다
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/acorn", "acorn12", "acorn12");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT deptno, dname, loc ");
			sql.append("FROM dept ");
			sql.append("ORDER BY deptno ");

			// 3. sql을 전송하는 PreparedStatement 객체 생성
			pstmt = con.prepareStatement(sql.toString());

			rs = pstmt.executeQuery(); // select문을 sql문으로 전송하는 메서드

			while (rs.next()) {
				int index = 0;
				int deptno = rs.getInt(++index); //++index : 증가하고 대입 / index++ : 대입하고 증가
				String dname = rs.getString(++index);
				String loc = rs.getString(++index);
				System.out.printf("%d , %s , %s %n", deptno, dname, loc);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}















