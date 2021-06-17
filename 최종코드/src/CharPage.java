import java.awt.*;
import java.awt.event.*;
import javax.swing.*;   
import javax.swing.border.*;


public class CharPage extends JFrame {
      public static JPanel contentPane;
      private JButton joinCompletebt, charbt; 
      String comment;
      
      public CharPage(String tfID, int maxnum) {
         List l1 =new List();
         
         setTitle("눈송 시네마 - 당신의 캐릭터");

         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         setSize(2000,1000);
         contentPane = new JPanel(); 
         contentPane.setBorder(new EmptyBorder(5,5,5,5));
         setContentPane(contentPane);
         contentPane.setLayout(null);

         
         Font font = new Font("엘리스 디지털배움체", Font.PLAIN, 18);
          Font font2 = new Font("엘리스 디지털배움체", Font.BOLD, 50);

         JLabel label = new JLabel("눈송 시네마 - 당신의 캐릭터");// 제목
         label.setFont(font2);
         label.setBounds(350, 72, 1001, 80);
         contentPane.add(label);

         JLabel lb_Char = new JLabel();
         contentPane.add(lb_Char);
         JLabel lb_Char_ment = new JLabel();
         contentPane.add(lb_Char_ment);

         lb_Char_ment.setFont(font);
         lb_Char.setBounds(500, 200, 1001, 380);
         lb_Char_ment.setBounds(470, 170, 350,34);

         joinCompletebt = new JButton("확인");
         joinCompletebt.setFont(font);
         joinCompletebt.setBounds(650, 560, 139, 39);
         contentPane.add(joinCompletebt);
         joinCompletebt.setCursor(new Cursor(Cursor.HAND_CURSOR)); 

         charbt = new JButton("캐릭터 보기");
         charbt.setFont(font);
         charbt.setBounds(470, 560, 150, 39);
         contentPane.add(charbt);
         charbt.setCursor(new Cursor(Cursor.HAND_CURSOR)); 

         setVisible(true);
         
         charbt.addActionListener(new ActionListener(){
              @Override
              public void actionPerformed(ActionEvent e) {
                 if (maxnum == 1 || maxnum ==3 || maxnum==10)
                 {
                    ImageIcon Char1 = new ImageIcon("char1.png");   
                    lb_Char.setIcon(Char1);
                    lb_Char_ment.setText("당신의 캐릭터는 재미를 찾는 레드달걀입니다!" );
                    lb_Char_ment.setFont(font);
                    //connectsql.setcharnum(tfID,1);
                    
                 }
                 else if (maxnum == 2 || maxnum==4 || maxnum==5)
                 {
                    ImageIcon Char2 = new ImageIcon("char6.png");   
                    lb_Char.setIcon(Char2);
                    lb_Char_ment.setText("당신의 캐릭터는 호기심 많은 보라달걀입니다!" );
                    lb_Char_ment.setFont(font);
                    //connectsql.setcharnum(tfID,6);
                    
                 }
                 else if (maxnum == 6)
                 {
                    ImageIcon Char3 = new ImageIcon("char3.png");   
                    lb_Char.setIcon(Char3);
                    lb_Char_ment.setText("당신의 캐릭터는 용감한 노랑달걀 입니다!" );
                    lb_Char_ment.setFont(font);
                    //connectsql.setcharnum(tfID,3);
                    
                 }
                 else if (maxnum == 7)
                 {
                    ImageIcon Char4 = new ImageIcon("char4.png");   
                    lb_Char.setIcon(Char4);
                    lb_Char_ment.setText("당신의 캐릭터는 유쾌한 초록달걀 입니다!" );
                    lb_Char_ment.setFont(font);
                    //connectsql.setcharnum(tfID,4);
                    
                 }
                 else if (maxnum ==11 || maxnum ==12)
                 {
                    ImageIcon Char5 = new ImageIcon("char5.png");
                    lb_Char.setIcon(Char5);
                    lb_Char_ment.setText("당신의 캐릭터는 감수성 풍부한 블루달걀 입니다!" );
                    lb_Char_ment.setFont(font);
                    //connectsql.setcharnum(tfID,5);
                    
                 }
                 else if (maxnum == 8 || maxnum ==9)
                 {
                    ImageIcon Char6 = new ImageIcon("char2.png");
                    lb_Char.setIcon(Char6);
                    lb_Char_ment.setText("당신의 캐릭터는 러블리한 핑크달걀 입니다!" );
                    lb_Char_ment.setFont(font);
                    //connectsql.setcharnum(tfID,2);
                    
                 }
                 
                 
              }
           });

         
         // 회원가입 완료 액션
         joinCompletebt.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");
               
               // 기존 창 삭제
               // 첫화면으로 복귀
               dispose();
               
            }
         });
      }
}