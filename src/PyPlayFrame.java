import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PyPlayFrame extends JFrame {
    private JFrame pyFrame;
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
    Color backgroundColor1 = new Color(255,255,255, 178);
    Border border1 = BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.BLACK, 2), // Line border
            BorderFactory.createEmptyBorder(0, 10, 0, 0)   // Empty border (left padding)
    );
    JLabel jlName, jlAge, jlChatWindow1, jlChooseTitle;
    JButton nextButton;

    public void create() {

        pyFrame = new JFrame();
        pyFrame.setTitle("py");
        pyFrame.setSize(1300, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        pyFrame.setResizable(false);
        pyFrame.setLocationRelativeTo(null);
        pyFrame.setResizable(false);

        cardLayout = new CardLayout();
        cards = new JPanel(cardLayout);

        JPanel pyPanel_page1 = pyPanel_page1();
        cards.add(pyPanel_page1, "pyPanel_page1");
        JPanel pyPanel_page2 = pyPanel_page2();
        cards.add(pyPanel_page2, "pyPanel_page2");
        JPanel pyPanel_page3 = pyPanel_page3();
        cards.add(pyPanel_page3, "pyPanel_page3");
        JPanel pyPanel_page4 = pyPanel_page4();
        cards.add(pyPanel_page4, "pyPanel_page4");
        JPanel pyPanel_page5 = pyPanel_page5();
        cards.add(pyPanel_page5, "pyPanel_page5");
        JPanel pyPanel_page6 = pyPanel_page6();
        cards.add(pyPanel_page6, "pyPanel_page6");
        JPanel pyPanel_page7 = pyPanel_page7();
        cards.add(pyPanel_page7, "pyPanel_page7");
        JPanel pyPanel_page8 = pyPanel_page8();
        cards.add(pyPanel_page8, "pyPanel_page8");
        JPanel pyPanel_page9 = pyPanel_page9();
        cards.add(pyPanel_page9, "pyPanel_page9");
        JPanel pyPanel_page10 = pyPanel_page10();
        cards.add(pyPanel_page10, "pyPanel_page10");
        JPanel pyPanel_page11 = pyPanel_page11();
        cards.add(pyPanel_page11, "pyPanel_page11");
        JPanel pyPanel_page12 = pyPanel_page12();
        cards.add(pyPanel_page12, "pyPanel_page12");
        JPanel pyPanel_page13 = pyPanel_page13();
        cards.add(pyPanel_page13, "pyPanel_page13");
        JPanel pyPanel_page14 = pyPanel_page14();
        cards.add(pyPanel_page14, "pyPanel_page14");
        JPanel pyPanel_page15 = pyPanel_page15();
        cards.add(pyPanel_page15, "pyPanel_page15");
        JPanel pyPanel_page16 = pyPanel_page16();
        cards.add(pyPanel_page16, "pyPanel_page16");
        JPanel pyPanel_page17 = pyPanel_page17();
        cards.add(pyPanel_page17, "pyPanel_page17");
        JPanel pyPanel_page18 = pyPanel_page18();
        cards.add(pyPanel_page18, "pyPanel_page18");
        JPanel pyPanel_page19 = pyPanel_page19();
        cards.add(pyPanel_page19, "pyPanel_page19");
        JPanel pyPanel_page20 = pyPanel_page20();
        cards.add(pyPanel_page20, "pyPanel_page20");

//        퀴즈
        JPanel pyChoicePanel_page1 = pyChoicePanel_page1();
        cards.add(pyChoicePanel_page1, "pyChoicePanel_page1");
        JPanel pyChoicePanel_page2 = pyChoicePanel_page2();
        cards.add(pyChoicePanel_page2, "pyChoicePanel_page2");
        JPanel pyChoicePanel_page3 = pyChoicePanel_page3();
        cards.add(pyChoicePanel_page3, "pyChoicePanel_page3");

        cardLayout.show(cards, "pyPanel_page1");
        pyFrame.setVisible(true);
        pyFrame.add(cards);

    }

    //
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

    private JPanel pyPanel_page1() {
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
        jlChatWindow1.setText("<html>파이썬 뭔지 들어본 적 있어서 선택과목으로 선택했는데,<br>무슨 언어일지 정말 궁금하다!</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page2");
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

    private JPanel pyPanel_page2() {
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
        jlChatWindow1.setText("안녕~. 파이썬 1학기에는 쌤이 나눠준 pdf 2개 진도를 나갈거야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page3");
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

    private JPanel pyPanel_page3() {
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
        jlChatWindow1.setText("1교시에는 파이썬지도안.pdf 열고 기초문법에 대해서 배울거야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page4");
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

    private JPanel pyPanel_page4() {
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
        jlChatWindow1.setText("파이썬 처음 배워보는데, 자유로운 언어라고 들었는데, 어떤 언어일지 궁금하다");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page5");
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

    private JPanel pyPanel_page5() {
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
        jlChatWindow1.setText("파이썬은 간결하고 가독성이 높아서 다양한 응용 분야에서 사용되는 언어야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page6");
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

    private JPanel pyPanel_page6() {
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
        jlChatWindow1.setText("그리고 특히 파이썬에서 중요한게 있어. 뭔지 맞춰볼까?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyChoicePanel_page1");
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

    //    퀴즈1
    private JPanel pyChoicePanel_page1() {
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
        jlChooseTitle.setText("파이썬에서 가장 중요한 것은 뭘까?");

//        선택지 버튼
        JButton subChooseButton1 = new JButton("들여쓰기");
        subChooseButton1.setBackground(Color.WHITE);
        subChooseButton1.setBounds(350, 200, 550, 80);
        subChooseButton1.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page7");
            }
        });

        JButton subChooseButton2 = new JButton("띄어쓰기");
        subChooseButton2.setBackground(Color.WHITE);
        subChooseButton2.setBounds(350, 300, 550, 80);
        subChooseButton2.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page7");
            }
        });

        JButton subChooseButton3 = new JButton("괄호");
        subChooseButton3.setBackground(Color.WHITE);
        subChooseButton3.setBounds(350, 400, 550, 80);
        subChooseButton3.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page7");
            }
        });

        JButton subChooseButton4 = new JButton("변수");
        subChooseButton4.setBackground(Color.WHITE);
        subChooseButton4.setBounds(350, 500, 550, 80);
        subChooseButton4.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page7");
            }
        });

        JButton subChooseButton5 = new JButton("반복문");
        subChooseButton5.setBackground(Color.WHITE);
        subChooseButton5.setBounds(350, 600, 550, 80);
        subChooseButton5.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page7");
            }
        });

        choicePanel1.add(jlChooseTitle);
        choicePanel1.add(subChooseButton1);
        choicePanel1.add(subChooseButton2);
        choicePanel1.add(subChooseButton3);
        choicePanel1.add(subChooseButton4);
        choicePanel1.add(subChooseButton5);
        return choicePanel1;
    }

    private JPanel pyPanel_page7() {
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
        jlChatWindow1.setText("정답은 1번 들여쓰기가 가장 중요해.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page8");
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

    private JPanel pyPanel_page8() {
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
        jlChatWindow1.setText("C, java와 같은 언어에서는 코드 블록을 표시하기 위해 {} 중괄호를 사용해.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page9");
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

    private JPanel pyPanel_page9() {
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
        jlChatWindow1.setText("하지만 python에서는 중괄호 대신 들여쓰기를 사용해.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page10");
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

    private JPanel pyPanel_page10() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("들여쓰기를 하지 않으면 에러가 발생해. 이해가 되었다면 다음 질문에 대답해볼까?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyChoicePanel_page2");
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

    //    퀴즈2
    private JPanel pyChoicePanel_page2() {
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
        jlChooseTitle.setText("다음 파이썬의 if문으로 알맞은 것은?");

//        선택지 버튼
        JButton subChooseButton1 = new JButton("<html>if( i == 10){<br>printf(“10”)<br>}else{<br>printf(“?”);<br>}</html>");
        subChooseButton1.setBackground(Color.WHITE);
        subChooseButton1.setBounds(350, 200, 550, 150);
        subChooseButton1.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page11");
            }
        });

        JButton subChooseButton2 = new JButton("<html> if i == 10:<br>printf(“10”)<br> else :<br> printf(“?”)</html>");
        subChooseButton2.setBackground(Color.WHITE);
        subChooseButton2.setBounds(350, 370, 550, 150);
        subChooseButton2.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page11");
            }
        });

        JButton subChooseButton3 = new JButton("<html>if ( i == 10 ):<br>printf(“10”)<br>else :<br>printf(“?”)</html>");
        subChooseButton3.setBackground(Color.WHITE);
        subChooseButton3.setBounds(350, 540, 550, 150);
        subChooseButton3.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page11");
            }
        });

        choicePanel1.add(jlChooseTitle);
        choicePanel1.add(subChooseButton1);
        choicePanel1.add(subChooseButton2);
        choicePanel1.add(subChooseButton3);
        return choicePanel1;
    }

    private JPanel pyPanel_page11() {
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
        jlChatWindow1.setText("정답은 2번이야. 파이썬에서는 조건에 ()를 쓰지않고, 들여쓰기를 해.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page12");
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

    private JPanel pyPanel_page12() {
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
        jlChatWindow1.setText("또한 앞에서의 문제를 보면 알 수 있듯이 python에서는 ;을 쓰지 않아.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page13");
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

    private JPanel pyPanel_page13() {
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
        jlChatWindow1.setText("파이썬은 정말 java와 다른 언어구나! 특이하다.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page14");
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

    private JPanel pyPanel_page14() {
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
        jlChatWindow1.setText("또 다른 언어와 다른 특이한 점이 python에는 있어.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page15");
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

    private JPanel pyPanel_page15() {
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
        jlChatWindow1.setText("파이썬에서는 변수를 사용하지 않아.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page16");
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

    private JPanel pyPanel_page16() {
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
        jlChatWindow1.setText("<html>예를들어 java에서는 int num = 3; 이지만,<br>파이썬 에서는 num = 3;만 써도 에러가 나지않아.</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page17");
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

    private JPanel pyPanel_page17() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("여기서 num은 변수명이야. 변수명은 java와 같아. 다음 문제를 풀어볼까?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyChoicePanel_page3");
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

    //    3번쨰 퀴즈
    private JPanel pyChoicePanel_page3() {
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
        jlChooseTitle.setText("변수명으로 옳지 않은것은?");

//        선택지 버튼
        JButton subChooseButton1 = new JButton("_num");
        subChooseButton1.setBackground(Color.WHITE);
        subChooseButton1.setBounds(350, 200, 550, 80);
        subChooseButton1.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page18");
            }
        });

        JButton subChooseButton2 = new JButton("num");
        subChooseButton2.setBackground(Color.WHITE);
        subChooseButton2.setBounds(350, 300, 550, 80);
        subChooseButton2.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page18");
            }
        });

        JButton subChooseButton3 = new JButton("num_2");
        subChooseButton3.setBackground(Color.WHITE);
        subChooseButton3.setBounds(350, 400, 550, 80);
        subChooseButton3.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page18");
            }
        });

        JButton subChooseButton4 = new JButton("7num");
        subChooseButton4.setBackground(Color.WHITE);
        subChooseButton4.setBounds(350, 500, 550, 80);
        subChooseButton4.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page18");
            }
        });

        JButton subChooseButton5 = new JButton("NUM");
        subChooseButton5.setBackground(Color.WHITE);
        subChooseButton5.setBounds(350, 600, 550, 80);
        subChooseButton5.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page18");
            }
        });

        choicePanel1.add(jlChooseTitle);
        choicePanel1.add(subChooseButton1);
        choicePanel1.add(subChooseButton2);
        choicePanel1.add(subChooseButton3);
        choicePanel1.add(subChooseButton4);
        choicePanel1.add(subChooseButton5);
        return choicePanel1;
    }

    private JPanel pyPanel_page18() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("정답은 4번이야. 변수명의 첫 글자에는 수가 올 수 없어.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page19");
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

    private JPanel pyPanel_page19() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };        playPanel1.setLayout(null);
        info();

//        대화창
        jlChatWindow1.setText("다음 시간에는 파이썬의 예제를 풀어보며 기초를 더 배울거야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "pyPanel_page20");
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

    private JPanel pyPanel_page20() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background3.getImage(), 0, 0, null);
            }
        };        playPanel1.setLayout(null);
        info();

//        대화창
        jlAge.setText("18");
        jlName.setText("미림이");
        jlChatWindow1.setText("감사합니다~. 파이썬은 정말 특이한 언어다. 다음은 뭘 들을까?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                FinalFrame finalFrame = new FinalFrame();
                pyFrame.setVisible(false);
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
        PyPlayFrame pypFrame = new PyPlayFrame();
        pypFrame.create();
    }
}
