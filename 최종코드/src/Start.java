//시작화면
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

//import Movie.JoinFrame;

interface Theater{
	public void buyticket();
}

public class Start extends JFrame {
	public static JPanel contentPane;
	private JTextField tfID, tfPasswd;
	private JButton loginbt, joinbt;
	public String ID, Name, Passwd;
	String tfID_s; 
	
	public Start() {
		List l1 =new List();
		
		setTitle("눈송시네마 예매 키오스크");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(2000,1000);
		//setBounds(100, 100, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		contentPane = new JPanel(); // 버튼이나 라벨이 들어갈 화면
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.WHITE);
		
		Font font = new Font("엘리스 디지털배움체", Font.PLAIN, 20);
		Font font2 = new Font("엘리스 디지털배움체", Font.BOLD, 50);

		
		JButton loginbt = new JButton("로그인"); // 로그인 버튼
		loginbt.setFont(font);
		loginbt.setBounds(650,500,138,44);
		loginbt.setBackground(new Color(18, 50, 181));
        loginbt.setForeground(Color.WHITE);
		contentPane.add(loginbt);

		JButton joinbt = new JButton("회원가입"); // 회원가입 버튼
		joinbt.setFont(font);
		joinbt.setBounds(450 ,500,138,44);
		joinbt.setBackground(new Color(18, 50, 181));
        joinbt.setForeground(Color.WHITE);
		contentPane.add(joinbt);
		
		JLabel label = new JLabel("눈송 시네마");// 제목
		//label.setForeground(Color.WHITE);
		
		label.setFont(font2);
        //label.setFont(new Font("굴림", Font.PLAIN, 50));
        label.setBounds(510, 142, 491, 80);
		label.setForeground(new Color(18, 50, 181));
		contentPane.add(label);
		
		JLabel lb_Login = new JLabel("ID");
		lb_Login.setBounds(451,295,69,44);
		lb_Login.setFont(font);
		//lb_Login.setFont(new Font("굴림", Font.PLAIN, 30));
		lb_Login.setForeground(new Color(18, 50, 181));
		contentPane.add(lb_Login);

		JLabel lb_Passwd = new JLabel("PW");
		lb_Passwd.setFont(font);
		lb_Passwd.setBounds(451,375,100,44);
		lb_Passwd.setForeground(new Color(18, 50, 181));
		contentPane.add(lb_Passwd);
		
		//
		tfID = new JTextField();
		tfID.setBounds(550,300,238,34);
		contentPane.add(tfID);
		tfID.setColumns(10); // 최대 입력개수
		
		tfPasswd = new JTextField();
		tfPasswd.setColumns(10);
		tfPasswd.setBounds(550,381,238,34);
		contentPane.add(tfPasswd);
		
/*		// 배경화면
		JLabel background = new JLabel(""); //배경화면
		background.setIcon(new ImageIcon(""));
		background.setBounds(0, 0, 1262, 673);
		contentPane.add(background);
*/		
		
		setVisible(true);
		
		// 버튼 위로 올리면, 커서 모양을 손으로 바꿈
		loginbt.setCursor(new Cursor(Cursor.HAND_CURSOR)); 

		loginbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ID=tfID.getText();
				Passwd=tfPasswd.getText();
				
				ConnectSQL connectsql=new ConnectSQL();
				int result = connectsql.login(ID, Passwd);
				if(result==1) {
					JOptionPane.showMessageDialog(null, "로그인 성공");
					dispose();
					tfID_s = tfID.getText();
					MainPage frame = new MainPage(tfID_s);
					
					
				}
				else if (result==0){
					JOptionPane.showMessageDialog(null, "로그인 실패 : 비밀번호가 맞지 않습니다.");
				}
				else if (result==-1){
					JOptionPane.showMessageDialog(null, "로그인 실패 : 존재하지 않는 아이디입니다.");
				}
				else if (result==-2){
					JOptionPane.showMessageDialog(null, "로그인 실패 : 문제가 생겼습니다. 다시 확인해주세요.");
				}
			}
		});

/*
		loginbt.addMouseListener(new MouseAdapter() {
			@Override
            public void mousePressed(MouseEvent e) {
                contentPane.removeAll();//모든 컴포넌트를 지움
                contentPane.revalidate();
                contentPane.repaint();//다시 그려줌
		
			}});
*/
		joinbt.setCursor(new Cursor(Cursor.HAND_CURSOR)); 

/*		joinbt.addMouseListener(new MouseAdapter() {
			@Override
            public void mousePressed(MouseEvent e) {
                contentPane.removeAll();//모든 컴포넌트를 지움
                contentPane.revalidate();
               contentPane.repaint();//다시 그려줌
		
			}});
*/		


		joinbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JoinPage frame = new JoinPage();
			}
		});
		
}}




