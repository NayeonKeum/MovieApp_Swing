import java.awt.*;
import java.awt.event.*;
import javax.swing.*;	
import javax.swing.border.*;


public class BookPage2_10 extends JFrame {
	public static JPanel contentPane;
	JButton m10_bt, nextbt, backbt;
	String date=" ", time =" ", place=" ";
	private JTextField txtDate;
	
	public BookPage2_10(String tfID, String title) {
		List l1 =new List();
			
		setTitle("눈송 시네마 - 장소, 시간");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(2000,1000);
		contentPane = new JPanel(); 
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.WHITE);
		
		//create text field
				txtDate = new JTextField();
				//set bounds of text field
				txtDate.setBounds(130, 510, 200, 40);
				//add text field to contentPane
				contentPane.add(txtDate);
				//set columns
				txtDate.setColumns(10);		
				
				Font font = new Font("엘리스 디지털배움체", Font.PLAIN, 20);
			    Font font2 = new Font("엘리스 디지털배움체", Font.BOLD, 50);

				
			  //create button and there object
				JButton btnNewButton = new JButton("날짜 선택");
				btnNewButton.setFont(font);
				btnNewButton.setBackground(new Color(18, 50, 181));
				btnNewButton.setForeground(Color.WHITE);
				
				//perform action listener
				btnNewButton.addActionListener(new ActionListener() 
				{	
					//performed action
					public void actionPerformed(ActionEvent arg0) 
					{
						//create frame new object  f
						final JFrame f = new JFrame();
						//set text which is collected by date picker i.e. set date 
						txtDate.setText(new DatePicker(f).setPickedDate());
						txtDate.setFont(font);
					}
				});
				//set button bound
				btnNewButton.setBounds(130, 460, 200, 40);
				//add button in contentPane
				contentPane.add(btnNewButton);
							

				JLabel label = new JLabel("눈송 시네마 - 장소, 시간 예매");// 제목
				label.setFont(font2);
				label.setBounds(350, 72, 1001, 80);
				label.setForeground(new Color(18, 50, 181));
				contentPane.add(label);

				JLabel lb_m1 = new JLabel("겟아웃");
				lb_m1.setFont(font);
				lb_m1.setBounds(130, 180, 100, 50);
				lb_m1.setForeground(new Color(18, 50, 181));
				contentPane.add(lb_m1);
		
				m10_bt = new JButton();
				m10_bt.setBounds(130, 230, 170,200);
				ImageIcon icon = new ImageIcon("겟아웃.jpeg");
				m10_bt.setBackground(Color.WHITE);
				m10_bt.setIcon(icon);
				contentPane.add(m10_bt);

		setVisible(true);

int x = 400;
		
		JLabel m_p1 = new JLabel("강동점");
		m_p1.setForeground(new Color(18, 50, 181));
		m_p1.setBounds(x,180 , 80, 30);
		JRadioButton m_p1t1 = new JRadioButton("9:30");
        JRadioButton m_p1t2 = new JRadioButton("13:45");
        JRadioButton m_p1t3 = new JRadioButton("16:20");
		JRadioButton m_p1t4 = new JRadioButton("18:00");


        JLabel m_p2 = new JLabel("강서점");
		m_p2.setForeground(new Color(18, 50, 181));
        m_p2.setBounds(x, 280, 100, 40);
		JRadioButton m_p2t1 = new JRadioButton("10:10");
        JRadioButton m_p2t2 = new JRadioButton("12:15");
        JRadioButton m_p2t3 = new JRadioButton("14:50");
		JRadioButton m_p2t4 = new JRadioButton("17:45");

        JLabel m_p3 = new JLabel("강남점");
		m_p3.setForeground(new Color(18, 50, 181));
        m_p3.setBounds(x, 380, 100, 40);
		JRadioButton m_p3t1 = new JRadioButton("11:30");
        JRadioButton m_p3t2 = new JRadioButton("15:25");
        JRadioButton m_p3t3 = new JRadioButton("18:10");
		JRadioButton m_p3t4 = new JRadioButton("20:40");

        JLabel m_p4 = new JLabel("강북점");
		m_p4.setForeground(new Color(18, 50, 181));
        m_p4.setBounds(x, 480, 100, 40);
	    JRadioButton m_p4t1 = new JRadioButton("12:45");
        JRadioButton m_p4t2 = new JRadioButton("16:00");
        JRadioButton m_p4t3 = new JRadioButton("17:25");
		JRadioButton m_p4t4 = new JRadioButton("19:30");


		contentPane.add(m_p1);
		contentPane.add(m_p2);
		contentPane.add(m_p3);
		contentPane.add(m_p4);
		
/*
		ButtonGroup group1 = new ButtonGroup();
		ButtonGroup group2 = new ButtonGroup();
		ButtonGroup group3 = new ButtonGroup();
		ButtonGroup group4 = new ButtonGroup();
*/
		ButtonGroup group1 = new ButtonGroup();

		m_p1.setFont(font);
		m_p2.setFont(font);
		m_p3.setFont(font);
		m_p4.setFont(font);

		m_p1t1.setFont(font);
		m_p1t2.setFont(font);
		m_p1t3.setFont(font);
		m_p1t4.setFont(font);

		m_p2t1.setFont(font);
		m_p2t2.setFont(font);
		m_p2t3.setFont(font);
		m_p2t4.setFont(font);

		m_p3t1.setFont(font);
		m_p3t2.setFont(font);
		m_p3t3.setFont(font);
		m_p3t4.setFont(font);

		m_p4t1.setFont(font);
		m_p4t2.setFont(font);
		m_p4t3.setFont(font);
		m_p4t4.setFont(font);

		m_p1.setBackground(Color.WHITE);
		m_p2.setBackground(Color.WHITE);
		m_p3.setBackground(Color.WHITE);
		m_p4.setBackground(Color.WHITE);

		m_p1t1.setBackground(Color.WHITE);
		m_p1t2.setBackground(Color.WHITE);
		m_p1t3.setBackground(Color.WHITE);
		m_p1t4.setBackground(Color.WHITE);

		m_p2t1.setBackground(Color.WHITE);
		m_p2t2.setBackground(Color.WHITE);
		m_p2t3.setBackground(Color.WHITE);
		m_p2t4.setBackground(Color.WHITE);

		m_p3t1.setBackground(Color.WHITE);
		m_p3t2.setBackground(Color.WHITE);
		m_p3t3.setBackground(Color.WHITE);
		m_p3t4.setBackground(Color.WHITE);

		m_p4t1.setBackground(Color.WHITE);
		m_p4t2.setBackground(Color.WHITE);
		m_p4t3.setBackground(Color.WHITE);
		m_p4t4.setBackground(Color.WHITE);

//		m_p1.setBounds(700,150,100,60);
//        m_p2.setBounds(700,350,100,60);
//        m_p3.setBounds(700,550,100,60);
//        m_p4.setBounds(700,750,100,60);

		group1.add(m_p1t1);
        group1.add(m_p1t2);
        group1.add(m_p1t3);
		group1.add(m_p1t4);

		m_p1t1.setBounds(x, 230, 100, 20);
		int x2 = 600;
		m_p1t2.setBounds(x2, 230, 100, 20);
		int x3 = 800;
		m_p1t3.setBounds(x3, 230, 100, 20);
		int x4 = 1000;
		m_p1t4.setBounds(x4, 230, 100, 20);

        this.add(m_p1t1);
        this.add(m_p1t2);
        this.add(m_p1t3);
		this.add(m_p1t4);
		
		group1.add(m_p2t1);
        group1.add(m_p2t2);
        group1.add(m_p2t3); 
		group1.add(m_p2t4);

		m_p2t1.setBounds(x, 330, 100, 20);
		m_p2t2.setBounds(x2, 330, 100, 20);
		m_p2t3.setBounds(x3, 330, 100, 20);
		m_p2t4.setBounds(x4, 330, 100, 20);
	
        this.add(m_p2t1);
        this.add(m_p2t2);
        this.add(m_p2t3);
		this.add(m_p2t4);

		group1.add(m_p3t1);
        group1.add(m_p3t2);
        group1.add(m_p3t3); 
		group1.add(m_p3t4);

		m_p3t1.setBounds(x, 430, 100, 30);
		m_p3t2.setBounds(x2, 430, 100, 30);
		m_p3t3.setBounds(x3, 430, 100, 30);
		m_p3t4.setBounds(x4, 430, 100, 30);
		
        this.add(m_p3t1);
        this.add(m_p3t2);
        this.add(m_p3t3);
		this.add(m_p3t4);

		group1.add(m_p4t1);
        group1.add(m_p4t2);
        group1.add(m_p4t3);
		group1.add(m_p4t4);

		m_p4t1.setBounds(x, 530, 100, 30);
		m_p4t2.setBounds(x2, 530, 100, 30);
		m_p4t3.setBounds(x3, 530, 100, 30);
		m_p4t4.setBounds(x4, 530, 100, 30);

        this.add(m_p4t1);
        this.add(m_p4t2);
        this.add(m_p4t3);
		this.add(m_p4t4);
        
        backbt = new JButton("메인화면");
        backbt.setFont(font);
		backbt.setBounds(40, 600, 139, 39);
		backbt.setBackground(new Color(18, 50, 181));
        backbt.setForeground(Color.WHITE);
		contentPane.add(backbt);

		
		nextbt = new JButton("다음");
		nextbt.setFont(font);
		nextbt.setBounds(1100, 600, 139, 39);
		nextbt.setBackground(new Color(18,50,181));
		nextbt.setForeground(Color.WHITE);
		contentPane.add(nextbt);
		
		backbt.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
		nextbt.setCursor(new Cursor(Cursor.HAND_CURSOR));

		nextbt.addActionListener(new ActionListener() {

			@Override
	         public void actionPerformed(ActionEvent e) {
	            
				 if(m_p1t1.isSelected()){
		            	place = "강동점";
		            	time = "9:30:00";
		            }
		            else if(m_p1t2.isSelected()){
		            	place = "강동점";
		            	time = "13:45:00";
		            }
		            else if(m_p1t3.isSelected()){
		            	place = "강동점";
		            	time = "16:20:00";
		            }
		            else if(m_p1t4.isSelected()){
		            	place = "강동점";
		            	time = "18:00:00";
		            }
		            else if(m_p2t1.isSelected()){
		            	place = "강서점";
		            	time = "10:10:00";
		            }
		            else if(m_p2t2.isSelected()){
		            	place = "강서점";
		            	time = "12:15:00";
		            }
		            else if(m_p2t3.isSelected()){
		            	place = "강서점";
		            	time = "14:50:00";
		            }
		            else if(m_p2t4.isSelected()){
		            	place = "강서점";
		            	time = "17:45:00";
		            }
		            else if(m_p3t1.isSelected()){
		            	place = "강남점";
		            	time = "11:30:00";
		            }
		            else if(m_p3t2.isSelected()){
		            	place = "강남점";
		            	time = "15:25:00";
		            }
		            else if(m_p3t3.isSelected()){
		            	place = "강남점";
		            	time = "18:10:00";
		            }
		            else if(m_p3t4.isSelected()){
		            	place = "강남점";
		            	time = "20:40:00";
		            }
		            else if(m_p4t1.isSelected()){
		            	place = "강북점";
		            	time = "12:45:00";
		            }
		            else if(m_p4t2.isSelected()){
		            	place = "강북점";
		            	time = "16:00:00";
		            }
		            else if(m_p4t3.isSelected()){
		            	place = "강북점";
		            	time = "17:25:00";
		            }
		            /*
		            else if(m_p4t4.isSelected()){
		               time = "19:30(강북점)";
		            }
		            */
		            date = txtDate.getText();
					BookPage3 frame = new BookPage3(tfID, title, date, place, time);
					dispose();
				}
		});
		backbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "메인화면으로 돌아갑니다.");
				dispose();
				BookPage bp = new BookPage(tfID);
				
				}
		});
	}
}