import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TutorialFrame extends JFrame {
    private JFrame tutorialFrame;
    private JPanel cards;
    private CardLayout cardLayout;

    //    style
    Color backgroundColor1 = new Color(192, 192, 192, 128); // 128: 50% 투명
    Border border1 = BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.BLACK, 2), // Line border
            BorderFactory.createEmptyBorder(0, 10, 0, 0)   // Empty border (left padding)
    );
    JLabel jlName, jlAge, jlChatWindow1;
    JButton nextButton;

//  img
    ImageIcon background1 = new ImageIcon("src/img/background1.jpg");
    ImageIcon background2 = new ImageIcon("src/img/background2.jpg");
    ImageIcon background3 = new ImageIcon("src/img/background3.jpg");
    ImageIcon background4 = new ImageIcon("src/img/background4.jpg");

    ImageIcon student1 = new ImageIcon("src/img/student1.png");
    ImageIcon student2 = new ImageIcon("src/img/student2.png");
    ImageIcon student3 = new ImageIcon("src/img/student3.png");

    public void create() {

        tutorialFrame = new JFrame();
        tutorialFrame.setTitle("튜토리얼");
        tutorialFrame.setSize(1300, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        tutorialFrame.setResizable(false);
        tutorialFrame.setLocationRelativeTo(null);
        tutorialFrame.setResizable(false);

        cardLayout = new CardLayout();
        cards = new JPanel(cardLayout);

        JPanel page1 = tutorial_page1();
        cards.add(page1, "page1");
        JPanel page2 = tutorial_page2();
        cards.add(page2, "page2");
        JPanel page3 = tutorial_page3();
        cards.add(page3, "page3");
        JPanel page4 = tutorial_page4();
        cards.add(page4, "page4");
        JPanel page5 = tutorial_page5();
        cards.add(page5, "page5");

        cardLayout.show(cards, "page1");
        tutorialFrame.setVisible(true);
        tutorialFrame.add(cards);

    }

    public void info(){
        //        닉네임
        jlName = new JLabel("미림이");
        jlName.setBounds(100, 500, 130, 50);
        jlName.setFont(new Font("맑은고딕", Font.BOLD, 20));
        jlName.setOpaque(true);
        jlName.setHorizontalAlignment(SwingConstants.CENTER);
        jlName.setBackground(backgroundColor1);
        jlName.setBorder(border1);

        //나이
        jlAge = new JLabel("18");
        jlAge.setBounds(228, 500, 50,50);
        jlAge.setFont(new Font("맑은고딕", Font.BOLD, 20));
        jlAge.setOpaque(true);
        jlAge.setHorizontalAlignment(SwingConstants.CENTER);
        jlAge.setBackground(backgroundColor1);
        jlAge.setBorder(border1);

        //대화창
        jlChatWindow1 = new JLabel("");
        jlChatWindow1.setBounds(100, 548, 1050,150);
        jlChatWindow1.setFont(new Font("맑은고딕", Font.BOLD, 20));
        jlChatWindow1.setOpaque(true);
        jlChatWindow1.setBackground(backgroundColor1);
        jlChatWindow1.setBorder(border1);


        //        다음
        nextButton = new JButton("next");
        nextButton.setBackground(Color.WHITE);
        nextButton.setBounds(1020, 640, 110, 50);
        nextButton.setFont(new Font("맑은고딕", Font.BOLD, 20));
    }

    private JPanel tutorial_page1() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background1.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

        jlChatWindow1.setText("이번에 선생님께서 2학년 선택과목을 고르라고 하셨지. 2학년 전공과목에는 뭐가 있는지 볼까?");
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "page2");
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
    private JPanel tutorial_page2() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background1.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

        jlChatWindow1.setText("파이썬? 파이썬은 들어본 적 있는데... 어, 자바도 있네! 볼록체인? 자료구조..는 또 뭐지?");
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "page3");
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
    private JPanel tutorial_page3() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background1.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

        jlChatWindow1.setText("선택과목에 대해서 아는게 없는데...어떻게 고르면 좋을까? 아직 모르겠는 전공들도 많고...고민이다..");
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "page4");
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
    private JPanel tutorial_page4() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background1.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

        jlChatWindow1.setText("1학년을 대상으로 한 2학년 전공과목 미리 체험하기 VR게임? 이런 게 있었다니. 하러 가야지!");
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "page5");
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
    private JPanel tutorial_page5() {
        JPanel playPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background1.getImage(), 0, 0, null);
            }
        };
        playPanel1.setLayout(null);
        info();

        jlChatWindow1.setText("이걸 이렇게 쓰고..아, 됐다!! 여기서 고르면 되는 건가?");
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SubjectSelectionFrame sSFrame = new SubjectSelectionFrame();
                sSFrame.create();
                tutorialFrame.setVisible(false);
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



    public static void main(String args[]){
        TutorialFrame tutorialFrame = new TutorialFrame();
        tutorialFrame.create();
    }
}
