import java.awt.List;
import java.sql.*;
import java.util.ArrayList;

public class ConnectSQL {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private Statement stmt,stmt1;
	private int rs_signup;
	private ResultSet rs, rs1, rs_login;
	
	public ConnectSQL() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/movie?useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false";
			String dbID = "root";
			String dbPassword = "minji1234";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL,dbID,dbPassword);
			if (conn != null){
				System.out.println("성공");
			} else{
				System.out.println("실패");
			} 
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int login(String userID, String userPassword) {
		String SQL = "SELECT Password FROM member WHERE ID=?";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userID);
			rs_login = pstmt.executeQuery();
			if(rs_login.next()) {
				if(rs_login.getString(1).contentEquals(userPassword)) {
					return 1;//"로그인 성공";
				}
				else
					return 0;//"비밀번호 다름";
			}
			return -1;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -2;
	}
	public int Signup(String userID, String userName,String userPassword) {
		String SQL = "Insert into member values(?,?,?,0)";
		try {
			pstmt = conn.prepareStatement(SQL);
			
			pstmt.setString(1, userID);
			pstmt.setString(2, userName);
			pstmt.setString(3, userPassword);
			
			rs_signup = pstmt.executeUpdate();
			System.out.println(rs_signup);
			return 1;
			
		} catch (SQLIntegrityConstraintViolationException e1) {
			return 0;
		}
		catch (Exception e2) {
			e2.printStackTrace();
			return -1;
		}
	}
	public String getNameById(String userID) throws SQLException {
		String SQL = "select name from member where ID=?";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userID);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				return rs.getString(1);
			}
		} catch (SQLIntegrityConstraintViolationException e1) {
			return "찾을 수 없어요 젠장.";
		}
		return "";	
	}
	public String getIdByName(String name) throws SQLException {
		String SQL = "select ID from member where name=?";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, name);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				return rs.getString(1);
			}
		} catch (SQLIntegrityConstraintViolationException e1) {
			return "찾을 수 없어요 젠장.";
		}
		return "";	
	}
	public String getNumByTitle(String title) throws SQLException {
		String SQL = "select `m#` from movie where title=?";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, title);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				return rs.getString(1);
			}
			
		} catch (SQLIntegrityConstraintViolationException e1) {
			return "찾을 수 없어요 젠장.";
		}
		return "";
	}
	public int getMovieNum() {
		String SQL = "select count(*) from movie";
		try {
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				return rs.getInt("count(*)");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
		return 0;
	}
	
	public int getMemberNum() {
		String SQL = "select count(*) from member";
		try {
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				return rs.getInt("count(*)");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
		return 0;
	}
	
	public String[] getMovieList() {
		String SQL = "select title from movie";
		String[] movie_list=new String[getMovieNum()];
		try {
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			int i=0;
			while(rs.next()) {
				movie_list[i]=rs.getString(1);
				i+=1;
			}
			return movie_list;
		} catch (SQLException e) {
			e.printStackTrace();
			String[] emptylist=new String[1];
			return emptylist;
		}
	}
	
	public String[] getMemberList() {
		String SQL = "select name from member";
		String[] member_list=new String[getMemberNum()];
		try {
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			int i=0;
			while(rs.next()) {
				member_list[i]=rs.getString(1);
				i+=1;
			}
			return member_list;
		} catch (SQLException e) {
			e.printStackTrace();
			String[] emptylist=new String[1];
			return emptylist;
		}
	}
	public void printarray(double[][] arr) {
		for (int i=0;i<arr.length;i++) {
			for (int k=0;k<arr[0].length;k++) {
				System.out.print(arr[i][k]);
				System.out.print(", ");
			}
			System.out.println();
		}
	}
	public void printarray(String[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			System.out.print(", ");
		}
	}
	public int find_index_by_user(String user_name) {
		String[] user=getMemberList();
		for (int k=0;k<user.length;k++) {
			user_name=user_name.toString();
			user[k]=user[k].toString();
			if (user[k].equals(user_name)) {
				return k;
			}
		}
		return -1;	
	}
	
	public double[][] getRatingByIDandMnum() {
		String[] user=getMemberList();
		String[] place=getMovieList();
		double[][] array=new double[user.length][place.length];
		
	for (int i=0;i<user.length;i++) {
			for (int j=0;j<place.length;j++) {
				try {
					String SQL = "select reservation.rate from reservation "
					+ "left join member m on reservation.id=m.id "
					+ "left join movie v on reservation.`m#`=v.`m#` "
					+ "where m.id='"+getIdByName(user[i])+"'"
					+"and v.`m#`='"+getNumByTitle(place[j])+"'";
					pstmt = conn.prepareStatement(SQL);
					rs = pstmt.executeQuery();
					
					while(rs.next()) {
						if (rs.getString(1) != null){
							array[i][j]=Double.parseDouble(rs.getString(1));}
						else{
							array[i][j]=0.0;
						}
					}

				} catch (SQLException e) {
					e.printStackTrace();
					double[][] emptylist=new double[1][1];
					return emptylist;
				}
			}
		}
		return array;
	}
	
	public String[] getPopularMovies() {
		String SQL = "select title, count(*) from reservation left join movie on reservation.`m#`=movie.`m#` group by 1 order by 2 desc";
		String[] movie_list=new String[4];
		try {
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			int i=0;
			while(rs.next()) {
				if (i==4) {
					break;
				}
				else {
					movie_list[i]=rs.getString(1);
					i+=1;	
				}
			}
			return movie_list;
		} catch (SQLException e) {
			e.printStackTrace();
			String[] emptylist=new String[1];
			return emptylist;
		}
	}




	// 영화 예매
	public int insertMovie(String tfID,String title, String date, String place, String seat, int price, String pay) {
		String M = null;
		String SQL1 = "SELECT `M#` "
				+ "FROM movie "
				+ "WHERE `title`='"+title+"';";
		System.out.println(SQL1);
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL1);
			while(rs.next()) {
			M = rs.getString(1);
			}
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		String SQL = "Insert into reservation(`ID`,`M#`,`date`,`place`,`seat`,`price`,`pay`,`rate`)"+" values("+tfID+",'"+M+"','"+date+"','"+place+"','"+seat+"','"+price+"','"+pay+"','0')";
		System.out.println(SQL);
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(SQL);
			return 1;
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	
	// 예매 확인
	public ArrayList checkMovie(String id, int i) {
		String R, M, date, place, seat, pay, price, rate;
		ArrayList<ArrayList> reserve_list = new ArrayList();
		ArrayList<String> list = new ArrayList();
		// 본 영화
		if (i==1) {
			String SQL = "SELECT * FROM reservation WHERE `id` = '"+id+"';";
			System.out.println(SQL);
			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(SQL);
					while (rs.next()) {
						ArrayList<String> list1 = new ArrayList();
						R = rs.getString(1);
						M = rs.getString(3);
						date = rs.getString(4);
						place = rs.getString(5);
						seat = rs.getString(6);
						price = rs.getString(7);
						pay = rs.getString(8);
						rate = rs.getString(9);
						
						String SQL2 = "SELECT `title` "
								+ "FROM movie "
								+ "WHERE `M#` = '"+M+"';";
						System.out.println(SQL2);
						try {
							stmt1 = conn.createStatement();
							rs1 = stmt1.executeQuery(SQL2);
							while(rs1.next()) {
								M = rs1.getString(1);
							}
						}catch (Exception e) {
							e.printStackTrace();
						}
						
						
						list1.add(R);
						list1.add(M);
						list1.add(date);
						list1.add(place);
						list1.add(seat);
						list1.add(price);
						list1.add(pay);
						list1.add(rate);
						reserve_list.add(list1);
					}
					return reserve_list;
			} catch (SQLException e) { e.printStackTrace();}
		}
		// 볼 영화
		else if (i==2) {
			String SQL = "SELECT * FROM reservation "
					+ "WHERE `date` = (SELECT MAX(`date`) "
					+ "FROM reservation "
					+ "WHERE `id` = '"+id+"');";
			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(SQL);
				while (rs.next()) {
					R = rs.getString(1);
				M = rs.getString(3);
				date = rs.getString(4);
				seat = rs.getString(6);
				price = rs.getString(7);
				pay = rs.getString(8);

				String SQL2 = "SELECT `title` "
						+ "FROM movie "
						+ "WHERE `M#` = '"+M+"';";
				try {
					stmt1 = conn.createStatement();
					rs1 = stmt1.executeQuery(SQL2);
					while(rs1.next()) {
					M = rs1.getString(1);
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
				
				list.add(R);
				list.add(M);
				list.add(date);
				list.add(seat);
				list.add(price);
				list.add(pay);
				return list;
				}
						
		} catch (SQLException e) { e.printStackTrace();}
			
		}
		return null;
		}
	
	// 예매 취소
	public int deleteMovie(String r) {
		String SQL = "DELETE FROM reservation WHERE `R#` = '"+r+"';";
		System.out.println(SQL);
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(SQL);
			return 1;
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	// 평점 반영
	public int updateRate(String r,String rate) {
		String SQL = "UPDATE reservation SET `rate` = '"+rate
				+"' WHERE `R#` = '"+r+"';";
		System.out.println(SQL);
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(SQL);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	   public int getcharnum(String tfID) {
		      String SQL = "select CharNum from member where id=?";
		      try {
		         pstmt = conn.prepareStatement(SQL);
		         pstmt.setString(1, tfID);
		         rs = pstmt.executeQuery();
		         while(rs.next()) {
		        	System.out.println(rs.getInt("CharNum"));
		            return rs.getInt("CharNum");
		         }
		         
		      } catch (SQLException e) {
		         e.printStackTrace();
		         return -1;
		      }
		      return -1;
		   }
		   
		   public int setcharnum(String tfID, int num) {
		      String SQL = "UPDATE member SET CharNum=? where id=?";
		      System.out.println(SQL);
		      try {
		         pstmt = conn.prepareStatement(SQL);
		         pstmt.setLong(1, num);
		         pstmt.setString(2, tfID);
		         pstmt.executeUpdate();
		         return 1;
		      } catch (Exception e) {
		         e.printStackTrace();
		         return 0;
		      }
		   }
}

