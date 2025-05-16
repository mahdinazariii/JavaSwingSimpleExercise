package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame  extends JFrame {
    private JButton button;
    private JLabel label;
    private int count = 0;


//f
    public MyFrame() {
        this.setLayout(new BorderLayout());
        this.setTitle("Click Counter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,150 );
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        label = new JLabel();
        this.label.setText("Clicks = 0 "  );
        this.label.setHorizontalAlignment(SwingConstants.CENTER);
        this.label.setForeground(new Color(190,70,45));
        this.add(label);
        button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("Clicks = " + count);
            }
        })

   ;
        this.add(button, BorderLayout.SOUTH);
        this.add(label, BorderLayout.CENTER);
        this.setVisible(true);





    }
    public void clickCounter() {
        count++;
        label.setText("Clicks = " + count);
    }

}
