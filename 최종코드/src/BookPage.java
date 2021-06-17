import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class BookPage extends JFrame {
   public static JPanel contentPane;
   private JLabel lb_mA;
   private JButton logoutbt, homebt, m1_bt,m2_bt,m3_bt,m4_bt,m5_bt,m6_bt,m7_bt,m8_bt,m9_bt,m10_bt;
   private JButton w1_bt,w2_bt,w3_bt,w4_bt,w5_bt,w6_bt,w7_bt,w8_bt,w9_bt,w10_bt;
//   int heart1=0, heart2=0, heart3=0, heart4=0, heart5=0, heart6=0;
//   int heart7=0, heart8=0, heart9=0, heart10=0;
   int heart[] = {0,0,0,0,0,0,0,0,0,0,0};
   static int check[] = {0,0,0,0,0,0,0,0,0,0,0};
   String title[] = {"","","","","","","","","",""};
   ImageIcon iconfull = new ImageIcon("fullheart2.png");
   ImageIcon icon = new ImageIcon("emptyheart2.png"); 
   
      
   public BookPage(String tfID) {
      List l1 =new List();
         
      setTitle("눈송 시네마 - 영화 예매");

      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setSize(2000,1000);
      contentPane = new JPanel(); 
      contentPane.setBorder(new EmptyBorder(5,5,5,5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
	  contentPane.setBackground(Color.WHITE);

      Font font = new Font("엘리스 디지털배움체", Font.PLAIN, 20);
      Font font2 = new Font("엘리스 디지털배움체", Font.BOLD, 50);
      
      JLabel label = new JLabel("눈송 시네마 - 영화 예매");// 제목
      label.setFont(font2);
      label.setBounds(350, 72, 1001, 80);
	  label.setForeground(new Color(18, 50, 181));
      contentPane.add(label);

      m1_bt = new JButton();
      //m1_bt.setBounds(100, 200, 270, 360);
      m1_bt.setBounds(100, 180, 170, 200);
      ImageIcon icon1 = new ImageIcon("해리포터.jpg");
      m1_bt.setIcon(icon1);
	  m1_bt.setBackground(Color.WHITE);
      contentPane.add(m1_bt);

      m2_bt = new JButton();
      //m2_bt.setBounds(430, 200, 270, 360);
      m2_bt.setBounds(300, 180, 170, 200);
      ImageIcon icon2 = new ImageIcon("나의 소녀시대.jpg");
      m2_bt.setIcon(icon2);
	  m2_bt.setBackground(Color.WHITE);
      contentPane.add(m2_bt);

      m3_bt = new JButton();
      m3_bt.setBounds(500, 180, 170, 200);
      ImageIcon icon3 = new ImageIcon("극한직업.jpg");
      m3_bt.setIcon(icon3);
	  m3_bt.setBackground(Color.WHITE);
      contentPane.add(m3_bt);

      m4_bt = new JButton();
      //m4_bt.setBounds(1090, 200, 270, 360);
      m4_bt.setBounds(700, 180, 170, 200);
      ImageIcon icon4 = new ImageIcon("건축학개론.jpg");
      m4_bt.setIcon(icon4);
	  m4_bt.setBackground(Color.WHITE);
      contentPane.add(m4_bt);

      m5_bt = new JButton();
      //m4_bt.setBounds(1090, 200, 270, 360);
      m5_bt.setBounds(900, 180, 170, 200);
      ImageIcon icon5 = new ImageIcon("1987.jpg");
      m5_bt.setIcon(icon5);
	  m5_bt.setBackground(Color.WHITE);
      contentPane.add(m5_bt);
      
      m6_bt = new JButton();
      //m6_bt.setBounds(100, 570, 270, 360);
      m6_bt.setBounds(100, 415, 170, 200);
      ImageIcon icon6 = new ImageIcon("7번방의 선물.jpg");
      m6_bt.setIcon(icon6);
	  m6_bt.setBackground(Color.WHITE);
      contentPane.add(m6_bt);

      m7_bt = new JButton();
      m7_bt.setBounds(300, 415, 170, 200);
      ImageIcon icon7 = new ImageIcon("트와일라잇.jpeg");
      m7_bt.setIcon(icon7);
	  m7_bt.setBackground(Color.WHITE);
      contentPane.add(m7_bt);

      m8_bt = new JButton();
      m8_bt.setBounds(500, 415, 170, 200);
      ImageIcon icon8 = new ImageIcon("아저씨.jpeg");
      m8_bt.setIcon(icon8);
	  m8_bt.setBackground(Color.WHITE);
      contentPane.add(m8_bt);

      m9_bt = new JButton();
      m9_bt.setBounds(700, 415, 170, 200);
      ImageIcon icon9 = new ImageIcon("아가씨.jpeg");
      m9_bt.setIcon(icon9);
	  m9_bt.setBackground(Color.WHITE);
      contentPane.add(m9_bt);

      m10_bt = new JButton();
      m10_bt.setBounds(900, 415, 170, 200);
      ImageIcon icon10 = new ImageIcon("겟아웃.jpeg");
      m10_bt.setIcon(icon10);
	  m10_bt.setBackground(Color.WHITE);
      contentPane.add(m10_bt);

      w1_bt = new JButton();
      w1_bt.setBounds(240, 385, 30, 25);
      w1_bt.setIcon(icon);
      contentPane.add(w1_bt);
      JLabel label_title1 = new JLabel("해리포터");// 제목
      //title[1] = label_title1.getText();
        label_title1.setFont(font);
        label_title1.setBounds(100,385, 135, 25);
		//label_title1.setForeground(new Color(18, 50, 181));
        contentPane.add(label_title1);
      
      w2_bt = new JButton();
      w2_bt.setBounds(440, 385, 30, 25);
      w2_bt.setIcon(icon);
      contentPane.add(w2_bt);
      JLabel label_title2 = new JLabel("나의 소녀시대");// 제목
      //title[2] = label_title2.getText();
        label_title2.setFont(font);
        label_title2.setBounds(300,385, 135, 25);
		//label_title2.setForeground(new Color(18, 50, 181));
        contentPane.add(label_title2);

      w3_bt = new JButton();
      w3_bt.setBounds(640, 385, 30, 25);
      w3_bt.setIcon(icon);
      contentPane.add(w3_bt);
      JLabel label_title3 = new JLabel("극한직업");// 제목
      //title[3] = label_title3.getText();
        label_title3.setFont(font);
        label_title3.setBounds(500,385, 135, 25);
		//label_title3.setForeground(new Color(18, 50, 181));
        contentPane.add(label_title3);

      w4_bt = new JButton();
      w4_bt.setBounds(840, 385, 30, 25);
      w4_bt.setIcon(icon);
      contentPane.add(w4_bt);
      JLabel label_title4 = new JLabel("건축학개론");// 제목
      //title[4] = label_title4.getText();
        label_title4.setFont(font);
        label_title4.setBounds(700,385, 135, 25);
		//label_title4.setForeground(new Color(18, 50, 181));
        contentPane.add(label_title4);

      w5_bt = new JButton();
      w5_bt.setBounds(1040, 385, 30, 25);
      w5_bt.setIcon(icon);
      contentPane.add(w5_bt);
      JLabel label_title5 = new JLabel("1987");// 제목
      //title[5] = label_title5.getText();
        label_title5.setFont(font);
        label_title5.setBounds(900,385, 135, 25);
		//label_title5.setForeground(new Color(18, 50, 181));
        contentPane.add(label_title5);

      w6_bt = new JButton();
      w6_bt.setBounds(240, 620, 30, 25);
      w6_bt.setIcon(icon);
      contentPane.add(w6_bt);
      JLabel label_title6 = new JLabel("7번방의 선물");// 제목
      //title[6] = label_title6.getText();
        label_title6.setFont(font);
        label_title6.setBounds(100,620, 135, 25);
		//label_title6.setForeground(new Color(18, 50, 181));
        contentPane.add(label_title6);

      w7_bt = new JButton();
      w7_bt.setBounds(440, 620, 30, 25);
      w7_bt.setIcon(icon);
      contentPane.add(w7_bt);
      JLabel label_title7 = new JLabel("트와일라잇");// 제목
      //title[7] = label_title7.getText();
        label_title7.setFont(font);
        label_title7.setBounds(300,620, 135, 25);
		//label_title7.setForeground(new Color(18, 50, 181));
        contentPane.add(label_title7);

      w8_bt = new JButton();
      w8_bt.setBounds(640, 620, 30, 25);
      w8_bt.setIcon(icon);
      contentPane.add(w8_bt);
      JLabel label_title8 = new JLabel("아저씨");// 제목
      //title[8] = label_title8.getText();
      label_title8.setFont(font);
        label_title8.setBounds(500,620, 135, 25);
		//label_title8.setForeground(new Color(18, 50, 181));
        contentPane.add(label_title8);

      w9_bt = new JButton();
      w9_bt.setBounds(840, 620, 30,25);
      w9_bt.setIcon(icon);
      contentPane.add(w9_bt);
      JLabel label_title9 = new JLabel("아가씨");// 제목
      //title[9] = label_title9.getText();
        label_title9.setFont(font);
        label_title9.setBounds(700,620, 135, 25);
		//label_title9.setForeground(new Color(18, 50, 181));
        contentPane.add(label_title9);
        
      w10_bt = new JButton();
      w10_bt.setBounds(1040, 620, 30, 25);
      w10_bt.setIcon(icon);
      contentPane.add(w10_bt);
      JLabel label_title10 = new JLabel("겟아웃");// 제목
      //title[10]=label_title10.getText();
        label_title10.setFont(font);
        label_title10.setBounds(900,620, 135, 25);
		//label_title10.setForeground(new Color(18, 50, 181));
        contentPane.add(label_title10);
        
      setVisible(true);

      m1_bt.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {

            BookPage2_1 frame = new BookPage2_1(tfID,"해리포터");
            dispose();
         }
         });
      
      m2_bt.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {

            BookPage2_2 frame = new BookPage2_2(tfID, "나의 소녀시대");
            dispose();
         }
         });

      m3_bt.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {

            BookPage2_3 frame = new BookPage2_3(tfID, "극한직업");
            dispose();
         }
         });

      m4_bt.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {

            BookPage2_4 frame = new BookPage2_4(tfID,"건축학개론");
            dispose();
         }
         });

      m5_bt.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {

            BookPage2_5 frame = new BookPage2_5(tfID,"1987");
            dispose();
         }
         });

      m6_bt.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {

            BookPage2_6 frame = new BookPage2_6(tfID,"7번방의 선물");
            dispose();
         }
         });
      
      m7_bt.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {

            BookPage2_7 frame = new BookPage2_7(tfID,"트와일라잇");
            dispose();
         }
         });

      m8_bt.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {

            BookPage2_8 frame = new BookPage2_8(tfID,"아저씨");
            dispose();
         }
         });

      m9_bt.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {

            BookPage2_9 frame = new BookPage2_9(tfID,"아가씨");
            dispose();
         }
         });

      m10_bt.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {

            BookPage2_10 frame = new BookPage2_10(tfID,"겟아웃");
            dispose();
         }
         });

      w1_bt.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {

            if (heart[1] == 1 ) {
               heart[1] = 0;
               w1_bt.setIcon(icon);

            int save = 0;

             for (int i = 0;i<11;i++){
               if(check[i] == 1) {
                  save = i;
               }
            }

            for (int j = save; j < 10; j++) {
               check[j] = check[j+1];
               }
         }
            

            else { 
               heart[1] = 1;
               w1_bt.setIcon(iconfull);

            for(int i = 0;i<11;i++){
               if (check[i] == 0){
                  check[i] = 1;
                  break;
               }
            }
            }

         }
         });
      
      
      w2_bt.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {

            if (heart[2] == 1 ) {
               heart[2] = 0;
               w2_bt.setIcon(icon);

           int save = 0;

             for (int i = 0;i<11;i++){
               if(check[i] == 2) {
                  save = i;
               }
            }
            for (int j = save; j < 10; j++) {
               check[j] = check[j+1];
               }
            
         }
            
            else { 
               heart[2] = 1;
               w2_bt.setIcon(iconfull);

            for(int i = 0;i<11;i++){
               if (check[i] == 0){
                  check[i] = 2;
                  break;
               }
            }
            }
         }
         });

      w3_bt.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {

            if (heart[3] == 1 ) {
               heart[3] = 0;
               w3_bt.setIcon(icon);

            int save = 0;

             for (int i = 0;i<11;i++){
               if(check[i] == 3) {
                  save = i;
               }
            }
            for (int j = save; j < 10; j++) {
               check[j] = check[j+1];
               }
            
         }
               
            else { 
               heart[3] = 1;
               w3_bt.setIcon(iconfull);

            for(int i = 0;i<11;i++){
               if (check[i] == 0){
                  check[i] = 3;
                  break;
               }
            }
            }

         }
         });

      w4_bt.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {

            if (heart[4] == 1 ) {
               heart[4] = 0;
               w4_bt.setIcon(icon);

            int save = 0;

             for (int i = 0;i<11;i++){
               if(check[i] == 4) {
                  save = i;
               }
            }
            for (int j = save; j < 10; j++) {
               check[j] = check[j+1];
               }
         
            
         }

            else { 
               heart[4] = 1;
               w4_bt.setIcon(iconfull);

            for(int i = 0;i<11;i++){
               if (check[i] == 0){
                  check[i] = 4;
                  break;
               }
            }
            }

         }
         });

      w5_bt.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {

            if (heart[5] == 1 ) {
               heart[5] = 0;
               w5_bt.setIcon(icon);

             int save = 0;

             for (int i = 0;i<11;i++){
               if(check[i] == 5) {
                  save = i;
               }
            }
            for (int j = save; j < 10; j++) {
               check[j] = check[j+1];
               }
            
         }

            else { 
               heart[5] = 1;
               w5_bt.setIcon(iconfull);

            for(int i = 0;i<11;i++){
               if (check[i] == 0){
                  check[i] = 5;
                  break;
               }
            }
            }

         }
         });

      w6_bt.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {
            
            if (heart[6] == 1 ) {
               heart[6] = 0;
               w6_bt.setIcon(icon);

             int save = 0;

             for (int i = 0;i<11;i++){
               if(check[i] == 6) {
                  save = i;
               }
            }
            for (int j = save; j < 10; j++) {
               check[j] = check[j+1];
               }
            
         }

            else { 
               heart[6] = 1;
               w6_bt.setIcon(iconfull);

            for(int i = 0;i<11;i++){
               if (check[i] == 0){
                  check[i] = 6;
                  break;
               }
            }
            }
         }
         });

      w7_bt.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {

            if (heart[7] == 1 ) {
               heart[7] = 0;
               w7_bt.setIcon(icon);

             int save = 0;

             for (int i = 0;i<11;i++){
               if(check[i] == 7) {
                  save = i;
               }
            }
            for (int j = save; j < 10; j++) {
               check[j] = check[j+1];
               }
            
         }

            else { 
               heart[7] = 1;
               w7_bt.setIcon(iconfull);

            for(int i = 0;i<11;i++){
               if (check[i] == 0){
                  check[i] = 7;
                  break;
               }
            }
            }

         }
         });

      w8_bt.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {
            if (heart[8] == 1 ) {
               heart[8] = 0;
               w8_bt.setIcon(icon);

            int save = 0;

             for (int i = 0;i<11;i++){
               if(check[i] == 8) {
                  save = i;
               }
            }
            for (int j = save; j < 10; j++) {
               check[j] = check[j+1];
               }
            
         }

            else { 
               heart[8] = 1;
               w8_bt.setIcon(iconfull);

            for(int i = 0;i<11;i++){
               if (check[i] == 0){
                  check[i] = 8;
                  break;
               }
            }
            }
         }
         });

      w9_bt.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {
            if (heart[9] == 1 ) {
               heart[9] = 0;
               w9_bt.setIcon(icon);

             int save = 0;

             for (int i = 0;i<11;i++){
               if(check[i] == 9) {
                  save = i;
               }
            }
            for (int j = save; j < 10; j++) {
               check[j] = check[j+1];
               }
            
         }

            else { 
               heart[9] = 1;
               w9_bt.setIcon(iconfull);

            for(int i = 0;i<11;i++){
               if (check[i] == 0){
                  check[i] = 9;
                  break;
               }
            }
            }

         }
         });
      

      w10_bt.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {

            if (heart[10] == 1 ) {
               heart[10] = 0;
               w10_bt.setIcon(icon);

             int save = 0;

             for (int i = 0;i<11;i++){
               if(check[i] == 10) {
                  save = i;
               }
            }
            for (int j = save; j < 10; j++) {
               check[j] = check[j+1];
               }
            
         }

            else { 
               heart[10] = 1;
               w10_bt.setIcon(iconfull);

            for(int i = 0;i<11;i++){
               if (check[i] == 0){
                  check[i] = 10;
                  break;
               }
            }
            }

         }
       });

       
      
      
      homebt = new JButton("메인화면");
      homebt.setFont(font);
      homebt.setBounds(1100, 580, 139, 39);
	  homebt.setBackground(new Color(18, 50, 181));
      homebt.setForeground(Color.WHITE);
      contentPane.add(homebt);


        logoutbt = new JButton("로그아웃");
        logoutbt.setBounds(1100, 32, 139, 39);
        logoutbt.setFont(font);
		logoutbt.setBackground(new Color(18, 50, 181));
        logoutbt.setForeground(Color.WHITE);

        contentPane.add(logoutbt);
         logoutbt.setCursor(new Cursor(Cursor.HAND_CURSOR));
         logoutbt.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
              Start frame = new Start();
              dispose();
           }
        });

         
      homebt.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            
            JOptionPane.showMessageDialog(null, "내용을 초기화하고 메인화면으로 돌아갑니다.");

         /*for (int i = 0;i<11;i++ )
         {
              System.out.println(check[i]);
         }*/

            dispose();
            MainPage mp = new MainPage(tfID);
            
            }
      });
   }
}
