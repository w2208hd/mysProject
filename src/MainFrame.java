
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame {  //JPanel

    private JFrame homeFrame;
    private JPanel cards;
    private CardLayout cardLayout;
    ImageIcon logo = new ImageIcon("src/img/logo.png");
    ImageIcon background1 = new ImageIcon("src/img/background.jpg");

    public void create() {
        homeFrame = new JFrame();
        homeFrame.setTitle("home");
        homeFrame.setSize(1300, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        homeFrame.setResizable(false);
        homeFrame.setLocationRelativeTo(null);
        homeFrame.setResizable(false);

        cardLayout = new CardLayout();
        cards = new JPanel(cardLayout);

        JPanel home = homePanel();
        cards.add(home, "home");

        cardLayout.show(cards, "home");
        homeFrame.setVisible(true);
        homeFrame.add(cards);
    }

    //    홈화면
    private JPanel homePanel() {
        JPanel homePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 배경 이미지를 그립니다
                g.drawImage(background1.getImage(), 0, 0, null);
            }
        };
        homePanel.setLayout(null);

//        로고
        JLabel logoLabel = new JLabel(logo);
        logoLabel.setBounds(400, 0, 500, 548);
        logoLabel.setHorizontalAlignment(SwingConstants.CENTER);



//        go튜토리얼
        JButton startButton = new JButton("play");
        startButton.setBackground(Color.WHITE);
        startButton.setFont(new Font("맑은고딕", Font.BOLD, 20));
        startButton.setBounds(300, 390, 700, 100);
        startButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                TutorialFrame tutorialFrame = new TutorialFrame();
                tutorialFrame.create();
                homeFrame.setVisible(false);
            }
        });

        JButton exitButton = new JButton("나가기");
        exitButton.setBackground(Color.WHITE);
        exitButton.setFont(new Font("맑은고딕", Font.BOLD, 20));
        exitButton.setBounds(300, 520, 700, 100);
        exitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        homePanel.add(logoLabel);
        homePanel.add(startButton);
        homePanel.add(exitButton);
        return homePanel;
    }

    public static void main(String args[]) {
        MainFrame hm = new MainFrame();
        hm.create();
    }
}