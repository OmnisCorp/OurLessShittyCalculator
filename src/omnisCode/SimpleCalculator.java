package omnisCode;

import javax.swing.JFrame;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Component;
import javax.swing.JRadioButton;
import java.awt.Window.Type;

public class SimpleCalculator {

	private JFrame frmOmniscalculatorv;
	private JTextField textR;
	double n1;
	double n2;
	double result;
	String Op;
	String Ans;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator window = new SimpleCalculator();
					window.frmOmniscalculatorv.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOmniscalculatorv = new JFrame();
		frmOmniscalculatorv.setBackground(Color.LIGHT_GRAY);
		frmOmniscalculatorv.setType(Type.UTILITY);
		frmOmniscalculatorv.setTitle("OmnisCalculatorV2");
		frmOmniscalculatorv.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmOmniscalculatorv.getContentPane().setForeground(Color.GRAY);
		frmOmniscalculatorv.getContentPane().setBackground(Color.DARK_GRAY);
		frmOmniscalculatorv.setBounds(100, 100, 772, 794);
		frmOmniscalculatorv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOmniscalculatorv.getContentPane().setLayout(null);
		
		textR = new JTextField();
		textR.setEditable(false);
		textR.setFont(new Font("Bauhaus 93", Font.PLAIN, 50));
		textR.setForeground(Color.BLACK);
		textR.setBackground(Color.LIGHT_GRAY);
		textR.setHorizontalAlignment(SwingConstants.RIGHT);
		textR.setBounds(10, 11, 738, 200);
		frmOmniscalculatorv.getContentPane().add(textR);
		textR.setColumns(10);
		
		///---------ROW 1-------------
		JButton btnAC = new JButton("CLEAR");
		btnAC.setBackground(Color.RED);
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textR.setText(null);
			}
		});
		
		btnAC.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnAC.setBorder(null);
		btnAC.setFont(new Font("BankGothic Md BT", Font.PLAIN, 50));
		btnAC.setForeground(new Color(255, 255, 255));
		btnAC.setBounds(10, 222, 241, 131);
		frmOmniscalculatorv.getContentPane().add(btnAC);
		
		JButton btnD = new JButton("\u00F7");
		btnD.setForeground(Color.BLACK);
		btnD.setBackground(Color.LIGHT_GRAY);
		
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(textR.getText());
				textR.setText("");
				Op="/";
						
			}
		});
		btnD.setFont(new Font("BankGothic Md BT", Font.PLAIN, 80));
		btnD.setBounds(322, 347, 116, 131);
		frmOmniscalculatorv.getContentPane().add(btnD);
		
		//-----------ROW 2------------
		JButton btn7 = new JButton("7");
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textR.getText() + btn7.getText();
				textR.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("BankGothic Md BT", Font.PLAIN, 40));
		btn7.setBounds(10, 367, 70, 70);
		frmOmniscalculatorv.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textR.getText() + btn8.getText();
				textR.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("BankGothic Md BT", Font.PLAIN, 40));
		btn8.setBounds(95, 367, 70, 70);
		frmOmniscalculatorv.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textR.getText() + btn9.getText();
				textR.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("BankGothic Md BT", Font.PLAIN, 40));
		btn9.setBounds(180, 367, 70, 70);
		frmOmniscalculatorv.getContentPane().add(btn9);
		
		JButton btnMulti = new JButton("X");
		btnMulti.setForeground(Color.BLACK);
		btnMulti.setBackground(Color.LIGHT_GRAY);
		
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(textR.getText());
				textR.setText("");
				Op="*";
						
			}
		});
		btnMulti.setFont(new Font("BankGothic Md BT", Font.PLAIN, 99));
		btnMulti.setBounds(322, 222, 116, 131);
		frmOmniscalculatorv.getContentPane().add(btnMulti);
		
		//-----------ROW 3------------
		JButton btn4 = new JButton("4");
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textR.getText() + btn4.getText();
				textR.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("BankGothic Md BT", Font.PLAIN, 40));
		btn4.setBounds(12, 448, 70, 70);
		frmOmniscalculatorv.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textR.getText() + btn5.getText();
				textR.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("BankGothic Md BT", Font.PLAIN, 40));
		btn5.setBounds(97, 448, 70, 70);
		frmOmniscalculatorv.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textR.getText() + btn6.getText();
				textR.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("BankGothic Md BT", Font.PLAIN, 40));
		btn6.setBounds(182, 448, 70, 70);
		frmOmniscalculatorv.getContentPane().add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.setForeground(Color.BLACK);
		btnSub.setBackground(Color.LIGHT_GRAY);
		
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(textR.getText());
				textR.setText("");
				Op="-";
						
			}
		});
		btnSub.setFont(new Font("BankGothic Md BT", Font.PLAIN, 99));
		btnSub.setBounds(322, 598, 116, 126);
		frmOmniscalculatorv.getContentPane().add(btnSub);
		
		
		//-----------ROW 4------------
		JButton btn1 = new JButton("1");
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textR.getText() + btn1.getText();
				textR.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("BankGothic Md BT", Font.PLAIN, 40));
		btn1.setBounds(10, 533, 70, 70);
		frmOmniscalculatorv.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textR.getText() + btn2.getText();
				textR.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("BankGothic Md BT", Font.PLAIN, 40));
		btn2.setBounds(97, 533, 70, 70);
		frmOmniscalculatorv.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textR.getText() + btn3.getText();
				textR.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("BankGothic Md BT", Font.PLAIN, 40));
		btn3.setBounds(182, 533, 70, 70);
		frmOmniscalculatorv.getContentPane().add(btn3);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setBackground(Color.LIGHT_GRAY);
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(textR.getText());
				textR.setText("");
				Op="+";
						
				
			}
		});
		btnAdd.setFont(new Font("BankGothic Md BT", Font.PLAIN, 80));
		btnAdd.setBounds(322, 475, 116, 131);
		frmOmniscalculatorv.getContentPane().add(btnAdd);
		
		
		//-----------ROW 5------------
		JButton btn0 = new JButton("0");
		btn0.setBackground(Color.LIGHT_GRAY);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textR.getText() + btn0.getText();
				textR.setText(EnterNumber);
			}
			
		});
		btn0.setFont(new Font("BankGothic Md BT", Font.PLAIN, 40));
		btn0.setBounds(12, 614, 116, 112);
		frmOmniscalculatorv.getContentPane().add(btn0);
		
	
		
		JButton btnP = new JButton(".");
		btnP.setBackground(Color.LIGHT_GRAY);
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(! textR.getText().contains("."))
		          {
		          textR.setText(textR.getText() + btnP.getText());
		          }
			}
			
		});
		btnP.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnP.setBounds(138, 614, 116, 112);
		frmOmniscalculatorv.getContentPane().add(btnP);
		
		JButton btnE = new JButton("=");
		btnE.setBackground(Color.LIGHT_GRAY);
	
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n2= Double.parseDouble(textR.getText());
				if(Op == "+")
				{
					result = n1+n2;
					Ans = String.format("%.2f", result);
					textR.setText(Ans);
					
				}
				if(Op == "-")
				{
					result = n1-n2;
					Ans = String.format("%.2f", result);
					textR.setText(Ans);
					
				}
				if(Op == "*")
				{
					result = n1*n2;
					Ans = String.format("%.2f", result);
					textR.setText(Ans);
					
				}
				if(Op == "/")
				{
					result = n1/n2;
					Ans = String.format("%.4f", result);
					textR.setText(Ans);
					
				}
				
				
			}
		});
		btnE.setForeground(Color.BLACK);
		btnE.setFont(new Font("BankGothic Md BT", Font.PLAIN, 99));
		btnE.setBounds(448, 222, 300, 500);
		frmOmniscalculatorv.getContentPane().add(btnE);
	}
}