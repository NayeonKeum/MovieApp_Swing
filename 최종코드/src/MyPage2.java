import java.awt.*;
import java.awt.event.*;
import javax.swing.*;	
import javax.swing.border.*;

public class MyPage2 extends JFrame{
	public static JPanel contentPane;
	int maxnum;
	JButton myMoviebt,logoutbt, nextbt, homebt, myCharbt, myWishbt, myHisbt, charbt;
		
	public MyPage2(String tfID) {
		List l1 =new List();
		
		setTitle("���� �ó׸� - �� ĳ����");

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(2000,1000);
		contentPane = new JPanel(); 
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.WHITE);

		
		Font font = new Font("������ �����й��ü", Font.PLAIN, 20);
	    Font font2 = new Font("������ �����й��ü", Font.BOLD, 50);
	    Font font3 = new Font("������ �����й��ü", Font.PLAIN, 15);


	    JLabel label = new JLabel("���� �ó׸� - ����������");// ����
		label.setFont(font2);
		label.setBounds(350, 72, 1001, 80);
		label.setForeground(new Color(18, 50, 181));
		contentPane.add(label);
		
		JLabel lb_history = new JLabel("<< �� ĳ���� >>");
		lb_history.setFont(font);
		lb_history.setBounds(550, 182,200,30);
		contentPane.add(lb_history);
		

      	logoutbt = new JButton("�α׾ƿ�");
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
      
  		
      	myMoviebt = new JButton("���� �� ��ȭ");
  		myMoviebt.setFont(font3);
  		myMoviebt.setBounds(1000,252,130,50);
		myMoviebt.setBackground(Color.WHITE);
        myMoviebt.setForeground(new Color(18, 50, 181));
  		contentPane.add(myMoviebt);
  		
  		myHisbt = new JButton("����Ȯ��/���");
  		myHisbt.setFont(font3);
  		myHisbt.setBounds(1000, 352, 130, 50);
		myHisbt.setBackground(Color.WHITE);
        myHisbt.setForeground(new Color(18, 50, 181));
  		contentPane.add(myHisbt);
  		
  		myCharbt = new JButton("�� ĳ����");
  		myCharbt.setFont(font3);
  		myCharbt.setBounds(1000, 452, 130, 50);
		myCharbt.setBackground(Color.WHITE);
        myCharbt.setForeground(new Color(18, 50, 181));
  		contentPane.add(myCharbt);
  		
  		myWishbt = new JButton("���ø���Ʈ");
  		myWishbt.setFont(font3);
  		myWishbt.setBounds(1000, 552, 130, 50);
		myWishbt.setBackground(Color.WHITE);
        myWishbt.setForeground(new Color(18, 50, 181));
  		contentPane.add(myWishbt);
  		
  		homebt = new JButton("����ȭ��");
  		homebt.setFont(font);
  		homebt.setBounds(40, 600, 139, 39);
		homebt.setBackground(new Color(18, 50, 181));
        homebt.setForeground(Color.WHITE);
  		contentPane.add(homebt);

  		
  		JLabel label_myPage = new JLabel("ID: "+tfID+" ��");// ����
		//label.setForeground(Color.WHITE);
  		label_myPage.setFont(font3);
        //label_myPage.setBounds(900,200, 491, 80); 
        label_myPage.setBounds(1000,200, 100, 80);
		contentPane.add(label_myPage);
		
		JLabel lb_Char = new JLabel();
	      contentPane.add(lb_Char);
	      JLabel lb_Char_ment = new JLabel();
	      contentPane.add(lb_Char_ment);

	      lb_Char_ment.setFont(font);
	      lb_Char.setBounds(500, 200, 1001, 380);
	      lb_Char_ment.setBounds(430,230, 500,34);
	      
	      charbt = new JButton("ĳ���� ����");
	      charbt.setFont(font);
	      charbt.setBounds(550, 572, 139, 39);
	      charbt.setBackground(new Color(18,50,181));
	      charbt.setForeground(Color.WHITE);
	      contentPane.add(charbt);

	      charbt.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
	      ConnectSQL connectsql=new ConnectSQL();
          maxnum = connectsql.getcharnum(tfID);
          System.out.println(maxnum);

	      setVisible(true);

	      charbt.addActionListener(new ActionListener(){
	      
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  

	         if (maxnum == 1 || maxnum ==3 || maxnum==10)
	         {
	            ImageIcon Char1 = new ImageIcon("char1.png");   
	            lb_Char.setIcon(Char1);
	            lb_Char_ment.setText("����� ĳ���ʹ� ��̸� ã�� ����ް��Դϴ�!" );
	            lb_Char_ment.setFont(font);
	            
	         }
	         else if (maxnum == 2 || maxnum==4 || maxnum==5)
	         {
	            ImageIcon Char2 = new ImageIcon("char6.png");   
	            lb_Char.setIcon(Char2);
	            lb_Char_ment.setText("����� ĳ���ʹ� ȣ��� ���� ����ް��Դϴ�!" );
	            lb_Char_ment.setFont(font);
	            
	         }
	         else if (maxnum == 6)
	         {
	            ImageIcon Char3 = new ImageIcon("char3.png");   
	            lb_Char.setIcon(Char3);
	            lb_Char_ment.setText("����� ĳ���ʹ� �밨�� ����ް� �Դϴ�!" );
	            lb_Char_ment.setFont(font);
	            
	         }
	         else if (maxnum == 7)
	         {
	            ImageIcon Char4 = new ImageIcon("char4.png");   
	            lb_Char.setIcon(Char4);
	            lb_Char_ment.setText("����� ĳ���ʹ� ������ �ʷϴް� �Դϴ�!" );
	            lb_Char_ment.setFont(font);
	            
	         }
	         else if (maxnum ==11 || maxnum ==12)
	         {
	            ImageIcon Char5 = new ImageIcon("char5.png");
	            lb_Char.setIcon(Char5);
	            lb_Char_ment.setText("����� ĳ���ʹ� ������ ǳ���� ���ް� �Դϴ�!" );
	            lb_Char_ment.setFont(font);
	            
	         }
	         else if (maxnum == 8 || maxnum ==9)
	         {
	            ImageIcon Char6 = new ImageIcon("char2.png");
	            lb_Char.setIcon(Char6);
	            lb_Char_ment.setText("����� ĳ���ʹ� ������ ��ũ�ް� �Դϴ�!" );
	            lb_Char_ment.setFont(font);
	            
	         }
	      }
	      });

        
        	
      		
//      		nextbt = new JButton("");
//      		nextbt.setBounds(1100, 600, 139, 39);
//      		contentPane.add(nextbt);

      	homebt.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
      	myHisbt.setCursor(new Cursor(Cursor.HAND_CURSOR));
      	myWishbt.setCursor(new Cursor(Cursor.HAND_CURSOR));
      	myCharbt.setCursor(new Cursor(Cursor.HAND_CURSOR));
      		
      		myHisbt.addActionListener(new ActionListener() {

      			@Override
      			public void actionPerformed(ActionEvent e) {
      				MyPage1 frame = new MyPage1(tfID);
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
      				JOptionPane.showMessageDialog(null, "����ȭ������ ���ư��ϴ�.");
      				dispose();
      				
      				MainPage frame = new MainPage(tfID);
      				
      				}
      		});
      		
      	// ���� ��� �׼�
      				
        
		setVisible(true);

		
	}
}
