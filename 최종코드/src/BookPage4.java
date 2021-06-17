import java.awt.*;
import java.awt.event.*;
import javax.swing.*;	
import javax.swing.border.*;

public class BookPage4 extends JFrame {
	public static JPanel contentPane;
	JButton nextbt, backbt;
	String dateTime, pay;

	public BookPage4(String tfID, String title, String date, String place, String time, String msg, int price){
		List l1 =new List();
		
		
		setTitle("���� �ó׸� - ����â");

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(2000,1000);
		contentPane = new JPanel(); 
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.WHITE);
		
		Font font = new Font("������ �����й��ü", Font.PLAIN, 20);
	    Font font2 = new Font("������ �����й��ü", Font.BOLD, 50);


	    JLabel label = new JLabel("���� �ó׸� - ����â");// ����
		label.setFont(font2);
		label.setBounds(400, 72, 1001, 80);
		label.setForeground(new Color(18, 50, 181));
		contentPane.add(label);
		
		JLabel lb_mv = new JLabel("��ȭ ����: " +title);
		lb_mv.setFont(font);
		lb_mv.setBounds(150, 172, 500, 30);
		contentPane.add(lb_mv);
		
		JLabel lb_loc = new JLabel("����: "+place);
		lb_loc.setFont(font);
		lb_loc.setBounds(500, 172, 500, 30);
		contentPane.add(lb_loc);
		
		dateTime = date+ " "+ time;
		JLabel lb_time = new JLabel("�� ��¥: "+ date);
		lb_time.setFont(font);
		lb_time.setBounds(150, 232, 400, 30);
		contentPane.add(lb_time);
		
		JLabel lb_date = new JLabel("���� �ð�: "+time);
		lb_date.setFont(font);
		lb_date.setBounds(500, 230, 300, 30);
		contentPane.add(lb_date);
		
		JLabel lb_st = new JLabel("���� �¼�: "+msg);
		lb_st.setFont(font);
		lb_st.setBounds(150, 292, 500, 30);
		contentPane.add(lb_st);
		
		JLabel lb_pr = new JLabel("�� ���� �ݾ�: "+price+"��");
		lb_pr.setFont(font);
		lb_pr.setBounds(150, 352, 300, 30);
		contentPane.add(lb_pr);
		
		JLabel lb_pay = new JLabel("���� ����");
		lb_pay.setFont(font);
		lb_pay.setBounds(150, 412, 100, 30);
		contentPane.add(lb_pay);
		
		// ���� ��ư ����
        JRadioButton pay_1 = new JRadioButton("�ſ�ī��");
        JRadioButton pay_2 = new JRadioButton("����");
        JRadioButton pay_3 = new JRadioButton("�Ｚ����");
        JRadioButton pay_4 = new JRadioButton("īī������");
        JRadioButton pay_5 = new JRadioButton("��������");
        pay_1.setBounds(150,450,200,40);
        pay_2.setBounds(350,450,200,40);
        pay_3.setBounds(550,450,200,40);
        pay_4.setBounds(750,450,200,40);
        pay_5.setBounds(950,450,200,40);
        
        pay_1.setFont(font);
        pay_2.setFont(font);
        pay_3.setFont(font);
        pay_4.setFont(font);
        pay_5.setFont(font);

		pay_1.setBackground(Color.WHITE);
        pay_2.setBackground(Color.WHITE);
        pay_3.setBackground(Color.WHITE);
        pay_4.setBackground(Color.WHITE);
        pay_5.setBackground(Color.WHITE);
        
        // ���� ��ư�� �׷�ȭ �ϱ����� ��ü ����
        ButtonGroup groupPay1 = new ButtonGroup();
        // �׷쿡 ���� ��ư ���Խ�Ų��.
        groupPay1.add(pay_1);
        groupPay1.add(pay_2);
        groupPay1.add(pay_3);  
        groupPay1.add(pay_4);
        groupPay1.add(pay_5);
        
        this.add(pay_1);
        this.add(pay_2);
        this.add(pay_3);
        this.add(pay_4);
        this.add(pay_5);
        
        JLabel lb_Check = new JLabel("�� ������ Ȯ���Ͽ����� ������ �����մϴ�.");
		lb_Check.setBounds(431,500,350,44);
		lb_Check.setFont(font);
		contentPane.add(lb_Check);
		// ���� checkbox
		JCheckBox Check = new JCheckBox("����", false);
		Check.setFont(font);
		contentPane.add(Check);
		Check.setBounds(570,540,150,44);
		Check.setBackground(Color.WHITE);
				
        
        
		backbt = new JButton("����ȭ��");
  		backbt.setBounds(40, 600, 139, 39);
  		backbt.setFont(font);
		backbt.setBackground(new Color(18, 50, 181));
		backbt.setForeground(Color.WHITE);
  		contentPane.add(backbt);
  		
  		nextbt = new JButton("����");
  		nextbt.setFont(font);
  		nextbt.setBounds(1100, 600, 139, 39);
		nextbt.setBackground(new Color(18, 50, 181));
		nextbt.setForeground(Color.WHITE);
  		contentPane.add(nextbt);

      		backbt.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
      		nextbt.setCursor(new Cursor(Cursor.HAND_CURSOR));
      		
      		
      		backbt.addActionListener(new ActionListener() {
      			
      			@Override
      			public void actionPerformed(ActionEvent e) {
      				JOptionPane.showMessageDialog(null, "������ �ʱ�ȭ�ϰ� ����ȭ������ ���ư��ϴ�.");
      				dispose();
      				BookPage3 bp = new BookPage3(tfID, title, date, place, time);
      				
      				}
      		});
      		
      	// pay�� �������� ���� �ڵ�
            pay_1.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  pay = "�ſ�ī��";
               }
            });
            pay_2.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  pay = "����";
               }
            });
            pay_3.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  pay = "�Ｚ����";
               }
            });
            pay_4.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  pay = "īī������";
               }
            });
            pay_5.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  pay = "��������";
               }
            });
            
      				nextbt.addActionListener(new ActionListener() {
      					
      				
      					public void actionPerformed(ActionEvent e) {
      		               // ���� ���� insert
      		                  ConnectSQL connectsql = new ConnectSQL();
      		                  int result = connectsql.insertMovie(tfID,title,dateTime,place,msg,price,pay);
      		                if(!Check.isSelected()){
      		                     JOptionPane.showMessageDialog(null, "������� �������ּ���.");}
      		                
      		                else if (result == 1) {
      		                     JOptionPane.showMessageDialog(null, "������ �Ϸ�Ǿ����ϴ�. ����ȭ������ �̵��մϴ�.");
      		                    // ùȭ������ ����
      		                     MainPage frame = new MainPage(tfID);
      		                     dispose();
      		               
      		                }
      		                else if (result == 0) {
      		                     JOptionPane.showMessageDialog(null, "������ �����߽��ϴ�. �ٽ� �õ����ּ���.");
      		                  }
      		               }
      		            });
      				
        
		setVisible(true);
	}
}
