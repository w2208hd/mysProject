import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinalFrame extends JFrame {
    private JFrame finalFrame;
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

        finalFrame = new JFrame();
        finalFrame.setTitle("final");
        finalFrame.setSize(1300, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        finalFrame.setResizable(false);
        finalFrame.setLocationRelativeTo(null);
        finalFrame.setResizable(false);

        cardLayout = new CardLayout();
        cards = new JPanel(cardLayout);

//        첫번쨰 퀴즈 전
        JPanel finalPanel_page1 = finalPanel_page1();
        cards.add(finalPanel_page1, "finalPanel_page1");
        JPanel finalPanel_page2 = finalPanel_page2();
        cards.add(finalPanel_page2, "finalPanel_page2");
        JPanel finalPanel_page3 = finalPanel_page3();
        cards.add(finalPanel_page3, "finalPanel_page3");
        JPanel finalPanel_page4 = finalPanel_page4();
        cards.add(finalPanel_page4, "finalPanel_page4");
        JPanel finalPanel_page5 = finalPanel_page5();
        cards.add(finalPanel_page5, "finalPanel_page5");

        cardLayout.show(cards, "finalPanel_page1");
        finalFrame.setVisible(true);
        finalFrame.add(cards);

    }

    public void info() {
        //        닉네임
        jlName = new JLabel("미림이");
        jlName.setBounds(100, 500, 130, 50);
        jlName.setFont(new Font("맑은고딕", Font.BOLD, 20));
        jlName.setHorizontalAlignment(SwingConstants.CENTER);
        jlName.setOpaque(true);
        jlName.setBackground(backgroundColor1);
        jlName.setBorder(border1);

        //나이
        jlAge = new JLabel("18");
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


    private JPanel finalPanel_page1() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background1.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("미림이");
        jlAge.setText("18");
        jlChatWindow1.setText("2학년 되니까 선택과목도 생기고, 전공과목도 더 많이 배우는구나!!");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "finalPanel_page2");
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

    private JPanel finalPanel_page2() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background1.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("미림이");
        jlAge.setText("18");
        jlChatWindow1.setText("전공을 많이 하니까 실습 위주의 수업이 많아서 재미있다!");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "finalPanel_page3");
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

    private JPanel finalPanel_page3() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background1.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("미림이");
        jlAge.setText("18");
        jlChatWindow1.setText("전공과목도 정말 잘 선택한 것 같아!");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "finalPanel_page4");
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

    private JPanel finalPanel_page4() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background1.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("미림이");
        jlAge.setText("18");
        jlChatWindow1.setText("오늘 한 수업들, 다음 수업 시간에도 기대가 되는걸?");

        // 다음
        nextButton.addActionListener(e -> {
            cardLayout.show(cards, "finalPanel_page5");
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

    private JPanel finalPanel_page5() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background1.getImage(), 0, 0, null);
            }
        };

        playPanel1.setLayout(null);
        info();

//        대화창
        jlName.setText("미림이");
        jlAge.setText("18");
        jlChatWindow1.setText("다음 수업도 빨리 듣고싶다!");
//        다음
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame mainFrame = new MainFrame();
                finalFrame.setVisible(false);
                mainFrame.create();
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
        FinalFrame jpFrame = new FinalFrame();
        jpFrame.create();
    }
}
