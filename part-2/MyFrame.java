import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private JLabel label;
    private JButton button;
    private JTextField textField;
    private JPanel panel;
    public MyFrame(){
        this.setTitle("Greeting Form");
        this.setSize(350,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.label = new JLabel("Enter your name and press greet", SwingConstants.CENTER);
        this.button = new JButton("Greet");
        this.panel = new JPanel();
        this.textField = new JTextField(15);
        panel.add(button);
        panel.add(textField);
        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);
        add(panel, BorderLayout.NORTH);
        button.addActionListener(e -> {
            String name = textField.getText();
            if (!name.isEmpty()) {
                label.setText("Hello " + name + "!");


            }else{
                label.setText("please enter your name");
            }
        });



this.setVisible(true);
    }

}
