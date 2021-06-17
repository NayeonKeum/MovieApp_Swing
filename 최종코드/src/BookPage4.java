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
		
		
		setTitle("눈송 시네마 - 결제창");

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(2000,1000);
		contentPane = new JPanel(); 
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.WHITE);
		
		Font font = new Font("엘리스 디지털배움체", Font.PLAIN, 20);
	    Font font2 = new Font("엘리스 디지털배움체", Font.BOLD, 50);


	    JLabel label = new JLabel("눈송 시네마 - 결제창");// 제목
		label.setFont(font2);
		label.setBounds(400, 72, 1001, 80);
		label.setForeground(new Color(18, 50, 181));
		contentPane.add(label);
		
		JLabel lb_mv = new JLabel("영화 제목: " +title);
		lb_mv.setFont(font);
		lb_mv.setBounds(150, 172, 500, 30);
		contentPane.add(lb_mv);
		
		JLabel lb_loc = new JLabel("극장: "+place);
		lb_loc.setFont(font);
		lb_loc.setBounds(500, 172, 500, 30);
		contentPane.add(lb_loc);
		
		dateTime = date+ " "+ time;
		JLabel lb_time = new JLabel("상영 날짜: "+ date);
		lb_time.setFont(font);
		lb_time.setBounds(150, 232, 400, 30);
		contentPane.add(lb_time);
		
		JLabel lb_date = new JLabel("시작 시간: "+time);
		lb_date.setFont(font);
		lb_date.setBounds(500, 230, 300, 30);
		contentPane.add(lb_date);
		
		JLabel lb_st = new JLabel("선택 좌석: "+msg);
		lb_st.setFont(font);
		lb_st.setBounds(150, 292, 500, 30);
		contentPane.add(lb_st);
		
		JLabel lb_pr = new JLabel("총 결제 금액: "+price+"원");
		lb_pr.setFont(font);
		lb_pr.setBounds(150, 352, 300, 30);
		contentPane.add(lb_pr);
		
		JLabel lb_pay = new JLabel("결제 수단");
		lb_pay.setFont(font);
		lb_pay.setBounds(150, 412, 100, 30);
		contentPane.add(lb_pay);
		
		// 라디오 버튼 생성
        JRadioButton pay_1 = new JRadioButton("신용카드");
        JRadioButton pay_2 = new JRadioButton("현금");
        JRadioButton pay_3 = new JRadioButton("삼성페이");
        JRadioButton pay_4 = new JRadioButton("카카오페이");
        JRadioButton pay_5 = new JRadioButton("제로페이");
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
        
        // 라디오 버튼을 그룹화 하기위한 객체 생성
        ButtonGroup groupPay1 = new ButtonGroup();
        // 그룹에 라디오 버튼 포함시킨다.
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
        
        JLabel lb_Check = new JLabel("위 내용을 확인하였으며 결제에 동의합니다.");
		lb_Check.setBounds(431,500,350,44);
		lb_Check.setFont(font);
		contentPane.add(lb_Check);
		// 동의 checkbox
		JCheckBox Check = new JCheckBox("동의", false);
		Check.setFont(font);
		contentPane.add(Check);
		Check.setBounds(570,540,150,44);
		Check.setBackground(Color.WHITE);
				
        
        
		backbt = new JButton("이전화면");
  		backbt.setBounds(40, 600, 139, 39);
  		backbt.setFont(font);
		backbt.setBackground(new Color(18, 50, 181));
		backbt.setForeground(Color.WHITE);
  		contentPane.add(backbt);
  		
  		nextbt = new JButton("결제");
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
      				JOptionPane.showMessageDialog(null, "내용을 초기화하고 이전화면으로 돌아갑니다.");
      				dispose();
      				BookPage3 bp = new BookPage3(tfID, title, date, place, time);
      				
      				}
      		});
      		
      	// pay값 가져오기 위한 코드
            pay_1.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  pay = "신용카드";
               }
            });
            pay_2.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  pay = "현금";
               }
            });
            pay_3.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  pay = "삼성페이";
               }
            });
            pay_4.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  pay = "카카오페이";
               }
            });
            pay_5.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  pay = "제로페이";
               }
            });
            
      				nextbt.addActionListener(new ActionListener() {
      					
      				
      					public void actionPerformed(ActionEvent e) {
      		               // 예매 정보 insert
      		                  ConnectSQL connectsql = new ConnectSQL();
      		                  int result = connectsql.insertMovie(tfID,title,dateTime,place,msg,price,pay);
      		                if(!Check.isSelected()){
      		                     JOptionPane.showMessageDialog(null, "사용약관을 동의해주세요.");}
      		                
      		                else if (result == 1) {
      		                     JOptionPane.showMessageDialog(null, "결제가 완료되었습니다. 메인화면으로 이동합니다.");
      		                    // 첫화면으로 복귀
      		                     MainPage frame = new MainPage(tfID);
      		                     dispose();
      		               
      		                }
      		                else if (result == 0) {
      		                     JOptionPane.showMessageDialog(null, "결제에 실패했습니다. 다시 시도해주세요.");
      		                  }
      		               }
      		            });
      				
        
		setVisible(true);
	}
}
