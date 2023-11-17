import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WSMPlayFrame extends JFrame {
    private JFrame wsmFrame;
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

        wsmFrame = new JFrame();
        wsmFrame.setTitle("WSM");
        wsmFrame.setSize(1300, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        wsmFrame.setResizable(false);
        wsmFrame.setLocationRelativeTo(null);
        wsmFrame.setResizable(false);

        cardLayout = new CardLayout();
        cards = new JPanel(cardLayout);

//        첫번쨰 퀴즈 전
        JPanel WSMPanel_page1 = WSMPanel_page1();
        cards.add(WSMPanel_page1, "WSMPanel_page1");
        JPanel WSMPanel_page2 = WSMPanel_page2();
        cards.add(WSMPanel_page2, "WSMPanel_page2");
        JPanel WSMPanel_page3 = WSMPanel_page3();
        cards.add(WSMPanel_page3, "WSMPanel_page3");
        JPanel WSMPanel_page4 = WSMPanel_page4();
        cards.add(WSMPanel_page4, "WSMPanel_page4");
        JPanel WSMPanel_page5 = WSMPanel_page5();
        cards.add(WSMPanel_page5, "WSMPanel_page5");
        JPanel WSMPanel_page6 = WSMPanel_page6();
        cards.add(WSMPanel_page6, "WSMPanel_page6");
        JPanel WSMPanel_page7 = WSMPanel_page7();
        cards.add(WSMPanel_page7, "WSMPanel_page7");
        JPanel WSMPanel_page8 = WSMPanel_page8();
        cards.add(WSMPanel_page8, "WSMPanel_page8");
        JPanel WSMPanel_page9_1 = WSMPanel_page9_1();
        cards.add(WSMPanel_page9_1, "WSMPanel_page9_1");
        JPanel WSMPanel_page9_2 = WSMPanel_page9_2();
        cards.add(WSMPanel_page9_2, "WSMPanel_page9_2");
        JPanel WSMPanel_page10 = WSMPanel_page10();
        cards.add(WSMPanel_page10, "WSMPanel_page10");

//        2번째 퀴즈 후
        JPanel WSMPanel_page11 = WSMPanel_page11();
        cards.add(WSMPanel_page11, "WSMPanel_page11");
        JPanel WSMPanel_page12 = WSMPanel_page12();
        cards.add(WSMPanel_page12, "WSMPanel_page12");
        JPanel WSMPanel_page13 = WSMPanel_page13();
        cards.add(WSMPanel_page13, "WSMPanel_page13");
        JPanel WSMPanel_page14 = WSMPanel_page14();
        cards.add(WSMPanel_page14, "WSMPanel_page14");

//        3번째 퀴즈 후
        JPanel WSMPanel_page15_1 = WSMPanel_page15_1();
        cards.add(WSMPanel_page15_1, "WSMPanel_page15_1");
        JPanel WSMPanel_page15_2 = WSMPanel_page15_2();
        cards.add(WSMPanel_page15_2, "WSMPanel_page15_2");
        JPanel WSMPanel_page16 = WSMPanel_page16();
        cards.add(WSMPanel_page16, "WSMPanel_page16");

        JPanel WSMPanel_page17 = WSMPanel_page17();
        cards.add(WSMPanel_page17, "WSMPanel_page17");
        JPanel WSMPanel_page18 = WSMPanel_page18();
        cards.add(WSMPanel_page18, "WSMPanel_page18");


//        퀴즈
        JPanel WSMChoicePanel_page1 = WSMChoicePanel_page1();
        cards.add(WSMChoicePanel_page1, "WSMChoicePanel_page1");
        JPanel WSMChoicePanel_page2 = WSMChoicePanel_page2();
        cards.add(WSMChoicePanel_page2, "WSMChoicePanel_page2");


        cardLayout.show(cards, "WSMPanel_page1");
        wsmFrame.setVisible(true);
        wsmFrame.add(cards);

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


    private JPanel WSMPanel_page1() {
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
        jlChatWindow1.setText("<html>"+"그러고 보니, WSM은 1학년 때도 배운 적이 있는 내용이었어." +
                "<br>"+"웹사이트를 만드는 수업이었지? 2학년 때는 어떤 걸 더 자세히 배울지 기대되는 걸"+"</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMPanel_page2");
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

    private JPanel WSMPanel_page2() {
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
        jlName.setText("선생님");
        jlAge.setText("??");
        jlChatWindow1.setText("안녕~ 다들 반가워. 난 이번에 2학년 WSM 수업을 가르치게 된 선생님이야. 앞으로 잘 부탁할게.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMPanel_page3");
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

    private JPanel WSMPanel_page3() {
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
        jlChatWindow1.setText("다들 1학년 때도 WSM을 배워본 적이 있지? 어디까지 배웠었니?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMPanel_page4");
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

    private JPanel WSMPanel_page4() {
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
        jlChatWindow1.setText("자바스크립트까지 배웠었어요!");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMPanel_page5");
            }
        });

        JLabel characterLabel = new JLabel(student2);
        characterLabel.setBounds(400, -24, 450, 600);
        characterLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playPanel1.add(characterLabel);
        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel WSMPanel_page5() {
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
        jlName.setText("선생님");
        jlAge.setText("??");
        jlChatWindow1.setText("js까지 나갔었구나. 다들 혹시 깃허브 써본 적 있니?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMPanel_page6");
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

    private JPanel WSMPanel_page6() {
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
        jlName.setText("친구들");
        jlAge.setText("18");
        jlChatWindow1.setText("네!");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMPanel_page7");
            }
        });

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel WSMPanel_page7() {
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
        jlName.setText("친구들");
        jlAge.setText("18");
        jlChatWindow1.setText("아니요!");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMPanel_page8");
            }
        });

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel WSMPanel_page8() {
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
        jlName.setText("선생님");
        jlAge.setText("??");
        jlChatWindow1.setText("<html>"+"거의 반반이네. WSM 수업에서는 깃과 깃허브도 같이 사용할 거야." +
                "<br/>"+"다들 깃허브가 어떤 용도로 쓰이는지 아니?"+"</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMChoicePanel_page1");
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


    private JPanel WSMChoicePanel_page1() {
        JPanel choicePanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background2부분에 위에서 선언한 이름 넣으면 됨
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };
        choicePanel1.setLayout(null);
        info();

//        무엇을 선택할지
        jlChooseTitle.setText("맞는 것을 골라보자(정답 두 개, 하나만 골라도 인정)");

//        선택지 버튼
        JButton subChooseButton1 = new JButton("코드 리뷰");
        subChooseButton1.setBackground(Color.WHITE);
        subChooseButton1.setBounds(350, 200, 550, 100);
        subChooseButton1.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMPanel_page9_1");
            }
        });

        JButton subChooseButton2 = new JButton("코드 작성 사이트");
        subChooseButton2.setBackground(Color.WHITE);
        subChooseButton2.setBounds(350, 350, 550, 100);
        subChooseButton2.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMPanel_page9_2");
            }
        });

        JButton subChooseButton3 = new JButton("코딩 파일들 저장");
        subChooseButton3.setBackground(Color.WHITE);
        subChooseButton3.setBounds(350, 500, 550, 100);
        subChooseButton3.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMPanel_page9_1");

            }
        });


        choicePanel1.add(jlChooseTitle);
        choicePanel1.add(subChooseButton1);
        choicePanel1.add(subChooseButton2);
        choicePanel1.add(subChooseButton3);
        return choicePanel1;
    }

    private JPanel WSMPanel_page9_1() {
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
        jlChatWindow1.setText("좋아! 아주 잘했어.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMPanel_page10");
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

    private JPanel WSMPanel_page9_2() {
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
        jlChatWindow1.setText("<html>"+"틀렸지만 그래도 잘했어." + "<br/>" +
                "깃허브는 기본적으로 코드리뷰와 코딩 파일들을 저장하고 올리는데 쓴단다."+"</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMPanel_page10");
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

    private JPanel WSMPanel_page10() {
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
        jlChatWindow1.setText("<html>"+"깃허브는 프로젝트 때만 잠깐 써봐서 그런지 아직 잘은 모르겠는걸…" +
                "<br/>"+"수업 듣다 보면 알게 되겠지?!"+"</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMPanel_page11");
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
    //    퀴즈 1



    private JPanel WSMPanel_page11() {
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
        jlChatWindow1.setText("다들 자바스크립트까지 배웠다고 했나?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMPanel_page12");
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

    private JPanel WSMPanel_page12() {
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
                cardLayout.show(cards, "WSMPanel_page13");
            }
        });

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }

    private JPanel WSMPanel_page13() {
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
        jlChatWindow1.setText("좋아. 그럼 오늘은 1학년 때 배운 내용들 복습 한 번 할게.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMPanel_page14");
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

    private JPanel WSMPanel_page14() {
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
        jlChatWindow1.setText("<html>" + "자바스크립트까지 배웠다고 하니까 간단한 html 문제!" +
                "<br/>" + "공백은 html 코드 상에서 어떻게 쓸까?" + "</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMChoicePanel_page2");
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

    //    퀴즈2
    private JPanel WSMChoicePanel_page2() {
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
        jlChooseTitle.setText("맞는 설명을 골라보자");

//        선택지 버튼
        JButton subChooseButton1 = new JButton("기본 공백 문자(스페이스)");
        subChooseButton1.setBackground(Color.WHITE);
        subChooseButton1.setBounds(350, 200, 550, 100);
        subChooseButton1.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMPanel_page15_2");
            }
        });

        JButton subChooseButton2 = new JButton("&nbsp;");
        subChooseButton2.setBackground(Color.WHITE);
        subChooseButton2.setBounds(350, 330, 550, 100);
        subChooseButton2.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMPanel_page15_1");
            }
        });

        JButton subChooseButton3 = new JButton("%gap;");
        subChooseButton3.setBackground(Color.WHITE);
        subChooseButton3.setBounds(350, 460, 550, 100);
        subChooseButton3.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMPanel_page15_2");
            }
        });

        JButton subChooseButton4 = new JButton("blank");
        subChooseButton4.setBackground(Color.WHITE);
        subChooseButton4.setBounds(350, 590, 550, 100);
        subChooseButton4.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMPanel_page15_2");
            }
        });

        choicePanel1.add(jlChooseTitle);
        choicePanel1.add(subChooseButton1);
        choicePanel1.add(subChooseButton2);
        choicePanel1.add(subChooseButton3);
        choicePanel1.add(subChooseButton4);
        return choicePanel1;
    }

    private JPanel WSMPanel_page15_1() {
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
        jlChatWindow1.setText("맞았어!! 잘 맞추는걸.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMPanel_page16");
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

    private JPanel WSMPanel_page15_2() {
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
                cardLayout.show(cards, "WSMPanel_page16");
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


    private JPanel WSMPanel_page16() {
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
        jlChatWindow1.setText("<html>" + "다들 생각보다 WSM에 대해 잘 알고 있어서 놀랐어." +
                "<br/>" + "다음시간도 기대되네! 그럼 다음시간에 보자." + "</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMPanel_page17");
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

    private JPanel WSMPanel_page17() {
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
        jlChatWindow1.setText("네! 감사합니다 선생님!");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "WSMPanel_page18");
            }
        });

        playPanel1.add(jlName);
        playPanel1.add(jlAge);
        playPanel1.add(jlChatWindow1);
        playPanel1.add(nextButton);
        return playPanel1;
    }



    private JPanel WSMPanel_page18() {
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
        jlChatWindow1.setText("<html>" + "역시 배웠던 과목이라 그런지 조금 익숙하네." + "<br/>" +
                "이번엔 깃허브도 배울 수 있어 좋을 것 같아. 2학년 때 배울 WSM이 기대돼!" + "</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                FinalFrame finalFrame = new FinalFrame();
                wsmFrame.setVisible(false);
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
        WSMPlayFrame jpFrame = new WSMPlayFrame();
        jpFrame.create();
    }
}
