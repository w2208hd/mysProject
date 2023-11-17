import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PHPPlayFrame extends JFrame {
    private JFrame phpFrame;
    private JPanel cards;
    private CardLayout cardLayout;

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


    //    style
    //대화창? 투명하게 하는거
    Color backgroundColor1 = new Color(255,255,255, 178);

    Border border1 = BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.BLACK, 2), // Line border
            BorderFactory.createEmptyBorder(0, 10, 0, 0)   // Empty border (left padding)
    );
    JLabel jlName, jlAge, jlChatWindow1, jlChooseTitle;
    JButton nextButton;


    public void create() {

        phpFrame = new JFrame();
        phpFrame.setTitle("php");
        phpFrame.setSize(1300, 800);
        setLayout(null);
        phpFrame.setLocationRelativeTo(null);
        phpFrame.setResizable(false);

        cardLayout = new CardLayout();
        cards = new JPanel(cardLayout);

//        첫번쨰 퀴즈 전
        JPanel PHPPanel_page1 = PHPPanel_page1();
        cards.add(PHPPanel_page1, "PHPPanel_page1");
        JPanel PHPPanel_page2 = PHPPanel_page2();
        cards.add(PHPPanel_page2, "PHPPanel_page2");
        JPanel PHPPanel_page3 = PHPPanel_page3();
        cards.add(PHPPanel_page3, "PHPPanel_page3");
        JPanel PHPPanel_page4 = PHPPanel_page4();
        cards.add(PHPPanel_page4, "PHPPanel_page4");
        JPanel PHPPanel_page5 = PHPPanel_page5();
        cards.add(PHPPanel_page5, "PHPPanel_page5");
        JPanel PHPPanel_page6 = PHPPanel_page6();
        cards.add(PHPPanel_page6, "PHPPanel_page6");
        JPanel PHPPanel_page7 = PHPPanel_page7();
        cards.add(PHPPanel_page7, "PHPPanel_page7");

        //퀴즈 후
        JPanel PHPPanel_page8_1 = PHPPanel_page8_1();
        cards.add(PHPPanel_page8_1, "PHPPanel_page8_1");
        JPanel PHPPanel_page8_2 = PHPPanel_page8_2();
        cards.add(PHPPanel_page8_2, "PHPPanel_page8_2");
        JPanel PHPPanel_page9 = PHPPanel_page9();
        cards.add(PHPPanel_page9, "PHPPanel_page9");
        JPanel PHPPanel_page10 = PHPPanel_page10();
        cards.add(PHPPanel_page10, "PHPPanel_page10");
        JPanel PHPPanel_page11 = PHPPanel_page11();
        cards.add(PHPPanel_page11, "PHPPanel_page11");
        JPanel PHPPanel_page12 = PHPPanel_page12();
        cards.add(PHPPanel_page12, "PHPPanel_page12");

        //        2번째 퀴즈 후
        JPanel PHPPanel_page13_1 = PHPPanel_page13_1();
        cards.add(PHPPanel_page13_1, "PHPPanel_page13_1");
        JPanel PHPPanel_page13_2 = PHPPanel_page13_2();
        cards.add(PHPPanel_page13_2, "PHPPanel_page13_2");
        JPanel PHPPanel_page14 = PHPPanel_page14();
        cards.add(PHPPanel_page14, "PHPPanel_page14");
        JPanel PHPPanel_page15 = PHPPanel_page15();
        cards.add(PHPPanel_page15, "PHPPanel_page15");
        JPanel PHPPanel_page16 = PHPPanel_page16();
        cards.add(PHPPanel_page16, "PHPPanel_page16");

//        퀴즈
        JPanel PHPChoicePanel_page1 = PHPChoicePanel_page1();
        cards.add(PHPChoicePanel_page1, "PHPChoicePanel_page1");
        JPanel PHPChoicePanel_page2 = PHPChoicePanel_page2();
        cards.add(PHPChoicePanel_page2, "PHPChoicePanel_page2");


        // 라벨 생성



        cardLayout.show(cards, "PHPPanel_page1");
        phpFrame.setVisible(true);
        phpFrame.add(cards);

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


    private JPanel PHPPanel_page1() {
        //JPanel playPanel1 선언한 부분 한줄 복붙
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("미림이");
        jlAge.setText("18");
        jlChatWindow1.setText("<html>" + " php는 들어본 적은 있는데… 잘은 모르겠어. 서버 언어라고 했던가?" +
                "<br>" + "선택과목 중에 있었던 걸로 기억해."+"</html>");
//        다음rdsssc
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPPanel_page2");
            }

        });

        JLabel characterLabel = new JLabel(student1);
        characterLabel.setBounds(450, -24, 450, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);

        return playPanel1;
    }

    private JPanel PHPPanel_page2() {
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
        jlChatWindow1.setText("다들 반가워. 나는 이번에 php를 가르치게 된 선생님이야. 다들 php가 무엇인지 알고 있니?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPPanel_page3");
            }
        });

        JLabel characterLabel = new JLabel(teacher1);
        characterLabel.setBounds(450, -24, 360, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel PHPPanel_page3() {
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
        jlChatWindow1.setText("흠... 나는... 잘 모르겠다...");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPPanel_page4");
            }
        });

        JLabel characterLabel = new JLabel(student1);
        characterLabel.setBounds(450, -24, 420, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel PHPPanel_page4() {
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
        jlChatWindow1.setText("<html>" + "php는 서버 언어 중 하나야. html과 연동해서 쓰는 서버언어인데," + "<br/>" +
                "클라이언트 쪽에서 요청을 보내면 응답을 해주는 쪽이 서버지. 그리고 php가 그런 역할이야." + "</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPPanel_page5");
            }
        });

        JLabel characterLabel = new JLabel(teacher2);
        characterLabel.setBounds(330, -24, 600, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel PHPPanel_page5() {
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
        jlChatWindow1.setText("그렇기에 php 수업에서는 html도 같이 쓴단다. 다들 html 기본은 배워본 적 있지?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPPanel_page6");
            }
        });

        JLabel characterLabel = new JLabel(teacher2);
        characterLabel.setBounds(330, -24, 600, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel PHPPanel_page6() {
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
        jlChatWindow1.setText("네!!");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPPanel_page7");
            }
        });

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel PHPPanel_page7() {
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
        jlChatWindow1.setText("좋아. 그럼 여기서 문제 하나 낼게. php를 시작하는 첫 줄은 무엇일까?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPChoicePanel_page1");
            }
        });

        JLabel characterLabel = new JLabel(teacher2);
        characterLabel.setBounds(330, -24, 600, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }


    private JPanel PHPChoicePanel_page1() {
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
        JButton subChooseButton1 = new JButton("#php");
        subChooseButton1.setBackground(Color.WHITE);
        subChooseButton1.setBounds(350, 200, 550, 100);
        subChooseButton1.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPPanel_page8_2");
            }
        });

        JButton subChooseButton2 = new JButton("php class {");
        subChooseButton2.setBackground(Color.WHITE);
        subChooseButton2.setBounds(350, 350, 550, 100);
        subChooseButton2.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPPanel_page8_2");
            }
        });

        JButton subChooseButton3 = new JButton("<?php");
        subChooseButton3.setBackground(Color.WHITE);
        subChooseButton3.setBounds(350, 500, 550, 100);
        subChooseButton3.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPPanel_page8_1");

            }
        });


        choicePanel1.add(jlChooseTitle);
        choicePanel1.add(subChooseButton1);
        choicePanel1.add(subChooseButton2);
        choicePanel1.add(subChooseButton3);
        return choicePanel1;
    }

    private JPanel PHPPanel_page8_1() {
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
        jlChatWindow1.setText("정답이야! 아주 잘 맞췄어.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPPanel_page9");
            }
        });

        JLabel characterLabel = new JLabel(teacher1);
        characterLabel.setBounds(450, -24, 360, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel PHPPanel_page8_2() {
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
        jlChatWindow1.setText("틀렸지만 그래도 잘했어.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPPanel_page9");
            }
        });

        JLabel characterLabel = new JLabel(teacher1);
        characterLabel.setBounds(450, -24, 360, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel PHPPanel_page9() {
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
        jlChatWindow1.setText("신기하다! html이 생각나는 것 같기도 해.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPPanel_page10");
            }
        });

        JLabel characterLabel = new JLabel(student3);
        characterLabel.setBounds(350, -24, 600, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel PHPPanel_page10() {
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
        jlChatWindow1.setText("php는 <?php로 시작해서 ?>로 끝나. 다들 기억해둬. 알겠지?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPPanel_page11");
            }
        });

        JLabel characterLabel = new JLabel(teacher2);
        characterLabel.setBounds(330, -24, 600, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }
    //    퀴즈 1



    private JPanel PHPPanel_page11() {
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
                cardLayout.show(cards, "PHPPanel_page12");
            }
        });

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel PHPPanel_page12() {
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
        jlChatWindow1.setText("<html>"+"그리고 하나 더. php의 가장 큰 특징으로는 변수 앞에 특이한 기호가 하나 붙어." +
                "<br/>" + "그렇다면 이 기호는 무엇일까?" + "</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPChoicePanel_page2");
            }
        });

        JLabel characterLabel = new JLabel(teacher2);
        characterLabel.setBounds(330, -24, 600, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel PHPChoicePanel_page2() {
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
        JButton subChooseButton1 = new JButton("&");
        subChooseButton1.setBackground(Color.WHITE);
        subChooseButton1.setBounds(350, 200, 550, 100);
        subChooseButton1.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPPanel_page13_2");
            }
        });

        JButton subChooseButton2 = new JButton("#");
        subChooseButton2.setBackground(Color.WHITE);
        subChooseButton2.setBounds(350, 330, 550, 100);
        subChooseButton2.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPPanel_page13_2");
            }
        });

        JButton subChooseButton3 = new JButton("%");
        subChooseButton3.setBackground(Color.WHITE);
        subChooseButton3.setBounds(350, 460, 550, 100);
        subChooseButton3.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPPanel_page13_2");
            }
        });

        JButton subChooseButton4 = new JButton("$");
        subChooseButton4.setBackground(Color.WHITE);
        subChooseButton4.setBounds(350, 590, 550, 100);
        subChooseButton4.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPPanel_page13_1");
            }
        });

        choicePanel1.add(jlChooseTitle);
        choicePanel1.add(subChooseButton1);
        choicePanel1.add(subChooseButton2);
        choicePanel1.add(subChooseButton3);
        choicePanel1.add(subChooseButton4);
        return choicePanel1;
    }

    private JPanel PHPPanel_page13_1() {
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
        jlChatWindow1.setText("맞아! 아주 잘했어.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPPanel_page14");
            }
        });

        JLabel characterLabel = new JLabel(teacher1);
        characterLabel.setBounds(450, -24, 360, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel PHPPanel_page13_2() {
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
        jlChatWindow1.setText("아쉽지만 잘했어!");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPPanel_page14");
            }
        });

        JLabel characterLabel = new JLabel(teacher1);
        characterLabel.setBounds(450, -24, 360, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel PHPPanel_page14() {
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
        jlChatWindow1.setText("다음시간부터는 html과 php를 같이 써보는 식으로 배워볼게. 다들 첫 수업 듣느라 수고했어!");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPPanel_page15");
            }
        });

        JLabel characterLabel = new JLabel(teacher1);
        characterLabel.setBounds(450, -24, 360, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel PHPPanel_page15() {
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
        jlAge.setText("17");
        jlChatWindow1.setText("네! 감사합니다!");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "PHPPanel_page16");
            }
        });

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }
    //    퀴즈2


    private JPanel PHPPanel_page16() {
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
        jlChatWindow1.setText("1학년 때 배운 html을 같이 쓰는건 몰랐네. 그래도 재밌겠는걸! 기대가 되는 수업이야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                FinalFrame finalFrame = new FinalFrame();
                phpFrame.setVisible(false);
                finalFrame.create();
            }
        });

        JLabel characterLabel = new JLabel(student3);
        characterLabel.setBounds(350, -24, 600, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }


    public static void main(String args[]) {
        PHPPlayFrame jpFrame = new PHPPlayFrame();
        jpFrame.create();
    }
}
