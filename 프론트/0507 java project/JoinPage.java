// 회원가입 화면

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;	
import javax.swing.border.*;


public class JoinPage extends JFrame {
		public static JPanel contentPane;
		private JTextField tfID, tfPasswd, tfName, tfBirth, tfSex, tfPhone, tfEmail ;
		private JButton joinCompletebt;
		
		
		public JoinPage() {
			List l1 =new List();
			
			setTitle("눈송시네마 예매 키오스크 - 회원가입창");
			
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setSize(2000,1000);
			//setBounds(100, 100, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
			contentPane = new JPanel(); // 버튼이나 라벨이 들어갈 화면
			contentPane.setBorder(new EmptyBorder(5,5,5,5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel label = new JLabel("눈송 시네마 - 회원가입");// 제목
			//label.setForeground(Color.WHITE);
	        label.setFont(new Font("굴림", Font.PLAIN, 50));
	        label.setBounds(350, 102, 591, 80);
			contentPane.add(label);
			
			
			
			// ID, PW, 이름, 생년월일, 성별, 전화번호, 이메일, 약관
			JLabel lb_Login = new JLabel("ID");
			lb_Login.setBounds(401,201,69,44);
			contentPane.add(lb_Login);
			JLabel lb_Passwd = new JLabel("PW");
			lb_Passwd.setBounds(401,251,69,44);
			contentPane.add(lb_Passwd);
			JLabel lb_Name = new JLabel("이름");
			lb_Name.setBounds(401,300,69,44);
			contentPane.add(lb_Name);
			JLabel lb_Birth = new JLabel("생년월일");
			lb_Birth.setBounds(401,350,69,44);
			contentPane.add(lb_Birth);
			JLabel lb_Sex = new JLabel("성별");
			lb_Sex.setBounds(401,400,69,44);
			contentPane.add(lb_Sex);
			JLabel lb_Phone = new JLabel("전화번호");
			lb_Phone.setBounds(401,450,69,44);
			contentPane.add(lb_Phone);
//			JLabel lb_Email = new JLabel("Email");
//			lb_Email.setBounds(401,500,69,44);
//			contentPane.add(lb_Email);
			JLabel lb_Check = new JLabel("개인정보 수집 및 이용 동의합니까?");
			lb_Check.setBounds(401,500,350,44);
			contentPane.add(lb_Check);
			// 동의 checkbox
			JCheckBox Check = new JCheckBox("동의", false);
			contentPane.add(Check);
			Check.setBounds(650,500,150,44);
					
			
			// Textfield
			tfID = new JTextField();
			tfID.setBounds(500,201,238,34);
			contentPane.add(tfID);
			tfID.setColumns(10);
			
			tfPasswd = new JTextField();
			tfPasswd.setColumns(10);
			tfPasswd.setBounds(500,251,238,34);
			contentPane.add(tfPasswd);
			
			tfName = new JTextField();
			tfName.setColumns(10);
			tfName.setBounds(500,300,238,34);
			contentPane.add(tfName);
			
			tfBirth = new JTextField();
			tfBirth.setColumns(10);
			tfBirth.setBounds(500,350,238,34);
			contentPane.add(tfBirth);
			
			tfSex = new JTextField();
			tfSex.setColumns(10);
			tfSex.setBounds(500,400,238,34);
			contentPane.add(tfSex);
			
			tfPhone = new JTextField();
			tfPhone.setColumns(10);
			tfPhone.setBounds(500,450,238,34);
			contentPane.add(tfPhone);
			
//			tfEmail = new JTextField();
//			tfEmail.setColumns(10);
//			tfEmail.setBounds(500,500,238,34);
//			contentPane.add(tfEmail);
			
			joinCompletebt = new JButton("회원가입");
			joinCompletebt.setBounds(550, 550, 139, 29);
			contentPane.add(joinCompletebt);
			
			setVisible(true);
			//회원가입완료 액션
			joinCompletebt.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");
					dispose();}

			
		});

	}
}



//			
//			
//			JButton loginbt = new JButton("로그인"); // 로그인 버튼
//			loginbt.setFont(new Font("굴림", Font.PLAIN, 20));
//			loginbt.setBounds(650,500,138,44);
//			contentPane.add(loginbt);
//			JButton joinbt = new JButton("회원가입"); // 회원가입 버튼
//			joinbt.setFont(new Font("굴림", Font.PLAIN, 20));
//			joinbt.setBounds(450 ,500,138,44);
//			contentPane.add(joinbt);
//			
//			JLabel label = new JLabel("회원가입");// 제목
//			//label.setForeground(Color.WHITE);
//	        label.setFont(new Font("굴림", Font.PLAIN, 50));
//	        label.setBounds(489, 142, 491, 80);
//			contentPane.add(label);
//			
//			
//			
//			tfID = new JTextField();
//			tfID.setBounds(600,300,138,44);
//			contentPane.add(tfID);
//			tfID.setColumns(10);
//			
//			tfPasswd = new JTextField();
//			tfPasswd.setColumns(10);
//			tfPasswd.setBounds(600,381,138,44);
//			contentPane.add(tfPasswd);
//			
////			// 배경화면
////			JLabel background = new JLabel(""); //배경화면
////			background.setIcon(new ImageIcon(""));
////			background.setBounds(0, 0, 1262, 673);
////			contentPane.add(background);
//			
//			
//			setVisible(true);
//			
//			// 버튼 위로 올리면, 커서 모양을 손으로 바꿈
//			loginbt.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
//			loginbt.addMouseListener(new MouseAdapter() {
//				@Override
//	            public void mousePressed(MouseEvent e) {
//	                contentPane.removeAll();//모든 컴포넌트를 지움
//	                contentPane.revalidate();
//	                contentPane.repaint();//다시 그려줌
//			
//				}});
//			joinbt.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
//			joinbt.addMouseListener(new MouseAdapter() {
//				@Override
//	            public void mousePressed(MouseEvent e) {
//	                contentPane.removeAll();//모든 컴포넌트를 지움
//	                contentPane.revalidate();
//	                contentPane.repaint();//다시 그려줌
//			
//				}});
//			
////			loginbt.addActionListener(new ActionListener() {
////				
////				@Override
////				public void actionPerformed(ActionEvent e) {
////					JoinPage frame = new JoinPage();
////				}
////			});
////			
//	}}
//
//}
