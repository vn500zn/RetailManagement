package com.stylior.shirt;

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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.stylior.beans.OfflineOrderMeasurements;
import com.stylior.beans.OrderOffline;
import com.stylior.beans.ShirtDetails;
import com.stylior.business.OrderBusiness;
import com.stylior.login.Home;

public class ShirtMeasurements extends JFrame {

	private JPanel contentPane;
	private JTextField givenWidthValue;
	private JTextField givenPostureValue;
	private JTextField givenShoulderTypeValue;
	private JTextField givenSholderAngleValue;
	private JLabel lblFit;
	private JTextField givenFitValue;
	private JLabel lblCollar;
	private JTextField givenCollarValue;
	private JLabel lblShoulder;
	private JTextField givenShoulderValue;
	private JLabel lblSleeveLength;
	private JTextField givenSleeveLengthValue;
	private JLabel lblArmhole;
	private JTextField givenArmholeValue;
	private JLabel Bicep;
	private JTextField givenBicepValue;
	private JLabel lblChest;
	private JTextField givenChestValue;
	private JLabel lblWaist;
	private JTextField givenWaisttValue;
	private JLabel lblHips;
	private JTextField givenHipsValue;
	private JLabel lblShirtLength;
	private JTextField givenShirtLengthValue;
	private JLabel givenHeight1;
	private JTextField givenHeightValue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShirtMeasurements frame = new ShirtMeasurements();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public static OrderOffline orderDetails = new OrderOffline();
	public static void saveOrderInfo(OrderOffline orderDetailsObj){
		orderDetails = orderDetailsObj;
	}
	public ShirtMeasurements() {
		setTitle("Shirt measurements");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1372, 733);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel givenWeight = new JLabel("Wigth");
		givenWeight.setFont(new Font("Tahoma", Font.BOLD, 11));
		givenWeight.setForeground(SystemColor.textHighlight);
		givenWeight.setBackground(SystemColor.textHighlight);
		givenWeight.setHorizontalAlignment(SwingConstants.CENTER);
		givenWeight.setBounds(544, 95, 85, 30);
		contentPane.add(givenWeight);
		
		givenWidthValue = new JTextField();
		givenWidthValue.setForeground(SystemColor.textHighlight);
		givenWidthValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		givenWidthValue.setBackground(SystemColor.text);
		givenWidthValue.setBounds(639, 95, 150, 30);
		contentPane.add(givenWidthValue);
		givenWidthValue.setColumns(20);
		
		JLabel lblPosture = new JLabel("Posture");
		lblPosture.setHorizontalAlignment(SwingConstants.CENTER);
		lblPosture.setForeground(SystemColor.textHighlight);
		lblPosture.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPosture.setBackground(SystemColor.textHighlight);
		lblPosture.setBounds(544, 136, 85, 30);
		contentPane.add(lblPosture);
		
		givenPostureValue = new JTextField();
		givenPostureValue.setForeground(SystemColor.textHighlight);
		givenPostureValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		givenPostureValue.setColumns(20);
		givenPostureValue.setBackground(Color.WHITE);
		givenPostureValue.setBounds(639, 136, 150, 30);
		contentPane.add(givenPostureValue);
		
		JLabel lblShoulderType = new JLabel("Shoulder Type");
		lblShoulderType.setHorizontalAlignment(SwingConstants.CENTER);
		lblShoulderType.setForeground(SystemColor.textHighlight);
		lblShoulderType.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblShoulderType.setBackground(SystemColor.textHighlight);
		lblShoulderType.setBounds(544, 177, 85, 30);
		contentPane.add(lblShoulderType);
		
		givenShoulderTypeValue = new JTextField();
		givenShoulderTypeValue.setForeground(SystemColor.textHighlight);
		givenShoulderTypeValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		givenShoulderTypeValue.setColumns(20);
		givenShoulderTypeValue.setBackground(Color.WHITE);
		givenShoulderTypeValue.setBounds(639, 177, 150, 30);
		contentPane.add(givenShoulderTypeValue);
		
		JLabel lblShoulderAngle = new JLabel("Shoulder Angle");
		lblShoulderAngle.setHorizontalAlignment(SwingConstants.CENTER);
		lblShoulderAngle.setForeground(SystemColor.textHighlight);
		lblShoulderAngle.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblShoulderAngle.setBackground(SystemColor.textHighlight);
		lblShoulderAngle.setBounds(544, 218, 85, 30);
		contentPane.add(lblShoulderAngle);
		
		givenSholderAngleValue = new JTextField();
		givenSholderAngleValue.setForeground(SystemColor.textHighlight);
		givenSholderAngleValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		givenSholderAngleValue.setColumns(20);
		givenSholderAngleValue.setBackground(Color.WHITE);
		givenSholderAngleValue.setBounds(639, 218, 150, 30);
		contentPane.add(givenSholderAngleValue);
		
		lblFit = new JLabel("Fit");
		lblFit.setHorizontalAlignment(SwingConstants.CENTER);
		lblFit.setForeground(SystemColor.textHighlight);
		lblFit.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFit.setBackground(SystemColor.textHighlight);
		lblFit.setBounds(544, 259, 85, 30);
		contentPane.add(lblFit);
		
		givenFitValue = new JTextField();
		givenFitValue.setForeground(SystemColor.textHighlight);
		givenFitValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		givenFitValue.setColumns(20);
		givenFitValue.setBackground(Color.WHITE);
		givenFitValue.setBounds(639, 259, 150, 30);
		contentPane.add(givenFitValue);
		
		lblCollar = new JLabel("Collar");
		lblCollar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCollar.setForeground(SystemColor.textHighlight);
		lblCollar.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCollar.setBackground(SystemColor.textHighlight);
		lblCollar.setBounds(544, 300, 85, 30);
		contentPane.add(lblCollar);
		
		givenCollarValue = new JTextField();
		givenCollarValue.setForeground(SystemColor.textHighlight);
		givenCollarValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		givenCollarValue.setColumns(20);
		givenCollarValue.setBackground(Color.WHITE);
		givenCollarValue.setBounds(639, 300, 150, 30);
		contentPane.add(givenCollarValue);
		
		lblShoulder = new JLabel("Shoulder");
		lblShoulder.setHorizontalAlignment(SwingConstants.CENTER);
		lblShoulder.setForeground(SystemColor.textHighlight);
		lblShoulder.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblShoulder.setBackground(SystemColor.textHighlight);
		lblShoulder.setBounds(544, 341, 85, 30);
		contentPane.add(lblShoulder);
		
		givenShoulderValue = new JTextField();
		givenShoulderValue.setForeground(SystemColor.textHighlight);
		givenShoulderValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		givenShoulderValue.setColumns(20);
		givenShoulderValue.setBackground(Color.WHITE);
		givenShoulderValue.setBounds(639, 341, 150, 30);
		contentPane.add(givenShoulderValue);
		
		lblSleeveLength = new JLabel("Sleeve Length");
		lblSleeveLength.setHorizontalAlignment(SwingConstants.CENTER);
		lblSleeveLength.setForeground(SystemColor.textHighlight);
		lblSleeveLength.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSleeveLength.setBackground(SystemColor.textHighlight);
		lblSleeveLength.setBounds(544, 382, 85, 30);
		contentPane.add(lblSleeveLength);
		
		givenSleeveLengthValue = new JTextField();
		givenSleeveLengthValue.setForeground(SystemColor.textHighlight);
		givenSleeveLengthValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		givenSleeveLengthValue.setColumns(20);
		givenSleeveLengthValue.setBackground(Color.WHITE);
		givenSleeveLengthValue.setBounds(639, 382, 150, 30);
		contentPane.add(givenSleeveLengthValue);
		
		lblArmhole = new JLabel("Armhole");
		lblArmhole.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmhole.setForeground(SystemColor.textHighlight);
		lblArmhole.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblArmhole.setBackground(SystemColor.textHighlight);
		lblArmhole.setBounds(544, 423, 85, 30);
		contentPane.add(lblArmhole);
		
		givenArmholeValue = new JTextField();
		givenArmholeValue.setForeground(SystemColor.textHighlight);
		givenArmholeValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		givenArmholeValue.setColumns(20);
		givenArmholeValue.setBackground(Color.WHITE);
		givenArmholeValue.setBounds(639, 423, 150, 30);
		contentPane.add(givenArmholeValue);
		
		Bicep = new JLabel("Bicep");
		Bicep.setHorizontalAlignment(SwingConstants.CENTER);
		Bicep.setForeground(SystemColor.textHighlight);
		Bicep.setFont(new Font("Tahoma", Font.BOLD, 11));
		Bicep.setBackground(SystemColor.textHighlight);
		Bicep.setBounds(544, 464, 85, 30);
		contentPane.add(Bicep);
		
		givenBicepValue = new JTextField();
		givenBicepValue.setForeground(SystemColor.textHighlight);
		givenBicepValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		givenBicepValue.setColumns(20);
		givenBicepValue.setBackground(Color.WHITE);
		givenBicepValue.setBounds(639, 464, 150, 30);
		contentPane.add(givenBicepValue);
		
		lblChest = new JLabel("Chest");
		lblChest.setHorizontalAlignment(SwingConstants.CENTER);
		lblChest.setForeground(SystemColor.textHighlight);
		lblChest.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChest.setBackground(SystemColor.textHighlight);
		lblChest.setBounds(544, 505, 85, 30);
		contentPane.add(lblChest);
		
		givenChestValue = new JTextField();
		givenChestValue.setForeground(SystemColor.textHighlight);
		givenChestValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		givenChestValue.setColumns(20);
		givenChestValue.setBackground(Color.WHITE);
		givenChestValue.setBounds(639, 505, 150, 30);
		contentPane.add(givenChestValue);
		
		lblWaist = new JLabel("Waist");
		lblWaist.setHorizontalAlignment(SwingConstants.CENTER);
		lblWaist.setForeground(SystemColor.textHighlight);
		lblWaist.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblWaist.setBackground(SystemColor.textHighlight);
		lblWaist.setBounds(544, 546, 85, 30);
		contentPane.add(lblWaist);
		
		givenWaisttValue = new JTextField();
		givenWaisttValue.setForeground(SystemColor.textHighlight);
		givenWaisttValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		givenWaisttValue.setColumns(20);
		givenWaisttValue.setBackground(Color.WHITE);
		givenWaisttValue.setBounds(639, 546, 150, 30);
		contentPane.add(givenWaisttValue);
		
		lblHips = new JLabel("Hips");
		lblHips.setHorizontalAlignment(SwingConstants.CENTER);
		lblHips.setForeground(SystemColor.textHighlight);
		lblHips.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHips.setBackground(SystemColor.textHighlight);
		lblHips.setBounds(544, 587, 85, 30);
		contentPane.add(lblHips);
		
		givenHipsValue = new JTextField();
		givenHipsValue.setForeground(SystemColor.textHighlight);
		givenHipsValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		givenHipsValue.setColumns(20);
		givenHipsValue.setBackground(Color.WHITE);
		givenHipsValue.setBounds(639, 587, 150, 30);
		contentPane.add(givenHipsValue);
		
		lblShirtLength = new JLabel("Shirt Length");
		lblShirtLength.setHorizontalAlignment(SwingConstants.CENTER);
		lblShirtLength.setForeground(SystemColor.textHighlight);
		lblShirtLength.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblShirtLength.setBackground(SystemColor.textHighlight);
		lblShirtLength.setBounds(544, 629, 85, 30);
		contentPane.add(lblShirtLength);
		
		givenShirtLengthValue = new JTextField();
		givenShirtLengthValue.setForeground(SystemColor.textHighlight);
		givenShirtLengthValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		givenShirtLengthValue.setColumns(20);
		givenShirtLengthValue.setBackground(Color.WHITE);
		givenShirtLengthValue.setBounds(639, 629, 150, 30);
		contentPane.add(givenShirtLengthValue);
		
		givenHeight1 = new JLabel("Height");
		givenHeight1.setHorizontalAlignment(SwingConstants.CENTER);
		givenHeight1.setForeground(SystemColor.textHighlight);
		givenHeight1.setFont(new Font("Tahoma", Font.BOLD, 11));
		givenHeight1.setBackground(SystemColor.textHighlight);
		givenHeight1.setBounds(544, 54, 85, 30);
		contentPane.add(givenHeight1);
		
		givenHeightValue = new JTextField();
		givenHeightValue.setForeground(SystemColor.textHighlight);
		givenHeightValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		givenHeightValue.setColumns(20);
		givenHeightValue.setBackground(Color.WHITE);
		givenHeightValue.setBounds(639, 54, 150, 30);
		contentPane.add(givenHeightValue);
		
		JButton btnNewButton = new JButton("Continue");
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(SystemColor.text);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				OfflineOrderMeasurements measurements = new OfflineOrderMeasurements();
				
				measurements.setHeight(givenHeightValue.getText());
				measurements.setWidth(givenWidthValue.getText());
				measurements.setPosture(givenPostureValue.getText());
				measurements.setShouldertype(givenShoulderTypeValue.getText());
				measurements.setShoulderAngle(givenSholderAngleValue.getText());
				measurements.setFit(givenFitValue.getText());
				measurements.setCollor(givenCollarValue.getText());
				measurements.setShoulder(givenShoulderValue.getText());
				measurements.setSleeve(givenSleeveLengthValue.getText());
				measurements.setArmhole(givenArmholeValue.getText());
				measurements.setBicep(givenBicepValue.getText());
				measurements.setChest(givenChestValue.getText());
				measurements.setWaist(givenWaisttValue.getText());
				measurements.setHips(givenHipsValue.getText());
				measurements.setShirtlength(givenShirtLengthValue.getText());
				
				ShirtDetails orderDetailsInfo = new ShirtDetails();
				orderDetailsInfo.setShirtDetails(orderDetails);
				orderDetailsInfo.setShirtMeasurements(measurements);
				
				String response = new OrderBusiness().createOrder(orderDetailsInfo);
				if(response.contains("success")){
					String str[] = response.split("/");
					//Home h = new Home();
					//h.setVisible(true);
					new Home().showOrderSuccess(home,str[1]);
					measures.setVisible(false);
				}else{
					failureMessage.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(885, 320, 123, 51);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shirt shirtFrame = new Shirt();
				//frame.setVisible(true);
				
				Toolkit toolkit =  Toolkit.getDefaultToolkit ();
				Dimension dim = toolkit.getScreenSize();
				shirtFrame.setSize(dim.width,dim.height);//here frame is your container 
				
				new Shirt().getOrderDetails(orderDetails);
				
				shirtFrame.showFrame(shirtObj);
				shirtFrame.hideBackWindow(measures);
				
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setBackground(SystemColor.textHighlight);
		btnBack.setBounds(370, 320, 123, 51);
		contentPane.add(btnBack);
		
		failureMessage = new JLabel("");
		failureMessage.setFont(new Font("Tahoma", Font.BOLD, 11));
		failureMessage.setForeground(Color.RED);
		failureMessage.setBounds(584, 11, 232, 32);
		contentPane.add(failureMessage);
		failureMessage.setVisible(false);
	}
	Shirt shirtObj = null;
	Home home = null;
	public void hideWindow(Shirt shirt,Home h) {
		shirt.setVisible(false);
		shirtObj = shirt;
		home = h;
	}
	ShirtMeasurements measures = null;
	private JLabel failureMessage;
	public void showWindow(ShirtMeasurements shirtMeasurementsFrame) {
		measures = shirtMeasurementsFrame;
		shirtMeasurementsFrame.setVisible(true);
		
		Toolkit toolkit =  Toolkit.getDefaultToolkit ();
		Dimension dim = toolkit.getScreenSize();
		shirtMeasurementsFrame.setSize(dim.width,dim.height);//here frame is your container 
		
	}
}
