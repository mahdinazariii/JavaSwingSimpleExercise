import javax.swing.*;
import java.awt.*;


public class RegistrationFormApp extends javax.swing.JFrame {
    private TextField name;
    private TextField email;
    private JPasswordField password;
    private JRadioButton female,male,rather;
    private JCheckBox python,cpp,java;
    private JButton submit;
    private GridBagConstraints gbc;

    public RegistrationFormApp() {
        this.setTitle("User Registration");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(500,350);



        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Name :" ),gbc );
        gbc.gridx = 1; name = new TextField(20);
        panel.add(name,gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("Email :") , gbc);
        gbc.gridx = 1 ; email = new TextField(20);
        panel.add(email,gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(new JLabel("Password : "),gbc);
        gbc.gridx = 1 ; password = new JPasswordField(20);
        panel.add(password,gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        panel.add(new JLabel("Gender :"),gbc);
        gbc.gridx = 1 ;
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        rather = new JRadioButton("Rather not to say ");
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);
        group.add(rather);
        JPanel genderPanel = new JPanel(); genderPanel.add(male); genderPanel.add(female); genderPanel.add(rather);
        panel.add(genderPanel,gbc);



        gbc.gridx = 0; gbc.gridy = 4;
        panel.add(new JLabel("Interests :"),gbc);
        gbc.gridx = 1 ;
        JPanel buttonPanel = new JPanel();
        java = new JCheckBox("Java");  python = new JCheckBox("Python");  cpp = new JCheckBox("CPP");
        buttonPanel.add(python);
        buttonPanel.add(cpp);
        buttonPanel.add(java);
        panel.add(buttonPanel,gbc);


        gbc.gridx = 1; gbc.gridy = 5;

        gbc.anchor = GridBagConstraints.CENTER;
        submit = new JButton("Submit");
        panel.add(submit,gbc);
        submit.addActionListener(e -> {
            StringBuilder message = new StringBuilder();
            message.append("Name: " + name.getText() + "\n");
            message.append("Email: " + email.getText() + "\n");
            message.append("Password: " + password.getText() + "\n");
            message.append("Gender: ");
            if(female.isSelected())
                message.append("Female");
            else if(male.isSelected())
                message.append("Male");
            else message.append("Rather");
            message.append("\n");
            message.append("Interests: ");
            if(java.isSelected())
                message.append("Java");
            else if (python.isSelected())
                message.append("Python");
            else message.append("CPP");
            message.append("\n");


            JOptionPane.showMessageDialog(null, message.toString());
        });








add(panel);


    }

}
