
//����ȭ��
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
	
	
	public Start() {
		List l1 =new List();
		
		setTitle("���۽ó׸� ���� Ű����ũ");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(2000,1000);
		//setBounds(100, 100, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		contentPane = new JPanel(); // ��ư�̳� ���� �� ȭ��
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton loginbt = new JButton("�α���"); // �α��� ��ư
		loginbt.setFont(new Font("����", Font.PLAIN, 20));
		loginbt.setBounds(650,500,138,44);
		contentPane.add(loginbt);
		JButton joinbt = new JButton("ȸ������"); // ȸ������ ��ư
		joinbt.setFont(new Font("����", Font.PLAIN, 20));
		joinbt.setBounds(450 ,500,138,44);
		contentPane.add(joinbt);
		
		JLabel label = new JLabel("���� �ó׸�");// ����
		//label.setForeground(Color.WHITE);
        label.setFont(new Font("����", Font.PLAIN, 50));
        label.setBounds(489, 142, 491, 80);
		contentPane.add(label);
		
		JLabel lb_Login = new JLabel("ID");
		lb_Login.setBounds(451,300,69,44);
		//lb_Login.setFont(new Font("����", Font.PLAIN, 30));
		contentPane.add(lb_Login);
		JLabel lb_Passwd = new JLabel("PW");
		lb_Passwd.setBounds(451,381,69,44);
		contentPane.add(lb_Passwd);
		
		tfID = new JTextField();
		tfID.setBounds(550,300,238,34);
		contentPane.add(tfID);
		tfID.setColumns(10); // �ִ� �Է°���
		
		tfPasswd = new JTextField();
		tfPasswd.setColumns(10);
		tfPasswd.setBounds(550,381,238,34);
		contentPane.add(tfPasswd);
		
//		// ���ȭ��
//		JLabel background = new JLabel(""); //���ȭ��
//		background.setIcon(new ImageIcon(""));
//		background.setBounds(0, 0, 1262, 673);
//		contentPane.add(background);
		
		
		setVisible(true);
		
		// ��ư ���� �ø���, Ŀ�� ����� ������ �ٲ�
		loginbt.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
		loginbt.addMouseListener(new MouseAdapter() {
			@Override
            public void mousePressed(MouseEvent e) {
                contentPane.removeAll();//��� ������Ʈ�� ����
                contentPane.revalidate();
                contentPane.repaint();//�ٽ� �׷���
		
			}});
		joinbt.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
//		joinbt.addMouseListener(new MouseAdapter() {
//			@Override
//            public void mousePressed(MouseEvent e) {
//                contentPane.removeAll();//��� ������Ʈ�� ����
//                contentPane.revalidate();
//               contentPane.repaint();//�ٽ� �׷���
//		
//			}});
		
		joinbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JoinPage frame = new JoinPage();
			}
		});
		
}}
