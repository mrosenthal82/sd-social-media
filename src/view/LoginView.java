package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

//import SocialMedia;				<-- make this file
import controller.ViewManager;

public class LoginView extends JPanel implements ActionListener {
	
    private ViewManager manager;
    private JTextField emailField;
    private JTextField passwordField;
    private JButton submit;
    
    public LoginView() {
        super();
        this.init();
    }
    
    public void clearFields() {
        emailField.setText("");
        passwordField.setText("");
    }
    
    private void init() {
        this.setLayout(null);
        
        initEmailField();
        initPasswordField();
        
        submit = new JButton("Submit");
        submit.putClientProperty("id", -1L);
        submit.addActionListener(this);
    }
    
    private void initEmailField() {
        JLabel label = new JLabel("Email");
        label.setFont(new Font("DialogInput", Font.BOLD, 14));
        label.setBounds(25, 15, 200, 40);
        label.setLabelFor(emailField);
        
        emailField = new JTextField(10);
        emailField.setBounds(20, 45, 710, 40);;
        
        this.add(label);
        this.add(emailField);
    }
    
    private void initPasswordField() {
        JLabel label = new JLabel("Password");
        label.setFont(new Font("DialogInput", Font.BOLD, 14));
        label.setBounds(25, 15, 200, 40);
        label.setLabelFor(passwordField);
        
        passwordField = new JTextField(10);
        passwordField.setBounds(20, 45, 710, 40);;
        
        this.add(label);
        this.add(passwordField);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        
        if (source.equals(submit)) {
            manager.switchTo(view.ProfileView);
        }
    }
	
}