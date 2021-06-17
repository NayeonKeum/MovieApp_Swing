import java.awt.*;
import java.awt.event.*;
import javax.swing.*;	
import javax.swing.border.*;


public class BookPage3 extends JFrame {
	public static JPanel contentPane;
	JButton nextbt, backbt;
	JCheckBox A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18,A19,A20;
	JCheckBox B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20;
	JCheckBox C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20;
	public int price = 0;
	String msg="";	
	
	public BookPage3(String tfID, String title, String date, String place, String time ) {
		List l1 =new List();
		setTitle("눈송 시네마 - 좌석 선택");

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(2000,1000);
		contentPane = new JPanel(); 
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.WHITE);
		
		Font font = new Font("엘리스 디지털배움체", Font.PLAIN, 20);
	    Font font2 = new Font("엘리스 디지털배움체", Font.BOLD, 50);


		JLabel label = new JLabel("눈송 시네마 - 좌석 선택");// 제목
		label.setFont(new Font("굴림",Font.PLAIN, 50));
		label.setBounds(350, 72, 1001, 80);
		contentPane.add(label);
		
		JLabel st_Screen = new JLabel("SCREEN");
		st_Screen.setBounds(560,210,300,30);
		st_Screen.setFont(font);
		contentPane.add(st_Screen);
		
		//A열
				JLabel st_A = new JLabel("A열");
				st_A.setFont(font);
				st_A.setBounds(210,280,40,30);
				contentPane.add(st_A);
				JLabel st_A1 = new JLabel("1");
				st_A1.setFont(font);
				st_A1.setBounds(253,260,30,30);
				contentPane.add(st_A1);
				JLabel st_A2 = new JLabel("2");
				st_A2.setFont(font);
				st_A2.setBounds(283,260,30,30);
				contentPane.add(st_A2);
				JLabel st_A3 = new JLabel("3");
				st_A3.setFont(font);
				st_A3.setBounds(313,260,30,30);
				contentPane.add(st_A3);
				JLabel st_A4 = new JLabel("4");
				st_A4.setFont(font);
				st_A4.setBounds(343,260,30,30);
				contentPane.add(st_A4);
		
				JLabel st_A5 = new JLabel("5");
				st_A5.setFont(font);
				st_A5.setBounds(443,260,30,30);
				contentPane.add(st_A5);
				JLabel st_A6 = new JLabel("6");
				st_A6.setFont(font);
				st_A6.setBounds(473,260,30,30);
				contentPane.add(st_A6);
				JLabel st_A7 = new JLabel("7");
				st_A7.setFont(font);
				st_A7.setBounds(503,260,30,30);
				contentPane.add(st_A7);
				JLabel st_A8 = new JLabel("8");
				st_A8.setFont(font);
				st_A8.setBounds(533,260,30,30);
				contentPane.add(st_A8);
				JLabel st_A9 = new JLabel("9");
				st_A9.setFont(font);
				st_A9.setBounds(563,260,30,30);
				contentPane.add(st_A9);
				JLabel st_A10 = new JLabel("10");
				st_A10.setFont(font);
				st_A10.setBounds(593,260,30,30);
				contentPane.add(st_A10);
				JLabel st_A11 = new JLabel("11");
				st_A11.setFont(font);
				st_A11.setBounds(623,260,30,30);
				contentPane.add(st_A11);
				JLabel st_A12 = new JLabel("12");
				st_A12.setFont(font);
				st_A12.setBounds(653,260,30,30);
				contentPane.add(st_A12);
				JLabel st_A13 = new JLabel("13");
				st_A13.setFont(font);
				st_A13.setBounds(683,260,30,30);
				contentPane.add(st_A13);
				JLabel st_A14 = new JLabel("14");
				st_A14.setFont(font);
				st_A14.setBounds(713,260,30,30);
				contentPane.add(st_A14);
				JLabel st_A15 = new JLabel("15");
				st_A15.setFont(font);
				st_A15.setBounds(743,260,30,30);
				contentPane.add(st_A15);
		
				JLabel st_A16 = new JLabel("16");
				st_A16.setFont(font);
				st_A16.setBounds(843,260,30,30);
				contentPane.add(st_A16);
				JLabel st_A17 = new JLabel("17");
				st_A17.setFont(font);
				st_A17.setBounds(873,260,30,30);
				contentPane.add(st_A17);
				JLabel st_A18 = new JLabel("18");
				st_A18.setFont(font);
				st_A18.setBounds(903,260,30,30);
				contentPane.add(st_A18);
				JLabel st_A19 = new JLabel("19");
				st_A19.setFont(font);
				st_A19.setBounds(933,260,30,30);
				contentPane.add(st_A19);
				JLabel st_A20 = new JLabel("20");
				st_A20.setFont(font);
				st_A20.setBounds(963,260,30,30);
				contentPane.add(st_A20);
		
		// 동의 checkbox
				A1 = new JCheckBox("", false);
				contentPane.add(A1);
				int y = 290;
				int y2 = 340;
				int y3 = 390;
				A1.setBounds(250,y,20,20);
//		if(A1.isSelected()){
//	        price+=8000;
//	        msg += "A1, ";
				A2 = new JCheckBox("", false);
				contentPane.add(A2);
				A2.setBounds(280,y,20,20);
				
				A3 = new JCheckBox("", false);
				contentPane.add(A3);
				A3.setBounds(310,y,20,20);
				A4 = new JCheckBox("", false);
				contentPane.add(A4);
				A4.setBounds(340,y,20,20);
				
				A5 = new JCheckBox("", false);
				contentPane.add(A5);
				A5.setBounds(440,y,20,20);
				A6 = new JCheckBox("", false);
				contentPane.add(A6);
				A6.setBounds(470,y,20,20);
				A7 = new JCheckBox("", false);
				contentPane.add(A7);
				A7.setBounds(500,y,20,20);
				JCheckBox A8 = new JCheckBox("", false);
				contentPane.add(A8);
				A8.setBounds(530,y,20,20);
				A9 = new JCheckBox("", false);
				contentPane.add(A9);
				A9.setBounds(560,y,20,20);
				A10 = new JCheckBox("", false);
				contentPane.add(A10);
				A10.setBounds(590,y,20,20);
				A11 = new JCheckBox("", false);
				contentPane.add(A11);
				A11.setBounds(620,y,20,20);
				A12 = new JCheckBox("", false);
				contentPane.add(A12);
				A12.setBounds(650,y,20,20);
				A13 = new JCheckBox("", false);
				contentPane.add(A13);
				A13.setBounds(680,y,20,20);
				A14 = new JCheckBox("", false);
				contentPane.add(A14);
				A14.setBounds(710,y,20,20);
				A15 = new JCheckBox("", false);
				contentPane.add(A15);
				A15.setBounds(740,y,20,20);
				
				A16 = new JCheckBox("", false);
				contentPane.add(A16);
				A16.setBounds(840,y,20,20);
				A17 = new JCheckBox("", false);
				contentPane.add(A17);
				A17.setBounds(870,y,20,20);
				A18 = new JCheckBox("", false);
				contentPane.add(A18);
				A18.setBounds(900,y,20,20);
				A19 = new JCheckBox("", false);
				contentPane.add(A19);
				A19.setBounds(930,y,20,20);
				A20 = new JCheckBox("", false);
				contentPane.add(A20);
				A20.setBounds(960,y,20,20);
		
				//B열
				JLabel st_B = new JLabel("B열");
				st_B.setFont(font);
				st_B.setBounds(210,330,40,30);
				contentPane.add(st_B);

				// 동의 checkbox
				B1 = new JCheckBox("", false);
				contentPane.add(B1);
				B1.setBounds(250,y2,20,20);
				B2 = new JCheckBox("", false);
				contentPane.add(B2);
				B2.setBounds(280,y2,20,20);
				B3 = new JCheckBox("", false);
				contentPane.add(B3);
				B3.setBounds(310,y2,20,20);
				B4 = new JCheckBox("", false);
				contentPane.add(B4);
				B4.setBounds(340,y2,20,20);
				
				B5 = new JCheckBox("", false);
				contentPane.add(B5);
				B5.setBounds(440,y2,20,20);
				B6 = new JCheckBox("", false);
				contentPane.add(B6);
				B6.setBounds(470,y2,20,20);
				B7 = new JCheckBox("", false);
				contentPane.add(B7);
				B7.setBounds(500,y2,20,20);
				B8 = new JCheckBox("", false);
				contentPane.add(B8);
				B8.setBounds(530,y2,20,20);
				B9 = new JCheckBox("", false);
				contentPane.add(B9);
				B9.setBounds(560,y2,20,20);
				B10 = new JCheckBox("", false);
				contentPane.add(B10);
				B10.setBounds(590,y2,20,20);
				B11 = new JCheckBox("", false);
				contentPane.add(B11);
				B11.setBounds(620,y2,20,20);
				B12 = new JCheckBox("", false);
				contentPane.add(B12);
				B12.setBounds(650,y2,20,20);
				B13 = new JCheckBox("", false);
				contentPane.add(B13);
				B13.setBounds(680,y2,20,20);
				B14 = new JCheckBox("", false);
				contentPane.add(B14);
				B14.setBounds(710,y2,20,20);
				B15 = new JCheckBox("", false);
				contentPane.add(B15);
				B15.setBounds(740,y2,20,20);
				
				B16 = new JCheckBox("", false);
				contentPane.add(B16);
				B16.setBounds(840,y2,20,20);
				B17 = new JCheckBox("", false);
				contentPane.add(B17);
				B17.setBounds(870,y2,20,20);
				B18 = new JCheckBox("", false);
				contentPane.add(B18);
				B18.setBounds(900,y2,20,20);
				B19 = new JCheckBox("", false);
				contentPane.add(B19);
				B19.setBounds(930,y2,20,20);
				B20 = new JCheckBox("", false);
				contentPane.add(B20);
				B20.setBounds(960,y2,20,20);
				
				//C열
				JLabel st_C = new JLabel("C열");
				st_C.setFont(font);
				st_C.setBounds(210,380,40,30);
				contentPane.add(st_C);
				C1 = new JCheckBox("", false);
				contentPane.add(C1);
				C1.setBounds(250,y3,20,20);
				C2 = new JCheckBox("", false);
				contentPane.add(C2);
				C2.setBounds(280,y3,20,20);
				C3 = new JCheckBox("", false);
				contentPane.add(C3);
				C3.setBounds(310,y3,20,20);
				JCheckBox C4 = new JCheckBox("", false);
				contentPane.add(C4);
				C4.setBounds(340,y3,20,20);
				
				C5 = new JCheckBox("", false);
				contentPane.add(C5);
				C5.setBounds(440,y3,20,20);
				C6 = new JCheckBox("", false);
				contentPane.add(C6);
				C6.setBounds(470,y3,20,20);
				C7 = new JCheckBox("", false);
				contentPane.add(C7);
				C7.setBounds(500,y3,20,20);
				C8 = new JCheckBox("", false);
				contentPane.add(C8);
				C8.setBounds(530,y3,20,20);
				JCheckBox C9 = new JCheckBox("", false);
				contentPane.add(C9);
				C9.setBounds(560,y3,20,20);
				C10 = new JCheckBox("", false);
				contentPane.add(C10);
				C10.setBounds(590,y3,20,20);
				C11 = new JCheckBox("", false);
				contentPane.add(C11);
				C11.setBounds(620,y3,20,20);
				C12 = new JCheckBox("", false);
				contentPane.add(C12);
				C12.setBounds(650,y3,20,20);
				C13 = new JCheckBox("", false);
				contentPane.add(C13);
				C13.setBounds(680,y3,20,20);
				C14 = new JCheckBox("", false);
				contentPane.add(C14);
				C14.setBounds(710,y3,20,20);
				C15 = new JCheckBox("", false);
				contentPane.add(C15);
				C15.setBounds(740,y3,20,20);
				
				C16 = new JCheckBox("", false);
				contentPane.add(C16);
				C16.setBounds(840,y3,20,20);
				C17 = new JCheckBox("", false);
				contentPane.add(C17);
				C17.setBounds(870,y3,20,20);
				JCheckBox C18 = new JCheckBox("", false);
				contentPane.add(C18);
				C18.setBounds(900,y3,20,20);
				C19 = new JCheckBox("", false);
				contentPane.add(C19);
				C19.setBounds(930,y3,20,20);
				JCheckBox C20 = new JCheckBox("", false);
				contentPane.add(C20);
				C20.setBounds(960,y3,20,20);
		//D열
//		JLabel st_D = new JLabel("D열");
//		st_D.setBounds(210,320,30,30);
//		contentPane.add(st_D);
//		
//		//E열
//		JLabel st_E = new JLabel("E열");
//		st_E.setBounds(210,350,30,30);
//		contentPane.add(st_E);
//		//F열
//		JLabel st_F = new JLabel("F열");
//		st_F.setBounds(210,380,30,30);
//		contentPane.add(st_F);
//		//G열
//		JLabel st_G = new JLabel("G열");
//		st_G.setBounds(210,410,30,30);
//		contentPane.add(st_G);			
		
				backbt = new JButton("메인화면");
				backbt.setBounds(40, 600, 139, 39);
				backbt.setFont(font);
				backbt.setBackground(new Color(18, 50, 181));
				backbt.setForeground(Color.WHITE);
				contentPane.add(backbt);
				
				nextbt = new JButton("다음");
				nextbt.setBounds(1100, 600, 139, 39);
				nextbt.setFont(font);
				nextbt.setBackground(new Color(18, 50, 181));
				nextbt.setForeground(Color.WHITE);
				contentPane.add(nextbt);

		backbt.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
		nextbt.setCursor(new Cursor(Cursor.HAND_CURSOR));
		nextbt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(A1.isSelected()){
			        price+=8000;
			        msg += "A1 ";}
				if(A2.isSelected()){
			        price+=8000;
			        msg += "A2 ";}
				if(A3.isSelected()){
			        price+=8000;
			        msg += "A3 ";}
				if(A4.isSelected()){
			        price+=8000;
			        msg += "A4 ";}
				if(A5.isSelected()){
			        price+=8000;
			        msg += "A5 ";}
				if(A6.isSelected()){
			        price+=8000;
			        msg += "A6 ";}
				if(A7.isSelected()){
			        price+=8000;
			        msg += "A7 ";}
				if(A8.isSelected()){
			        price+=8000;
			        msg += "A8 ";}
				if(A9.isSelected()){
			        price+=8000;
			        msg += "A9 ";}
				if(A10.isSelected()){
			        price+=8000;
			        msg += "A10 ";}
				if(A11.isSelected()){
			        price+=8000;
			        msg += "A11 ";}
				if(A12.isSelected()){
			        price+=8000;
			        msg += "A12 ";}
				if(A13.isSelected()){
			        price+=8000;
			        msg += "A13 ";}
				if(A14.isSelected()){
			        price+=8000;
			        msg += "A14 ";}
				if(A15.isSelected()){
			        price+=8000;
			        msg += "A15 ";}
				if(A16.isSelected()){
			        price+=8000;
			        msg += "A16 ";}
				if(A17.isSelected()){
			        price+=8000;
			        msg += "A17 ";}
				if(A18.isSelected()){
			        price+=8000;
			        msg += "A18 ";}
				if(A19.isSelected()){
			        price+=8000;
			        msg += "A19 ";}
				if(A20.isSelected()){
			        price+=8000;
			        msg += "A20 ";}
				
				if(B1.isSelected()){
			        price+=8000;
			        msg += "B1 ";}
				if(B2.isSelected()){
			        price+=8000;
			        msg += "B2 ";}
				if(B3.isSelected()){
			        price+=8000;
			        msg += "B3 ";}
				if(B4.isSelected()){
			        price+=8000;
			        msg += "B4 ";}
				if(B5.isSelected()){
			        price+=8000;
			        msg += "B5 ";}
				if(B6.isSelected()){
			        price+=8000;
			        msg += "B6 ";}
				if(B7.isSelected()){
			        price+=8000;
			        msg += "B7 ";}
				if(B8.isSelected()){
			        price+=8000;
			        msg += "B8 ";}
				if(B9.isSelected()){
			        price+=8000;
			        msg += "B9 ";}
				if(B10.isSelected()){
			        price+=8000;
			        msg += "B10 ";}
				if(B11.isSelected()){
			        price+=8000;
			        msg += "B11 ";}
				if(B12.isSelected()){
			        price+=8000;
			        msg += "B12 ";}
				if(B13.isSelected()){
			        price+=8000;
			        msg += "B13 ";}
				if(B14.isSelected()){
			        price+=8000;
			        msg += "B14 ";}
				if(B15.isSelected()){
			        price+=8000;
			        msg += "B15 ";}
				if(B16.isSelected()){
			        price+=8000;
			        msg += "B16 ";}
				if(B17.isSelected()){
			        price+=8000;
			        msg += "B17 ";}
				if(B18.isSelected()){
			        price+=8000;
			        msg += "B18 ";}
				if(B19.isSelected()){
			        price+=8000;
			        msg += "B19 ";}
				if(B20.isSelected()){
			        price+=8000;
			        msg += "B20 ";}
				
				if(C1.isSelected()){
			        price+=8000;
			        msg += "C1 ";}
				if(C2.isSelected()){
			        price+=8000;
			        msg += "C2 ";}
				if(C3.isSelected()){
			        price+=8000;
			        msg += "C3 ";}
				if(C4.isSelected()){
			        price+=8000;
			        msg += "C4 ";}
				if(C5.isSelected()){
			        price+=8000;
			        msg += "C5 ";}
				if(C6.isSelected()){
			        price+=8000;
			        msg += "C6 ";}
				if(C7.isSelected()){
			        price+=8000;
			        msg += "C7 ";}
				if(C8.isSelected()){
			        price+=8000;
			        msg += "C8 ";}
				if(C9.isSelected()){
			        price+=8000;
			        msg += "C9 ";}
				if(C10.isSelected()){
			        price+=8000;
			        msg += "C10 ";}
				if(C11.isSelected()){
			        price+=8000;
			        msg += "C11 ";}
				if(C12.isSelected()){
			        price+=8000;
			        msg += "C12 ";}
				if(C13.isSelected()){
			        price+=8000;
			        msg += "C13 ";}
				if(C14.isSelected()){
			        price+=8000;
			        msg += "C14 ";}
				if(C15.isSelected()){
			        price+=8000;
			        msg += "C15 ";}
				if(C16.isSelected()){
			        price+=8000;
			        msg += "C16 ";}
				if(C17.isSelected()){
			        price+=8000;
			        msg += "C17 ";}
				if(C18.isSelected()){
			        price+=8000;
			        msg += "C18 ";}
				if(C19.isSelected()){
			        price+=8000;
			        msg += "C19 ";}
				if(C20.isSelected()){
			        price+=8000;
			        msg += "C20 ";}
				
				
				BookPage4 frame = new BookPage4(tfID,title, date, place, time, msg, price);
				dispose();
				msg = "   ";
				price = 0;
			}
		});
		
		backbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "내용을 초기화하고 메인화면으로 돌아갑니다.");
				dispose();
				MainPage mp = new MainPage(tfID);
				
				}
		});
		setVisible(true);

		}}
		
