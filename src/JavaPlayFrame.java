import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaPlayFrame extends JFrame {
    private JFrame javaFrame;
    private JPanel cards;
    private CardLayout cardLayout;

    //    이미지
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
    Color backgroundColor1 = new Color(255,255,255, 178);
    Border border1 = BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.BLACK, 2), // Line border
            BorderFactory.createEmptyBorder(0, 10, 0, 0)   // Empty border (left padding)
    );
    JLabel jlName, jlAge, jlChatWindow1, jlChooseTitle;
    JButton nextButton;

    public void create() {

        javaFrame = new JFrame();
        javaFrame.setTitle("java");
        javaFrame.setSize(1300, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        javaFrame.setResizable(false);
        javaFrame.setLocationRelativeTo(null);
        javaFrame.setResizable(false);

        cardLayout = new CardLayout();
        cards = new JPanel(cardLayout);

//        첫번쨰 퀴즈 전
        JPanel javaPanel_page1 = javaPanel_page1();
        cards.add(javaPanel_page1, "javaPanel_page1");
        JPanel javaPanel_page2 = javaPanel_page2();
        cards.add(javaPanel_page2, "javaPanel_page2");
        JPanel javaPanel_page3 = javaPanel_page3();
        cards.add(javaPanel_page3, "javaPanel_page3");
        JPanel javaPanel_page4 = javaPanel_page4();
        cards.add(javaPanel_page4, "javaPanel_page4");
        JPanel javaPanel_page5 = javaPanel_page5();
        cards.add(javaPanel_page5, "javaPanel_page5");
        JPanel javaPanel_page6 = javaPanel_page6();
        cards.add(javaPanel_page6, "javaPanel_page6");
        JPanel javaPanel_page7 = javaPanel_page7();
        cards.add(javaPanel_page7, "javaPanel_page7");
        JPanel javaPanel_page8 = javaPanel_page8();
        cards.add(javaPanel_page8, "javaPanel_page8");
//        2번째 퀴즈 전
        JPanel javaPanel_page9_1 = javaPanel_page9_1();
        cards.add(javaPanel_page9_1, "javaPanel_page9_1");
        JPanel javaPanel_page9_2 = javaPanel_page9_2();
        cards.add(javaPanel_page9_2, "javaPanel_page9_2");
        JPanel javaPanel_page10 = javaPanel_page10();
        cards.add(javaPanel_page10, "javaPanel_page10");
        JPanel javaPanel_page11 = javaPanel_page11();
        cards.add(javaPanel_page11, "javaPanel_page11");
        JPanel javaPanel_page12 = javaPanel_page12();
        cards.add(javaPanel_page12, "javaPanel_page12");
        JPanel javaPanel_page13 = javaPanel_page13();
        cards.add(javaPanel_page13, "javaPanel_page13");
        JPanel javaPanel_page14 = javaPanel_page14();
        cards.add(javaPanel_page14, "javaPanel_page14");
        JPanel javaPanel_page15 = javaPanel_page15();
        cards.add(javaPanel_page15, "javaPanel_page15");

//        3번째 퀴즈 전
        JPanel javaPanel_page16_1 = javaPanel_page16_1();
        cards.add(javaPanel_page16_1, "javaPanel_page16_1");
        JPanel javaPanel_page16_2 = javaPanel_page16_2();
        cards.add(javaPanel_page16_2, "javaPanel_page16_2");
        JPanel javaPanel_page17 = javaPanel_page17();
        cards.add(javaPanel_page17, "javaPanel_page17");
        JPanel javaPanel_page18 = javaPanel_page18();
        cards.add(javaPanel_page18, "javaPanel_page18");
        JPanel javaPanel_page19 = javaPanel_page19();
        cards.add(javaPanel_page19, "javaPanel_page19");
        JPanel javaPanel_page20 = javaPanel_page20();
        cards.add(javaPanel_page20, "javaPanel_page20");
        JPanel javaPanel_page21 = javaPanel_page21();
        cards.add(javaPanel_page21, "javaPanel_page21");
        JPanel javaPanel_page22 = javaPanel_page22();
        cards.add(javaPanel_page22, "javaPanel_page22");
        JPanel javaPanel_page23 = javaPanel_page23();
        cards.add(javaPanel_page23, "javaPanel_page23");

//        3번째 퀴즈 후
        JPanel javaPanel_page24 = javaPanel_page24();
        cards.add(javaPanel_page24, "javaPanel_page24");
        JPanel javaPanel_page25 = javaPanel_page25();
        cards.add(javaPanel_page25, "javaPanel_page25");

//        퀴즈
        JPanel javaChoicePanel_page1 = javaChoicePanel_page1();
        cards.add(javaChoicePanel_page1, "javaChoicePanel_page1");
        JPanel javaChoicePanel_page2 = javaChoicePanel_page2();
        cards.add(javaChoicePanel_page2, "javaChoicePanel_page2");
        JPanel javaChoicePanel_page3 = javaChoicePanel_page3();
        cards.add(javaChoicePanel_page3, "javaChoicePanel_page3");


        cardLayout.show(cards, "javaPanel_page1");
        javaFrame.setVisible(true);
        javaFrame.add(cards);

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

    private JPanel javaPanel_page1() {
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
        jlChatWindow1.setText("후! 드디어 2학년이다. 1학년 때 배운 자바를 2학년 때도 배우는구나.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page2");
            }
        });

//        캐릭터 사진
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

    private JPanel javaPanel_page2() {
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
        jlChatWindow1.setText("오늘 첫 시간이지. 1학년 때 어디까지 했었니?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page3");
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

    private JPanel javaPanel_page3() {
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
        jlAge.setText("18");
        jlName.setText("미림이");
        jlChatWindow1.setText("class까지 배웠어요!");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page4");
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

    private JPanel javaPanel_page4() {
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
        jlChatWindow1.setText("반장한테 수업자료 올라와있는 링크 줬으니까 다운받아서 보면 돼.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page5");
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

    private JPanel javaPanel_page5() {
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
        jlChatWindow1.setText("우리 과목은 교과서는 없다. 다운 받았으면 1장 인터페이스 열어놔봐.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page6");
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

    private JPanel javaPanel_page6() {
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
        jlChatWindow1.setText("자바는 다중 상속을 지원하지 않아. 너네가 1학년 때 배운 클래스도 하나만 상속할 수 있어");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page7");
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

    private JPanel javaPanel_page7() {
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
        jlChatWindow1.setText("인터페이스는 좀 특별해. 클래스와 달리 다중구현이 가능하거든.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page8");
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

    private JPanel javaPanel_page8() {
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
        jlChatWindow1.setText("그럼 여기서 퀴즈! ");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaChoicePanel_page1");
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

    //    퀴즈 1
    private JPanel javaChoicePanel_page1() {
        JPanel  choicePanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background4.getImage(), 0, 0, null);
            }
        };

        choicePanel1.setLayout(null);
        info();

//        무엇을 선택할지
        jlChooseTitle.setText("다중구현은 뭘까?");

//        선택지 버튼
        JButton subChooseButton1 = new JButton("여러개를 상속받을 수 있다.");
        subChooseButton1.setBounds(350, 200, 550, 100);
        subChooseButton1.setBackground(Color.WHITE);
        subChooseButton1.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page9_1");
            }
        });

        JButton subChooseButton2 = new JButton("2개를 상속 받을 수 있다.");
        subChooseButton2.setBounds(350, 350, 550, 100);
        subChooseButton2.setBackground(Color.WHITE);
        subChooseButton2.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page9_2");
            }
        });

        JButton subChooseButton3 = new JButton("한개만 상속받을 수 있다.");
        subChooseButton3.setBounds(350, 500, 550, 100);
        subChooseButton3.setBackground(Color.WHITE);
        subChooseButton3.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page9_2");
            }
        });

        choicePanel1.add(jlChooseTitle);
        choicePanel1.add(subChooseButton1);
        choicePanel1.add(subChooseButton2);
        choicePanel1.add(subChooseButton3);
        return choicePanel1;
    }

    private JPanel javaPanel_page9_1() {
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
        jlChatWindow1.setText("정답이야~. 인터페이의 문법은 interface MyInterface(){ }야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page10");
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

    private JPanel javaPanel_page9_2() {
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
        jlChatWindow1.setText("틀렸지만 잘했어~. 인터페이의 문법은 interface MyInterface(){ }야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page10");
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

    private JPanel javaPanel_page10() {
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
        jlChatWindow1.setText("위처럼 인터페이스의 이름을 쓰고 이름 앞에 interface를 붙이면 기본적인 문법이 완성돼.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page11");
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

    private JPanel javaPanel_page11() {
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
        jlChatWindow1.setText("class 클래스이름 implements 인터페이스이름{ } 이야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page12");
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

    private JPanel javaPanel_page12() {
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
        jlAge.setText("18");
        jlName.setText("미림이");
        jlChatWindow1.setText("오~. 1학년 때 배운 class는 상속받을 때 extends로 했었는데  인터페이스는 다르구나.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page13");
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

    private JPanel javaPanel_page13() {
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
        jlChatWindow1.setText("이번시간에는 2장 펴봐. 패키지에 대해서 배울거야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page14");
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

    private JPanel javaPanel_page14() {
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
        jlChatWindow1.setText("패키지? 내가 아는 클래스 나누는 그 패키지인가?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page15");
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

    private JPanel javaPanel_page15() {
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
        jlChatWindow1.setText("패키지의 설명에 대해서 한번 맞춰볼까?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaChoicePanel_page2");
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

    //    퀴즈2
    private JPanel javaChoicePanel_page2() {
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
        jlChooseTitle.setText("틀린 설명을 골라보자");

//        선택지 버튼
        JButton subChooseButton1 = new JButton("비슷한 클래스를 모아 놓은것이다.");
        subChooseButton1.setBackground(Color.WHITE);
        subChooseButton1.setBounds(350, 200, 550, 100);
        subChooseButton1.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page16_2");
            }
        });

        JButton subChooseButton2 = new JButton("인터페이스 모아놓기 위해 사용한다");
        subChooseButton2.setBackground(Color.WHITE);
        subChooseButton2.setBounds(350, 330, 550, 100);
        subChooseButton2.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page16_2");
            }
        });

        JButton subChooseButton3 = new JButton("패키지 하나에 클래스 하나를 넣는다");
        subChooseButton3.setBackground(Color.WHITE);
        subChooseButton3.setBounds(350, 460, 550, 100);
        subChooseButton3.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page16_1");
            }
        });

        JButton subChooseButton4 = new JButton("클래스를 관리하고 구분하기 위해 사용한다.");
        subChooseButton4.setBackground(Color.WHITE);
        subChooseButton4.setBounds(350, 590, 550, 100);
        subChooseButton4.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page16_2");
            }
        });

        choicePanel1.add(jlChooseTitle);
        choicePanel1.add(subChooseButton1);
        choicePanel1.add(subChooseButton2);
        choicePanel1.add(subChooseButton3);
        choicePanel1.add(subChooseButton4);
        return choicePanel1;
    }

    private JPanel javaPanel_page16_1() {
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
        jlChatWindow1.setText("맞았어!! 잘 맞추는걸. 정답은 패키지 하나에 클래스 하나를 넣는다가 틀린말이야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page17");
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

    private JPanel javaPanel_page16_2() {
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
        jlChatWindow1.setText("아쉽지만 잘했어! 정딥은 패키지 하나에 클래스 하나를 넣는다가 틀린말이야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page17");
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

    private JPanel javaPanel_page17() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background4.getImage(), 0, 0, null);
            }
        };        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("패키지는 비슷한 클래스, 인터페이스를 저장하기 위해 사용하는거야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page18");
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

    private JPanel javaPanel_page18() {
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
        jlChatWindow1.setText("같은 패키지를 이용하려면 첫번째로 패키지 파일을 만들어");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page19");
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

    private JPanel javaPanel_page19() {
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
        jlChatWindow1.setText("그리고 그 패키지에 넣을 클래스 위에 package 패키지 이름; 을 써주면 돼.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page20");
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

    private JPanel javaPanel_page20() {
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
        jlChatWindow1.setText("선생님. 여기 이름 없는 패키지가 있는데 이거는 뭔가요?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page21");
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

    private JPanel javaPanel_page21() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background4.getImage(), 0, 0, null);
            }
        };        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText(" 자. 여러개의 패키지 중에서 이름이 없는 패키지가 있지?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page22");
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

    private JPanel javaPanel_page22() {
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
        jlChatWindow1.setText("패키지에 속하지 않은 클래스, 인터페이스는 모두 이름이 없는 패키지에  속하게돼.\n");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page23");
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

    private JPanel javaPanel_page23() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background4.getImage(), 0, 0, null);
            }
        };        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("자. 그럼 여기서 마지막 퀴즈!");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaChoicePanel_page3");
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

    //    퀴즈3
    private JPanel javaChoicePanel_page3() {
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
        jlChooseTitle.setText("다음중 패키지에 대한 권장사항이 아닌 것은?");

//        선택지 버튼
        JButton subChooseButton1 = new JButton("가급적 하나 이상의 패키지를 쓴다.");
        subChooseButton1.setBackground(Color.WHITE);
        subChooseButton1.setBounds(350, 200, 550, 100);
        subChooseButton1.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page24");
            }
        });

        JButton subChooseButton2 = new JButton("이름을 전부 소문자로 구성한다");
        subChooseButton2.setBackground(Color.WHITE);
        subChooseButton2.setBounds(350, 350, 550, 100);
        subChooseButton2.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page24");
            }
        });

        JButton subChooseButton3 = new JButton("<html>" + "예제로 사용할 간단한 프로젝트도" +
                "<br/>" + "무조건 패키지를 써야한다." + "</html>");
        subChooseButton3.setBackground(Color.WHITE);
        subChooseButton3.setBounds(350, 500, 550, 100);
        subChooseButton3.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page24");
            }
        });

        choicePanel1.add(jlChooseTitle);
        choicePanel1.add(subChooseButton1);
        choicePanel1.add(subChooseButton2);
        choicePanel1.add(subChooseButton3);
        return choicePanel1;
    }

    private JPanel javaPanel_page24() {
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
        jlChatWindow1.setText("<html>" + "정답은 3번이었어. 간단한 프로젝트는 꼭 쓰지 않아도 돼." +
                "<br/>" + "오늘 수업 수고했고, 다음 수업 잘 들으러 가렴~ " + "</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "javaPanel_page25");
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

    private JPanel javaPanel_page25() {
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
        jlAge.setText("18");
        jlName.setText("미림이");
        jlChatWindow1.setText("감사합니다~. 다음수업은 뭘 들을까? ");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                FinalFrame finalFrame = new FinalFrame();
                javaFrame.setVisible(false);
                finalFrame.create();
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

    public static void main(String args[]) {
        JavaPlayFrame jpFrame = new JavaPlayFrame();
        jpFrame.create();
    }
}
