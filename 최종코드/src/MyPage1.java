import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;	
import javax.swing.border.*;

public class MyPage1 extends JFrame{
	public static JPanel contentPane;
	JButton myMoviebt, logoutbt, nextbt, homebt, myCharbt, myWishbt, cancelbt, myHisbt;
		
	public MyPage1(String tfID) {
		List l1 =new List();
		
		setTitle("눈송 시네마 - 마이페이지");

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(2000,1000);
		contentPane = new JPanel(); 
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.WHITE);

		Font font = new Font("엘리스 디지털배움체", Font.PLAIN, 20);
	    Font font2 = new Font("엘리스 디지털배움체", Font.BOLD, 50);
	    Font font3 = new Font("엘리스 디지털배움체", Font.PLAIN, 15);

		
		// 예매 확인
		ConnectSQL connectsql = new ConnectSQL();
		ArrayList<?> result = connectsql.checkMovie(tfID, 2);
		String r = (String) result.get(0);

		JLabel label = new JLabel("눈송 시네마 - 마이페이지");// 제목
		label.setFont(font2);
		label.setBounds(350, 72, 1001, 80);
		label.setForeground(new Color(18, 50, 181));
		contentPane.add(label);
		
		JLabel lb_history = new JLabel("<< 예매확인/취소 >>");
		lb_history.setFont(font);
		lb_history.setBounds(550, 182,200,30);
		contentPane.add(lb_history);
		
		JLabel lb_mv = new JLabel("영화 제목: "+result.get(1));
		lb_mv.setFont(font);
		lb_mv.setBounds(150, 262, 500, 30);
		contentPane.add(lb_mv);
		
		JLabel lb_time = new JLabel("상영 시간: "+result.get(2));
		lb_time.setFont(font);
		lb_time.setBounds(150, 322, 2000, 30);
		contentPane.add(lb_time);
		
		JLabel lb_st = new JLabel("선택 좌석: "+result.get(3));
		lb_st.setFont(font);
		lb_st.setBounds(150, 382, 500, 30);
		contentPane.add(lb_st);
		
		JLabel lb_pr = new JLabel("결제 금액: "+result.get(4)+"원");
		lb_pr.setFont(font);
		lb_pr.setBounds(150, 442, 300, 30);
		contentPane.add(lb_pr);
		
		JLabel lb_pay = new JLabel("결제 수단: "+result.get(5));
		lb_pay.setFont(font);
		lb_pay.setBounds(150, 502, 300, 30);
		contentPane.add(lb_pay);
		
		cancelbt = new JButton("예매 취소하기");
		cancelbt.setFont(font3);
  		cancelbt.setBounds(550, 572, 139, 39);
		cancelbt.setBackground(new Color(18, 50, 181));
        cancelbt.setForeground(Color.WHITE);
  		contentPane.add(cancelbt);
  		
  		myMoviebt = new JButton("내가 본 영화");
  		myMoviebt.setFont(font3);
  		myMoviebt.setBounds(1000,252,130,50);
		myMoviebt.setBackground(Color.WHITE);
        myMoviebt.setForeground(new Color(18, 50, 181));
  		contentPane.add(myMoviebt);
  		
  		myHisbt = new JButton("예매확인/취소");
  		myHisbt.setFont(font3);
  		myHisbt.setBounds(1000, 352, 130, 50);
		myHisbt.setBackground(Color.WHITE);
        myHisbt.setForeground(new Color(18, 50, 181));
  		contentPane.add(myHisbt);
  		
  		myCharbt = new JButton("내 캐릭터");
  		myCharbt.setFont(font3);
  		myCharbt.setBounds(1000, 452, 130, 50);
		myCharbt.setBackground(Color.WHITE);
        myCharbt.setForeground(new Color(18, 50, 181));
  		contentPane.add(myCharbt);
  		
  		myWishbt = new JButton("위시리스트");
  		myWishbt.setFont(font3);
  		myWishbt.setBounds(1000, 552, 130, 50);
		myWishbt.setBackground(Color.WHITE);
        myWishbt.setForeground(new Color(18, 50, 181));
  		contentPane.add(myWishbt);
  		
  		
  		homebt = new JButton("메인화면");
  		homebt.setFont(font);
  		homebt.setBounds(40, 600, 139, 39);
		homebt.setBackground(new Color(18, 50, 181));
        homebt.setForeground(Color.WHITE);
  		contentPane.add(homebt);
  		
  		JLabel label_myPage = new JLabel("ID: "+tfID+" 님");// 제목
		//label.setForeground(Color.WHITE);
        label_myPage.setFont(font3);
        //label_myPage.setBounds(900,200, 491, 80);
        label_myPage.setBounds(1000,182, 100, 80);
		contentPane.add(label_myPage);
        
        	
      		
//      		nextbt = new JButton("");
//      		nextbt.setBounds(1100, 600, 139, 39);
//      		contentPane.add(nextbt);

      	homebt.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
      	cancelbt.setCursor(new Cursor(Cursor.HAND_CURSOR));
      		

      	logoutbt = new JButton("로그아웃");
  		logoutbt.setBounds(1100, 32, 139, 39);
  		logoutbt.setFont(font);
		logoutbt.setBackground(new Color(18, 50, 181));
        logoutbt.setForeground(Color.WHITE);
  		contentPane.add(logoutbt);
  		
      	logoutbt.setCursor(new Cursor(Cursor.HAND_CURSOR));
      	
      	logoutbt.addActionListener(new ActionListener() {

  			@Override
  			public void actionPerformed(ActionEvent e) {
  				Start frame = new Start();
  				dispose();
  			}
  		});
      		myMoviebt.addActionListener(new ActionListener() {

      			@Override
      			public void actionPerformed(ActionEvent e) {
      				MyPage4 frame = new MyPage4(tfID);
      				dispose();
      			}
      		});
      		
      		myCharbt.addActionListener(new ActionListener() {

      			@Override
      			public void actionPerformed(ActionEvent e) {
      				MyPage2 frame = new MyPage2(tfID);
      				dispose();
      			}
      		});
      		
      		myWishbt.addActionListener(new ActionListener() {

      			@Override
      			public void actionPerformed(ActionEvent e) {
      				MyPage3 frame = new MyPage3(tfID);
      				dispose();
      			}
      		});
      		
      		
      		
      		homebt.addActionListener(new ActionListener() {
      			
      			@Override
      			public void actionPerformed(ActionEvent e) {
      				JOptionPane.showMessageDialog(null, "메인화면으로 돌아갑니다.");
      				MainPage frame = new MainPage(tfID);
      				dispose();
      				
      				}
      		});
      		
      		
      	// 예매 취소 액션
      				cancelbt.addActionListener(new ActionListener() {
      					
      					@Override
      					public void actionPerformed(ActionEvent e) {
      						ConnectSQL connectsql = new ConnectSQL();
      						int result = connectsql.deleteMovie(r);
      						if (result == 1) {
      							// 기존 창 삭제
          						// 첫화면으로 복귀
      							
      							JOptionPane.showMessageDialog(null, "취소가 완료되었습니다. 메인화면으로 이동합니다.");
          						dispose();
          						MainPage frame = new MainPage(tfID);
      						}
      						else if(result == 0) {
      							JOptionPane.showMessageDialog(null, "예매 취소에 실패했습니다. 다시 시도해주세요.");
      						}
      					}
      				});
        
		setVisible(true);

		
	}
}
