import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;	
import javax.swing.border.*;

public class MyPage3 extends JFrame{
	public static JPanel contentPane;
	JButton myMoviebt, logoutbt, nextbt, homebt, myCharbt, myWishbt, myHisbt,wlbt;
	private JButton m1_bt;
		
	public MyPage3(String tfID) {
		List l1 =new List();
		
		setTitle("눈송 시네마 - 위시리스트");

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

		JLabel label = new JLabel("눈송 시네마 - 마이페이지");// 제목
		label.setFont(font2);
		label.setBounds(350, 72, 1001, 80);
		label.setForeground(new Color(18, 50, 181));
		contentPane.add(label);
		
		JLabel lb_history = new JLabel("<< 위시리스트 >>");
		lb_history.setFont(font);
		lb_history.setBounds(550, 182,200,30);
		contentPane.add(lb_history);
		
//		JScrollPane scroll = new JScrollPane(contentPane);
//		scroll.setBounds(0,0,600,600);
	
  		
		
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

		wlbt = new JButton("위시리스트 보기");
		wlbt.setFont(font3);
  		wlbt.setBounds(550, 572, 139, 39);
		wlbt.setBackground(new Color(18, 50, 181));
        wlbt.setForeground(Color.WHITE);
  		contentPane.add(wlbt);

  		JLabel label_myPage = new JLabel("ID: "+tfID+" 님");// 제목
		//label.setForeground(Color.WHITE);
        label_myPage.setFont(font3);
        //label_myPage.setBounds(900,200, 491, 80);
        label_myPage.setBounds(1000,180, 100, 80);
		contentPane.add(label_myPage); 

      	homebt.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
      	myHisbt.setCursor(new Cursor(Cursor.HAND_CURSOR));
      	myWishbt.setCursor(new Cursor(Cursor.HAND_CURSOR));
      	myCharbt.setCursor(new Cursor(Cursor.HAND_CURSOR));

      	
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
      		
      		myHisbt.addActionListener(new ActionListener() {

      			@Override
      			public void actionPerformed(ActionEvent e) {
      				MyPage1 frame = new MyPage1(tfID);
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
      		
      		myMoviebt.addActionListener(new ActionListener() {

      			@Override
      			public void actionPerformed(ActionEvent e) {
      				MyPage4 frame = new MyPage4(tfID);
      				dispose();
      			}
      		});
      		
      		homebt.addActionListener(new ActionListener() {
      			
      			@Override
      			public void actionPerformed(ActionEvent e) {
      				JOptionPane.showMessageDialog(null, "메인화면으로 돌아갑니다.");
      				dispose();
      				
      				MainPage frame = new MainPage(tfID);
      				
      				}
      		});
      		
			wlbt.addActionListener(new ActionListener() {

  				@Override
  				public void actionPerformed(ActionEvent e) {
  					ArrayList<String> wish = new ArrayList<String>();
					for (int i = 0; i < 11 ; i++ )
					{
						
						if (BookPage.check[i] == 1)
						{
							System.out.println(BookPage.check[i]);
							wish.add("해리포터");
						}
						if (BookPage.check[i] == 2)
						{
							System.out.println(BookPage.check[i]);
							wish.add("나의 소녀시대");
						}
						if (BookPage.check[i] == 3)
						{
							System.out.println(BookPage.check[i]);
							wish.add("극한직업");
						}
						if (BookPage.check[i] == 4)
						{
							System.out.println(BookPage.check[i]);
							wish.add("건축학개론");
						}
						if (BookPage.check[i] == 5)
						{
							System.out.println(BookPage.check[i]);
							wish.add("1987");
						}
						if (BookPage.check[i] == 6)
						{
							System.out.println(BookPage.check[i]);
							wish.add("7번방의 선물");
						}
						if (BookPage.check[i] == 7)
						{
							System.out.println(BookPage.check[i]);
							wish.add("트와일라잇");
						}
						if (BookPage.check[i] == 8)
						{
							System.out.println(BookPage.check[i]);
							wish.add("아저씨");
						}
						if (BookPage.check[i] == 9)
						{
							System.out.println(BookPage.check[i]);
							wish.add("아가씨");
						}
						if (BookPage.check[i] == 10)
						{
							System.out.println(BookPage.check[i]);
							wish.add("겟아웃");
						}
					}
					
					for(int i=0;i<wish.size();i++) {
						
						m1_bt = new JButton();
						//m1_bt.setBounds(100, 200, 270, 360);
						m1_bt.setBounds(100+200*i, 220, 170, 200);
						String title = (String) wish.get(i);
						
					    ImageIcon icon = null;
					    if (title.equals("7번방의 선물") || title.equals("1987") || title.equals("건축학개론") || title.equals("극한직업") || title.equals("나의 소녀시대") || title.equals("해리포터"))
				          {
				             String photo = title+".jpg";
				             System.out.println(photo);
				             icon = new ImageIcon(photo);
				          }
				          else if (title.equals("겟아웃") || title.equals("그랜드부다페스트호텔") || title.equals("Mr.& Mrs.Smith") || title.equals("아가씨") || title.equals("아저씨") || title.equals("트와일라잇"))
				         {
				             String photo = title+".jpeg";
				             System.out.println(photo);
				             icon = new ImageIcon(photo);
				          }			
					    m1_bt.setIcon(icon);
						m1_bt.setBackground(Color.WHITE);
						contentPane.add(m1_bt);  					    
					}
  				}
  			});
      		
		setVisible(true);

		
	}
}
