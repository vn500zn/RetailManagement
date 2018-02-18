package com.stylior.login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.stylior.shirt.Shirt;

public class Home extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JLabel orderSuccessMessage;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Home() {
		setTitle("Main Window");

		//LoginFrame frame1 = new LoginFrame();
		//frame1.dispose();
		//frame1.setVisible(false);
		//setDefaultCloseOperation(frame1.DISPOSE_ON_CLOSE);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 744);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.textHighlight);
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Shirt");
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setForeground(SystemColor.text);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Shirt shirtFrame = new Shirt();
				//frame.setVisible(true);
				
				
				shirtFrame.hideWindow(home);
				shirtFrame.showFrame(shirtFrame);
				
				
		}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(630, 63, 100, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Trouser");
		btnNewButton_1.setForeground(SystemColor.text);
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(630, 127, 100, 40);
		contentPane.add(btnNewButton_1);
		
		orderSuccessMessage = new JLabel("");
		orderSuccessMessage.setBackground(Color.WHITE);
		orderSuccessMessage.setFont(new Font("Tahoma", Font.BOLD, 11));
		orderSuccessMessage.setForeground(Color.GREEN);
		orderSuccessMessage.setBounds(582, 11, 191, 28);
		contentPane.add(orderSuccessMessage);
		//orderSuccessMessage.setVisible(false);
	}

	public void hideFrame(LoginFrame frame) {
		frame.setVisible(false);
	}
	Home home = null;
	public void displayFrame(Home homeFrame) {
		// TODO Auto-generated method stub
		homeFrame.setVisible(true);
		home = homeFrame;
		
		Toolkit toolkit =  Toolkit.getDefaultToolkit ();
		Dimension dim = toolkit.getScreenSize();
		homeFrame.setSize(dim.width,dim.height);//here frame is your container 
	}

	public void showOrderSuccess(Home h,String orderId) {
		h.setVisible(true);
		orderSuccessMessage.setVisible(true);
		orderSuccessMessage.setText("Order Success. Order Id : "+ orderId);
		
		
	}

}
