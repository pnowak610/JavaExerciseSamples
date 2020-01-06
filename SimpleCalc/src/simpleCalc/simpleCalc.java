package simpleCalc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Panel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class simpleCalc {

	private JFrame frmPercentageCalc;
	private JTextField textField_evlue;
	private JTextField textField_1_percent_off;
	private JTextField textField_2_result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					simpleCalc window = new simpleCalc();
					window.frmPercentageCalc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public simpleCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPercentageCalc = new JFrame();
		frmPercentageCalc.getContentPane().setBackground(new Color(240, 240, 240));
		frmPercentageCalc.setTitle("Percentage Calc");
		frmPercentageCalc.setBounds(100, 100, 568, 289);
		frmPercentageCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPercentageCalc.getContentPane().setLayout(null);
		
		JLabel textLabel_1 = new JLabel("Ile to");
		textLabel_1.setBounds(37, 51, 91, 14);
		frmPercentageCalc.getContentPane().add(textLabel_1);
		
		JLabel textLabel_2 = new JLabel("% z");
		textLabel_2.setBounds(252, 51, 46, 14);
		frmPercentageCalc.getContentPane().add(textLabel_2);
		
		textField_evlue = new JTextField();
		textField_evlue.setBounds(124, 48, 86, 20);
		frmPercentageCalc.getContentPane().add(textField_evlue);
		textField_evlue.setColumns(10);
		
		textField_1_percent_off = new JTextField();
		textField_1_percent_off.setBounds(323, 48, 86, 20);
		frmPercentageCalc.getContentPane().add(textField_1_percent_off);
		textField_1_percent_off.setColumns(10);
		
		textField_2_result = new JTextField();
		textField_2_result.setBounds(323, 94, 86, 20);
		frmPercentageCalc.getContentPane().add(textField_2_result);
		textField_2_result.setColumns(10);
		
		JButton calculateButton = new JButton("Calculate");
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Float num1,num2,result;
				num1 = Float.parseFloat(textField_evlue.getText());
				num2 = Float.parseFloat(textField_1_percent_off.getText());
				result = num2 /100 * num1;
				textField_2_result.setText(String.valueOf(result));
				
			}
		});
		calculateButton.setBounds(124, 93, 89, 23);
		frmPercentageCalc.getContentPane().add(calculateButton);
		
		JButton clearButton = new JButton("Clear");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_evlue.setText("");
				textField_1_percent_off.setText("");
				textField_2_result.setText("");
				
			}
		});
		clearButton.setBounds(124, 156, 89, 23);
		frmPercentageCalc.getContentPane().add(clearButton);
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exitButton.setBounds(323, 156, 89, 23);
		frmPercentageCalc.getContentPane().add(exitButton);
	}
}
