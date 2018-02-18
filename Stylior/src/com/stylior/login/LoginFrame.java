package com.stylior.login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class LoginFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField userName;
	private JTextField password;

	static LoginFrame frame = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LoginFrame();
					
					//frame.pack();
					// frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					frame.setVisible(true);
					
					Toolkit toolkit =  Toolkit.getDefaultToolkit ();
					Dimension dim = toolkit.getScreenSize();
					frame.setSize(dim.width,dim.height);//here frame is your container 
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setForeground(Color.BLUE);
		setBackground(Color.WHITE);
		setTitle("Login Window");
		
		
		//frame.setSize(dim.width,dim.height);//here frame is your container 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1361, 736);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setForeground(SystemColor.textHighlight);
		contentPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		
		
		final JLabel lblNewLabel_2 = new JLabel("User Name Required");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(795, 183, 198, 25);
		lblNewLabel_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_2.setVisible(false);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name* : ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(524, 182, 98, 26);
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setForeground(SystemColor.textHighlight);
		contentPane.add(lblNewLabel);
		
			userName = new JTextField();
			userName.setBounds(636, 180, 138, 32);
			contentPane.add(userName);
			userName.setColumns(10);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Password* : ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(524, 232, 98, 26);
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		contentPane.add(lblNewLabel_1);
		
		password = new JTextField();
		password.setBounds(636, 230, 138, 32);
		contentPane.add(password);
		password.setColumns(10);
		
		final JLabel lblNewLabel_3 = new JLabel("Password Required");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setBounds(795, 229, 198, 32);
		lblNewLabel_3.setForeground(SystemColor.textHighlight);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setVisible(false);
		
		final JLabel lblNewLabel_4 = new JLabel("Invalid Login Details");
		lblNewLabel_4.setBounds(595, 132, 157, 26);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_4.setForeground(SystemColor.textHighlight);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setVisible(false);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setForeground(SystemColor.text);
		btnNewButton.setBounds(581, 288, 84, 32);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String strEmpty = "";
				String strUserName = userName.getText();
				String strPassword = password.getText();
				/* to check user name is given or not */
				if(strUserName == null || strEmpty.equalsIgnoreCase(strUserName)){
					lblNewLabel_2.setVisible(true);
					return;
					
				}else{
					lblNewLabel_2.setVisible(false);
				}
				/* to check password name is given or not */
				if(strPassword == null || strEmpty.equalsIgnoreCase(strPassword)){
					lblNewLabel_3.setVisible(true);
					return;
					
				}else{
					lblNewLabel_3.setVisible(false);
				}
				/* verify given login details are corect or not.  */
				if(strUserName.equalsIgnoreCase("admin") && strPassword.equalsIgnoreCase("admin")){
					lblNewLabel_4.setVisible(false);
					
					
					Home homeFrame = new Home();
					//homeFrame.setVisible(true);
					
					homeFrame.hideFrame(frame);
					homeFrame.displayFrame(homeFrame);
					
					
					//frame1.setVisible(false);
				}else{
					lblNewLabel_4.setVisible(true);
				}
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setForeground(SystemColor.text);
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.setBounds(697, 288, 77, 32);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				userName.setText("");
				password.setText("");
			}
		});
		contentPane.add(btnNewButton_1);
		
		
		
	
		
		
	}
}
