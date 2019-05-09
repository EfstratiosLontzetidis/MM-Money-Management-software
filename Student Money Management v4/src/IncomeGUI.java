
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class IncomeGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void income() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IncomeGUI frame = new IncomeGUI();
					frame.setLocationRelativeTo(null);
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
	public IncomeGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B7\u03C3\u03B7 \u0395\u03C3\u03CC\u03B4\u03C9\u03BD");
		label.setFont(new Font("Times New Roman", Font.BOLD, 24));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(99, 11, 262, 164);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("\u039C\u03B7\u03BD\u03B9\u03B1\u03AF\u03B1 \u0388\u03C3\u03BF\u03B4\u03B1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Monthly_incomeGUI mi = new Monthly_incomeGUI();
				mi.monthly_inc();
				close();
			}
		});
		btnNewButton.setBounds(138, 150, 194, 45);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u0391\u03C0\u03C1\u03CC\u03BF\u03C0\u03C4\u03B1 \u0388\u03C3\u03BF\u03B4\u03B1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Unexpected_incomeGUI ui = new Unexpected_incomeGUI();
				ui.unexpected_inc();
				close();
			}
		});
		btnNewButton_1.setBounds(138, 237, 194, 45);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("\u03A0\u03AF\u03C3\u03C9");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu back = new Menu();
				back.MenuScreen();
				close();
			}
		});
		button.setBounds(0, 0, 89, 23);
		contentPane.add(button);
	}
	public void close(){
		this.setVisible(false);
		 this.dispose();
		
	}
}

