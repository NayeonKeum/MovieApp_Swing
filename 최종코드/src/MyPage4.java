import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;	
import javax.swing.border.*;

public class MyPage4 extends JFrame{
	public static JPanel contentPane, menu_P, main_P, m1_P, m2_P;
	   JButton myMoviebt, logoutbt, nextbt, homebt, myCharbt, myWishbt, myHisbt;
	   JLabel m1_n_lb, m1_p_lb, m1_d_lb;
	   JButton m1_bt, m2_bt;
	   String m1_g, m2_g;
	   JLabel m1_g_lb;
	   String m1_n, m1_p, m1_d, m1_r; 
	   String[] grade  = {"1","2","3","4","5"};
		
	public MyPage4(String tfID) {
		List l1 =new List();
		
		setTitle("���� �ó׸� - ���� �� ��ȭ");

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(2000,1000);
		contentPane = new JPanel(); 
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		//setContentPane(contentPane);
	    add(contentPane);
	    contentPane.setBounds(0, 0, 1250, 220);
	    contentPane.setLayout(null);
	    contentPane.setBackground(Color.WHITE);

	    menu_P = new JPanel();
	    menu_P.setBorder(new EmptyBorder(5,5,5,5));
	    add(menu_P);
	    menu_P.setBounds(800, 0, 500, 1100);
	    menu_P.setLayout(null);
	    menu_P.setBackground(Color.WHITE);

	    main_P = new JPanel();
	    main_P.setBorder(new EmptyBorder(5,5,5,5));
	    add(main_P);
	    main_P.setBounds(0, 550, 300, 300);
	    main_P.setLayout(null);
	    main_P.setBackground(Color.WHITE);

	    m1_P = new JPanel();
	    m1_P.setBorder(new EmptyBorder(5,5,5,5));
	    add(m1_P);
	    m1_P.setBounds(90, 200, 150, 400);
	    m1_P.setLayout(null);
	    m1_P.setBackground(Color.WHITE);
	    
	    Font font = new Font("������ �����й��ü", Font.PLAIN, 20);
		Font font2 = new Font("������ �����й��ü", Font.BOLD, 50);
		Font font3 = new Font("������ �����й��ü", Font.PLAIN, 15);

	    
		JLabel label = new JLabel("���� �ó׸� - ����������");// ����
	    label.setFont(font2);
	    label.setBounds(350, 72, 800, 80);
	    label.setForeground(new Color(18, 50, 181));
	    contentPane.add(label);
	     
	    JLabel lb_history = new JLabel("<< ���� �� ��ȭ >>");
	    lb_history.setFont(font);
	    lb_history.setBounds(550, 182,200,30);
	    contentPane.add(lb_history);
		
//		JScrollPane scroll = new JScrollPane(contentPane);
//		scroll.setBounds(0,0,600,600);
		
	    logoutbt = new JButton("�α׾ƿ�");
	    logoutbt.setBounds(1100, 32, 139, 39);
	    logoutbt.setFont(font);
	    logoutbt.setBackground(new Color(18, 50, 181));
        logoutbt.setForeground(Color.WHITE);
	    contentPane.add(logoutbt);
	    logoutbt.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    
		// ���� Ȯ��
		ConnectSQL connectsql = new ConnectSQL();
		ArrayList<?> result = connectsql.checkMovie(tfID, 1);

		for(int i=0;i<result.size();i++) {
			System.out.println(result.get(i));
			ArrayList data = (ArrayList) result.get(i);
			m1_bt = new JButton();
		    m1_bt.setBounds(100+200*i, 220, 170, 200);
		    
		    m1_r = (String) data.get(0);
		    m1_n = (String) data.get(1);
		    m1_p = (String) data.get(3);
		    m1_d = ((String) data.get(2)).substring(0,10); 
		    m1_g = (String) data.get(7);
		    		    
		    ImageIcon icon = null;
		    System.out.println(m1_n);
		    if (m1_n.equals("7������ ����") || m1_n.equals("1987") || m1_n.equals("�����а���") || m1_n.equals("��������") || m1_n.equals("���� �ҳ�ô�") || m1_n.equals("�ظ�����"))
	          {
	             String photo = m1_n+".jpg";
	             System.out.println(photo);
	             icon = new ImageIcon(photo);
	          }
	          else if (m1_n.equals("�پƿ�") || m1_n.equals("�׷���δ��佺Ʈȣ��") || m1_n.equals("Mr.& Mrs.Smith") || m1_n.equals("�ư���") || m1_n.equals("������") || m1_n.equals("Ʈ���϶���"))
	         {
	             String photo = m1_n+".jpeg";
	             System.out.println(photo);
	             icon = new ImageIcon(photo);
	          }
		    m1_bt.setIcon(icon);
		    m1_bt.setBackground(Color.WHITE);	
		    m1_P.add(m1_bt);
		    
		    JLabel m1_n_lb = new JLabel("���� : " + m1_n);
		    m1_n_lb.setFont(font);		    
		    m1_n_lb.setBounds(100+200*i, 430 ,200, 30);
		    m1_P.add(m1_n_lb);
		      
		    JLabel m1_p_lb = new JLabel("�󿵰� : " + m1_p);
		    m1_p_lb.setFont(font);		    
		    m1_p_lb.setBounds(100+200*i, 460 ,200, 30);
		    m1_P.add(m1_p_lb);
	      
		    JLabel m1_d_lb = new JLabel("��¥ : " + m1_d);
		    m1_d_lb.setFont(font);
		    m1_d_lb.setBounds(100+200*i, 490 ,200, 30);
		    m1_P.add(m1_d_lb);
		      
		    JLabel m1_g_lb = new JLabel("���� : " + m1_g);
		    m1_g_lb.setFont(font);
		    m1_g_lb.setBounds(100+200*i, 520 ,490, 30);
		    m1_P.add(m1_g_lb);
		}

	


  		
		myMoviebt = new JButton("���� �� ��ȭ");
      	myMoviebt.setFont(font3);
        myMoviebt.setBounds(200,252,130,50);
		myMoviebt.setBackground(Color.WHITE);
        myMoviebt.setForeground(new Color(18, 50, 181));
        menu_P.add(myMoviebt);
        
        myHisbt = new JButton("����Ȯ��/���");
        myHisbt.setFont(font3);
        myHisbt.setBounds(200, 352, 130, 50);
		myHisbt.setBackground(Color.WHITE);
        myHisbt.setForeground(new Color(18, 50, 181));
        menu_P.add(myHisbt);
        
        myCharbt = new JButton("�� ĳ����");
        myCharbt.setFont(font3);
        myCharbt.setBounds(200, 452, 130, 50);
		myCharbt.setBackground(Color.WHITE);
        myCharbt.setForeground(new Color(18, 50, 181));
        menu_P.add(myCharbt);
        
        myWishbt = new JButton("���ø���Ʈ");
        myWishbt.setFont(font3);
        myWishbt.setBounds(200, 552, 130, 50);
		myWishbt.setBackground(Color.WHITE);
        myWishbt.setForeground(new Color(18, 50, 181));
        menu_P.add(myWishbt);
        
        homebt = new JButton("����ȭ��");
        homebt.setFont(font);
        homebt.setBounds(40, 50, 139, 39);
		homebt.setBackground(new Color(18, 50, 181));
        homebt.setForeground(Color.WHITE);
        main_P.add(homebt);
  		
        JLabel label_myPage = new JLabel("ID: "+tfID+" ��");// ����
	     //label.setForeground(Color.WHITE);
        label_myPage.setFont(font3);
        //label_myPage.setBounds(900,200, 491, 80);

        label_myPage.setBounds(200,200, 300, 80);
        menu_P.add(label_myPage);


        m1_bt.addActionListener(new ActionListener() {
	              
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		int selected = JOptionPane.showOptionDialog(null, "�ش� ��ȭ�� ���� ������ �Ű� �ּ���!", "����",	             
	            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, grade, grade[0]);
        		
	            if(selected == JOptionPane.CLOSED_OPTION)
	                 JOptionPane.showMessageDialog(null, " ����.. �Ű��ּ���...");
	            else {
	            	m1_g = grade[selected];
	                System.out.println(m1_g);
	                
	                ConnectSQL connectsql = new ConnectSQL();
	                int result = connectsql.updateRate(m1_r ,m1_g);
	                if (result == 1) {
	                	JOptionPane.showMessageDialog(null, "����Ǿ����ϴ�.");
	                	MyPage4 frame = new MyPage4(tfID);
	      				dispose();
	                }
	                else
	                	JOptionPane.showMessageDialog(null, "���� �ݿ��� ���� �ʾҽ��ϴ�. �ٽ� �õ����ּ���.");
	            }
	            	
	            
//	            m1_g_lb.setText("���� : " + m1_g);
	            
	            
//	            JLabel m1_lb = new JLabel("���� : " + m1_g+ "��");// ����
//	            m1_lb.setFont(new Font("����",Font.PLAIN, 20));
//	            m1_lb.setBounds(100, 450, 170, 40);
//	            contentPane.add(m1_lb);
	                 

        	}
        	});
		

        	
      		
//      		nextbt = new JButton("");
//      		nextbt.setBounds(1100, 600, 139, 39);
//      		contentPane.add(nextbt);

		

      	homebt.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
      	myHisbt.setCursor(new Cursor(Cursor.HAND_CURSOR));
      	myWishbt.setCursor(new Cursor(Cursor.HAND_CURSOR));
      	myCharbt.setCursor(new Cursor(Cursor.HAND_CURSOR));

      	

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
      				JOptionPane.showMessageDialog(null, "����ȭ������ ���ư��ϴ�.");
      				dispose();
      				
      				MainPage frame = new MainPage(tfID);
      				
      				}
      		});
      		
      		
      		
      
      				
        
		setVisible(true);

		
	}
}
