// ȸ������ �ι� ° ȭ��

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;   
import javax.swing.border.*;
import java.util.Enumeration;
import java.util.Arrays;


public class JoinPage2 extends JFrame {
      public static JPanel contentPane;
      //private JTextField tfID, tfPasswd, tfName, tfBirth, tfSex, tfPhone ;
      private JButton nextbt, homebt; // homebt:�Է� �ʱ�ȭ, ����ȭ������
      public int count0 =0, count_1=0, count_2=0, count_3=0, count_4=0, count_5=0, count_6=0, 
            count_7=0, count_8=0, count_9=0, count_10=0, count_11=0,count_12=0, maxnum;
      int[] arr = new int[13];

      
      public JoinPage2(String tfID) {
         List l1 =new List();
         
         setTitle("���۽ó׸� ���� Ű����ũ - ����� ��ȭ���� �м�");
         
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         setSize(2000,1000);
         //setBounds(100, 100, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
         contentPane = new JPanel(); // ��ư�̳� ���� �� ȭ��
         contentPane.setBorder(new EmptyBorder(5,5,5,5));
         setContentPane(contentPane);
         contentPane.setLayout(null);
         contentPane.setBackground(Color.WHITE);
         
         Font font = new Font("������ �����й��ü", Font.PLAIN, 13);
         Font font3 = new Font("������ �����й��ü", Font.BOLD, 13);
          Font font2 = new Font("������ �����й��ü", Font.BOLD, 30);
          Font font4 = new Font("������ �����й��ü", Font.PLAIN, 20);
         
         JLabel label = new JLabel("���� �ó׸� - ��ȭ ���� �м�");// ����
         //label.setForeground(Color.WHITE);
           label.setFont(font2);
           label.setBounds(450, 42, 1591, 80);
           label.setForeground(new Color(18, 50, 181));
         contentPane.add(label);
         
         
         JLabel lb_q0 = new JLabel("�� ĳ���� �ο��� ���� �����Դϴ�. ���� �� �ϳ��� ������.");
         lb_q0.setBounds(80,121,1269,34);
         lb_q0.setFont(font3);
         contentPane.add(lb_q0);
         JLabel lb_q1 = new JLabel("Q1. ���� ��ȣ�ϴ� ���� �ϳ��� ������.");
         lb_q1.setBounds(80,151,1269,34);
         lb_q1.setFont(font3);
         contentPane.add(lb_q1);
         JLabel lb_q2 = new JLabel("Q2. ���� ��ȣ�ϴ� ��ȭ ������?");
         lb_q2.setBounds(80,201,369,34);
         lb_q2.setFont(font3);
         contentPane.add(lb_q2);
         JLabel lb_q3 = new JLabel("Q3. ������ ��� �����ι���");
         lb_q3.setFont(font3);
         lb_q3.setBounds(80,250,369,34);
         contentPane.add(lb_q3);
         JLabel lb_q4 = new JLabel("Q4. ���� �̷� ��ȭ�� ����.");
         lb_q4.setFont(font3);
         lb_q4.setBounds(80,300,369,34);
         contentPane.add(lb_q4);
         JLabel lb_q5 = new JLabel("Q5. ���� �ٶ�� ������?");
         lb_q5.setFont(font3);
         lb_q5.setBounds(80,350,369,34);
         contentPane.add(lb_q5);
         JLabel lb_q6 = new JLabel("Q6. ����");
         lb_q6.setFont(font3);
         lb_q6.setBounds(80,400,369,34);
         contentPane.add(lb_q6);
         JLabel lb_q7 = new JLabel("Q7. �� �� ��ȣ�ϴ� �帣��?");
         lb_q7.setFont(font3);
         lb_q7.setBounds(80,450,369,34);
         contentPane.add(lb_q7);
         JLabel lb_q8 = new JLabel("Q8. �� �� ��ȣ�ϴ� �帣��?");
         lb_q8.setFont(font3);
         lb_q8.setBounds(80,500,369,34);
         contentPane.add(lb_q8);

         // ����
         // ���� ��ư ����
            JRadioButton q1_1 = new JRadioButton("�ش���/������ ���������� ������ �ḻ�� ��ȭ");
            JRadioButton q1_2 = new JRadioButton("���� �ḻ������ ����ִ� ��ȭ");
            JRadioButton q1_3 = new JRadioButton("��Ȥ������ �������� ��ȭ");
            JRadioButton q1_4 = new JRadioButton("���������̶� ������ �پ ��ȭ");
            JRadioButton q1_5 = new JRadioButton("������ �޾���� ���� �������� ��ȭ");
            q1_1.setFont(font);
            q1_2.setFont(font);
            q1_3.setFont(font);
            q1_4.setFont(font);
            q1_5.setFont(font);
            
            q1_1.setBounds(80,175,290,34);
            q1_2.setBounds(370,175,200,34);
            q1_3.setBounds(570,175,180,34);
            q1_4.setBounds(750,175,250,34);
            q1_5.setBounds(1000,175,250,34);
            // ���� ��ư�� �׷�ȭ �ϱ����� ��ü ����
            ButtonGroup groupQ1 = new ButtonGroup();
            // �׷쿡 ���� ��ư ���Խ�Ų��.
            groupQ1.add(q1_1);
            groupQ1.add(q1_2);
            groupQ1.add(q1_3);  
            groupQ1.add(q1_4);
            groupQ1.add(q1_5);
            
            this.add(q1_1);
            this.add(q1_2);
            this.add(q1_3);
            this.add(q1_4);
            this.add(q1_5);

         
      //System.out.println(count9);

// 2�� ����
            JRadioButton q2_1 = new JRadioButton("��ȭ�� ����� �Ȱ��� ����Ǹ� ¥������.");
            JRadioButton q2_2 = new JRadioButton("��ȭ�� ����� ����ϰ� ����Ǿ ũ�� ����ġ �ʴ´�.");
            q2_1.setBounds(80,225,290,34);
            q2_2.setBounds(370,225,400,34);
            
            q2_1.setFont(font);
            q2_2.setFont(font);
            
            // ���� ��ư�� �׷�ȭ �ϱ����� ��ü ����
            ButtonGroup groupQ2 = new ButtonGroup();
            // �׷쿡 ���� ��ư ���Խ�Ų��.
            groupQ2.add(q2_1);
            groupQ2.add(q2_2);
            
            this.add(q2_1);
            this.add(q2_2);
            
            
// 3�� ����
            JRadioButton q3_1 = new JRadioButton("���Ǽ��� ���� �׾ �������.");
            JRadioButton q3_2 = new JRadioButton("������ ���� �̾߱⸦ ��ġ�� ���� ����.");
            q3_1.setBounds(80,275,290,34);
            q3_2.setBounds(370,275,400,34);
            
            q3_1.setFont(font);
            q3_2.setFont(font);
            // ���� ��ư�� �׷�ȭ �ϱ����� ��ü ����
            ButtonGroup groupQ3 = new ButtonGroup();
            // �׷쿡 ���� ��ư ���Խ�Ų��.
            groupQ3.add(q3_1);
            groupQ3.add(q3_2);
            
            this.add(q3_1);
            this.add(q3_2);
            

// 4�� ����
            JRadioButton q4_1 = new JRadioButton("�������̰� ������ ���� ��ȭ�� ����.");
            JRadioButton q4_2 = new JRadioButton("������ ���� ���� ��ȭ���ٴ� �޸��� ����� ��ȭ�� ����.");
            q4_1.setBounds(80,325,290,34);
            q4_2.setBounds(370,325,400,34);
            
            q4_1.setFont(font);
            q4_2.setFont(font);
            // ���� ��ư�� �׷�ȭ �ϱ����� ��ü ����
            ButtonGroup groupQ4 = new ButtonGroup();
            // �׷쿡 ���� ��ư ���Խ�Ų��.
            groupQ4.add(q4_1);
            groupQ4.add(q4_2);
            
            this.add(q4_1);
            this.add(q4_2);
            
    
// 5�� ����
            JRadioButton q5_1 = new JRadioButton("���ǿ����� ����.");
            JRadioButton q5_2 = new JRadioButton("��ȭ�� �ϼ����� ���� ���忣���̾ ������.");
            q5_1.setBounds(80,375,290,34);
            q5_2.setBounds(370,375,400,34);
            
            q5_1.setFont(font);
            q5_2.setFont(font);
            // ���� ��ư�� �׷�ȭ �ϱ����� ��ü ����
            ButtonGroup groupQ5 = new ButtonGroup();
            // �׷쿡 ���� ��ư ���Խ�Ų��.
            groupQ5.add(q5_1);
            groupQ5.add(q5_2);
            
            this.add(q5_1);
            this.add(q5_2);
            
         
            
// 6�� ����
            JRadioButton q6_1 = new JRadioButton("�����ϴ��� �� ¥���� ��ȭ�� ����.");
            JRadioButton q6_2 = new JRadioButton("�����Ӱ� ��̷ο� â������ ��ȭ�� ����.");
            q6_1.setBounds(80,425,290,34);
            q6_2.setBounds(370,425,400,34);
            
            q6_1.setFont(font);
            q6_2.setFont(font);
            // ���� ��ư�� �׷�ȭ �ϱ����� ��ü ����
            ButtonGroup groupQ6 = new ButtonGroup();
            // �׷쿡 ���� ��ư ���Խ�Ų��.
            groupQ6.add(q6_1);
            groupQ6.add(q6_2);
            
            this.add(q6_1);
            this.add(q6_2);
         
            
// 7�� ����  
            JRadioButton q7_1 = new JRadioButton("��Ÿ�� �θǽ� ������� ��ȭ.");
            JRadioButton q7_2 = new JRadioButton("��ȭ ������� ��ť���͸� ��ȭ");
            JRadioButton q7_3 = new JRadioButton("�̽��͸� �׼� ����");
            q7_1.setBounds(80,475,290,34);
            q7_2.setBounds(370,475,200,34);
            q7_3.setBounds(750,475,400,34);
            
            q7_1.setFont(font);
            q7_2.setFont(font);
            q7_3.setFont(font);
            
            // ���� ��ư�� �׷�ȭ �ϱ����� ��ü ����
            ButtonGroup groupQ7 = new ButtonGroup();
            // �׷쿡 ���� ��ư ���Խ�Ų��.
            groupQ7.add(q7_1);
            groupQ7.add(q7_2);
            groupQ7.add(q7_3);
            
            this.add(q7_1);
            this.add(q7_2);
            this.add(q7_3);
            
           
// 8�� ����
            JRadioButton q8_1 = new JRadioButton("�θǽ� �׼�");
            JRadioButton q8_2 = new JRadioButton("���� ��Ÿ��");
            JRadioButton q8_3 = new JRadioButton("���� �ڹ̵�");
            JRadioButton q8_4 = new JRadioButton("�߸� Ž�� �̽��͸� ������");
            JRadioButton q8_5 = new JRadioButton("���� ��ȭ ����");
            
            q8_1.setBounds(80,525,290,34);
            q8_2.setBounds(370,525,200,34);
            q8_3.setBounds(570,525,180,34);
            q8_4.setBounds(750,525,250,34);
            q8_5.setBounds(1000,525,250,34);
            
            q8_1.setFont(font);
            q8_2.setFont(font);
            q8_3.setFont(font);
            q8_4.setFont(font);
            q8_5.setFont(font);
            // ���� ��ư�� �׷�ȭ �ϱ����� ��ü ����
            ButtonGroup groupQ8 = new ButtonGroup();
            // �׷쿡 ���� ��ư ���Խ�Ų��.
            groupQ8.add(q8_1);
            groupQ8.add(q8_2);
            groupQ8.add(q8_3);  
            groupQ8.add(q8_4);
            groupQ8.add(q8_5);
            
            this.add(q8_1);
            this.add(q8_2);
            this.add(q8_3);
            this.add(q8_4);
            this.add(q8_5);
                  
            
         homebt = new JButton("����ȭ��");
         homebt.setBounds(40, 600, 139, 39);
         homebt.setFont(font4);
         contentPane.add(homebt);
         
         nextbt = new JButton("����");
         nextbt.setFont(font4);
         nextbt.setBounds(1100, 600, 139, 39);
         contentPane.add(nextbt);
         
         setVisible(true);

         nextbt.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {

               if(q1_1.isSelected())
               {
                  count_2++;
                  count_4++;
                  count_5++;
               }
               
               else if(q1_2.isSelected())
               {
                  count_1++;
                  count_11++;
               }
               
               else if(q1_3.isSelected())
               {
                  count_6++;
                  count_12++;
               }
               else if(q1_4.isSelected())
               {
                  count_3++;
                  count_7++;
                  count_8++;
                  count_9++;
               }
               else if(q1_5.isSelected())
               {
                  count_9++;
               }

               if(q2_1.isSelected())
               {
                  count_2++;
                  count_4++;
                  count_5++;
                  count_6++;
                  count_10++;
               }
               else if(q2_2.isSelected())
               {// 1, 3, 7, 8, 9, 11, 12
                  count_1++;
                  count_3++;
                  count_7++;
                  count_8++;
                  count_9++;
                  count_11++;
                  count_12++;
               }

                if(q3_1.isSelected())
               {//2, 4, 10, 11, 12 
                  count_2++;
                  count_4++;
                  count_10++;
                  count_11++;
                  count_12++;
               }
               if(q3_2.isSelected())
               {// 1, 3, 5, 6, 7, 8, 9
                  count_1++;
                  count_3++;
                  count_5++;
                  count_6++;
                  count_7++;
                  count_8++;
                  count_9++;
               }

               if(q4_1.isSelected())
               {//2, 3, 4, 5, 6, 9, 11, 12
                  count_2++;
                  count_3++;
                  count_4++;
                  count_5++;
                  count_6++;
                  count_9++;
                  count_11++;
                  count_12++;
               }
               if(q4_2.isSelected())
               {// 1, 7, 8, 10
                  count_1++;
                  count_7++;
                  count_8++;
                  count_10++;
               }

               if(q6_1.isSelected())
               {//  1, 6, 7, 8, 9, 11, 12
                  count_1++;
                  count_6++;
                  count_7++;
                  count_8++;
                  count_9++;
                  count_11++;
                  count_12++;
               }
               if(q6_2.isSelected())
               {// 2, 3, 4, 5, 10
                  count_2++;
                  count_3++;
                  count_4++;
                  count_5++;
                  count_10++;
               }

               if(q7_1.isSelected())
               {// 3, 8,  9, 10,
                  count_3++;
                  count_8++;
                  count_9++;
                  count_10++;
               }
               if(q7_2.isSelected())
               {// 11, 12, 
                  count_11++;
                  count_12++;
               }
               if(q7_3.isSelected())
               {// 1, 2, 4, 5, 6, 7
                  count_1++;
                  count_2++;
                  count_4++;
                  count_5++;
                  count_6++;
                  count_7++;
               }

               if(q8_1.isSelected())
               {// 1, 3, 8, 9,
                  count_1++;
                  count_3++;
                  count_8++;
                  count_9++;
               }
               if(q8_2.isSelected())
               {//  6, 10 
                  count_6++;
                  count_10++;
               }
               if(q8_3.isSelected())
               {// 7, 11
                  count_7++;
                  count_11++;
               }
               
               if(q8_4.isSelected())
               {// 2, 4, 5
                  count_2++;
                  count_4++;
                  count_5++;
               }
               
               if(q8_5.isSelected())
               {// 12
                  count_12++;
               }

               if(q5_1.isSelected())
               {// 1, 3, 4, 6, 7, 8, 10, 11
                  count_1++;
                  count_3++;
                  count_4++;
                  count_6++;
                  count_7++;
                  count_8++;
                  count_10++;
                  count_11++;
               }
               if(q5_2.isSelected())
               {// 2, 5, 9, 12
                  count_2++;
                  count_5++;
                  count_9++;
                  count_12++;
               }

               arr[1] = count_1; arr[2]=count_2; arr[3]=count_3; arr[4]=count_4; arr[5]=count_5;
               arr[6]=count_6; arr[7] = count_7; arr[8]=count_8; arr[9]=count_9; arr[10]=count_10;
               arr[11] = count_11; arr[12] = count_12;
               arr[0] = count0; 
            
               maxnum = 0;

               for(int i=1;i<13;i++) {
                  if (arr[i] > arr[0]) {
                     //System.out.println(arr[i]);
                     arr[0] = arr[i];
                     maxnum = i;
                     //System.out.println(maxnum);
                     // ��ġ�� �� ��� X �� ���� �켱.
                  }
               }

               System.out.println(maxnum);
               
               ConnectSQL connectsql=new ConnectSQL();
               connectsql.setcharnum(tfID,maxnum);


               CharPage frame = new CharPage(tfID, maxnum);

               dispose();

               
            }
         });
         homebt.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "������ �ʱ�ȭ�ϰ� ����ȭ������ ���ư��ϴ�.");
               dispose();
               
               }
         });
      }
}