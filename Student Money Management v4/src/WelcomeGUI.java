import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;

public class WelcomeGUI extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public WelcomeGUI() {
		setBackground(new Color(0, 0, 0));
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 50, 480, 400);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToThe = new JLabel("\u039A\u03B1\u03BB\u03C9\u03C2 \u03AE\u03C1\u03B8\u03B1\u03C4\u03B5 \u03C3\u03C4\u03BF \u03A3\u03CD\u03C3\u03C4\u03B7\u03BC\u03B1 \u0394\u03B9\u03B1\u03C7\u03B5\u03AF\u03C1\u03B9\u03C3\u03B7\u03C2 \u03A7\u03C1\u03B7\u03BC\u03AC\u03C4\u03C9\u03BD!");
		lblWelcomeToThe.setBounds(10, 12, 444, 94);
		lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToThe.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(lblWelcomeToThe);
		Image img= new ImageIcon(this.getClass().getResource("/images.png")).getImage();
		
		JButton btnProceed = new JButton("Συνέχεια");
		btnProceed.setBounds(352, 308, 102, 43);
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Menu m = new Menu();
				m.MenuScreen();
				close();
			}
		});
		contentPane.add(btnProceed);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Student Money Management v4.4\\imgs\\images.png"));
		lblNewLabel.setBounds(20, 111, 230, 224);
		contentPane.add(lblNewLabel);
		
		
		
	}
	
	public void close(){
		this.setVisible(false);
		 this.dispose();
		
	}
}