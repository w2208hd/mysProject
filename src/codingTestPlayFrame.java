import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class codingTestPlayFrame extends JFrame {
    private JFrame codingTestFrame;
    private JPanel cards;
    private CardLayout cardLayout;

    ImageIcon background1 = new ImageIcon("src/img/background1.jpg");
    ImageIcon background2 = new ImageIcon("src/img/background2.jpg");
    ImageIcon background3 = new ImageIcon("src/img/background3.jpg");
    ImageIcon background4 = new ImageIcon("src/img/background4.jpg");

    ImageIcon student1 = new ImageIcon("src/img/student1.png");
    ImageIcon student2 = new ImageIcon("src/img/student2.png");
    ImageIcon student3 = new ImageIcon("src/img/student3.png");

    ImageIcon teacher1 = new ImageIcon("src/img/teacher1.png");
    ImageIcon teacher2 = new ImageIcon("src/img/teacher2.png");

    //    style
    Color backgroundColor1 = new Color(255,255,255, 178);// 128: 50% 투명
    Border border1 = BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.BLACK, 2), // Line border
            BorderFactory.createEmptyBorder(0, 10, 0, 0)   // Empty border (left padding)
    );
    JLabel jlName, jlAge, jlChatWindow1, jlChooseTitle;
    JButton nextButton;

    public void create() {

        codingTestFrame = new JFrame();
        codingTestFrame.setTitle("codingTest");
        codingTestFrame.setSize(1300, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        codingTestFrame.setResizable(false);
        codingTestFrame.setLocationRelativeTo(null);
        codingTestFrame.setResizable(false);

        cardLayout = new CardLayout();
        cards = new JPanel(cardLayout);

        //첫번쨰 퀴즈 전
        JPanel codingTestPanel_page1 = codingTestPanel_page1();
        cards.add(codingTestPanel_page1, "codingTestPanel_page1");
        JPanel codingTestPanel_page2 = codingTestPanel_page2();
        cards.add(codingTestPanel_page2, "codingTestPanel_page2");
        JPanel codingTestPanel_page3 = codingTestPanel_page3();
        cards.add(codingTestPanel_page3, "codingTestPanel_page3");
        JPanel codingTestPanel_page4 = codingTestPanel_page4();
        cards.add(codingTestPanel_page4, "codingTestPanel_page4");
        JPanel codingTestPanel_page5 = codingTestPanel_page5();
        cards.add(codingTestPanel_page5, "codingTestPanel_page5");
        JPanel codingTestPanel_page6 = codingTestPanel_page6();
        cards.add(codingTestPanel_page6, "codingTestPanel_page6");
        JPanel codingTestPanel_page7 = codingTestPanel_page7();
        cards.add(codingTestPanel_page7, "codingTestPanel_page7");
        JPanel codingTestPanel_page8 = codingTestPanel_page8();
        cards.add(codingTestPanel_page8, "codingTestPanel_page8");
        JPanel codingTestPanel_page9 = codingTestPanel_page9();
        cards.add(codingTestPanel_page9, "codingTestPanel_page9");
        JPanel codingTestPanel_page10 = codingTestPanel_page10();
        cards.add(codingTestPanel_page10, "codingTestPanel_page10");
        JPanel codingTestPanel_page11 = codingTestPanel_page11();
        cards.add(codingTestPanel_page11, "codingTestPanel_page11");
        JPanel codingTestPanel_page12 = codingTestPanel_page12();
        cards.add(codingTestPanel_page12, "codingTestPanel_page12");
        JPanel codingTestPanel_page13 = codingTestPanel_page13();
        cards.add(codingTestPanel_page13, "codingTestPanel_page13");

        //       퀴즈
        JPanel codingTestChoicePanel_page1 = codingTestChoicePanel_page1();
        cards.add(codingTestChoicePanel_page1, "codingTestChoicePanel_page1");
        JPanel codingTestChoicePanel_page2 = codingTestChoicePanel_page2();
        cards.add(codingTestChoicePanel_page2, "codingTestChoicePanel_page2");

        cardLayout.show(cards, "codingTestPanel1");
        codingTestFrame.setVisible(true);
        codingTestFrame.add(cards);

    }

    public void info() {
        //        닉네임
        jlName = new JLabel("선생님");
        jlName.setBounds(100, 500, 130, 50);
        jlName.setFont(new Font("맑은고딕", Font.BOLD, 20));
        jlName.setHorizontalAlignment(SwingConstants.CENTER);
        jlName.setOpaque(true);
        jlName.setBackground(backgroundColor1);
        jlName.setBorder(border1);

        //나이
        jlAge = new JLabel("??");
        jlAge.setBounds(228, 500, 50, 50);
        jlAge.setHorizontalAlignment(SwingConstants.CENTER);
        jlAge.setFont(new Font("맑은고딕", Font.BOLD, 20));
        jlAge.setOpaque(true);
        jlAge.setBackground(backgroundColor1);
        jlAge.setBorder(border1);

        //대화창
        jlChatWindow1 = new JLabel("");
        jlChatWindow1.setBounds(100, 548, 1050, 150);
        jlChatWindow1.setFont(new Font("맑은고딕", Font.BOLD, 20));
        jlChatWindow1.setOpaque(true);
        jlChatWindow1.setBackground(backgroundColor1);
        jlChatWindow1.setBorder(border1);

        //        다음
        nextButton = new JButton("next");
        nextButton.setBackground(Color.WHITE);
        nextButton.setBounds(1020, 640, 110, 50);
        nextButton.setFont(new Font("맑은고딕", Font.BOLD, 20));

        jlChooseTitle = new JLabel("");
        jlChooseTitle.setHorizontalAlignment(SwingConstants.CENTER);
        jlChooseTitle.setBounds(350, 120, 550, 50);
        jlChooseTitle.setFont(new Font("맑은고딕", Font.BOLD, 20));
        jlChooseTitle.setBorder(border1);
    }

    private JPanel codingTestPanel_page1() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background2.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlAge.setText("18");
        jlName.setText("미림이");
        jlChatWindow1.setText("취업할 때 코딩테스트가 중요하다 했는데, 무슨 수업을 할까?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "codingTestPanel_page2");
            }
        });

        JLabel studentLabel = new JLabel(student1);
        studentLabel.setBounds(400, 0, 500, 548);
        studentLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(studentLabel);

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel codingTestPanel_page2() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("안녕~. 코딩테스트 무슨 수업인지 알고있어?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "codingTestPanel_page3");
            }
        });

        JLabel teacherLabel = new JLabel(teacher1);
        teacherLabel.setBounds(400, 0, 500, 548);
        teacherLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(teacherLabel);

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel codingTestPanel_page3() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("우리 수업시간은 선생님이 간단한 문제를 내주면 풀면 되는 수업이야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "codingTestPanel_page4");
            }
        });

        JLabel teacherLabel = new JLabel(teacher1);
        teacherLabel.setBounds(400, 0, 500, 548);
        teacherLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(teacherLabel);

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel codingTestPanel_page4() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("일단 툴 먼저 깔고 시작할까? c언어 툴 깔아보자.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "codingTestPanel_page5");
            }
        });

        JLabel teacherLabel = new JLabel(teacher1);
        teacherLabel.setBounds(400, 0, 500, 548);
        teacherLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(teacherLabel);

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel codingTestPanel_page5() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("미림이");
        jlAge.setText("18");
        jlChatWindow1.setText("(어? 자바로 하는줄 알았는데 c 언어로 하는구나!)");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "codingTestPanel_page6");
            }
        });

        JLabel studentLabel = new JLabel(student3);
        studentLabel.setBounds(400, 0, 500, 548);
        studentLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(studentLabel);

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel codingTestPanel_page6() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background4.getImage(), 0, 0, null);
            }
        };

        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("오늘은 간단하게 c언어 기본 문법에 대해서 해보자.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "codingTestPanel_page7");
            }
        });

        JLabel teacherLabel = new JLabel(teacher2);
        teacherLabel.setBounds(400, 0, 500, 548);
        teacherLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(teacherLabel);

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel codingTestPanel_page7() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background4.getImage(), 0, 0, null);
            }
        };

        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("문제 나와있는 프린트물 나눠줄게. 진짜 간단한 거니까 3분 줄게. 해봐.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "codingTestPanel_page8");
            }
        });

        JLabel teacherLabel = new JLabel(teacher1);
        teacherLabel.setBounds(400, 0, 500, 548);
        teacherLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(teacherLabel);

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel codingTestPanel_page8() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("미림이");
        jlAge.setText("18");
        jlChatWindow1.setText("이번문제는 진짜 기초네. 1학년 때 배운 c언어로도 풀 수 있겠다.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "codingTestChoicePanel_page1");
            }
        });

        JLabel studentLabel = new JLabel(student2);
        studentLabel.setBounds(400, 0, 500, 548);
        studentLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(studentLabel);

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    //    퀴즈 1
    private JPanel codingTestChoicePanel_page1() {
        JPanel choicePanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        choicePanel1.setLayout(null);
        info();

//        무엇을 선택할지
        jlChooseTitle.setText("c언어 3+5를 계산하는 문제를 풀어보자. 알맞은 코드는?");

//        선택지 버튼
        JButton subChooseButton1 = new JButton("<html> int a = 5, b = 7;<br> printf( “%d + %d = %d”, a,b,a+b);</html>");
        subChooseButton1.setBackground(Color.WHITE);
        subChooseButton1.setBounds(350, 200, 550, 100);
        subChooseButton1.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "codingTestPanel_page9");
            }
        });

        JButton subChooseButton2 = new JButton("<html>int a = 5, b = 7;<br>printf( a + b = a+b”, a,b,a+b);</html>");
        subChooseButton2.setBackground(Color.WHITE);
        subChooseButton2.setBounds(350, 330, 550, 100);
        subChooseButton2.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "codingTestPanel_page9");
            }
        });

        JButton subChooseButton3 = new JButton("<html>int a = 5, b = 7;<br> printf( a + “ +” + b + “ =  “ + (a+b);</html>");
        subChooseButton3.setBackground(Color.WHITE);
        subChooseButton3.setBounds(350, 460, 550, 100);
        subChooseButton3.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "codingTestPanel_page9");
            }
        });

        choicePanel1.add(jlChooseTitle);
        choicePanel1.add(subChooseButton1);
        choicePanel1.add(subChooseButton2);
        choicePanel1.add(subChooseButton3);
        return choicePanel1;
    }

    private JPanel codingTestPanel_page9() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background4.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("정답은 1번이야. c언어는 printf( “ %d “, a) 로 변수를 출력해");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "codingTestPanel_page10");
            }
        });

        JLabel teacherLabel = new JLabel(teacher2);
        teacherLabel.setBounds(400, 0, 500, 548);
        teacherLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(teacherLabel);

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel codingTestPanel_page10() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background4.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("다음 프린트 봐볼까? 이번에도 조금 쉬운 문제야. 한번 풀어보자");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "codingTestChoicePanel_page2");
            }
        });

        JLabel teacherLabel = new JLabel(teacher2);
        teacherLabel.setBounds(400, 0, 500, 548);
        teacherLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(teacherLabel);

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    //    퀴즈 2
    private JPanel codingTestChoicePanel_page2() {
        JPanel choicePanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        choicePanel1.setLayout(null);
        info();

//        무엇을 선택할지
        jlChooseTitle.setText("1~5까지 출력되는 if문의 조건으로 알맞은 코드는?");

//        선택지 버튼
        JButton subChooseButton1 = new JButton("if(i<5)");
        subChooseButton1.setBackground(Color.WHITE);
        subChooseButton1.setBounds(350, 200, 550, 100);
        subChooseButton1.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "codingTestPanel_page11");
            }
        });

        JButton subChooseButton2 = new JButton("if(i<=5)");
        subChooseButton2.setBackground(Color.WHITE);
        subChooseButton2.setBounds(350, 330, 550, 100);
        subChooseButton2.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page11");
            }
        });

        JButton subChooseButton3 = new JButton("if(i<6)");
        subChooseButton3.setBackground(Color.WHITE);
        subChooseButton3.setBounds(350, 460, 550, 100);
        subChooseButton3.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "codingTestPanel_page11");
            }
        });

        JButton subChooseButton4 = new JButton("if(i<=6)");
        subChooseButton4.setBackground(Color.WHITE);
        subChooseButton4.setBounds(350, 590, 550, 100);
        subChooseButton4.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "codingTestPanel_page11");
            }
        });

        choicePanel1.add(jlChooseTitle);
        choicePanel1.add(subChooseButton1);
        choicePanel1.add(subChooseButton2);
        choicePanel1.add(subChooseButton3);
        choicePanel1.add(subChooseButton4);
        return choicePanel1;
    }

    private JPanel codingTestPanel_page11() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background4.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText(" 1번과 3번 모두 5까지로 정답이 돼.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "codingTestPanel_page12");
            }
        });

        JLabel teacherLabel = new JLabel(teacher2);
        teacherLabel.setBounds(400, 0, 500, 548);
        teacherLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(teacherLabel);

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel codingTestPanel_page12() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background4.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("이번시간 문제는 쉬웠지? 다음 시간부터는 어려운 문제로 할게. 다음시간에 보자~.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "codingTestPanel_page13");
            }
        });

        JLabel teacherLabel = new JLabel(teacher1);
        teacherLabel.setBounds(400, 0, 500, 548);
        teacherLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(teacherLabel);

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel codingTestPanel_page13() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("네!!. 코딩테스트 시간에는 진짜 문제만 푸는구나. 다음은 무슨 수업을 들으러 갈까?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                FinalFrame finalFrame = new FinalFrame();
                codingTestFrame.setVisible(false);
                finalFrame.create();
            }
        });

        JLabel studentLabel = new JLabel(student3);
        studentLabel.setBounds(400, 0, 500, 548);
        studentLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(studentLabel);

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    public static void main(String args[]){
        codingTestPlayFrame codingTestpFrame = new codingTestPlayFrame();
        codingTestpFrame.create();
    }
}
