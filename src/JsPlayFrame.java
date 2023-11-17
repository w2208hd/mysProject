import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JsPlayFrame extends JFrame {
    private JFrame jsFrame;
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
    Color backgroundColor1 = new Color(255, 255, 255, 178);
    Border border1 = BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.BLACK, 2), // Line border
            BorderFactory.createEmptyBorder(0, 10, 0, 0)   // Empty border (left padding)
    );
    JLabel jlName, jlAge, jlChatWindow1, jlChooseTitle;
    JButton nextButton;


    public void create() {

        jsFrame = new JFrame();
        jsFrame.setTitle("js");
        jsFrame.setSize(1300, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        jsFrame.setResizable(false);
        jsFrame.setLocationRelativeTo(null);
        jsFrame.setResizable(false);

        cardLayout = new CardLayout();
        cards = new JPanel(cardLayout);

        JPanel jsPanel_page1 = jsPanel_page1();
        cards.add(jsPanel_page1, "jsPanel_page1");
        JPanel jsPanel_page2 = jsPanel_page2();
        cards.add(jsPanel_page2, "jsPanel_page2");
        JPanel jsPanel_page3 = jsPanel_page3();
        cards.add(jsPanel_page3, "jsPanel_page3");
        JPanel jsPanel_page4 = jsPanel_page4();
        cards.add(jsPanel_page4, "jsPanel_page4");
        JPanel jsPanel_page5 = jsPanel_page5();
        cards.add(jsPanel_page5, "jsPanel_page5");
        JPanel jsPanel_page6 = jsPanel_page6();
        cards.add(jsPanel_page6, "jsPanel_page6");
        JPanel jsPanel_page7 = jsPanel_page7();
        cards.add(jsPanel_page7, "jsPanel_page7");
        JPanel jsPanel_page8 = jsPanel_page8();
        cards.add(jsPanel_page8, "jsPanel_page8");
        JPanel jsPanel_page9 = jsPanel_page9();
        cards.add(jsPanel_page9, "jsPanel_page9");
        JPanel jsPanel_page10 = jsPanel_page10();
        cards.add(jsPanel_page10, "jsPanel_page10");
        JPanel jsPanel_page11 = jsPanel_page11();
        cards.add(jsPanel_page11, "jsPanel_page11");
        JPanel jsPanel_page12 = jsPanel_page12();
        cards.add(jsPanel_page12, "jsPanel_page12");
        JPanel jsPanel_page13 = jsPanel_page13();
        cards.add(jsPanel_page13, "jsPanel_page13");
        JPanel jsPanel_page14 = jsPanel_page14();
        cards.add(jsPanel_page14, "jsPanel_page14");
        JPanel jsPanel_page15 = jsPanel_page15();
        cards.add(jsPanel_page15, "jsPanel_page15");
        JPanel jsPanel_page16 = jsPanel_page16();
        cards.add(jsPanel_page16, "jsPanel_page16");
        JPanel jsPanel_page17 = jsPanel_page17();
        cards.add(jsPanel_page17, "jsPanel_page17");
        JPanel jsPanel_page18 = jsPanel_page18();
        cards.add(jsPanel_page18, "jsPanel_page18");
        JPanel jsPanel_page19 = jsPanel_page19();
        cards.add(jsPanel_page19, "jsPanel_page19");
        JPanel jsPanel_page20 = jsPanel_page20();
        cards.add(jsPanel_page20, "jsPanel_page20");
        JPanel jsPanel_page21 = jsPanel_page21();
        cards.add(jsPanel_page21, "jsPanel_page21");
        JPanel jsPanel_page22 = jsPanel_page22();
        cards.add(jsPanel_page22, "jsPanel_page22");
        JPanel jsPanel_page23 = jsPanel_page23();
        cards.add(jsPanel_page23, "jsPanel_page23");
        JPanel jsPanel_page24 = jsPanel_page24();
        cards.add(jsPanel_page24, "jsPanel_page24");

//        퀴즈
        JPanel jsChoicePanel_page1 = jsChoicePanel_page1();
        cards.add(jsChoicePanel_page1, "jsChoicePanel_page1");
        JPanel jsChoicePanel_page2 = jsChoicePanel_page2();
        cards.add(jsChoicePanel_page2, "jsChoicePanel_page2");

        cardLayout.show(cards, "jsPanel_page1");
        jsFrame.setVisible(true);
        jsFrame.add(cards);

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

    private JPanel jsPanel_page1() {
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
        jlChatWindow1.setText("1학년 때 HTML을 배우면서 javaScript도 배운 적 있는데 똑같은거를 배우려나?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page2");
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

    private JPanel jsPanel_page2() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background2.getImage(), 0, 0, null);
            }
        };        playPanel1.setLayout(null);
        info();

//        대화창
        jlAge.setText("18");
        jlName.setText("미림이");
        jlChatWindow1.setText("익숙해서 선택과목으로 javaScript를 선택했는데, 기대된다!.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page3");
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

    private JPanel jsPanel_page3() {
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
        jlChatWindow1.setText("3반, 4반 합쳐서 다 온건가?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page4");
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

    private JPanel jsPanel_page4() {

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
        jlChatWindow1.setText("네!");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page5");
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

    private JPanel jsPanel_page5() {
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
        jlChatWindow1.setText("자바스크립트 시간에는 챕터별로 진도를 나가고, 코딩테스트를 할거야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page6");
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

    private JPanel jsPanel_page6() {
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
        jlChatWindow1.setText("일단 1교시에는 정말 간단하게 1학년 때 배운거를 복습할거야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page7");
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

    private JPanel jsPanel_page7() {
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
        jlChatWindow1.setText("<html>1-01(기본문법).html 을 만들어볼까? <br> 자바스크립트를 html에서 사용할 때 <script></script>사이에서 써야해.</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page8");
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

    private JPanel jsPanel_page8() {
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
        jlChatWindow1.setText("그럼 여기서 문제, script를 사용할 수 있는 구간은 어디일까?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsChoicePanel_page1");
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
    private JPanel jsChoicePanel_page1() {
        JPanel choicePanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background4.getImage(), 0, 0, null);
            }
        };        choicePanel1.setLayout(null);
        info();

//        무엇을 선택할지
        jlChooseTitle.setText(" <script></script>가 들어갈 수 있는 곳으로 알맞은것은?");

//        선택지 버튼
        JButton subChooseButton1 = new JButton("어디든");
        subChooseButton1.setBackground(Color.WHITE);
        subChooseButton1.setBounds(350, 200, 550, 80);
        subChooseButton1.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page9");
            }
        });

        JButton subChooseButton2 = new JButton("html안 에서만 어디든");
        subChooseButton2.setBackground(Color.WHITE);
        subChooseButton2.setBounds(350, 300, 550, 80);
        subChooseButton2.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page9");
            }
        });

        JButton subChooseButton3 = new JButton("head안 에서만 어디든");
        subChooseButton3.setBackground(Color.WHITE);
        subChooseButton3.setBounds(350, 400, 550, 80);
        subChooseButton3.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page9");
            }
        });

        JButton subChooseButton4 = new JButton(" title안 에서만 어디든");
        subChooseButton4.setBackground(Color.WHITE);
        subChooseButton4.setBounds(350, 500, 550, 80);
        subChooseButton4.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page9");
            }
        });

        JButton subChooseButton5 = new JButton("body안 에서만 어디든");
        subChooseButton5.setBackground(Color.WHITE);
        subChooseButton5.setBounds(350, 600, 550, 80);
        subChooseButton5.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page9");
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

    private JPanel jsPanel_page9() {
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
        jlChatWindow1.setText("정답은 1번. 어디서든 script를 사용할 수 있어.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page10");
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

    private JPanel jsPanel_page10() {
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
        jlChatWindow1.setText("자바스크립트를 간단히 콘솔에서 확인할 수 있는 방법이있어.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page11");
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

    private JPanel jsPanel_page11() {
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
        jlChatWindow1.setText("<html>document.write(“”);가 화면에 출력하는거고,<br>콘솔에 출력하는 코드는 console.log(“”); 이야.</html>");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page12");
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

    private JPanel jsPanel_page12() {
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
        jlChatWindow1.setText("앞으로 자주 사용하게 될거야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page13");
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

    private JPanel jsPanel_page13() {
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
        jlChatWindow1.setText("자바스크립트는 변수로 var과 let, const를 사용해");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page14");
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

    private JPanel jsPanel_page14() {
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
        jlChatWindow1.setText("var은 재 선언이 가능해. java같은 언어에서는 절대 못하는거지.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page15");
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

    private JPanel jsPanel_page15() {
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
        jlName.setText("미림이");
        jlAge.setText("18");
        jlChatWindow1.setText("자바스크립트는 자바와 달리 엄청 자유로운 언어구나.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page16");
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

    private JPanel jsPanel_page16() {
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
        jlChatWindow1.setText("let은 var과 달리 재 선언이 불가능해.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page17");
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

    private JPanel jsPanel_page17() {
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
        jlChatWindow1.setText(" 마지막으로 const는 자바의 final같은거야. 상수여서 값을 초기에 반드시 줘야해.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page18");
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

    private JPanel jsPanel_page18() {
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
        jlChatWindow1.setText("이번시간은 자바스크립트의 정말 기초를 했어. 다음 시간은 코테 할거야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page19");
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

    private JPanel jsPanel_page19() {
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
        jlChatWindow1.setText("(종치고)이번시간에는 코딩테스트를 할거야. Quiz-01(세수중 최소 값 구하기).html을 만들어.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page20");
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

    private JPanel jsPanel_page20() {
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
        jlChatWindow1.setText("세수중 최소 값을 구하는 코드를 짜봐. 5분 줄게~.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsChoicePanel_page2");
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

    private JPanel jsChoicePanel_page2() {
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
        jlChooseTitle.setText("<html>" + " 세수중 최소값을 구하는 코드이다." +
                "<br/>" + "빈칸에 들어갈 부호를 고르세요. (첫if)" + "</html>");

//        선택지 버튼
        JButton subChooseButton1 = new JButton("<=");
        subChooseButton1.setBackground(Color.WHITE);
        subChooseButton1.setBounds(350, 200, 550, 100);
        subChooseButton1.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page21");
            }
        });

        JButton subChooseButton2 = new JButton(">");
        subChooseButton2.setBackground(Color.WHITE);
        subChooseButton2.setBounds(350, 330, 550, 100);
        subChooseButton2.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page21");
            }
        });

        JButton subChooseButton3 = new JButton("=>");
        subChooseButton3.setBackground(Color.WHITE);
        subChooseButton3.setBounds(350, 460, 550, 100);
        subChooseButton3.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page21");
            }
        });

        JButton subChooseButton4 = new JButton("<");
        subChooseButton4.setBackground(Color.WHITE);
        subChooseButton4.setBounds(350, 590, 550, 100);
        subChooseButton4.setFont(new Font("맑은고딕", Font.BOLD, 20));
        subChooseButton4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page21");
            }
        });

        choicePanel1.add(jlChooseTitle);
        choicePanel1.add(subChooseButton1);
        choicePanel1.add(subChooseButton2);
        choicePanel1.add(subChooseButton3);
        choicePanel1.add(subChooseButton4);
        return choicePanel1;
    }    //코드 이미지 넣어야함

    private JPanel jsPanel_page21() {
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
        jlChatWindow1.setText("정답은 <야. a와 b를 비교해 작은값을 구하는 answer이 a라면 a < b가 되어야겠지.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page22");
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

    private JPanel jsPanel_page22() {
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
        jlChatWindow1.setText("이번 문제는 생각보다 쉽게 풀었다. 1학년 때도 많이 풀어본 문제야.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page23");
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

    private JPanel jsPanel_page23() {
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
        jlChatWindow1.setText("퀴즈 난이도는 점점 어려워 질거야. 이번시간 정말 수고했어~. 다음 시간에 보자.");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "jsPanel_page24");
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

    private JPanel jsPanel_page24() {
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
        jlChatWindow1.setText("감사합니다~. 다음 시간에는 무슨 문제를 풀까? 다음은 무슨 수업을 들을까?");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                FinalFrame finalFrame = new FinalFrame();
                jsFrame.setVisible(false);
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
        JsPlayFrame jspFrame = new JsPlayFrame();
        jspFrame.create();
    }
}
