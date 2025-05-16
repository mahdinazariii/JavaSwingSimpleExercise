import javax.swing.*;
import java.awt.*;

public class Myframe  extends JFrame {
    private JPanel panel;
    private JButton redButton;
    private JButton blueButton;
    private JButton greenButton;
    public Myframe() {
        panel = new JPanel();
        this.setTitle("Theme color selector ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 250);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        JPanel buttonPanel = new JPanel();
        redButton = new JButton("Red");
        blueButton = new JButton("Blue");
        greenButton = new JButton("Green");
        redButton.setActionCommand("Red");
        blueButton.setActionCommand("Blue");
        greenButton.setActionCommand("Green");
        greenButton.addActionListener(e -> {
            if(greenButton.getText().equals("Green")) {
                panel.setBackground(Color.GREEN);
            }
        });
        blueButton.addActionListener(e -> {
            if(blueButton.getText().equals("Blue")) {
                panel.setBackground(Color.BLUE);
            }
        });
        redButton.addActionListener(e -> {
            if(redButton.getText().equals("Red")) {
                panel.setBackground(Color.RED);
            }
        });


        buttonPanel.add(redButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(greenButton);
        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

    }
}
