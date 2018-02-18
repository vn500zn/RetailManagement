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
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.stylior.beans.OrderOffline;
import com.stylior.login.Home;

public class Shirt extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel fabric;
	
	JLabel selectedFabric = null;
	JLabel selectedSleeve	 = null;
	JLabel selectedCollar = null;
	JLabel selectedCuff = null;
	JLabel selectedButton = null;
	JLabel selectedpocket = null;
	JLabel selectedPlacket = null;
	JLabel selectedBack = null;
	JLabel selectedBottomStyle = null;
	JLabel selectedSignature = null;
	JLabel selectedOuter = null;
	JLabel selectedINNERCONTRAST = null;
	OrderOffline objOrder = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shirt frame = new Shirt();
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
	public Shirt() {
		setTitle("Shirt");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1358, 729);
		fabric = new JPanel();
		fabric.setBackground(SystemColor.text);
		fabric.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(fabric);
		fabric.setLayout(null);
		
		
		/*  Selected Information Start */
		final JLabel selectedSleeve1 = new JLabel("SLEEVE : ");
		selectedSleeve1.setForeground(SystemColor.windowBorder);
		selectedSleeve1.setFont(new Font("Tahoma", Font.BOLD, 9));
		selectedSleeve1.setBounds(195, 597, 58, 28);
		fabric.add(selectedSleeve1);
		
		selectedSleeve = new JLabel("");
		selectedSleeve.setForeground(SystemColor.textHighlight);
		selectedSleeve.setFont(new Font("Tahoma", Font.BOLD, 9));
		selectedSleeve.setBounds(245, 597, 107, 28);
		fabric.add(selectedSleeve);
		
		final JLabel collors = new JLabel("COLLAR : ");
		collors.setForeground(SystemColor.windowBorder);
		collors.setFont(new Font("Tahoma", Font.BOLD, 9));
		collors.setBounds(378, 597, 58, 28);
		fabric.add(collors);
		
		selectedCollar = new JLabel("");
		selectedCollar.setForeground(SystemColor.textHighlight);
		selectedCollar.setFont(new Font("Tahoma", Font.BOLD, 9));
		selectedCollar.setBounds(434, 597, 107, 28);
		fabric.add(selectedCollar);
		
		final JLabel labelCuff = new JLabel("CUFF : ");
		labelCuff.setForeground(SystemColor.windowBorder);
		labelCuff.setFont(new Font("Tahoma", Font.BOLD, 9));
		labelCuff.setBounds(546, 597, 42, 28);
		fabric.add(labelCuff);
		
		selectedCuff = new JLabel("");
		selectedCuff.setForeground(SystemColor.textHighlight);
		selectedCuff.setFont(new Font("Tahoma", Font.BOLD, 9));
		selectedCuff.setBounds(581, 597, 107, 28);
		fabric.add(selectedCuff);
		
		final JLabel labelButton = new JLabel("BUTTON : ");
		labelButton.setForeground(SystemColor.windowBorder);
		labelButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		labelButton.setBounds(729, 597, 65, 28);
		fabric.add(labelButton);
		
		selectedButton = new JLabel("");
		selectedButton.setForeground(SystemColor.textHighlight);
		selectedButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		selectedButton.setBounds(784, 597, 107, 28);
		fabric.add(selectedButton);
		
		final JLabel labelPocket = new JLabel("POCKET : ");
		labelPocket.setForeground(SystemColor.windowBorder);
		labelPocket.setFont(new Font("Tahoma", Font.BOLD, 9));
		labelPocket.setBounds(916, 597, 88, 28);
		fabric.add(labelPocket);
		
		selectedpocket = new JLabel("");
		selectedpocket.setForeground(SystemColor.textHighlight);
		selectedpocket.setFont(new Font("Tahoma", Font.BOLD, 9));
		selectedpocket.setBounds(968, 597, 107, 28);
		fabric.add(selectedpocket);
		
		final JLabel lblPlacket = new JLabel("PLACKET : ");
		lblPlacket.setForeground(SystemColor.windowBorder);
		lblPlacket.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblPlacket.setBounds(23, 644, 65, 28);
		fabric.add(lblPlacket);
		
		selectedPlacket = new JLabel("");
		selectedPlacket.setForeground(SystemColor.textHighlight);
		selectedPlacket.setFont(new Font("Tahoma", Font.BOLD, 9));
		selectedPlacket.setBounds(88, 644, 97, 28);
		fabric.add(selectedPlacket);
		
		final JLabel lblBack = new JLabel("BACK : ");
		lblBack.setForeground(SystemColor.windowBorder);
		lblBack.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblBack.setBounds(195, 644, 48, 28);
		fabric.add(lblBack);
		
		selectedBack = new JLabel("");
		selectedBack.setForeground(SystemColor.textHighlight);
		selectedBack.setFont(new Font("Tahoma", Font.BOLD, 9));
		selectedBack.setBounds(245, 644, 107, 28);
		fabric.add(selectedBack);
		
		String bottom = "BOTTOM";
		String style = "&nbsp;&nbsp;STYLE : ";
		String bottomStyle = "<html>"+bottom+"<br>"+style+"</html>";
		final JLabel lblBottomStyle = new JLabel(bottomStyle);
		lblBottomStyle.setForeground(SystemColor.windowBorder);
		lblBottomStyle.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblBottomStyle.setBounds(378, 644, 65, 28);
		fabric.add(lblBottomStyle);
		
		selectedBottomStyle = new JLabel("");
		selectedBottomStyle.setForeground(SystemColor.textHighlight);
		selectedBottomStyle.setFont(new Font("Tahoma", Font.BOLD, 9));
		selectedBottomStyle.setBounds(444, 644, 97, 28);
		fabric.add(selectedBottomStyle);
		
		final JLabel lblSignature = new JLabel("SIGNATURE: ");
		lblSignature.setForeground(SystemColor.windowBorder);
		lblSignature.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblSignature.setBounds(546, 644, 73, 28);
		fabric.add(lblSignature);
		
		selectedSignature = new JLabel("");
		selectedSignature.setForeground(SystemColor.textHighlight);
		selectedSignature.setFont(new Font("Tahoma", Font.BOLD, 9));
		selectedSignature.setBounds(612, 644, 107, 28);
		fabric.add(selectedSignature);
		
		String outer = "&nbsp;&nbsp;&nbsp;&nbsp;OUTER";
		String contrast = "CONTRAST : ";
		String innerContrast = "<html>"+outer+"<br>"+contrast+"</html>";
		final JLabel lblOuterContrast = new JLabel(innerContrast);
		lblOuterContrast.setForeground(SystemColor.windowBorder);
		lblOuterContrast.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblOuterContrast.setBounds(729, 636, 73, 28);
		fabric.add(lblOuterContrast);
		
		selectedOuter = new JLabel("");
		selectedOuter.setForeground(SystemColor.textHighlight);
		selectedOuter.setFont(new Font("Tahoma", Font.BOLD, 9));
		selectedOuter.setBounds(794, 636, 107, 28);
		fabric.add(selectedOuter);
		
		String inner = "&nbsp;&nbsp;&nbsp;&nbsp;INNER";
		String contrast1 = "CONTRAST : ";
		String innerContrast1 = "<html>"+inner+"<br>"+contrast1+"</html>";
		final JLabel lblInnerContrast = new JLabel(innerContrast1);
		lblInnerContrast.setForeground(SystemColor.windowBorder);
		lblInnerContrast.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblInnerContrast.setBounds(916, 636, 73, 28);
		fabric.add(lblInnerContrast);
		
		selectedINNERCONTRAST = new JLabel("");
		selectedINNERCONTRAST.setForeground(SystemColor.textHighlight);
		selectedINNERCONTRAST.setFont(new Font("Tahoma", Font.BOLD, 9));
		selectedINNERCONTRAST.setBounds(988, 636, 107, 28);
		fabric.add(selectedINNERCONTRAST);
		
		/* Selected Information End */
		
		/* fabric layout*/
		final JDesktopPane fabricFane = new JDesktopPane();
		fabricFane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.TRAILING, TitledBorder.TOP, null, new Color(51, 153, 255)));
		fabricFane.setBackground(SystemColor.text);
		fabricFane.setBounds(117, 11, 650, 550);
		fabric.add(fabricFane);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(633, 0, 17, 550);
		fabricFane.add(scrollBar);
		
		selectedFabric = new JLabel("");
		selectedFabric.setForeground(SystemColor.textHighlight);
		selectedFabric.setFont(new Font("Tahoma", Font.BOLD, 9));
		selectedFabric.setBounds(88, 597, 97, 28);
		fabric.add(selectedFabric);
		
		
		final JButton STY2015001 = new JButton("STY2015001");
		STY2015001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedFabric.setText(STY2015001.getText());
			}
		});
		STY2015001.setFont(new Font("Tahoma", Font.BOLD, 11));
		STY2015001.setForeground(SystemColor.text);
		STY2015001.setBackground(SystemColor.textHighlight);
		STY2015001.setBounds(20, 11, 122, 32);
		fabricFane.add(STY2015001);
		
		
		final JButton STY2015002 = new JButton("STY2015002");
		STY2015002.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedFabric.setText(STY2015002.getText());
			}
		});
		STY2015002.setFont(new Font("Tahoma", Font.BOLD, 11));
		STY2015002.setForeground(SystemColor.text);
		STY2015002.setBackground(SystemColor.textHighlight);
		STY2015002.setBounds(168, 11, 122, 32);
		fabricFane.add(STY2015002);
		
		final JButton STY2015003 = new JButton("STY2015003");
		STY2015003.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedFabric.setText(STY2015003.getText());
			}
		});
		STY2015003.setFont(new Font("Tahoma", Font.BOLD, 11));
		STY2015003.setForeground(SystemColor.text);
		STY2015003.setBackground(SystemColor.textHighlight);
		STY2015003.setBounds(320, 11, 122, 32);
		fabricFane.add(STY2015003);
		
		final JButton STY2015004 = new JButton("STY2015004");
		STY2015004.setFont(new Font("Tahoma", Font.BOLD, 11));
		STY2015004.setBackground(SystemColor.textHighlight);
		STY2015004.setForeground(SystemColor.text);
		STY2015004.setBounds(469, 11, 122, 32);
		fabricFane.add(STY2015004);
		
		final JButton btnLong = new JButton("Long");
		btnLong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedSleeve.setText(btnLong.getText());
			}
		});
		btnLong.setForeground(Color.WHITE);
		btnLong.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLong.setBackground(SystemColor.textHighlight);
		btnLong.setBounds(20, 54, 122, 32);
		fabricFane.add(btnLong);
		
		final JButton btnShort = new JButton("Short");
		btnShort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedSleeve.setText(btnShort.getText());
			}
		});
		btnShort.setForeground(Color.WHITE);
		btnShort.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnShort.setBackground(SystemColor.textHighlight);
		btnShort.setBounds(168, 54, 122, 32);
		fabricFane.add(btnShort);
		
		final JButton btnBigRound = new JButton("Big Round");
		btnBigRound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCollar.setText(btnBigRound.getText());
			}
		});
		btnBigRound.setForeground(Color.WHITE);
		btnBigRound.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBigRound.setBackground(SystemColor.textHighlight);
		btnBigRound.setBounds(20, 97, 122, 32);
		fabricFane.add(btnBigRound);
		
		final JButton btnCutAway = new JButton("Cut Away");
		btnCutAway.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCollar.setText(btnCutAway.getText());
			}
		});
		btnCutAway.setForeground(Color.WHITE);
		btnCutAway.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCutAway.setBackground(SystemColor.textHighlight);
		btnCutAway.setBounds(168, 97, 122, 32);
		fabricFane.add(btnCutAway);
		
		final JButton btnDualButton = new JButton("Dual Button");
		btnDualButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCollar.setText(btnDualButton.getText());
			}
		});
		btnDualButton.setForeground(Color.WHITE);
		btnDualButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDualButton.setBackground(SystemColor.textHighlight);
		btnDualButton.setBounds(320, 97, 122, 32);
		fabricFane.add(btnDualButton);
		
		final JButton btnStand = new JButton("Stand");
		btnStand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCollar.setText(btnStand.getText());
			}
		});
		btnStand.setForeground(Color.WHITE);
		btnStand.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnStand.setBackground(SystemColor.textHighlight);
		btnStand.setBounds(469, 97, 122, 32);
		fabricFane.add(btnStand);
		
		final JButton button_6 = new JButton("01");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedButton.setText(button_6.getText());
			}
		});
		button_6.setForeground(Color.WHITE);
		button_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_6.setBackground(SystemColor.textHighlight);
		button_6.setBounds(20, 140, 122, 32);
		fabricFane.add(button_6);
		
		final JButton button_7 = new JButton("02");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedButton.setText(button_7.getText());
			}
		});
		button_7.setForeground(Color.WHITE);
		button_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_7.setBackground(SystemColor.textHighlight);
		button_7.setBounds(168, 140, 122, 32);
		fabricFane.add(button_7);
		
		final JButton button_8 = new JButton("03");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedButton.setText(button_8.getText());
			}
		});
		button_8.setForeground(Color.WHITE);
		button_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_8.setBackground(SystemColor.textHighlight);
		button_8.setBounds(320, 140, 122, 32);
		fabricFane.add(button_8);
		
		final JButton button_9 = new JButton("04");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedButton.setText(button_9.getText());
			}
		});
		button_9.setForeground(Color.WHITE);
		button_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_9.setBackground(SystemColor.textHighlight);
		button_9.setBounds(469, 140, 122, 32);
		fabricFane.add(button_9);
		
		final JButton btnLeft = new JButton("Left");
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedpocket.setText(btnLeft.getText());
			}
		});
		btnLeft.setForeground(Color.WHITE);
		btnLeft.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLeft.setBackground(SystemColor.textHighlight);
		btnLeft.setBounds(20, 226, 122, 32);
		fabricFane.add(btnLeft);
		
		final JButton btnNone = new JButton("None");
		btnNone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedpocket.setText(btnNone.getText());
			}
		});
		btnNone.setForeground(Color.WHITE);
		btnNone.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNone.setBackground(SystemColor.textHighlight);
		btnNone.setBounds(168, 226, 122, 32);
		fabricFane.add(btnNone);
		
		final JButton btnBox = new JButton("Box");
		btnBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedPlacket.setText(btnBox.getText());
			}
		});
		btnBox.setForeground(Color.WHITE);
		btnBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBox.setBackground(SystemColor.textHighlight);
		btnBox.setBounds(20, 269, 122, 32);
		fabricFane.add(btnBox);
		
		final JButton btnFrench = new JButton("French");
		btnFrench.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedPlacket.setText(btnFrench.getText());
			}
		});
		btnFrench.setForeground(Color.WHITE);
		btnFrench.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFrench.setBackground(SystemColor.textHighlight);
		btnFrench.setBounds(168, 269, 122, 32);
		fabricFane.add(btnFrench);
		
		final JButton btnNarrow = new JButton("Narrow");
		btnNarrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedPlacket.setText(btnNarrow.getText());
			}
		});
		btnNarrow.setForeground(Color.WHITE);
		btnNarrow.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNarrow.setBackground(SystemColor.textHighlight);
		btnNarrow.setBounds(320, 269, 122, 32);
		fabricFane.add(btnNarrow);
		
		final JButton btnConcealed = new JButton("Concealed");
		btnConcealed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedPlacket.setText(btnConcealed.getText());
			}
		});
		btnConcealed.setForeground(Color.WHITE);
		btnConcealed.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConcealed.setBackground(SystemColor.textHighlight);
		btnConcealed.setBounds(469, 269, 122, 32);
		fabricFane.add(btnConcealed);
		
		final JButton btnSidePleat = new JButton("Side Pleat");
		btnSidePleat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedBack.setText(btnSidePleat.getText());
			}
		});
		btnSidePleat.setForeground(Color.WHITE);
		btnSidePleat.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSidePleat.setBackground(SystemColor.textHighlight);
		btnSidePleat.setBounds(20, 321, 122, 32);
		fabricFane.add(btnSidePleat);
		
		final JButton btnBoxPleat = new JButton("Box Pleat");
		btnBoxPleat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedBack.setText(btnBoxPleat.getText());
			}
		});
		btnBoxPleat.setForeground(Color.WHITE);
		btnBoxPleat.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBoxPleat.setBackground(SystemColor.textHighlight);
		btnBoxPleat.setBounds(168, 321, 122, 32);
		fabricFane.add(btnBoxPleat);
		
		final JButton btnDartPleat = new JButton("Dart Pleat");
		btnDartPleat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedBack.setText(btnDartPleat.getText());
			}
		});
		btnDartPleat.setForeground(Color.WHITE);
		btnDartPleat.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDartPleat.setBackground(SystemColor.textHighlight);
		btnDartPleat.setBounds(320, 321, 122, 32);
		fabricFane.add(btnDartPleat);
		
		final JButton btnMidTail = new JButton("Mid Tail");
		btnMidTail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedBottomStyle.setText(btnMidTail.getText());
			}
		});
		btnMidTail.setForeground(Color.WHITE);
		btnMidTail.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMidTail.setBackground(SystemColor.textHighlight);
		btnMidTail.setBounds(20, 371, 122, 32);
		fabricFane.add(btnMidTail);
		
		final JButton btnHighTail = new JButton("High Tail");
		btnHighTail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedBottomStyle.setText(btnHighTail.getText());
			}
		});
		btnHighTail.setForeground(Color.WHITE);
		btnHighTail.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnHighTail.setBackground(SystemColor.textHighlight);
		btnHighTail.setBounds(168, 371, 122, 32);
		fabricFane.add(btnHighTail);
		
		final JButton btnStraightTail = new JButton("Straight Tail");
		btnStraightTail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedBottomStyle.setText(btnStraightTail.getText());
			}
		});
		btnStraightTail.setForeground(Color.WHITE);
		btnStraightTail.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnStraightTail.setBackground(SystemColor.textHighlight);
		btnStraightTail.setBounds(320, 371, 122, 32);
		fabricFane.add(btnStraightTail);
		
		final JButton btnNone_1 = new JButton("None");
		btnNone_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedSignature.setText(btnNone_1.getText());
			}
		});
		btnNone_1.setForeground(Color.WHITE);
		btnNone_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNone_1.setBackground(SystemColor.textHighlight);
		btnNone_1.setBounds(20, 414, 122, 32);
		fabricFane.add(btnNone_1);
		
		final JButton btnInbitial = new JButton("Initial");
		btnInbitial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedSignature.setText(btnInbitial.getText());
			}
		});
		btnInbitial.setForeground(Color.WHITE);
		btnInbitial.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnInbitial.setBackground(SystemColor.textHighlight);
		btnInbitial.setBounds(168, 414, 122, 32);
		fabricFane.add(btnInbitial);
		
		final JButton btnName = new JButton("Name");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedSignature.setText(btnName.getText());
			}
			
		});
		btnName.setForeground(Color.WHITE);
		btnName.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnName.setBackground(SystemColor.textHighlight);
		btnName.setBounds(320, 414, 122, 32);
		fabricFane.add(btnName);
		
		final JButton btnNone_2 = new JButton("None");
		btnNone_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedOuter.setText(btnNone_2.getText());
			}
		});
		btnNone_2.setForeground(Color.WHITE);
		btnNone_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNone_2.setBackground(SystemColor.textHighlight);
		btnNone_2.setBounds(20, 457, 122, 32);
		fabricFane.add(btnNone_2);
		
		final JButton btnCollar = new JButton("Collar");
		btnCollar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedOuter.setText(btnCollar.getText());
			}
		});
		btnCollar.setForeground(Color.WHITE);
		btnCollar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCollar.setBackground(SystemColor.textHighlight);
		btnCollar.setBounds(168, 457, 122, 32);
		fabricFane.add(btnCollar);
		
		final JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedINNERCONTRAST.setText(btnYes.getText());
			}
		});
		btnYes.setForeground(Color.WHITE);
		btnYes.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnYes.setBackground(SystemColor.textHighlight);
		btnYes.setBounds(20, 500, 122, 32);
		fabricFane.add(btnYes);
		
		final JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedINNERCONTRAST.setText(btnNo.getText());
			}
		});
		btnNo.setForeground(Color.WHITE);
		btnNo.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNo.setBackground(SystemColor.textHighlight);
		btnNo.setBounds(168, 500, 122, 32);
		fabricFane.add(btnNo);
		
		final JButton cuffRound = new JButton("Round");
		cuffRound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCuff.setText(cuffRound.getText());
			}
		});
		cuffRound.setForeground(SystemColor.text);
		cuffRound.setFont(new Font("Tahoma", Font.BOLD, 11));
		cuffRound.setBackground(SystemColor.textHighlight);
		cuffRound.setBounds(20, 183, 122, 32);
		fabricFane.add(cuffRound);
		
		final JButton cuffAngle = new JButton("Angle");
		cuffAngle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCuff.setText(cuffAngle.getText());
			}
		});
		cuffAngle.setForeground(Color.WHITE);
		cuffAngle.setFont(new Font("Tahoma", Font.BOLD, 11));
		cuffAngle.setBackground(SystemColor.textHighlight);
		cuffAngle.setBounds(168, 183, 122, 32);
		fabricFane.add(cuffAngle);
		
		final JButton cuffSquare = new JButton("Square");
		cuffSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCuff.setText(cuffSquare.getText());
			}
		});
		cuffSquare.setForeground(Color.WHITE);
		cuffSquare.setFont(new Font("Tahoma", Font.BOLD, 11));
		cuffSquare.setBackground(SystemColor.textHighlight);
		cuffSquare.setBounds(320, 183, 122, 32);
		fabricFane.add(cuffSquare);
		
		final JButton cuffFrench = new JButton("French");
		cuffFrench.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCuff.setText(cuffFrench.getText());
			}
		});
		cuffFrench.setForeground(Color.WHITE);
		cuffFrench.setFont(new Font("Tahoma", Font.BOLD, 11));
		cuffFrench.setBackground(SystemColor.textHighlight);
		cuffFrench.setBounds(469, 183, 122, 32);
		fabricFane.add(cuffFrench);
		//sleevePhane.setVisible(false);
		
		STY2015001.setVisible(true);STY2015002.setVisible(true);STY2015003.setVisible(true);STY2015004.setVisible(true);

		btnLong.setVisible(false);btnShort.setVisible(false);

		btnBigRound.setVisible(false);btnCutAway.setVisible(false);btnDualButton.setVisible(false);btnStand.setVisible(false);

		button_6.setVisible(false);button_7.setVisible(false);button_8.setVisible(false);button_9.setVisible(false);

		btnLeft.setVisible(false);btnNone.setVisible(false);

		btnBox.setVisible(false);btnFrench.setVisible(false);btnNarrow.setVisible(false);btnConcealed.setVisible(false);

		btnSidePleat.setVisible(false);btnBoxPleat.setVisible(false);btnDartPleat.setVisible(false);

		btnMidTail.setVisible(false);btnHighTail.setVisible(false);btnStraightTail.setVisible(false);


		btnNone_1.setVisible(false);btnInbitial.setVisible(false);btnName.setVisible(false);

		btnNone_2.setVisible(false);btnCollar.setVisible(false);

		btnYes.setVisible(false);btnNo.setVisible(false);
		
		cuffRound.setVisible(false);cuffAngle.setVisible(false);cuffSquare.setVisible(false);cuffFrench.setVisible(false);
		
		/* Fabric button */
		JButton btnNewButton = new JButton("FABRIC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fabricFane.setVisible(true);
				//sleevePhane.setVisible(false);
				
				STY2015001.setVisible(true);STY2015002.setVisible(true);STY2015003.setVisible(true);STY2015004.setVisible(true);

				btnLong.setVisible(false);btnShort.setVisible(false);

				btnBigRound.setVisible(false);btnCutAway.setVisible(false);btnDualButton.setVisible(false);btnStand.setVisible(false);

				button_6.setVisible(false);button_7.setVisible(false);button_8.setVisible(false);button_9.setVisible(false);

				btnLeft.setVisible(false);btnNone.setVisible(false);

				btnBox.setVisible(false);btnFrench.setVisible(false);btnNarrow.setVisible(false);btnConcealed.setVisible(false);

				btnSidePleat.setVisible(false);btnBoxPleat.setVisible(false);btnDartPleat.setVisible(false);

				btnMidTail.setVisible(false);btnHighTail.setVisible(false);btnStraightTail.setVisible(false);


				btnNone_1.setVisible(false);btnInbitial.setVisible(false);btnName.setVisible(false);

				btnNone_2.setVisible(false);btnCollar.setVisible(false);

				btnYes.setVisible(false);btnNo.setVisible(false);
				cuffRound.setVisible(false);cuffAngle.setVisible(false);cuffSquare.setVisible(false);cuffFrench.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(SystemColor.text);
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setBounds(10, 11, 97, 35);
		fabric.add(btnNewButton);
		
		/*  Sleeve Button*/
		JButton btnNewButton_1 = new JButton("SLEEVE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//fabric.remove(desktopPane);
				//fabricFane.setVisible(false);
				//sleevePhane.setBounds(117, 11, 650, 550);
				//sleevePhane.setVisible(true);
				
				STY2015001.setVisible(false);STY2015002.setVisible(false);STY2015003.setVisible(false);STY2015004.setVisible(false);

				btnLong.setVisible(true);btnShort.setVisible(true);
				btnLong.setBounds(20, 11, 122, 32);btnShort.setBounds(168, 11, 122, 32);

				btnBigRound.setVisible(false);btnCutAway.setVisible(false);btnDualButton.setVisible(false);btnStand.setVisible(false);

				button_6.setVisible(false);button_7.setVisible(false);button_8.setVisible(false);button_9.setVisible(false);

				btnLeft.setVisible(false);btnNone.setVisible(false);

				btnBox.setVisible(false);btnFrench.setVisible(false);btnNarrow.setVisible(false);btnConcealed.setVisible(false);

				btnSidePleat.setVisible(false);btnBoxPleat.setVisible(false);btnDartPleat.setVisible(false);

				btnMidTail.setVisible(false);btnHighTail.setVisible(false);btnStraightTail.setVisible(false);


				btnNone_1.setVisible(false);btnInbitial.setVisible(false);btnName.setVisible(false);

				btnNone_2.setVisible(false);btnCollar.setVisible(false);

				btnYes.setVisible(false);btnNo.setVisible(false);
				cuffRound.setVisible(false);cuffAngle.setVisible(false);cuffSquare.setVisible(false);cuffFrench.setVisible(false);
			}
		});
		btnNewButton_1.setForeground(SystemColor.text);
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(10, 57, 97, 35);
		fabric.add(btnNewButton_1);
		
		JLabel lblFabric = new JLabel("FABRIC  : ");
		lblFabric.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblFabric.setForeground(SystemColor.windowBorder);
		lblFabric.setBounds(26, 597, 62, 28);
		fabric.add(lblFabric);
		
		/*  COLLOR Button*/
		JButton btnNewButton_3 = new JButton("COLLAR");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				STY2015001.setVisible(false);STY2015002.setVisible(false);STY2015003.setVisible(false);STY2015004.setVisible(false);

				btnLong.setVisible(false);btnShort.setVisible(false);
				btnLong.setBounds(20, 11, 122, 32);btnShort.setBounds(168, 11, 122, 32);

				btnBigRound.setVisible(true);btnCutAway.setVisible(true);btnDualButton.setVisible(true);btnStand.setVisible(true);
				btnBigRound.setBounds(20, 11, 122, 32);btnCutAway.setBounds(168, 11, 122, 32);btnDualButton.setBounds(320, 11, 122, 32);btnStand.setBounds(469, 11, 122, 32);
				
				button_6.setVisible(false);button_7.setVisible(false);button_8.setVisible(false);button_9.setVisible(false);

				btnLeft.setVisible(false);btnNone.setVisible(false);

				btnBox.setVisible(false);btnFrench.setVisible(false);btnNarrow.setVisible(false);btnConcealed.setVisible(false);

				btnSidePleat.setVisible(false);btnBoxPleat.setVisible(false);btnDartPleat.setVisible(false);

				btnMidTail.setVisible(false);btnHighTail.setVisible(false);btnStraightTail.setVisible(false);


				btnNone_1.setVisible(false);btnInbitial.setVisible(false);btnName.setVisible(false);

				btnNone_2.setVisible(false);btnCollar.setVisible(false);

				btnYes.setVisible(false);btnNo.setVisible(false);
				cuffRound.setVisible(false);cuffAngle.setVisible(false);cuffSquare.setVisible(false);cuffFrench.setVisible(false);

			}
		});
		btnNewButton_3.setForeground(SystemColor.text);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBackground(SystemColor.textHighlight);
		btnNewButton_3.setBounds(10, 105, 97, 35);
		fabric.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("BUTTON");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				STY2015001.setVisible(false);STY2015002.setVisible(false);STY2015003.setVisible(false);STY2015004.setVisible(false);

				btnLong.setVisible(false);btnShort.setVisible(false);
				btnLong.setBounds(20, 11, 122, 32);btnShort.setBounds(168, 11, 122, 32);

				btnBigRound.setVisible(false);btnCutAway.setVisible(false);btnDualButton.setVisible(false);btnStand.setVisible(false);
				btnBigRound.setBounds(20, 11, 122, 32);btnCutAway.setBounds(168, 11, 122, 32);btnDualButton.setBounds(320, 11, 122, 32);btnStand.setBounds(469, 11, 122, 32);
				
				button_6.setVisible(true);button_7.setVisible(true);button_8.setVisible(true);button_9.setVisible(true);
				button_6.setBounds(20, 11, 122, 32);button_7.setBounds(168, 11, 122, 32);button_8.setBounds(320, 11, 122, 32);button_9.setBounds(469, 11, 122, 32);

				btnLeft.setVisible(false);btnNone.setVisible(false);
				btnLeft.setBounds(20, 11, 122, 32);btnNone.setBounds(168, 11, 122, 32);
				btnBox.setVisible(false);btnFrench.setVisible(false);btnNarrow.setVisible(false);btnConcealed.setVisible(false);
				btnBox.setBounds(20, 11, 122, 32);btnFrench.setBounds(168, 11, 122, 32);btnNarrow.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);
				
				btnSidePleat.setVisible(false);btnBoxPleat.setVisible(false);btnDartPleat.setVisible(false);
				btnSidePleat.setBounds(20, 11, 122, 32);btnBoxPleat.setBounds(168, 11, 122, 32);btnDartPleat.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);

				btnMidTail.setVisible(false);btnHighTail.setVisible(false);btnStraightTail.setVisible(false);
				btnMidTail.setBounds(20, 11, 122, 32);btnHighTail.setBounds(168, 11, 122, 32);btnStraightTail.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);

				btnNone_1.setVisible(false);btnInbitial.setVisible(false);btnName.setVisible(false);
				btnNone_1.setBounds(20, 11, 122, 32);btnInbitial.setBounds(168, 11, 122, 32);btnName.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);
				
				btnNone_2.setVisible(false);btnCollar.setVisible(false);
				btnNone_2.setBounds(20, 11, 122, 32);btnCollar.setBounds(168, 11, 122, 32);

				btnYes.setVisible(false);btnNo.setVisible(false);
				btnYes.setBounds(20, 11, 122, 32);btnNo.setBounds(168, 11, 122, 32);
				cuffRound.setVisible(false);cuffAngle.setVisible(false);cuffSquare.setVisible(false);cuffFrench.setVisible(false);

			}
		});
		btnNewButton_4.setForeground(SystemColor.text);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.setBackground(SystemColor.textHighlight);
		btnNewButton_4.setBounds(10, 198, 97, 35);
		fabric.add(btnNewButton_4);
		
		JButton btnPocket = new JButton("POCKET");
		btnPocket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				STY2015001.setVisible(false);STY2015002.setVisible(false);STY2015003.setVisible(false);STY2015004.setVisible(false);

				btnLong.setVisible(false);btnShort.setVisible(false);
				btnLong.setBounds(20, 11, 122, 32);btnShort.setBounds(168, 11, 122, 32);

				btnBigRound.setVisible(false);btnCutAway.setVisible(false);btnDualButton.setVisible(false);btnStand.setVisible(false);
				btnBigRound.setBounds(20, 11, 122, 32);btnCutAway.setBounds(168, 11, 122, 32);btnDualButton.setBounds(320, 11, 122, 32);btnStand.setBounds(469, 11, 122, 32);
				
				button_6.setVisible(false);button_7.setVisible(false);button_8.setVisible(false);button_9.setVisible(false);
				button_6.setBounds(20, 11, 122, 32);button_7.setBounds(168, 11, 122, 32);button_8.setBounds(320, 11, 122, 32);button_9.setBounds(469, 11, 122, 32);

				btnLeft.setVisible(true);btnNone.setVisible(true);
				btnLeft.setBounds(20, 11, 122, 32);btnNone.setBounds(168, 11, 122, 32);
				btnBox.setVisible(false);btnFrench.setVisible(false);btnNarrow.setVisible(false);btnConcealed.setVisible(false);
				btnBox.setBounds(20, 11, 122, 32);btnFrench.setBounds(168, 11, 122, 32);btnNarrow.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);
				
				btnSidePleat.setVisible(false);btnBoxPleat.setVisible(false);btnDartPleat.setVisible(false);
				btnSidePleat.setBounds(20, 11, 122, 32);btnBoxPleat.setBounds(168, 11, 122, 32);btnDartPleat.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);

				btnMidTail.setVisible(false);btnHighTail.setVisible(false);btnStraightTail.setVisible(false);
				btnMidTail.setBounds(20, 11, 122, 32);btnHighTail.setBounds(168, 11, 122, 32);btnStraightTail.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);

				btnNone_1.setVisible(false);btnInbitial.setVisible(false);btnName.setVisible(false);
				btnNone_1.setBounds(20, 11, 122, 32);btnInbitial.setBounds(168, 11, 122, 32);btnName.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);
				
				btnNone_2.setVisible(false);btnCollar.setVisible(false);
				btnNone_2.setBounds(20, 11, 122, 32);btnCollar.setBounds(168, 11, 122, 32);

				btnYes.setVisible(false);btnNo.setVisible(false);
				btnYes.setBounds(20, 11, 122, 32);btnNo.setBounds(168, 11, 122, 32);
				cuffRound.setVisible(false);cuffAngle.setVisible(false);cuffSquare.setVisible(false);cuffFrench.setVisible(false);

			}
		});
		btnPocket.setForeground(Color.WHITE);
		btnPocket.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPocket.setBackground(SystemColor.textHighlight);
		btnPocket.setBounds(10, 244, 97, 35);
		fabric.add(btnPocket);
		
		JButton btnPlacket = new JButton("PLACKET");
		btnPlacket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				STY2015001.setVisible(false);STY2015002.setVisible(false);STY2015003.setVisible(false);STY2015004.setVisible(false);

				btnLong.setVisible(false);btnShort.setVisible(false);
				btnLong.setBounds(20, 11, 122, 32);btnShort.setBounds(168, 11, 122, 32);

				btnBigRound.setVisible(false);btnCutAway.setVisible(false);btnDualButton.setVisible(false);btnStand.setVisible(false);
				btnBigRound.setBounds(20, 11, 122, 32);btnCutAway.setBounds(168, 11, 122, 32);btnDualButton.setBounds(320, 11, 122, 32);btnStand.setBounds(469, 11, 122, 32);
				
				button_6.setVisible(false);button_7.setVisible(false);button_8.setVisible(false);button_9.setVisible(false);
				button_6.setBounds(20, 11, 122, 32);button_7.setBounds(168, 11, 122, 32);button_8.setBounds(320, 11, 122, 32);button_9.setBounds(469, 11, 122, 32);

				btnLeft.setVisible(false);btnNone.setVisible(false);
				btnLeft.setBounds(20, 11, 122, 32);btnNone.setBounds(168, 11, 122, 32);
				btnBox.setVisible(true);btnFrench.setVisible(true);btnNarrow.setVisible(true);btnConcealed.setVisible(true);
				btnBox.setBounds(20, 11, 122, 32);btnFrench.setBounds(168, 11, 122, 32);btnNarrow.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);
				
				btnSidePleat.setVisible(false);btnBoxPleat.setVisible(false);btnDartPleat.setVisible(false);
				btnSidePleat.setBounds(20, 11, 122, 32);btnBoxPleat.setBounds(168, 11, 122, 32);btnDartPleat.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);

				btnMidTail.setVisible(false);btnHighTail.setVisible(false);btnStraightTail.setVisible(false);
				btnMidTail.setBounds(20, 11, 122, 32);btnHighTail.setBounds(168, 11, 122, 32);btnStraightTail.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);

				btnNone_1.setVisible(false);btnInbitial.setVisible(false);btnName.setVisible(false);
				btnNone_1.setBounds(20, 11, 122, 32);btnInbitial.setBounds(168, 11, 122, 32);btnName.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);
				
				btnNone_2.setVisible(false);btnCollar.setVisible(false);
				btnNone_2.setBounds(20, 11, 122, 32);btnCollar.setBounds(168, 11, 122, 32);

				btnYes.setVisible(false);btnNo.setVisible(false);
				btnYes.setBounds(20, 11, 122, 32);btnNo.setBounds(168, 11, 122, 32);
				cuffRound.setVisible(false);cuffAngle.setVisible(false);cuffSquare.setVisible(false);cuffFrench.setVisible(false);
			}
		});
		btnPlacket.setForeground(Color.WHITE);
		btnPlacket.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPlacket.setBackground(SystemColor.textHighlight);
		btnPlacket.setBounds(10, 290, 97, 35);
		fabric.add(btnPlacket);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				STY2015001.setVisible(false);STY2015002.setVisible(false);STY2015003.setVisible(false);STY2015004.setVisible(false);

				btnLong.setVisible(false);btnShort.setVisible(false);
				btnLong.setBounds(20, 11, 122, 32);btnShort.setBounds(168, 11, 122, 32);

				btnBigRound.setVisible(false);btnCutAway.setVisible(false);btnDualButton.setVisible(false);btnStand.setVisible(false);
				btnBigRound.setBounds(20, 11, 122, 32);btnCutAway.setBounds(168, 11, 122, 32);btnDualButton.setBounds(320, 11, 122, 32);btnStand.setBounds(469, 11, 122, 32);
				
				button_6.setVisible(false);button_7.setVisible(false);button_8.setVisible(false);button_9.setVisible(false);
				button_6.setBounds(20, 11, 122, 32);button_7.setBounds(168, 11, 122, 32);button_8.setBounds(320, 11, 122, 32);button_9.setBounds(469, 11, 122, 32);

				btnLeft.setVisible(false);btnNone.setVisible(false);
				btnLeft.setBounds(20, 11, 122, 32);btnNone.setBounds(168, 11, 122, 32);
				btnBox.setVisible(false);btnFrench.setVisible(false);btnNarrow.setVisible(false);btnConcealed.setVisible(false);
				btnBox.setBounds(20, 11, 122, 32);btnFrench.setBounds(168, 11, 122, 32);btnNarrow.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);
				
				btnSidePleat.setVisible(true);btnBoxPleat.setVisible(true);btnDartPleat.setVisible(true);
				btnSidePleat.setBounds(20, 11, 122, 32);btnBoxPleat.setBounds(168, 11, 122, 32);btnDartPleat.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);

				btnMidTail.setVisible(false);btnHighTail.setVisible(false);btnStraightTail.setVisible(false);
				btnMidTail.setBounds(20, 11, 122, 32);btnHighTail.setBounds(168, 11, 122, 32);btnStraightTail.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);

				btnNone_1.setVisible(false);btnInbitial.setVisible(false);btnName.setVisible(false);
				btnNone_1.setBounds(20, 11, 122, 32);btnInbitial.setBounds(168, 11, 122, 32);btnName.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);
				
				btnNone_2.setVisible(false);btnCollar.setVisible(false);
				btnNone_2.setBounds(20, 11, 122, 32);btnCollar.setBounds(168, 11, 122, 32);

				btnYes.setVisible(false);btnNo.setVisible(false);
				btnYes.setBounds(20, 11, 122, 32);btnNo.setBounds(168, 11, 122, 32);
				cuffRound.setVisible(false);cuffAngle.setVisible(false);cuffSquare.setVisible(false);cuffFrench.setVisible(false);
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setBackground(SystemColor.textHighlight);
		btnBack.setBounds(10, 336, 97, 35);
		fabric.add(btnBack);
		
		String bottom1 = "BOTTOM";
		String style1 = "&nbsp;&nbsp;STYLE";
		String bottomStyle1 = "<html>"+bottom1+"<br>"+style1+"</html>";
		JButton btnBottom = new JButton(bottomStyle1);
		btnBottom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				STY2015001.setVisible(false);STY2015002.setVisible(false);STY2015003.setVisible(false);STY2015004.setVisible(false);

				btnLong.setVisible(false);btnShort.setVisible(false);
				btnLong.setBounds(20, 11, 122, 32);btnShort.setBounds(168, 11, 122, 32);

				btnBigRound.setVisible(false);btnCutAway.setVisible(false);btnDualButton.setVisible(false);btnStand.setVisible(false);
				btnBigRound.setBounds(20, 11, 122, 32);btnCutAway.setBounds(168, 11, 122, 32);btnDualButton.setBounds(320, 11, 122, 32);btnStand.setBounds(469, 11, 122, 32);
				
				button_6.setVisible(false);button_7.setVisible(false);button_8.setVisible(false);button_9.setVisible(false);
				button_6.setBounds(20, 11, 122, 32);button_7.setBounds(168, 11, 122, 32);button_8.setBounds(320, 11, 122, 32);button_9.setBounds(469, 11, 122, 32);

				btnLeft.setVisible(false);btnNone.setVisible(false);
				btnLeft.setBounds(20, 11, 122, 32);btnNone.setBounds(168, 11, 122, 32);
				btnBox.setVisible(false);btnFrench.setVisible(false);btnNarrow.setVisible(false);btnConcealed.setVisible(false);
				btnBox.setBounds(20, 11, 122, 32);btnFrench.setBounds(168, 11, 122, 32);btnNarrow.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);
				
				btnSidePleat.setVisible(false);btnBoxPleat.setVisible(false);btnDartPleat.setVisible(false);
				btnSidePleat.setBounds(20, 11, 122, 32);btnBoxPleat.setBounds(168, 11, 122, 32);btnDartPleat.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);

				btnMidTail.setVisible(true);btnHighTail.setVisible(true);btnStraightTail.setVisible(true);
				btnMidTail.setBounds(20, 11, 122, 32);btnHighTail.setBounds(168, 11, 122, 32);btnStraightTail.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);

				btnNone_1.setVisible(false);btnInbitial.setVisible(false);btnName.setVisible(false);
				btnNone_1.setBounds(20, 11, 122, 32);btnInbitial.setBounds(168, 11, 122, 32);btnName.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);
				
				btnNone_2.setVisible(false);btnCollar.setVisible(false);
				btnNone_2.setBounds(20, 11, 122, 32);btnCollar.setBounds(168, 11, 122, 32);

				btnYes.setVisible(false);btnNo.setVisible(false);
				btnYes.setBounds(20, 11, 122, 32);btnNo.setBounds(168, 11, 122, 32);
				cuffRound.setVisible(false);cuffAngle.setVisible(false);cuffSquare.setVisible(false);cuffFrench.setVisible(false);
			}
		});
		btnBottom.setForeground(Color.WHITE);
		btnBottom.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBottom.setBackground(SystemColor.textHighlight);
		btnBottom.setBounds(10, 382, 97, 35);
		fabric.add(btnBottom);
		
		JButton btnSignature = new JButton("SIGNATURE");
		btnSignature.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				STY2015001.setVisible(false);STY2015002.setVisible(false);STY2015003.setVisible(false);STY2015004.setVisible(false);

				btnLong.setVisible(false);btnShort.setVisible(false);
				btnLong.setBounds(20, 11, 122, 32);btnShort.setBounds(168, 11, 122, 32);

				btnBigRound.setVisible(false);btnCutAway.setVisible(false);btnDualButton.setVisible(false);btnStand.setVisible(false);
				btnBigRound.setBounds(20, 11, 122, 32);btnCutAway.setBounds(168, 11, 122, 32);btnDualButton.setBounds(320, 11, 122, 32);btnStand.setBounds(469, 11, 122, 32);
				
				button_6.setVisible(false);button_7.setVisible(false);button_8.setVisible(false);button_9.setVisible(false);
				button_6.setBounds(20, 11, 122, 32);button_7.setBounds(168, 11, 122, 32);button_8.setBounds(320, 11, 122, 32);button_9.setBounds(469, 11, 122, 32);

				btnLeft.setVisible(false);btnNone.setVisible(false);
				btnLeft.setBounds(20, 11, 122, 32);btnNone.setBounds(168, 11, 122, 32);
				btnBox.setVisible(false);btnFrench.setVisible(false);btnNarrow.setVisible(false);btnConcealed.setVisible(false);
				btnBox.setBounds(20, 11, 122, 32);btnFrench.setBounds(168, 11, 122, 32);btnNarrow.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);
				
				btnSidePleat.setVisible(false);btnBoxPleat.setVisible(false);btnDartPleat.setVisible(false);
				btnSidePleat.setBounds(20, 11, 122, 32);btnBoxPleat.setBounds(168, 11, 122, 32);btnDartPleat.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);

				btnMidTail.setVisible(false);btnHighTail.setVisible(false);btnStraightTail.setVisible(false);
				btnMidTail.setBounds(20, 11, 122, 32);btnHighTail.setBounds(168, 11, 122, 32);btnStraightTail.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);

				btnNone_1.setVisible(true);btnInbitial.setVisible(true);btnName.setVisible(true);
				btnNone_1.setBounds(20, 11, 122, 32);btnInbitial.setBounds(168, 11, 122, 32);btnName.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);
				
				btnNone_2.setVisible(false);btnCollar.setVisible(false);
				btnNone_2.setBounds(20, 11, 122, 32);btnCollar.setBounds(168, 11, 122, 32);

				btnYes.setVisible(false);btnNo.setVisible(false);
				btnYes.setBounds(20, 11, 122, 32);btnNo.setBounds(168, 11, 122, 32);
				cuffRound.setVisible(false);cuffAngle.setVisible(false);cuffSquare.setVisible(false);cuffFrench.setVisible(false);
			}
		});
		btnSignature.setForeground(Color.WHITE);
		btnSignature.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnSignature.setBackground(SystemColor.textHighlight);
		btnSignature.setBounds(10, 428, 97, 35);
		fabric.add(btnSignature);
		
		String strOuter = "&nbsp;&nbsp;&nbsp;&nbsp;OUTER";
		String strContrast = "CONTRAST";
		String strOuterCon = "<html>"+strOuter+"<br>"+strContrast+"</html>";
		JButton btnOuterContrast = new JButton(strOuterCon);
		btnOuterContrast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				STY2015001.setVisible(false);STY2015002.setVisible(false);STY2015003.setVisible(false);STY2015004.setVisible(false);

				btnLong.setVisible(false);btnShort.setVisible(false);
				btnLong.setBounds(20, 11, 122, 32);btnShort.setBounds(168, 11, 122, 32);

				btnBigRound.setVisible(false);btnCutAway.setVisible(false);btnDualButton.setVisible(false);btnStand.setVisible(false);
				btnBigRound.setBounds(20, 11, 122, 32);btnCutAway.setBounds(168, 11, 122, 32);btnDualButton.setBounds(320, 11, 122, 32);btnStand.setBounds(469, 11, 122, 32);
				
				button_6.setVisible(false);button_7.setVisible(false);button_8.setVisible(false);button_9.setVisible(false);
				button_6.setBounds(20, 11, 122, 32);button_7.setBounds(168, 11, 122, 32);button_8.setBounds(320, 11, 122, 32);button_9.setBounds(469, 11, 122, 32);

				btnLeft.setVisible(false);btnNone.setVisible(false);
				btnLeft.setBounds(20, 11, 122, 32);btnNone.setBounds(168, 11, 122, 32);
				btnBox.setVisible(false);btnFrench.setVisible(false);btnNarrow.setVisible(false);btnConcealed.setVisible(false);
				btnBox.setBounds(20, 11, 122, 32);btnFrench.setBounds(168, 11, 122, 32);btnNarrow.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);
				
				btnSidePleat.setVisible(false);btnBoxPleat.setVisible(false);btnDartPleat.setVisible(false);
				btnSidePleat.setBounds(20, 11, 122, 32);btnBoxPleat.setBounds(168, 11, 122, 32);btnDartPleat.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);

				btnMidTail.setVisible(false);btnHighTail.setVisible(false);btnStraightTail.setVisible(false);
				btnMidTail.setBounds(20, 11, 122, 32);btnHighTail.setBounds(168, 11, 122, 32);btnStraightTail.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);

				btnNone_1.setVisible(false);btnInbitial.setVisible(false);btnName.setVisible(false);
				btnNone_1.setBounds(20, 11, 122, 32);btnInbitial.setBounds(168, 11, 122, 32);btnName.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);
				
				btnNone_2.setVisible(true);btnCollar.setVisible(true);
				btnNone_2.setBounds(20, 11, 122, 32);btnCollar.setBounds(168, 11, 122, 32);

				btnYes.setVisible(false);btnNo.setVisible(false);
				btnYes.setBounds(20, 11, 122, 32);btnNo.setBounds(168, 11, 122, 32);
				cuffRound.setVisible(false);cuffAngle.setVisible(false);cuffSquare.setVisible(false);cuffFrench.setVisible(false);
			}
		});
		btnOuterContrast.setForeground(Color.WHITE);
		btnOuterContrast.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnOuterContrast.setBackground(SystemColor.textHighlight);
		btnOuterContrast.setBounds(10, 480, 97, 35);
		fabric.add(btnOuterContrast);
		
		String innerCons = "&nbsp;&nbsp;&nbsp;&nbsp;INNER";
		String contras = "CONTRAST";
		String conInner = "<html>"+innerCons+"<br>"+contras+"</html>";
		JButton btnInnerContrast = new JButton(conInner);
		btnInnerContrast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				STY2015001.setVisible(false);STY2015002.setVisible(false);STY2015003.setVisible(false);STY2015004.setVisible(false);

				btnLong.setVisible(false);btnShort.setVisible(false);
				btnLong.setBounds(20, 11, 122, 32);btnShort.setBounds(168, 11, 122, 32);

				btnBigRound.setVisible(false);btnCutAway.setVisible(false);btnDualButton.setVisible(false);btnStand.setVisible(false);
				btnBigRound.setBounds(20, 11, 122, 32);btnCutAway.setBounds(168, 11, 122, 32);btnDualButton.setBounds(320, 11, 122, 32);btnStand.setBounds(469, 11, 122, 32);
				
				button_6.setVisible(false);button_7.setVisible(false);button_8.setVisible(false);button_9.setVisible(false);
				button_6.setBounds(20, 11, 122, 32);button_7.setBounds(168, 11, 122, 32);button_8.setBounds(320, 11, 122, 32);button_9.setBounds(469, 11, 122, 32);

				btnLeft.setVisible(false);btnNone.setVisible(false);
				btnLeft.setBounds(20, 11, 122, 32);btnNone.setBounds(168, 11, 122, 32);
				btnBox.setVisible(false);btnFrench.setVisible(false);btnNarrow.setVisible(false);btnConcealed.setVisible(false);
				btnBox.setBounds(20, 11, 122, 32);btnFrench.setBounds(168, 11, 122, 32);btnNarrow.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);
				
				btnSidePleat.setVisible(false);btnBoxPleat.setVisible(false);btnDartPleat.setVisible(false);
				btnSidePleat.setBounds(20, 11, 122, 32);btnBoxPleat.setBounds(168, 11, 122, 32);btnDartPleat.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);

				btnMidTail.setVisible(false);btnHighTail.setVisible(false);btnStraightTail.setVisible(false);
				btnMidTail.setBounds(20, 11, 122, 32);btnHighTail.setBounds(168, 11, 122, 32);btnStraightTail.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);

				btnNone_1.setVisible(false);btnInbitial.setVisible(false);btnName.setVisible(false);
				btnNone_1.setBounds(20, 11, 122, 32);btnInbitial.setBounds(168, 11, 122, 32);btnName.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);
				
				btnNone_2.setVisible(false);btnCollar.setVisible(false);
				btnNone_2.setBounds(20, 11, 122, 32);btnCollar.setBounds(168, 11, 122, 32);

				btnYes.setVisible(true);btnNo.setVisible(true);
				btnYes.setBounds(20, 11, 122, 32);btnNo.setBounds(168, 11, 122, 32);
				cuffRound.setVisible(false);cuffAngle.setVisible(false);cuffSquare.setVisible(false);cuffFrench.setVisible(false);
			}
		});
		btnInnerContrast.setForeground(Color.WHITE);
		btnInnerContrast.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnInnerContrast.setBackground(SystemColor.textHighlight);
		btnInnerContrast.setBounds(10, 526, 97, 35);
		fabric.add(btnInnerContrast);
		
		JButton cuff = new JButton("CUFF");
		cuff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				STY2015001.setVisible(false);STY2015002.setVisible(false);STY2015003.setVisible(false);STY2015004.setVisible(false);

				btnLong.setVisible(false);btnShort.setVisible(false);
				btnLong.setBounds(20, 11, 122, 32);btnShort.setBounds(168, 11, 122, 32);

				btnBigRound.setVisible(false);btnCutAway.setVisible(false);btnDualButton.setVisible(false);btnStand.setVisible(false);
				btnBigRound.setBounds(20, 11, 122, 32);btnCutAway.setBounds(168, 11, 122, 32);btnDualButton.setBounds(320, 11, 122, 32);btnStand.setBounds(469, 11, 122, 32);
				
				button_6.setVisible(false);button_7.setVisible(false);button_8.setVisible(false);button_9.setVisible(false);
				button_6.setBounds(20, 11, 122, 32);button_7.setBounds(168, 11, 122, 32);button_8.setBounds(320, 11, 122, 32);button_9.setBounds(469, 11, 122, 32);

				btnLeft.setVisible(false);btnNone.setVisible(false);
				btnLeft.setBounds(20, 11, 122, 32);btnNone.setBounds(168, 11, 122, 32);
				btnBox.setVisible(false);btnFrench.setVisible(false);btnNarrow.setVisible(false);btnConcealed.setVisible(false);
				btnBox.setBounds(20, 11, 122, 32);btnFrench.setBounds(168, 11, 122, 32);btnNarrow.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);
				
				btnSidePleat.setVisible(false);btnBoxPleat.setVisible(false);btnDartPleat.setVisible(false);
				btnSidePleat.setBounds(20, 11, 122, 32);btnBoxPleat.setBounds(168, 11, 122, 32);btnDartPleat.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);

				btnMidTail.setVisible(false);btnHighTail.setVisible(false);btnStraightTail.setVisible(false);
				btnMidTail.setBounds(20, 11, 122, 32);btnHighTail.setBounds(168, 11, 122, 32);btnStraightTail.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);

				btnNone_1.setVisible(false);btnInbitial.setVisible(false);btnName.setVisible(false);
				btnNone_1.setBounds(20, 11, 122, 32);btnInbitial.setBounds(168, 11, 122, 32);btnName.setBounds(320, 11, 122, 32);btnConcealed.setBounds(469, 11, 122, 32);
				
				btnNone_2.setVisible(false);btnCollar.setVisible(false);
				btnNone_2.setBounds(20, 11, 122, 32);btnCollar.setBounds(168, 11, 122, 32);

				btnYes.setVisible(false);btnNo.setVisible(false);
				btnYes.setBounds(20, 11, 122, 32);btnNo.setBounds(168, 11, 122, 32);
				cuffRound.setVisible(true);cuffAngle.setVisible(true);cuffSquare.setVisible(true);cuffFrench.setVisible(true);
				cuffRound.setBounds(20, 11, 122, 32);cuffAngle.setBounds(168, 11, 122, 32);cuffSquare.setBounds(320, 11, 122, 32);cuffFrench.setBounds(469, 11, 122, 32);
			}
		});
		cuff.setForeground(Color.WHITE);
		cuff.setFont(new Font("Tahoma", Font.BOLD, 11));
		cuff.setBackground(SystemColor.textHighlight);
		cuff.setBounds(10, 152, 97, 35);
		fabric.add(cuff);
		
		
		

		JButton OrderButton = new JButton("ORDER");
		OrderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/* add selected properties to pojo class */
				objOrder = new OrderOffline();
				objOrder.setFabric(selectedFabric.getText());
				objOrder.setSleeve(selectedSleeve.getText());
				objOrder.setCollar(selectedCollar.getText());
				objOrder.setCuff(selectedCuff.getText());
				objOrder.setButton(selectedButton.getText());
				objOrder.setPocket(selectedpocket.getText());
				objOrder.setPlacket(selectedPlacket.getText());
				objOrder.setBack(selectedBack.getText());
				objOrder.setBottomStyle(selectedBottomStyle.getText());
				objOrder.setSignature(selectedSignature.getText());
				objOrder.setOuterContrast(selectedOuter.getText());
				objOrder.setInnerContrast(selectedINNERCONTRAST.getText());
				
				
				ShirtMeasurements shirtMeasurementsFrame = new ShirtMeasurements();
				shirtMeasurementsFrame.setVisible(true);
				
				Toolkit toolkit =  Toolkit.getDefaultToolkit ();
				Dimension dim = toolkit.getScreenSize();
				shirtMeasurementsFrame.setSize(dim.width,dim.height);//here frame is your container 
				
				ShirtMeasurements.saveOrderInfo(objOrder);
				
				shirtMeasurementsFrame.hideWindow(shirt,hom);
				shirtMeasurementsFrame.showWindow(shirtMeasurementsFrame);
				
			}
		});
		OrderButton.setForeground(SystemColor.text);
		OrderButton.setBackground(SystemColor.textHighlight);
		OrderButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		OrderButton.setBounds(1221, 605, 107, 67);
		fabric.add(OrderButton);
		
		
		
		//fabric.remove(desktopPane);
		//fabric.add(desktopPane);
	}
	public void getOrderDetails(OrderOffline offlineObj){
		selectedFabric.setText(offlineObj.getFabric());
		selectedSleeve.setText(offlineObj.getSleeve());
		selectedCollar.setText(offlineObj.getCollar());
		selectedCuff.setText(offlineObj.getCuff());
		selectedButton.setText(offlineObj.getButton());
		selectedpocket.setText(offlineObj.getPocket());
		selectedPlacket.setText(offlineObj.getPlacket());
		selectedBack.setText(offlineObj.getBack());
		selectedBottomStyle.setText(offlineObj.getBottomStyle());
		selectedSignature.setText(offlineObj.getSignature());
		selectedOuter.setText(offlineObj.getOuterContrast());
		selectedINNERCONTRAST.setText(offlineObj.getInnerContrast());
	}
	Home hom = null;
	public void hideWindow(Home home) {
		home.setVisible(false);
		hom = home;
	}
	Shirt shirt = null;
	public void showFrame(Shirt shirtFrame) {
		shirt = shirtFrame;
		shirtFrame.setVisible(true);
		
		Toolkit toolkit =  Toolkit.getDefaultToolkit ();
		Dimension dim = toolkit.getScreenSize();
		shirtFrame.setSize(dim.width,dim.height);//here frame is your container 
	}

	public void hideBackWindow(ShirtMeasurements measures) {
		measures.setVisible(false);
		
	}
}
