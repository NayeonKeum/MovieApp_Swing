
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;   
import javax.swing.border.*;


public class MainPage extends JFrame{
      public static JPanel contentPane;
      private JButton logoutbt, myPagebt;
      private JButton m1_bt,m2_bt,m3_bt,m4_bt,m6_bt,m7_bt,m8_bt,m9_bt;
      String tfID;
      
      public MainPage(String tfID){
         List l1 =new List();
         
         setTitle("���� �ó׸�");

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


         JLabel label = new JLabel("���� �ó׸�");// ����
			//label.setForeground(Color.WHITE);
	        label.setFont(font2);
	        //label.setBounds(489, 42, 491, 80);
	        label.setBounds(489, 32, 491, 80);
			label.setForeground(new Color(18, 50, 181));
			contentPane.add(label); 
			
			JLabel label_myPage = new JLabel("ID: "+tfID+" ��");// ����
			//label.setForeground(Color.WHITE);
	        label_myPage.setFont(font3);
	        //label_myPage.setBounds(900,200, 491, 80);
	        label_myPage.setBounds(900,70, 100, 80);
			contentPane.add(label_myPage);
			
			JButton myPagebt = new JButton("����������"); // ���������� ��ư
			myPagebt.setFont(font);
			//myPagebt.setBounds(900,400,138,230);
			myPagebt.setBounds(900,120,300,200);
			myPagebt.setBackground(new Color(18, 50, 181));
		    myPagebt.setForeground(Color.WHITE);
			contentPane.add(myPagebt);

			JButton Bookbt = new JButton("�����ϱ�"); 
			Bookbt.setFont(font);
			//Bookbt.setBounds(1100,400,138,230);
			Bookbt.setBounds(900,380,300,200);
			Bookbt.setBackground(new Color(18, 50, 181));
		    Bookbt.setForeground(Color.WHITE);
			contentPane.add(Bookbt);

			JLabel label_APR = new JLabel("������ ���� ��ȭ ��õ ����");// ����
			//label.setForeground(Color.WHITE);
	        label_APR.setFont(font3);
	        //label_myPage.setBounds(900,200, 491, 80);
	        label_APR.setBounds(100,65, 500, 80);
			contentPane.add(label_APR);

			JLabel label_IR = new JLabel("���� ��ȣ �帣 ���� ��ȭ ��õ ����");// ����
			//label.setForeground(Color.WHITE);
	        label_IR.setFont(font3);
	        //label_myPage.setBounds(900,200, 491, 80);
	        label_IR.setBounds(100,325, 700, 80);
			contentPane.add(label_IR);

         
         //////////////////////////////////
		 ConnectSQL connectsql=new ConnectSQL();
         String[] movie_list=connectsql.getPopularMovies();

         //////////////////////////////////
         UBCF ubcf=new UBCF(tfID);
         ubcf.filtering();
         ubcf.print_filtered_array();
         String[] mlist;
         mlist=ubcf.predictRating(ubcf.user_name);
         //////////////////////////////////

         
         JLabel label_title1 = new JLabel(movie_list[0]);// ����
         //label.setForeground(Color.WHITE);
         label_title1.setFont(font);
           //label_myPage.setBounds(900,200, 491, 80);
           label_title1.setBounds(100,300, 170, 80);
         contentPane.add(label_title1);
         JLabel label_title2 = new JLabel(movie_list[1]);// ����
         //label.setForeground(Color.WHITE);
         label_title2.setFont(font);
           //label_myPage.setBounds(900,200, 491, 80);
           label_title2.setBounds(300,300, 170, 80);
         contentPane.add(label_title2);
         JLabel label_title3 = new JLabel(movie_list[2]);// ����
         //label.setForeground(Color.WHITE);
         label_title3.setFont(font);
           //label_myPage.setBounds(900,200, 491, 80);
           label_title3.setBounds(500,300, 170, 80);
         contentPane.add(label_title3);
         JLabel label_title4 = new JLabel(movie_list[3]);// ����
         //label.setForeground(Color.WHITE);
         label_title4.setFont(font);
           //label_myPage.setBounds(900,200, 491, 80);
           label_title4.setBounds(700,300, 170, 80);
         contentPane.add(label_title4);
         
         
         JLabel label_title5 = new JLabel(mlist[0]);// ����
         //label.setForeground(Color.WHITE);
         label_title5.setFont(font);
           //label_myPage.setBounds(900,200, 491, 80);
           label_title5.setBounds(100,560, 170, 80);
         contentPane.add(label_title5);
         JLabel label_title6 = new JLabel(mlist[1]);// ����
         //label.setForeground(Color.WHITE);
         label_title6.setFont(font);
           //label_myPage.setBounds(900,200, 491, 80);
           label_title6.setBounds(300,560, 170, 80);
         contentPane.add(label_title6);
         JLabel label_title7 = new JLabel(mlist[2]);// ����
         //label.setForeground(Color.WHITE);
         label_title7.setFont(font);
           //label_myPage.setBounds(900,200, 491, 80);
           label_title7.setBounds(500,560, 170, 80);
         contentPane.add(label_title7);
         /*
         JLabel label_title8 = new JLabel("����");// ����
         //label.setForeground(Color.WHITE);
         label_title8.setFont(font);
           //label_myPage.setBounds(900,200, 491, 80);
           label_title8.setBounds(700,560, 170, 80);
         contentPane.add(label_title8);
         */
        
         
         m1_bt = new JButton();
			//m1_bt.setBounds(100, 200, 270, 360);
			m1_bt.setBounds(100, 120, 170, 200);
			ImageIcon icon = new ImageIcon(movie_list[0]+".jpg");
			m1_bt.setIcon(icon);
			m1_bt.setBackground(Color.WHITE);
			contentPane.add(m1_bt);

			m2_bt = new JButton();
			//m2_bt.setBounds(430, 200, 270, 360);
			m2_bt.setBounds(300, 120, 170, 200);
			ImageIcon icon2 = new ImageIcon(movie_list[1]+".jpg");
			m2_bt.setIcon(icon2);
			m2_bt.setBackground(Color.WHITE);
			contentPane.add(m2_bt);

			m3_bt = new JButton();
			m3_bt.setBounds(500, 120, 170, 200);
			ImageIcon icon3 = new ImageIcon(movie_list[2]+".jpg");
			m3_bt.setIcon(icon3);
			m3_bt.setBackground(Color.WHITE);
			contentPane.add(m3_bt);

			m4_bt = new JButton();
			//m4_bt.setBounds(1090, 200, 270, 360);
			m4_bt.setBounds(700, 120, 170, 200);
			ImageIcon icon4 = new ImageIcon(movie_list[3]+".jpg");
			m4_bt.setIcon(icon4);
			m4_bt.setBackground(Color.WHITE);
			contentPane.add(m4_bt);

			m6_bt = new JButton();
			//m6_bt.setBounds(100, 570, 270, 360);
			m6_bt.setBounds(100, 380, 170, 200);
			ImageIcon icon6 = new ImageIcon(mlist[0]+".jpg");
			m6_bt.setIcon(icon6);
			m6_bt.setBackground(Color.WHITE);
			contentPane.add(m6_bt);

			m7_bt = new JButton();
			m7_bt.setBounds(300, 380, 170, 200);
			ImageIcon icon7 = new ImageIcon(mlist[1]+".jpg");
			m7_bt.setIcon(icon7);
			m7_bt.setBackground(Color.WHITE);
			contentPane.add(m7_bt);

			m8_bt = new JButton();
			m8_bt.setBounds(500, 380, 170, 200);
			ImageIcon icon8 = new ImageIcon(mlist[2]+".jpg");
			m8_bt.setIcon(icon8);
			m8_bt.setBackground(Color.WHITE);
			contentPane.add(m8_bt);
/*
			m9_bt = new JButton();
			m9_bt.setBounds(700, 380, 170, 200);
			ImageIcon icon9 = new ImageIcon("apple.gif");
			m9_bt.setIcon(icon9);
			m9_bt.setBackground(Color.WHITE);
			contentPane.add(m9_bt);
*/
			logoutbt = new JButton("�α׾ƿ�");
	      	logoutbt.setFont(font);
	  		logoutbt.setBounds(1061, 32, 139, 39);
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
               
            
         setVisible(true);

         Bookbt.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {

            BookPage frame = new BookPage(tfID);
            dispose();
            
         }
         });

         myPagebt.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {

            MyPage1 frame = new MyPage1(tfID);
            dispose();
         }
         });
      }
}
         
//         JLabel label = new JLabel("���� �ó׸�");// ����
//         //label.setForeground(Color.WHITE);
//           label.setFont(new Font("����", Font.PLAIN, 50));
//           label.setBounds(489, 42, 491, 80);
//         contentPane.add(label);
         
//         JButton Mypagebt = new JButton("����������"); // ���������� ��ư
//         myPagebt.setFont(new Font("����", Font.PLAIN, 20));
//         myPagebt.setBounds(850,500,138,440);
//         contentPane.add(myPagebt);
//         setVisible(true);
//}}