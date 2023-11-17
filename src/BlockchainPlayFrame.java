import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BlockchainPlayFrame extends JFrame {
    private JFrame blockchainFrame;
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
    ImageIcon background5 = new ImageIcon("src/img/background5.jpg");
    ImageIcon background6 = new ImageIcon("src/img/background6.jpg");

    ImageIcon student1 = new ImageIcon("src/img/student1.png");
    ImageIcon student2 = new ImageIcon("src/img/student2.png");
    ImageIcon student3 = new ImageIcon("src/img/student3.png");

    ImageIcon teacher1 = new ImageIcon("src/img/teacher1.png");
    ImageIcon teacher2 = new ImageIcon("src/img/teacher2.png");

    //대화창? 투명하게 하는거
    Color backgroundColor1 = new Color(255,255,255, 178);


    public void create() {

        blockchainFrame = new JFrame();
        blockchainFrame.setTitle("blockchain");
        blockchainFrame.setSize(1300, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        blockchainFrame.setResizable(false);
        blockchainFrame.setLocationRelativeTo(null);
        blockchainFrame.setResizable(false);

        cardLayout = new CardLayout();
        cards = new JPanel(cardLayout);

//        첫번쨰 퀴즈 전
        JPanel blockchainPanel_page1 = blockchainPanel_page1();
        cards.add(blockchainPanel_page1, "blockchainPanel_page1");
        JPanel blockchainPanel_page2 = blockchainPanel_page2();
        cards.add(blockchainPanel_page2, "blockchainPanel_page2");
        JPanel blockchainPanel_page3 = blockchainPanel_page3();
        cards.add(blockchainPanel_page3, "blockchainPanel_page3");
        JPanel blockchainPanel_page4 = blockchainPanel_page4();
        cards.add(blockchainPanel_page4, "blockchainPanel_page4");
        JPanel blockchainPanel_page5 = blockchainPanel_page5();
        cards.add(blockchainPanel_page5, "blockchainPanel_page5");
        JPanel blockchainPanel_page6 = blockchainPanel_page6();
        cards.add(blockchainPanel_page6, "blockchainPanel_page6");
        JPanel blockchainPanel_page7 = blockchainPanel_page7();
        cards.add(blockchainPanel_page7, "blockchainPanel_page7");
        JPanel blockchainPanel_page8 = blockchainPanel_page8();
        cards.add(blockchainPanel_page8, "blockchainPanel_page8");
//        2번째 퀴즈 전
        JPanel blockchainPanel_page9_1 = blockchainPanel_page9();
        cards.add(blockchainPanel_page9_1, "blockchainPanel_page9");
        JPanel blockchainPanel_page10 = blockchainPanel_page10();
        cards.add(blockchainPanel_page10, "blockchainPanel_page10");
        JPanel blockchainPanel_page11 = blockchainPanel_page11();
        cards.add(blockchainPanel_page11, "blockchainPanel_page11");
        JPanel blockchainPanel_page12 = blockchainPanel_page12();
        cards.add(blockchainPanel_page12, "blockchainPanel_page12");
        JPanel blockchainPanel_page13_1 = blockchainPanel_page13_1();
        cards.add(blockchainPanel_page13_1, "blockchainPanel_page13_1");
        JPanel blockchainPanel_page13_2 = blockchainPanel_page13_2();
        cards.add(blockchainPanel_page13_2, "blockchainPanel_page13_2");
        JPanel blockchainPanel_page14 = blockchainPanel_page14();
        cards.add(blockchainPanel_page14, "blockchainPanel_page14");
        JPanel blockchainPanel_page15 = blockchainPanel_page15();
        cards.add(blockchainPanel_page15, "blockchainPanel_page15");

//        3번째 퀴즈 전
        JPanel blockchainPanel_page16_1 = blockchainPanel_page16_1();
        cards.add(blockchainPanel_page16_1, "blockchainPanel_page16_1");
        JPanel blockchainPanel_page16_2 = blockchainPanel_page16_2();
        cards.add(blockchainPanel_page16_2, "blockchainPanel_page16_2");
        JPanel blockchainPanel_page17 = blockchainPanel_page17();
        cards.add(blockchainPanel_page17, "blockchainPanel_page17");
        JPanel blockchainPanel_page18 = blockchainPanel_page18();
        cards.add(blockchainPanel_page18, "blockchainPanel_page18");
        JPanel blockchainPanel_page19 = blockchainPanel_page19();
        cards.add(blockchainPanel_page19, "blockchainPanel_page19");

//        퀴즈
        JPanel blockchainChoicePanel_page1 = blockchainChoicePanel_page1();
        cards.add(blockchainChoicePanel_page1, "blockchainChoicePanel_page1");
        JPanel blockchainChoicePanel_page2 = blockchainChoicePanel_page2();
        cards.add(blockchainChoicePanel_page2, "blockchainChoicePanel_page2");


        cardLayout.show(cards, "blockchainPanel_page1");
        blockchainFrame.setVisible(true);
        blockchainFrame.add(cards);

    }

    public void info() {
        //        닉네임
        jlName = new JLabel("선생님");
        jlName.setBounds(100, 500, 130, 50);
        jlName.setHorizontalAlignment(SwingConstants.CENTER);
        jlName.setFont(new Font("맑은고딕", Font.BOLD, 20));
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

    private JPanel blockchainPanel_page1() {
        //JPanel playPanel1 선언한 부분 한줄 복붙
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background1.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlAge.setText("18");
        jlName.setText("미림이");
        jlChatWindow1.setText("<html>" + "맞다, 블록체인은 학교 밖을 나가서 듣는 수업이라고 했었지?" +
                "<br/>"+ "기대된다~ 그럼 짐도 다 챙겼으니 버스에 타볼까!" + "</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page2");
            }
        });

        JLabel characterLabel = new JLabel(student2);
        characterLabel.setBounds(450, -24, 360, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel blockchainPanel_page2() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background5.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlAge.setText("18");
        jlName.setText("미림이");
        jlChatWindow1.setText("와아. 중앙대는 처음 와보는데 신기해~ 캠퍼스가 이런 거구나~");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page3");
            }
        });

        JLabel characterLabel = new JLabel(student2);
        characterLabel.setBounds(450, -24, 360, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel blockchainPanel_page3() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background5.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlAge.setText("??");
        jlName.setText("선생님");
        jlChatWindow1.setText("<html>" + "안녕~ 난 블록체인을 가르쳐줄 선생님이야." + "<br/>"+
                "옆에는 같이 수업 진행해주실 다른 선생님이시고, 앞으로 블록체인 수업 때는 학교 선생님께서 보조 역할로 같이 와주실 거야."+"</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page4");
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

    private JPanel blockchainPanel_page4() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background5.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("그럼 중앙대는 처음이니까 일단 가볍게 캠퍼스 투어부터 해볼까?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page5");
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

    private JPanel blockchainPanel_page5() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background5.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlAge.setText("18");
        jlName.setText("친구들");
        jlChatWindow1.setText("좋아요~!!");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page6");
            }
        });

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel blockchainPanel_page6() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background6.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlAge.setText("18");
        jlName.setText("미림이");
        jlChatWindow1.setText("학교 밖을 나오니 숨통이 트이는 기분이었어! 그리고 캠퍼스도 아주 예쁜걸~");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page7");
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

    private JPanel blockchainPanel_page7() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background6.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlAge.setText("??");
        jlName.setText("선생님");
        jlChatWindow1.setText("자, 첫 시간이니까 가볍게 진행할게. 다들 블록체인이 뭔지 알고 있니?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page8");
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

    private JPanel blockchainPanel_page8() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background6.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlAge.setText("18");
        jlName.setText("미림이");
        jlChatWindow1.setText("<html>"+"음… 대충 들어보긴 했지만 뭔지는 잘 모르겠는데…" +
                "<br/>" + "프로그래밍 언어 이름인가? 아니면 툴 이름?" + "</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page9");
            }
        });

        JLabel characterLabel = new JLabel(student1);
        characterLabel.setBounds(400, -24, 450, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    //    퀴즈 1
    private JPanel blockchainPanel_page9() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background6.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlAge.setText("??");
        jlName.setText("선생님");
        jlChatWindow1.setText("자, 블록체인은 인공지능(AI), 빅데이터(BigDATA)," +
                "<br/>" + "사물인터넷(IoT)과 더불어 핵심적으로 부상되고 있는 기술이야. ");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page10");
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

    private JPanel blockchainPanel_page10() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background6.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("<html>" + "다들 비트코인 들어본 적 있지? 블록체인이 만들어진 건 1980년대였으나" +
                "<br/>" + "널리 알려지기 시작한 건 2008년 비트코인의 탄생부터야." + "<br/>" +
                "사토시 나카모토라는 사람, 혹은 단체가 비트코인에 대한" + "<br/>" +
                "논문을 발표하면서부터 널리 퍼지게 되었지." + "</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page11");
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

    private JPanel blockchainPanel_page11() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background6.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlAge.setText("18");
        jlName.setText("미림이");
        jlChatWindow1.setText("아하, 비트코인에 대한 건 말로만 들어봤는데 블록체인과도 관련이 있었구나!");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page12");
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

    private JPanel blockchainPanel_page12() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background6.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

        //        대화창
        jlAge.setText("??");
        jlName.setText("선생님");
        jlChatWindow1.setText("맞아. 자 그러면 여기서 문제. 2013년에 비탈릭 부테인이 만든 디지털 화폐는 무엇일까?");
        //        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainChoicePanel_page1");
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

    private JPanel blockchainChoicePanel_page1() {
        JPanel choicePanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background6.getImage(), 0, 0, null);
            }
        };
        choicePanel1.setLayout(null);
        info();

//        무엇을 선택할지
        jlChooseTitle.setText("맞는 걸 골라보자");

//        선택지 버튼
        JButton subChooseButton1 = new JButton("이더리움");
        subChooseButton1.setBackground(Color.WHITE);
        subChooseButton1.setBounds(350, 200, 550, 100);
        subChooseButton1.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page13_1");
            }
        });

        JButton subChooseButton2 = new JButton("도지코인");
        subChooseButton2.setBackground(Color.WHITE);
        subChooseButton2.setBounds(350, 350, 550, 100);
        subChooseButton2.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page13_2");
            }
        });

        JButton subChooseButton3 = new JButton("리플");
        subChooseButton3.setBackground(Color.WHITE);
        subChooseButton3.setBounds(350, 500, 550, 100);
        subChooseButton3.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page13_2");
            }
        });

        choicePanel1.add(jlChooseTitle);
        choicePanel1.add(subChooseButton1);
        choicePanel1.add(subChooseButton2);
        choicePanel1.add(subChooseButton3);
        return choicePanel1;
    }

    private JPanel blockchainPanel_page13_1() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background6.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("정답이야! 2013년에 바탈릭 부테인이 만든 디지털 화폐는 이더리움이야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page14");
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

    private JPanel blockchainPanel_page13_2() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background6.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("틀렸지만 잘했어~. 2013년에 바탈릭 부테인이 만든 디지털 화폐는 이더리움이야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page14");
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

    private JPanel blockchainPanel_page14() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background6.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("다음 문제도 내볼게. 블록체인은 사용자와 사용자간의 거래를 우선으로 해.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page15");
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

    private JPanel blockchainPanel_page15() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background6.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("그러면, 여기서 블록체인의 특징으로 볼 수 없는 것은 무엇일까?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainChoicePanel_page2");
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

    //    퀴즈2
    private JPanel blockchainChoicePanel_page2() {
        JPanel choicePanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background6.getImage(), 0, 0, null);
            }
        };
        choicePanel1.setLayout(null);
        info();

//        무엇을 선택할지
        jlChooseTitle.setText("틀린 설명을 골라보자");

//        선택지 버튼
        JButton subChooseButton1 = new JButton("가격절감");
        subChooseButton1.setBackground(Color.WHITE);
        subChooseButton1.setBounds(350, 200, 550, 100);
        subChooseButton1.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page16_2");
            }
        });

        JButton subChooseButton2 = new JButton("중앙화 방식");
        subChooseButton2.setBackground(Color.WHITE);
        subChooseButton2.setBounds(350, 330, 550, 100);
        subChooseButton2.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page16_1");
            }
        });

        JButton subChooseButton3 = new JButton("보안 증가");
        subChooseButton3.setBackground(Color.WHITE);
        subChooseButton3.setBounds(350, 460, 550, 100);
        subChooseButton3.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page16_2");
            }
        });


        choicePanel1.add(jlChooseTitle);
        choicePanel1.add(subChooseButton1);
        choicePanel1.add(subChooseButton2);
        choicePanel1.add(subChooseButton3);
        return choicePanel1;
    }

    private JPanel blockchainPanel_page16_1() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background6.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("맞아! 아주 잘했어. 이번 수업은 여기까지야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page17");
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

    private JPanel blockchainPanel_page16_2() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background6.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("틀렸지만 잘했어! 이번 수업은 여기까지야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page17");
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

    private JPanel blockchainPanel_page17() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background6.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("선생님");
        jlAge.setText("??");
        jlChatWindow1.setText("<html>" + "자, 첫 시간임에도 불구하고 모두 잘 따라와줘서 고마워." + "<br/>" +
                "다음 수업 때 보자! 이 근처에 7호선 상도역이랑" + "<br/>" +
                "9호선 흑석역이 있으니까 각자 자기한테 맞는 쪽으로 잘 찾아가렴." + "</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page18");
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


    private JPanel blockchainPanel_page18() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background6.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("친구들");
        jlAge.setText("??");
        jlChatWindow1.setText("네, 감사합니다!");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "blockchainPanel_page19");
            }
        });

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel blockchainPanel_page19() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background6.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("미림이");
        jlAge.setText("18");
        jlChatWindow1.setText("<html>"+"블록체인이 기술의 이름인 건 몰랐어. 분명 툴이나 언어 같은 거라 생각했었는데 말이야…" +
                "<br/>"+ "첫 수업이 좋았는걸! 앞으로의 수업도 기대돼." + "</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                FinalFrame finalFrame = new FinalFrame();
                blockchainFrame.setVisible(false);
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
        BlockchainPlayFrame jpFrame = new BlockchainPlayFrame();
        jpFrame.create();
    }
}
