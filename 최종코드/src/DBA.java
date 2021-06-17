import java.sql.*;

public class DBA {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/movie?useSSL=false";
	static final String USERNAME = "root";
	static final String PASSWORD = "minji67204**";
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		System.out.print("User Table 접속: ");
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			if (conn != null) {
				System.out.println("성공");
				// 추가
				stmt = conn.createStatement();
				rs = stmt.executeQuery("SELECT * FROM member;");
				while(rs.next()) {
					System.out.println(rs.getString(1)+"\t"+
										rs.getString(2)+"\t"+
										rs.getString(3));
				}
			}else {System.out.println("실패");}
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found Exection");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL Exception : "+ e.getMessage());
			e.printStackTrace();
		}
	}
}
