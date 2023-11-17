import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DsPlayFrame extends JFrame {
    private JFrame dsFrame;
    private JPanel cards;
    private CardLayout cardLayout;

    //    style
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

        dsFrame = new JFrame();
        dsFrame.setTitle("DS");
        dsFrame.setSize(1300, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        dsFrame.setResizable(false);
        dsFrame.setLocationRelativeTo(null);
        dsFrame.setResizable(false);

        cardLayout = new CardLayout();
        cards = new JPanel(cardLayout);

        //첫번쨰 퀴즈 전
        JPanel dsPanel_page1 = dsPanel_page1();
        cards.add(dsPanel_page1, "dsPanel_page1");
        JPanel dsPanel_page2 = dsPanel_page2();
        cards.add(dsPanel_page2, "dsPanel_page2");
        JPanel dsPanel_page3 = dsPanel_page3();
        cards.add(dsPanel_page3, "dsPanel_page3");
        JPanel dsPanel_page4 = dsPanel_page4();
        cards.add(dsPanel_page4, "dsPanel_page4");
        JPanel dsPanel_page5 = dsPanel_page5();
        cards.add(dsPanel_page5, "dsPanel_page5");
        JPanel dsPanel_page6 = dsPanel_page6();
        cards.add(dsPanel_page6, "dsPanel_page6");
        JPanel dsPanel_page7 = dsPanel_page7();
        cards.add(dsPanel_page7, "dsPanel_page7");
        JPanel dsPanel_page8 = dsPanel_page8();
        cards.add(dsPanel_page8, "dsPanel_page8");
        JPanel dsPanel_page9 = dsPanel_page9();
        cards.add(dsPanel_page9, "dsPanel_page9");
        JPanel dsPanel_page10 = dsPanel_page10();
        cards.add(dsPanel_page10, "dsPanel_page10");
        JPanel dsPanel_page11 = dsPanel_page11();
        cards.add(dsPanel_page11, "dsPanel_page11");
        JPanel dsPanel_page12 = dsPanel_page12();
        cards.add(dsPanel_page12, "dsPanel_page12");
        JPanel dsPanel_page13 = dsPanel_page13();
        cards.add(dsPanel_page13, "dsPanel_page13");
        JPanel dsPanel_page14 = dsPanel_page14();
        cards.add(dsPanel_page14, "dsPanel_page14");
        JPanel dsPanel_page15 = dsPanel_page15();
        cards.add(dsPanel_page15, "dsPanel_page15");
        JPanel dsPanel_page16 = dsPanel_page16();
        cards.add(dsPanel_page16, "dsPanel_page16");
        JPanel dsPanel_page17 = dsPanel_page17();
        cards.add(dsPanel_page17, "dsPanel_page17");
        JPanel dsPanel_page18 = dsPanel_page18();
        cards.add(dsPanel_page18, "dsPanel_page18");

//        퀴즈
        JPanel dsChoicePanel_page1 = dsChoicePanel_page1();
        cards.add(dsChoicePanel_page1, "dsChoicePanel_page1");

        cardLayout.show(cards, "dsPanel_page1");
        dsFrame.setVisible(true);
        dsFrame.add(cards);

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

    private JPanel dsPanel_page1() {
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
        jlChatWindow1.setText("자료구조는 1학년 때 배운 인공지능하고 비슷한건가? 실습같은건 하는지 궁금하다.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsPanel_page2");
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

    private JPanel dsPanel_page2() {
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
        jlName.setText("미림이");
        jlAge.setText("18");
        jlChatWindow1.setText("수업을 교실에서 하는 걸 보니까 이론수업 인가보네.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsPanel_page3");
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

    private JPanel dsPanel_page3() {
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
        jlChatWindow1.setText("<html>자 종쳤으니까 자리에 앉고, 교과서 펴라. <br>그리고 선생님이 클래스룸에 교과서 pdf올려 놨으니까 그거 봐도 돼.</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsPanel_page4");
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

    private JPanel dsPanel_page4() {
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
        jlChatWindow1.setText("1페이지 펴볼까. 일단 간단히 자료구조의 정의에 대해서 배워보자.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsPanel_page5");
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

    private JPanel dsPanel_page5() {
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
        jlChatWindow1.setText("일단 자료구조의 자료에 대해서 알아볼까?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsPanel_page6");
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

    private JPanel dsPanel_page6() {
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
        jlChatWindow1.setText("<html>자료는 값을 컴퓨터에 입력 및 저장이 가능하여야 해.<br>그리고 처리한 결과를 정보로 활용되지.</html");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsPanel_page7");
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

    private JPanel dsPanel_page7() {
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
        jlChatWindow1.setText("자료구조는 컴퓨터 내부에서 형성된 자료와 자료의 논리적 관계야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsPanel_page8");
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

    private JPanel dsPanel_page8() {
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
        jlChatWindow1.setText("<html>자, 이제, 그 다음페이지에 알고리즘에 대해서 알아보자.<br>알고리즘은 자료와 깊은 관계가 있어</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsPanel_page9");
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

    private JPanel dsPanel_page9() {
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
        jlChatWindow1.setText(" 알고리즘의 정의는 문제 해결을 위해 자료를 토대로 원하는 결과를 만들어 내기 위한 규칙의 집합이야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsPanel_page10");
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

    private JPanel dsPanel_page10() {
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
        jlChatWindow1.setText("그럼 선생님의 질문에 대답해볼까?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsChoicePanel_page1");
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

    private JPanel dsChoicePanel_page1() {
        JPanel choicePanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background4.getImage(), 0, 0, null);
            }
        };
        choicePanel1.setLayout(null);

//        무엇을 선택할지
        jlChooseTitle = new JLabel("알고리즘 충족 요건으로 맞지 않은것은?");
        jlChooseTitle.setHorizontalAlignment(SwingConstants.CENTER);
        jlChooseTitle.setBounds(350, 120, 550,50);
        jlChooseTitle.setFont(new Font("맑은고딕", Font.BOLD, 20));
        jlChooseTitle.setBorder(border1);

//        선택지 버튼
        JButton subChooseButton1 = new JButton("무한성");
        subChooseButton1.setBackground(Color.WHITE);
        subChooseButton1.setBounds(350, 180, 550, 80);
        subChooseButton1.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsPanel_page11");
            }
        });

        JButton subChooseButton2 = new JButton("유한성");
        subChooseButton2.setBackground(Color.WHITE);
        subChooseButton2.setBounds(350, 270, 550, 80);
        subChooseButton2.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsPanel_page11");
            }
        });

        JButton subChooseButton3 = new JButton("명확성");
        subChooseButton3.setBackground(Color.WHITE);
        subChooseButton3.setBounds(350, 360, 550, 80);
        subChooseButton3.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsPanel_page11");
            }
        });

        JButton subChooseButton4 = new JButton("입력");
        subChooseButton4.setBackground(Color.WHITE);
        subChooseButton4.setBounds(350, 450, 550, 80);
        subChooseButton4.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsPanel_page11");
            }
        });

        JButton subChooseButton5 = new JButton("출력");
        subChooseButton5.setBackground(Color.WHITE);
        subChooseButton5.setBounds(350, 540, 550, 80);
        subChooseButton5.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsPanel_page11");
            }
        });

        JButton subChooseButton6 = new JButton("효과서");
        subChooseButton6.setBackground(Color.WHITE);
        subChooseButton6.setBounds(350, 630, 550, 80);
        subChooseButton6.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsPanel_page11");
            }
        });

        choicePanel1.add(jlChooseTitle);
        choicePanel1.add(subChooseButton1);
        choicePanel1.add(subChooseButton2);
        choicePanel1.add(subChooseButton3);
        choicePanel1.add(subChooseButton4);
        choicePanel1.add(subChooseButton5);
        choicePanel1.add(subChooseButton6);
        return choicePanel1;
    }

    //    퀴즈1 후
    private JPanel dsPanel_page11() {
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
        jlChatWindow1.setText("무한성은 유한성과 반대되는 말이니 무한성은 알고리즘 충족 요건에 맞지않아서 1번이 답이야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsPanel_page12");
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

    private JPanel dsPanel_page12() {
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
        jlName.setText("미림이");
        jlAge.setText("18");
        jlChatWindow1.setText("전문적인 언어가 많이 나오네. 열심히 정리해야 겠다.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsPanel_page13");
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

    private JPanel dsPanel_page13() {
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
        jlChatWindow1.setText("이번시간에는 포인터에 대해서 배워보자");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsPanel_page14");
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

    private JPanel dsPanel_page14() {
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
        jlName.setText("미림이");
        jlAge.setText("18");
        jlChatWindow1.setText("포인터? 포인터라는 말은 처음 들어보는 것 같다.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsPanel_page15");
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

    private JPanel dsPanel_page15() {
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
        jlChatWindow1.setText("포인터의 정의에 대해 알아볼까? 포인터는 주기억장치의 주소값이야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsPanel_page16");
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

    private JPanel dsPanel_page16() {
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
        jlChatWindow1.setText("포인터 변수에 데이터의 주소를 넣고, 한 번의 접근에도 데이터를 조작할 수 있어.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsPanel_page17");
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

    private JPanel dsPanel_page17() {
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
        jlChatWindow1.setText("이번 수업은 끝났다. 다음시간에 실습할거니까 c언어 툴 깔아와.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "dsPanel_page18");
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

    private JPanel dsPanel_page18() {
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
        jlName.setText("미림이");
        jlAge.setText("18");
        jlChatWindow1.setText("오. 이론만 하는 줄 알았는데 코드도 짜나보다. 다음 수업은 뭘 들을까?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                FinalFrame finalFrame = new FinalFrame();
                dsFrame.setVisible(false);
                finalFrame.create();
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



    public static void main(String args[]){
        DsPlayFrame dpFrame = new DsPlayFrame();
        dpFrame.create();
    }
}
