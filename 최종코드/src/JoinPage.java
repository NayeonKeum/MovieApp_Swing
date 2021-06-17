// 회원가입 화면

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;   
import javax.swing.border.*;


public class JoinPage extends JFrame {
      public static JPanel contentPane;
      private JTextField tfID, tfPasswd, tfName, tfBirth, tfSex, tfPhone ;
      private JButton nextbt, homebt;
      
      
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
         contentPane.setBackground(Color.WHITE);
         
         Font font = new Font("엘리스 디지털배움체", Font.PLAIN, 20);
          Font font2 = new Font("엘리스 디지털배움체", Font.BOLD, 50);
         
         JLabel label = new JLabel("눈송 시네마 - 회원가입");// 제목
         //label.setForeground(Color.WHITE);
           label.setFont(font2);
           label.setBounds(380, 102, 591, 80);
           label.setForeground(new Color(18, 50, 181));
         contentPane.add(label);
         
         
         
         // ID, PW, 이름, 생년월일, 성별, 전화번호, 이메일, 약관
         JLabel lb_Login = new JLabel("ID");
         lb_Login.setFont(font);
         lb_Login.setBounds(401,241,69,44);
         contentPane.add(lb_Login);
         JLabel lb_Passwd = new JLabel("PW");
         lb_Passwd.setFont(font);
         lb_Passwd.setBounds(401,311,69,44);
         contentPane.add(lb_Passwd);
         JLabel lb_Name = new JLabel("이름");
         lb_Name.setFont(font);
         lb_Name.setBounds(401,380,69,44);
         contentPane.add(lb_Name);
         
         JLabel lb_Check = new JLabel("개인정보 수집 및 이용 동의합니까?");
         lb_Check.setFont(font);
         lb_Check.setBounds(431,480,350,44);
         contentPane.add(lb_Check);
         // 동의 checkbox
         JCheckBox Check = new JCheckBox("동의", false);
         Check.setFont(font);
         contentPane.add(Check);
         Check.setBounds(720,480,150,44);
         Check.setBackground(Color.WHITE);

               
         
         // Textfield
         tfID = new JTextField();
         tfID.setBounds(500,241,320,34);
         tfID.setFont(font);
         contentPane.add(tfID);
         tfID.setColumns(10);
//         String ID;
//         ID = tfID.getText();
         
         tfPasswd = new JTextField();
         tfPasswd.setColumns(10);
         tfPasswd.setFont(font);
         tfPasswd.setBounds(500,311,320,34);
         contentPane.add(tfPasswd);
         
         tfName = new JTextField();
         tfName.setColumns(10);
         tfName.setFont(font);
         tfName.setBounds(500,380,320,34);
         contentPane.add(tfName);
         
         
         
         homebt = new JButton("시작화면");
         homebt.setFont(font);
         homebt.setBounds(40, 600, 139, 39);
         contentPane.add(homebt);
         
         nextbt = new JButton("다음");
         nextbt.setFont(font);
         nextbt.setBounds(1100, 600, 139, 39);
         contentPane.add(nextbt);
         
         homebt.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
         nextbt.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
         
         setVisible(true);
         nextbt.addActionListener(new ActionListener() {
             
             @Override
             public void actionPerformed(ActionEvent e) {
                if(tfID.getText().equals("")){
                         JOptionPane.showMessageDialog(null, "아이디를 입력해 주세요.");
                  }else if(tfPasswd.getText().equals("")){
                         JOptionPane.showMessageDialog(null, "비밀번호를 입력해 주세요.");
                  }else if(tfName.getText().equals("")){
                         JOptionPane.showMessageDialog(null, "이름을 입력해 주세요.");
                  }else if(!Check.isSelected()){
                     JOptionPane.showMessageDialog(null, "사용약관을 동의해주세요.");
                  }else {
                   // 데이터 입력 후
                   String ID = tfID.getText();
                   String Name = tfName.getText();
                   String Passwd = tfPasswd.getText();
                   
                   ConnectSQL connectsql=new ConnectSQL();
                   int result=connectsql.Signup(ID, Name, Passwd);
                   if(result==1) {
                      JOptionPane.showMessageDialog(null, "회원 가입 성공");
                      // 기존 창 삭제
                      dispose();
                      // 새 페이지 열기
                      JoinPage2 frame = new JoinPage2(ID);
                   }
                   else if (result==0){
                      JOptionPane.showMessageDialog(null, "회원가입 실패 : 이미 존재하는 아이디입니다.");
                   }
                   else if (result==-1){
                      JOptionPane.showMessageDialog(null, "회원가입 실패 : 다시 시도해주세요.");
                   }
                  }
                
             }
          });
         homebt.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "내용을 초기화하고 시작화면으로 돌아갑니다.");
               dispose();
               
               }
         });
         /*
         //회원가입완료 액션
         joinCompletebt.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");
               dispose();
               }
      
         
      });
*/
   }
}


