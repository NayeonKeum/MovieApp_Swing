// 회원가입 두번 째 화면

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;   
import javax.swing.border.*;
import java.util.Enumeration;
import java.util.Arrays;


public class JoinPage2 extends JFrame {
      public static JPanel contentPane;
      //private JTextField tfID, tfPasswd, tfName, tfBirth, tfSex, tfPhone ;
      private JButton nextbt, homebt; // homebt:입력 초기화, 메인화면으로
      public int count0 =0, count_1=0, count_2=0, count_3=0, count_4=0, count_5=0, count_6=0, 
            count_7=0, count_8=0, count_9=0, count_10=0, count_11=0,count_12=0, maxnum;
      int[] arr = new int[13];

      
      public JoinPage2(String tfID) {
         List l1 =new List();
         
         setTitle("눈송시네마 예매 키오스크 - 사용자 영화취향 분석");
         
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         setSize(2000,1000);
         //setBounds(100, 100, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
         contentPane = new JPanel(); // 버튼이나 라벨이 들어갈 화면
         contentPane.setBorder(new EmptyBorder(5,5,5,5));
         setContentPane(contentPane);
         contentPane.setLayout(null);
         contentPane.setBackground(Color.WHITE);
         
         Font font = new Font("엘리스 디지털배움체", Font.PLAIN, 13);
         Font font3 = new Font("엘리스 디지털배움체", Font.BOLD, 13);
          Font font2 = new Font("엘리스 디지털배움체", Font.BOLD, 30);
          Font font4 = new Font("엘리스 디지털배움체", Font.PLAIN, 20);
         
         JLabel label = new JLabel("눈송 시네마 - 영화 취향 분석");// 제목
         //label.setForeground(Color.WHITE);
           label.setFont(font2);
           label.setBounds(450, 42, 1591, 80);
           label.setForeground(new Color(18, 50, 181));
         contentPane.add(label);
         
         
         JLabel lb_q0 = new JLabel("★ 캐릭터 부여를 위한 질문입니다. 문항 당 하나만 고르세요.");
         lb_q0.setBounds(80,121,1269,34);
         lb_q0.setFont(font3);
         contentPane.add(lb_q0);
         JLabel lb_q1 = new JLabel("Q1. 가장 선호하는 것을 하나만 고르세요.");
         lb_q1.setBounds(80,151,1269,34);
         lb_q1.setFont(font3);
         contentPane.add(lb_q1);
         JLabel lb_q2 = new JLabel("Q2. 내가 선호하는 영화 전개는?");
         lb_q2.setBounds(80,201,369,34);
         lb_q2.setFont(font3);
         contentPane.add(lb_q2);
         JLabel lb_q3 = new JLabel("Q3. 마음에 드는 등장인물이");
         lb_q3.setFont(font3);
         lb_q3.setBounds(80,250,369,34);
         contentPane.add(lb_q3);
         JLabel lb_q4 = new JLabel("Q4. 나는 이런 영화가 좋다.");
         lb_q4.setFont(font3);
         lb_q4.setBounds(80,300,369,34);
         contentPane.add(lb_q4);
         JLabel lb_q5 = new JLabel("Q5. 내가 바라는 엔딩은?");
         lb_q5.setFont(font3);
         lb_q5.setBounds(80,350,369,34);
         contentPane.add(lb_q5);
         JLabel lb_q6 = new JLabel("Q6. 나는");
         lb_q6.setFont(font3);
         lb_q6.setBounds(80,400,369,34);
         contentPane.add(lb_q6);
         JLabel lb_q7 = new JLabel("Q7. 좀 더 선호하는 장르는?");
         lb_q7.setFont(font3);
         lb_q7.setBounds(80,450,369,34);
         contentPane.add(lb_q7);
         JLabel lb_q8 = new JLabel("Q8. 좀 더 선호하는 장르는?");
         lb_q8.setFont(font3);
         lb_q8.setBounds(80,500,369,34);
         contentPane.add(lb_q8);

         // 문항
         // 라디오 버튼 생성
            JRadioButton q1_1 = new JRadioButton("극단적/과격한 내용이지만 참신한 결말의 영화");
            JRadioButton q1_2 = new JRadioButton("뻔한 결말이지만 재미있는 영화");
            JRadioButton q1_3 = new JRadioButton("냉혹하지만 현실적인 영화");
            JRadioButton q1_4 = new JRadioButton("비현실적이라도 상상력이 뛰어난 영화");
            JRadioButton q1_5 = new JRadioButton("누구나 겪어봤을 법한 공감가는 영화");
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
            // 라디오 버튼을 그룹화 하기위한 객체 생성
            ButtonGroup groupQ1 = new ButtonGroup();
            // 그룹에 라디오 버튼 포함시킨다.
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

// 2번 문항
            JRadioButton q2_1 = new JRadioButton("영화가 예상과 똑같이 진행되면 짜증난다.");
            JRadioButton q2_2 = new JRadioButton("영화가 예상과 비슷하게 진행되어도 크게 개의치 않는다.");
            q2_1.setBounds(80,225,290,34);
            q2_2.setBounds(370,225,400,34);
            
            q2_1.setFont(font);
            q2_2.setFont(font);
            
            // 라디오 버튼을 그룹화 하기위한 객체 생성
            ButtonGroup groupQ2 = new ButtonGroup();
            // 그룹에 라디오 버튼 포함시킨다.
            groupQ2.add(q2_1);
            groupQ2.add(q2_2);
            
            this.add(q2_1);
            this.add(q2_2);
            
            
// 3번 문항
            JRadioButton q3_1 = new JRadioButton("현실성을 위해 죽어도 상관없다.");
            JRadioButton q3_2 = new JRadioButton("끝까지 남아 이야기를 마치는 것이 좋다.");
            q3_1.setBounds(80,275,290,34);
            q3_2.setBounds(370,275,400,34);
            
            q3_1.setFont(font);
            q3_2.setFont(font);
            // 라디오 버튼을 그룹화 하기위한 객체 생성
            ButtonGroup groupQ3 = new ButtonGroup();
            // 그룹에 라디오 버튼 포함시킨다.
            groupQ3.add(q3_1);
            groupQ3.add(q3_2);
            
            this.add(q3_1);
            this.add(q3_2);
            

// 4번 문항
            JRadioButton q4_1 = new JRadioButton("감동적이고 여운이 남는 영화가 좋다.");
            JRadioButton q4_2 = new JRadioButton("여운이 많이 남는 영화보다는 뒷맛이 깔끔한 영화가 좋다.");
            q4_1.setBounds(80,325,290,34);
            q4_2.setBounds(370,325,400,34);
            
            q4_1.setFont(font);
            q4_2.setFont(font);
            // 라디오 버튼을 그룹화 하기위한 객체 생성
            ButtonGroup groupQ4 = new ButtonGroup();
            // 그룹에 라디오 버튼 포함시킨다.
            groupQ4.add(q4_1);
            groupQ4.add(q4_2);
            
            this.add(q4_1);
            this.add(q4_2);
            
    
// 5번 문항
            JRadioButton q5_1 = new JRadioButton("해피엔딩이 좋다.");
            JRadioButton q5_2 = new JRadioButton("영화의 완성도를 위해 새드엔딩이어도 괜찮다.");
            q5_1.setBounds(80,375,290,34);
            q5_2.setBounds(370,375,400,34);
            
            q5_1.setFont(font);
            q5_2.setFont(font);
            // 라디오 버튼을 그룹화 하기위한 객체 생성
            ButtonGroup groupQ5 = new ButtonGroup();
            // 그룹에 라디오 버튼 포함시킨다.
            groupQ5.add(q5_1);
            groupQ5.add(q5_2);
            
            this.add(q5_1);
            this.add(q5_2);
            
         
            
// 6번 문항
            JRadioButton q6_1 = new JRadioButton("진부하더라도 잘 짜여진 영화가 좋다.");
            JRadioButton q6_2 = new JRadioButton("자유롭고 흥미로운 창의적인 영화가 좋다.");
            q6_1.setBounds(80,425,290,34);
            q6_2.setBounds(370,425,400,34);
            
            q6_1.setFont(font);
            q6_2.setFont(font);
            // 라디오 버튼을 그룹화 하기위한 객체 생성
            ButtonGroup groupQ6 = new ButtonGroup();
            // 그룹에 라디오 버튼 포함시킨다.
            groupQ6.add(q6_1);
            groupQ6.add(q6_2);
            
            this.add(q6_1);
            this.add(q6_2);
         
            
// 7번 문항  
            JRadioButton q7_1 = new JRadioButton("판타지 로맨스 공상과학 영화.");
            JRadioButton q7_2 = new JRadioButton("실화 사실주의 다큐멘터리 영화");
            JRadioButton q7_3 = new JRadioButton("미스터리 액션 범죄");
            q7_1.setBounds(80,475,290,34);
            q7_2.setBounds(370,475,200,34);
            q7_3.setBounds(750,475,400,34);
            
            q7_1.setFont(font);
            q7_2.setFont(font);
            q7_3.setFont(font);
            
            // 라디오 버튼을 그룹화 하기위한 객체 생성
            ButtonGroup groupQ7 = new ButtonGroup();
            // 그룹에 라디오 버튼 포함시킨다.
            groupQ7.add(q7_1);
            groupQ7.add(q7_2);
            groupQ7.add(q7_3);
            
            this.add(q7_1);
            this.add(q7_2);
            this.add(q7_3);
            
           
// 8번 문항
            JRadioButton q8_1 = new JRadioButton("로맨스 액션");
            JRadioButton q8_2 = new JRadioButton("범죄 판타지");
            JRadioButton q8_3 = new JRadioButton("가족 코미디");
            JRadioButton q8_4 = new JRadioButton("추리 탐정 미스터리 스릴러");
            JRadioButton q8_5 = new JRadioButton("감동 실화 역사");
            
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
            // 라디오 버튼을 그룹화 하기위한 객체 생성
            ButtonGroup groupQ8 = new ButtonGroup();
            // 그룹에 라디오 버튼 포함시킨다.
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
                  
            
         homebt = new JButton("시작화면");
         homebt.setBounds(40, 600, 139, 39);
         homebt.setFont(font4);
         contentPane.add(homebt);
         
         nextbt = new JButton("다음");
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
                     // 겹치는 건 고려 X 앞 숫자 우선.
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
               JOptionPane.showMessageDialog(null, "내용을 초기화하고 시작화면으로 돌아갑니다.");
               dispose();
               
               }
         });
      }
}