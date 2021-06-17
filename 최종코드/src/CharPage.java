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
         
         setTitle("���� �ó׸� - ����� ĳ����");

         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         setSize(2000,1000);
         contentPane = new JPanel(); 
         contentPane.setBorder(new EmptyBorder(5,5,5,5));
         setContentPane(contentPane);
         contentPane.setLayout(null);

         
         Font font = new Font("������ �����й��ü", Font.PLAIN, 18);
          Font font2 = new Font("������ �����й��ü", Font.BOLD, 50);

         JLabel label = new JLabel("���� �ó׸� - ����� ĳ����");// ����
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

         joinCompletebt = new JButton("Ȯ��");
         joinCompletebt.setFont(font);
         joinCompletebt.setBounds(650, 560, 139, 39);
         contentPane.add(joinCompletebt);
         joinCompletebt.setCursor(new Cursor(Cursor.HAND_CURSOR)); 

         charbt = new JButton("ĳ���� ����");
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
                    lb_Char_ment.setText("����� ĳ���ʹ� ��̸� ã�� ����ް��Դϴ�!" );
                    lb_Char_ment.setFont(font);
                    //connectsql.setcharnum(tfID,1);
                    
                 }
                 else if (maxnum == 2 || maxnum==4 || maxnum==5)
                 {
                    ImageIcon Char2 = new ImageIcon("char6.png");   
                    lb_Char.setIcon(Char2);
                    lb_Char_ment.setText("����� ĳ���ʹ� ȣ��� ���� ����ް��Դϴ�!" );
                    lb_Char_ment.setFont(font);
                    //connectsql.setcharnum(tfID,6);
                    
                 }
                 else if (maxnum == 6)
                 {
                    ImageIcon Char3 = new ImageIcon("char3.png");   
                    lb_Char.setIcon(Char3);
                    lb_Char_ment.setText("����� ĳ���ʹ� �밨�� ����ް� �Դϴ�!" );
                    lb_Char_ment.setFont(font);
                    //connectsql.setcharnum(tfID,3);
                    
                 }
                 else if (maxnum == 7)
                 {
                    ImageIcon Char4 = new ImageIcon("char4.png");   
                    lb_Char.setIcon(Char4);
                    lb_Char_ment.setText("����� ĳ���ʹ� ������ �ʷϴް� �Դϴ�!" );
                    lb_Char_ment.setFont(font);
                    //connectsql.setcharnum(tfID,4);
                    
                 }
                 else if (maxnum ==11 || maxnum ==12)
                 {
                    ImageIcon Char5 = new ImageIcon("char5.png");
                    lb_Char.setIcon(Char5);
                    lb_Char_ment.setText("����� ĳ���ʹ� ������ ǳ���� ���ް� �Դϴ�!" );
                    lb_Char_ment.setFont(font);
                    //connectsql.setcharnum(tfID,5);
                    
                 }
                 else if (maxnum == 8 || maxnum ==9)
                 {
                    ImageIcon Char6 = new ImageIcon("char2.png");
                    lb_Char.setIcon(Char6);
                    lb_Char_ment.setText("����� ĳ���ʹ� ������ ��ũ�ް� �Դϴ�!" );
                    lb_Char_ment.setFont(font);
                    //connectsql.setcharnum(tfID,2);
                    
                 }
                 
                 
              }
           });

         
         // ȸ������ �Ϸ� �׼�
         joinCompletebt.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "ȸ�������� �Ϸ�Ǿ����ϴ�.");
               
               // ���� â ����
               // ùȭ������ ����
               dispose();
               
            }
         });
      }
}