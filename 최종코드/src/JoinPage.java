// ȸ������ ȭ��

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
         
         setTitle("���۽ó׸� ���� Ű����ũ - ȸ������â");
         
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         setSize(2000,1000);
         //setBounds(100, 100, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
         contentPane = new JPanel(); // ��ư�̳� ���� �� ȭ��
         contentPane.setBorder(new EmptyBorder(5,5,5,5));
         setContentPane(contentPane);
         contentPane.setLayout(null);
         contentPane.setBackground(Color.WHITE);
         
         Font font = new Font("������ �����й��ü", Font.PLAIN, 20);
          Font font2 = new Font("������ �����й��ü", Font.BOLD, 50);
         
         JLabel label = new JLabel("���� �ó׸� - ȸ������");// ����
         //label.setForeground(Color.WHITE);
           label.setFont(font2);
           label.setBounds(380, 102, 591, 80);
           label.setForeground(new Color(18, 50, 181));
         contentPane.add(label);
         
         
         
         // ID, PW, �̸�, �������, ����, ��ȭ��ȣ, �̸���, ���
         JLabel lb_Login = new JLabel("ID");
         lb_Login.setFont(font);
         lb_Login.setBounds(401,241,69,44);
         contentPane.add(lb_Login);
         JLabel lb_Passwd = new JLabel("PW");
         lb_Passwd.setFont(font);
         lb_Passwd.setBounds(401,311,69,44);
         contentPane.add(lb_Passwd);
         JLabel lb_Name = new JLabel("�̸�");
         lb_Name.setFont(font);
         lb_Name.setBounds(401,380,69,44);
         contentPane.add(lb_Name);
         
         JLabel lb_Check = new JLabel("�������� ���� �� �̿� �����մϱ�?");
         lb_Check.setFont(font);
         lb_Check.setBounds(431,480,350,44);
         contentPane.add(lb_Check);
         // ���� checkbox
         JCheckBox Check = new JCheckBox("����", false);
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
         
         
         
         homebt = new JButton("����ȭ��");
         homebt.setFont(font);
         homebt.setBounds(40, 600, 139, 39);
         contentPane.add(homebt);
         
         nextbt = new JButton("����");
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
                         JOptionPane.showMessageDialog(null, "���̵� �Է��� �ּ���.");
                  }else if(tfPasswd.getText().equals("")){
                         JOptionPane.showMessageDialog(null, "��й�ȣ�� �Է��� �ּ���.");
                  }else if(tfName.getText().equals("")){
                         JOptionPane.showMessageDialog(null, "�̸��� �Է��� �ּ���.");
                  }else if(!Check.isSelected()){
                     JOptionPane.showMessageDialog(null, "������� �������ּ���.");
                  }else {
                   // ������ �Է� ��
                   String ID = tfID.getText();
                   String Name = tfName.getText();
                   String Passwd = tfPasswd.getText();
                   
                   ConnectSQL connectsql=new ConnectSQL();
                   int result=connectsql.Signup(ID, Name, Passwd);
                   if(result==1) {
                      JOptionPane.showMessageDialog(null, "ȸ�� ���� ����");
                      // ���� â ����
                      dispose();
                      // �� ������ ����
                      JoinPage2 frame = new JoinPage2(ID);
                   }
                   else if (result==0){
                      JOptionPane.showMessageDialog(null, "ȸ������ ���� : �̹� �����ϴ� ���̵��Դϴ�.");
                   }
                   else if (result==-1){
                      JOptionPane.showMessageDialog(null, "ȸ������ ���� : �ٽ� �õ����ּ���.");
                   }
                  }
                
             }
          });
         homebt.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "������ �ʱ�ȭ�ϰ� ����ȭ������ ���ư��ϴ�.");
               dispose();
               
               }
         });
         /*
         //ȸ�����ԿϷ� �׼�
         joinCompletebt.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "ȸ�������� �Ϸ�Ǿ����ϴ�.");
               dispose();
               }
      
         
      });
*/
   }
}


