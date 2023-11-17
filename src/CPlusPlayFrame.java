import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CPlusPlayFrame extends JFrame {
    private JFrame CppFrame;
    private JPanel cards;
    private CardLayout cardLayout;

    Border border1 = BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.BLACK, 2), // Line border
            BorderFactory.createEmptyBorder(0, 10, 0, 0)   // Empty border (left padding)
    );
    JLabel jlName, jlAge, jlChatWindow1, jlChooseTitle;
    JButton nextButton;
    // 이미지 아이콘 선언
    ImageIcon background1 = new ImageIcon("src/img/background1.jpg");
    ImageIcon background2 = new ImageIcon("src/img/background2.jpg");
    ImageIcon background3 = new ImageIcon("src/img/background3.jpg");
    ImageIcon background4 = new ImageIcon("src/img/background4.jpg");

    ImageIcon student1 = new ImageIcon("src/img/student1.png");
    ImageIcon student2 = new ImageIcon("src/img/student2.png");
    ImageIcon student3 = new ImageIcon("src/img/student3.png");

    ImageIcon teacher1 = new ImageIcon("src/img/teacher1.png");
    ImageIcon teacher2 = new ImageIcon("src/img/teacher2.png");

    //대화창? 투명하게 하는거
    Color backgroundColor1 = new Color(255,255,255, 178);


    public void create() {

        CppFrame = new JFrame();
        CppFrame.setTitle("cpp");
        CppFrame.setSize(1300, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        CppFrame.setResizable(false);
        CppFrame.setLocationRelativeTo(null);
        CppFrame.setResizable(false);

        cardLayout = new CardLayout();
        cards = new JPanel(cardLayout);

//        첫번쨰 퀴즈 전
        JPanel CppPanel_page1 = CppPanel_page1();
        cards.add(CppPanel_page1, "CppPanel_page1");
        JPanel CppPanel_page2 = CppPanel_page2();
        cards.add(CppPanel_page2, "CppPanel_page2");
        JPanel CppPanel_page3 = CppPanel_page3();
        cards.add(CppPanel_page3, "CppPanel_page3");
        JPanel CppPanel_page4 = CppPanel_page4();
        cards.add(CppPanel_page4, "CppPanel_page4");
        JPanel CppPanel_page5 = CppPanel_page5();
        cards.add(CppPanel_page5, "CppPanel_page5");
        JPanel CppPanel_page6 = CppPanel_page6();
        cards.add(CppPanel_page6, "CppPanel_page6");
        JPanel CppPanel_page7 = CppPanel_page7();
        cards.add(CppPanel_page7, "CppPanel_page7");
        JPanel CppPanel_page8 = CppPanel_page8();
        cards.add(CppPanel_page8, "CppPanel_page8");

        //퀴즈 후
        JPanel CppPanel_page9_1 = CppPanel_page9_1();
        cards.add(CppPanel_page9_1, "CppPanel_page9_1");
        JPanel CppPanel_page9_2 = CppPanel_page9_2();
        cards.add(CppPanel_page9_2, "CppPanel_page9_2");
        JPanel CppPanel_page10 = CppPanel_page10();
        cards.add(CppPanel_page10, "CppPanel_page10");
        JPanel CppPanel_page11 = CppPanel_page11();
        cards.add(CppPanel_page11, "CppPanel_page11");
        JPanel CppPanel_page12 = CppPanel_page12();
        cards.add(CppPanel_page12, "CppPanel_page12");
        JPanel CppPanel_page13 = CppPanel_page13();
        cards.add(CppPanel_page13, "CppPanel_page13");
        JPanel CppPanel_page14 = CppPanel_page14();
        cards.add(CppPanel_page14, "CppPanel_page14");

        //        2번째 퀴즈 후
        JPanel CppPanel_page15_1 = CppPanel_page15_1();
        cards.add(CppPanel_page15_1, "CppPanel_page15_1");
        JPanel CppPanel_page15_2 = CppPanel_page15_2();
        cards.add(CppPanel_page15_2, "CppPanel_page15_2");
        JPanel CppPanel_page16 = CppPanel_page16();
        cards.add(CppPanel_page16, "CppPanel_page16");
        JPanel CppPanel_page17 = CppPanel_page17();
        cards.add(CppPanel_page17, "CppPanel_page17");
        JPanel CppPanel_page18 = CppPanel_page18();
        cards.add(CppPanel_page18, "CppPanel_page18");

//        퀴즈
        JPanel CppChoicePanel_page1 = CppChoicePanel_page1();
        cards.add(CppChoicePanel_page1, "CppChoicePanel_page1");
        JPanel CppChoicePanel_page2 = CppChoicePanel_page2();
        cards.add(CppChoicePanel_page2, "CppChoicePanel_page2");


        cardLayout.show(cards, "CppPanel_page1");
        CppFrame.setVisible(true);
        CppFrame.add(cards);

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


    private JPanel CppPanel_page1() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("미림이");
        jlAge.setText("18");
        jlChatWindow1.setText("이번 수업은… 어.. 뭐라고 읽는 거지? 씨플러스플러스?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page2");
            }
        });

        JLabel characterLabel = new JLabel(student1);
        characterLabel.setBounds(450, -24, 360, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel CppPanel_page2() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("친구들");
        jlAge.setText("18");
        jlChatWindow1.setText("선배들 얘기 들어보니까 씨쁠쁠이라고 읽는 것 같더라.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page3");
            }
        });

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel CppPanel_page3() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("미림이");
        jlAge.setText("18");
        jlChatWindow1.setText("아! 그렇구나. 알려줘서 고마워.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page4");
            }
        });

        JLabel characterLabel = new JLabel(student3);
        characterLabel.setBounds(400, -24, 450, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel CppPanel_page4() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("선생님");
        jlAge.setText("??");
        jlChatWindow1.setText("다들 안녕. c++ 수업은 이번이 처음이지? 잘 부탁한다.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page5");
            }
        });

        JLabel characterLabel = new JLabel(teacher2);
        characterLabel.setBounds(360, -24, 600, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel CppPanel_page5() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("친구들");
        jlAge.setText("18");
        jlChatWindow1.setText("네!");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page6");
            }
        });

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel CppPanel_page6() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("선생님");
        jlAge.setText("??");
        jlChatWindow1.setText("과목명이 c++인 걸 보고 c를 떠올린 친구들이 많을 거야. 정규 수업시간이나 방과후 때 배워본 친구들 있지?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page7");
            }
        });

        JLabel characterLabel = new JLabel(teacher1);
        characterLabel.setBounds(450, -24, 420, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel CppPanel_page7() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("친구들");
        jlAge.setText("18");
        jlChatWindow1.setText("네!");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page8");
            }
        });

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel CppPanel_page8() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("선생님");
        jlAge.setText("??");
        jlChatWindow1.setText("<html>" + "일단 그럼 간단한 문제를 내볼테니 감으로 한 번 풀어봐." + "<br/>"
                + "틀려도 좋아. 여기 문제 중에서 C와 C++에 대한 차이점을 골라봐." + "</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppChoicePanel_page1");
            }
        });

        JLabel characterLabel = new JLabel(teacher1);
        characterLabel.setBounds(450, -24, 420, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }


    private JPanel CppChoicePanel_page1() {
        JPanel choicePanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        choicePanel1.setLayout(null);
        info();

//        무엇을 선택할지
        jlChooseTitle.setText("알맞은 것을 골라보자");

//        선택지 버튼
        JButton subChooseButton1 = new JButton("C는 절차지향 언어, C++은 객체지향 언어이다.");
        subChooseButton1.setBackground(Color.WHITE);
        subChooseButton1.setBounds(350, 200, 550, 100);
        subChooseButton1.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page9_1");
            }
        });

        JButton subChooseButton2 = new JButton("<html>" + "C는 컴파일 되어 기계코드로 변환하지만," +
                "<br>" + "C는 공용언어 타임으로 컴파일 된다." + "</html>");
        subChooseButton2.setBackground(Color.WHITE);
        subChooseButton2.setBounds(350, 350, 550, 100);
        subChooseButton2.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page9_2");
            }
        });

        JButton subChooseButton3 = new JButton("C는 이식성이 좋고, C++은 이식성이 좋지 못하다. ");
        subChooseButton3.setBackground(Color.WHITE);
        subChooseButton3.setBounds(350, 500, 550, 100);
        subChooseButton3.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page9_2");

            }
        });

        choicePanel1.add(jlChooseTitle);
        choicePanel1.add(subChooseButton1);
        choicePanel1.add(subChooseButton2);
        choicePanel1.add(subChooseButton3);
        return choicePanel1;
    }

    private JPanel CppPanel_page9_1() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("선생님");
        jlAge.setText("??");
        jlChatWindow1.setText("정답이야! 잘했어.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page10");
            }
        });

        JLabel characterLabel = new JLabel(teacher1);
        characterLabel.setBounds(450, -24, 420, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel CppPanel_page9_2() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("선생님");
        jlAge.setText("??");
        jlChatWindow1.setText("틀렸지만, 그래도 잘했어. C는 절차지향언어고 C++은 객체지향 언어야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page10");
            }
        });

        JLabel characterLabel = new JLabel(teacher1);
        characterLabel.setBounds(450, -24, 420, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel CppPanel_page10() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("선생님");
        jlAge.setText("??");
        jlChatWindow1.setText("C와 C++의 가장 큰 차이점은 C는 절차지향 언어, C++은 객체지향 언어라는 점이야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page11");
            }
        });

        JLabel characterLabel = new JLabel(teacher1);
        characterLabel.setBounds(450, -24, 420, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }
    //    퀴즈 1



    private JPanel CppPanel_page11() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("선생님");
        jlAge.setText("??");
        jlChatWindow1.setText("<html>" + "그리고 한 가지 더. C의 컴파일러는 C++의 코드를 컴파일하지 못하는데" +
                "<br/>" + "C++의 컴파일러는 C코드를 컴파일 하는 게 가능해." + "</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page12");
            }
        });

        JLabel characterLabel = new JLabel(teacher2);
        characterLabel.setBounds(360, -24, 600, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel CppPanel_page12() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("미림이");
        jlAge.setText("18");
        jlChatWindow1.setText("오, 이건 몰랐던 사실이야. 신기한걸?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page13");
            }
        });

        JLabel characterLabel = new JLabel(student1);
        characterLabel.setBounds(450, -24, 360, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }


    private JPanel CppPanel_page13() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("선생님");
        jlAge.setText("??");
        jlChatWindow1.setText("그럼, 이제 어느 정도 C++에 대해 알게 되었으니 출력문부터 배워볼까.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page14");
            }
        });

        JLabel characterLabel = new JLabel(teacher1);
        characterLabel.setBounds(450, -24, 420, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel CppPanel_page14() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("선생님");
        jlAge.setText("??");
        jlChatWindow1.setText("여기서 한 번 더 문제. 이 중 C++에서 쓰이는 출력문은 무엇일까?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppChoicePanel_page2");
            }
        });

        JLabel characterLabel = new JLabel(teacher2);
        characterLabel.setBounds(360, -24, 600, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel CppChoicePanel_page2() {
        JPanel choicePanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        choicePanel1.setLayout(null);
        info();

//        무엇을 선택할지
        jlChooseTitle.setText("맞는 걸 골라보자");

//        선택지 버튼
        JButton subChooseButton1 = new JButton("printf");
        subChooseButton1.setBackground(Color.WHITE);
        subChooseButton1.setBounds(350, 200, 550, 100);
        subChooseButton1.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page15_2");
            }
        });

        JButton subChooseButton2 = new JButton("print");
        subChooseButton2.setBackground(Color.WHITE);
        subChooseButton2.setBounds(350, 330, 550, 100);
        subChooseButton2.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page15_2");
            }
        });

        JButton subChooseButton3 = new JButton("cout");
        subChooseButton3.setBackground(Color.WHITE);
        subChooseButton3.setBounds(350, 460, 550, 100);
        subChooseButton3.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page15_1");
            }
        });

        JButton subChooseButton4 = new JButton("printf_s");
        subChooseButton4.setBackground(Color.WHITE);
        subChooseButton4.setBounds(350, 590, 550, 100);
        subChooseButton4.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page15_2");
            }
        });

        choicePanel1.add(jlChooseTitle);
        choicePanel1.add(subChooseButton1);
        choicePanel1.add(subChooseButton2);
        choicePanel1.add(subChooseButton3);
        choicePanel1.add(subChooseButton4);
        return choicePanel1;
    }

    private JPanel CppPanel_page15_1() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("맞아! 정답이야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page16");
            }
        });

        JLabel characterLabel = new JLabel(teacher1);
        characterLabel.setBounds(450, -24, 420, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel CppPanel_page15_2() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("아쉽지만 그래도 잘했어!");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page16");
            }
        });

        JLabel characterLabel = new JLabel(teacher1);
        characterLabel.setBounds(450, -24, 420, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }



    private JPanel CppPanel_page16() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("선생님");
        jlAge.setText("??");
        jlChatWindow1.setText("<html>" + "C++에서는 cout라는 출력문을 주로 써. printf도 쓰이긴 하지만 cout를 더 많이 사용해." +
                "<br/>" + "그리고 cin이라는 출력문도 같이 사용되니 둘 다 기억하고 있으렴." + "</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page17");
            }
        });

        JLabel characterLabel = new JLabel(teacher2);
        characterLabel.setBounds(360, -24, 600, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel CppPanel_page17() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("선생님");
        jlAge.setText("??");
        jlChatWindow1.setText("자, 오늘 수업은 여기까지. 첫 수업임에도 불구하고 다들 잘 따라와줘서 고마워! 다음 시간에 보자.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "CppPanel_page18");
            }
        });

        JLabel characterLabel = new JLabel(teacher1);
        characterLabel.setBounds(450, -24, 420, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }


    private JPanel CppPanel_page18() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("미림이");
        jlAge.setText("18");
        jlChatWindow1.setText("<html>" + "C에 이상한 특수기호가 붙어서 어려운 건 아닐까 조금 긴장했었는데," +
                "<br>" + "실제로 수업을 들어보니 그 긴장이 조금 간 것 같아. 재밌는 수업이었어!" + "</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FinalFrame finalFrame = new FinalFrame();
                CppFrame.setVisible(false);
                finalFrame.create();
            }
        });

        JLabel characterLabel = new JLabel(student3);
        characterLabel.setBounds(400, -24, 450, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    public static void main(String args[]) {
        CPlusPlayFrame jpFrame = new CPlusPlayFrame();
        jpFrame.create();
    }
}
