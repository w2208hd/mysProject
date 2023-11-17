
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SubjectSelectionFrame extends JFrame {  //JPanel

    private JFrame selectionFrame;
    private JPanel cards;
    private CardLayout cardLayout;

    public void create() {
        selectionFrame = new JFrame();
        selectionFrame.setTitle("home");
        selectionFrame.setSize(1300, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        selectionFrame.setResizable(false);
        selectionFrame.setLocationRelativeTo(null);
        selectionFrame.setResizable(false);

        cardLayout = new CardLayout();
        cards = new JPanel(cardLayout);

        JPanel subjectSelection = subjectSelectionPanel();
        cards.add(subjectSelection, "subjectSelection");

        cardLayout.show(cards, "subjectSelection");
        selectionFrame.setVisible(true);
        selectionFrame.add(cards);
    }
    //    과목선택
    public JPanel subjectSelectionPanel() {
        JPanel subjectSelectionPanel = new JPanel();
        subjectSelectionPanel.setLayout(null);

//        자바
        JButton javaChooseButton = new JButton("JAVA");
        javaChooseButton.setBackground(Color.WHITE);
        javaChooseButton.setBounds(420, 60, 400, 50);
        javaChooseButton.setFont(new Font("맑은고딕", Font.BOLD, 30));
        javaChooseButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JavaPlayFrame jpFrame = new JavaPlayFrame();
                selectionFrame.setVisible(false);
                jpFrame.create();
            }
        });
//        자료구조
        JButton dsChooseButton = new JButton("자료구조");
        dsChooseButton.setBackground(Color.WHITE);
        dsChooseButton.setBounds(420, 120, 400, 50);
        dsChooseButton.setFont(new Font("맑은고딕", Font.BOLD, 30));
        dsChooseButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                DsPlayFrame dpFrame = new DsPlayFrame();
                selectionFrame.setVisible(false);
                dpFrame.create();
            }
        });
//        코딩테스트
        JButton codingTestChooseButton = new JButton("코딩테스트");
        codingTestChooseButton.setBackground(Color.WHITE);
        codingTestChooseButton.setBounds(420, 180, 400, 50);
        codingTestChooseButton.setFont(new Font("맑은고딕", Font.BOLD, 30));
        codingTestChooseButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                codingTestPlayFrame codingTestpFrame = new codingTestPlayFrame();
                selectionFrame.setVisible(false);
                codingTestpFrame.create();
            }
        });
//        C++
        JButton cPlusChooseButton = new JButton("C++");
        cPlusChooseButton.setBackground(Color.WHITE);
        cPlusChooseButton.setBounds(420, 240, 400, 50);
        cPlusChooseButton.setFont(new Font("맑은고딕", Font.BOLD, 30));
        cPlusChooseButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                CPlusPlayFrame cPluspFrame = new CPlusPlayFrame();
                selectionFrame.setVisible(false);
                cPluspFrame.create();
            }
        });
//        WSM
        JButton wsmChooseButton = new JButton("WSM");
        wsmChooseButton.setBackground(Color.WHITE);
        wsmChooseButton.setBounds(420, 300, 400, 50);
        wsmChooseButton.setFont(new Font("맑은고딕", Font.BOLD, 30));
        wsmChooseButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                WSMPlayFrame wsmPluspFrame = new WSMPlayFrame();
                selectionFrame.setVisible(false);
                wsmPluspFrame.create();
            }
        });
//        PHP
        JButton phpChooseButton = new JButton("PHP");
        phpChooseButton.setBackground(Color.WHITE);
        phpChooseButton.setBounds(420, 360, 400, 50);
        phpChooseButton.setFont(new Font("맑은고딕", Font.BOLD, 30));
        phpChooseButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                PHPPlayFrame phpPluspFrame = new PHPPlayFrame();
                selectionFrame.setVisible(false);
                phpPluspFrame.create();
            }
        });
//        JavaScript
        JButton jsChooseButton = new JButton("JavaScript");
        jsChooseButton.setBackground(Color.WHITE);
        jsChooseButton.setBounds(420, 420, 400, 50);
        jsChooseButton.setFont(new Font("맑은고딕", Font.BOLD, 30));
        jsChooseButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JsPlayFrame jsPluspFrame = new JsPlayFrame();
                selectionFrame.setVisible(false);
                jsPluspFrame.create();
            }
        });
//        python
        JButton pyChooseButton = new JButton("Python");
        pyChooseButton.setBackground(Color.WHITE);
        pyChooseButton.setBounds(420, 480, 400, 50);
        pyChooseButton.setFont(new Font("맑은고딕", Font.BOLD, 30));
        pyChooseButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                PyPlayFrame pyPluspFrame = new PyPlayFrame();
                selectionFrame.setVisible(false);
                pyPluspFrame.create();
            }
        });
//        블록체인
        JButton blockchainChooseButton = new JButton("블록체인");
        blockchainChooseButton.setBackground(Color.WHITE);
        blockchainChooseButton.setBounds(420, 540, 400, 50);
        blockchainChooseButton.setFont(new Font("맑은고딕", Font.BOLD, 30));
        blockchainChooseButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                BlockchainPlayFrame blockchainPluspFrame = new BlockchainPlayFrame();
                selectionFrame.setVisible(false);
                blockchainPluspFrame.create();
            }
        });


        subjectSelectionPanel.add(javaChooseButton);
        subjectSelectionPanel.add(dsChooseButton);
        subjectSelectionPanel.add(codingTestChooseButton);
        subjectSelectionPanel.add(cPlusChooseButton);
        subjectSelectionPanel.add(wsmChooseButton);
        subjectSelectionPanel.add(phpChooseButton);
        subjectSelectionPanel.add(jsChooseButton);
        subjectSelectionPanel.add(pyChooseButton);
        subjectSelectionPanel.add(blockchainChooseButton);
        return subjectSelectionPanel;
    }


    public static void main(String args[]) {
        MainFrame hm = new MainFrame();
        hm.create();
    }
}