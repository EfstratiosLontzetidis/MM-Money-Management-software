import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Monthly_StatsGUI extends JFrame {

	private JPanel contentPane;
	private static DecimalFormat df2 = new DecimalFormat("#.##");

	/**
	 * Launch the application.
	 */
	public static void m_stats() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Monthly_StatsGUI frame = new Monthly_StatsGUI();
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
	public Monthly_StatsGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u039C\u03B7\u03BD\u03B9\u03B1\u03AF\u03B1 \u03A3\u03C4\u03B1\u03C4\u03B9\u03C3\u03C4\u03B9\u03BA\u03AC");
		lblNewLabel.setBounds(86, 28, 249, 31);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(389, 11, 65, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("\u03A6\u03AC\u03C1\u03BC\u03B1\u03BA\u03B1");
		label.setBounds(14, 106, 65, 14);
		contentPane.add(label);
		
		JLabel lblNewLabel_2 = new JLabel("\u03A4\u03C1\u03CC\u03C6\u03B9\u03BC\u03B1");
		lblNewLabel_2.setBounds(12, 170, 67, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u0394\u03B9\u03B1\u03C3\u03BA\u03AD\u03B4\u03B1\u03C3\u03B7");
		lblNewLabel_3.setBounds(9, 221, 70, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Hobby");
		lblNewLabel_4.setBounds(11, 273, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("MMM");
		lblNewLabel_5.setBounds(247, 105, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u03A1\u03BF\u03CD\u03C7\u03B1");
		lblNewLabel_6.setBounds(244, 165, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\u03A5\u03B3\u03B9\u03B5\u03B9\u03BD\u03AE");
		lblNewLabel_7.setBounds(244, 210, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u0386\u03BB\u03BB\u03BF");
		lblNewLabel_8.setBounds(243, 270, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(81, 108, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(76, 167, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBounds(86, 219, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBounds(75, 272, 46, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setBounds(331, 104, 46, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setBounds(337, 166, 46, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setBounds(335, 210, 46, 14);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setBounds(337, 267, 46, 14);
		contentPane.add(lblNewLabel_16);
		
		
		
		double farmaka=0;
		double trofima=0;
		double diaskedasi=0;
		double hobby=0;
		double mmm =0;
		double rouxa=0;
		double ugeia=0;
		double allo=0;
		double synolo=0;
		
		try {
			BufferedReader br=new BufferedReader(new FileReader("date.txt"));
			String st;
			try {
				while((st=br.readLine())!=null) {
					String minasxronos=st.substring(2,8);
					int i=1;
					lblNewLabel_1.setText(st.substring(2,4)+"/"+st.substring(4,8));
					while(i<=31) {
					File f=new File(i+minasxronos+"_de.txt");
					File f1=new File(i+minasxronos+"_tde.txt");
					BufferedReader br3=new BufferedReader(new FileReader(f));
					String st3;
					BufferedReader br4=new BufferedReader(new FileReader(f1));
					String st4;
					if((f).exists()&&(f1).exists()) {
						while((st4=br4.readLine())!=null) {
							double dst4=Double.parseDouble(st4);
							synolo+=dst4;
							int j=0;
							while((st3=br3.readLine())!=null) {
								if(j==0) {
									Double d0=Double.parseDouble(st3);
									farmaka+=d0;
									lblNewLabel_9.setText(df2.format((farmaka/synolo)*100)+"%");
									
									
									
								}
								else if(j==1){
									Double d1=Double.parseDouble(st3);
									trofima+=d1;
									lblNewLabel_10.setText(df2.format((trofima/synolo)*100)+"%");
								}
								else if(j==2) {
									Double d2=Double.parseDouble(st3);
									diaskedasi+=d2;
									lblNewLabel_11.setText(df2.format((diaskedasi/synolo)*100)+"%");
								}
								else if(j==3) {
									Double d3=Double.parseDouble(st3);
									hobby+=d3;
									lblNewLabel_12.setText(df2.format((hobby/synolo)*100)+"%");
								}
								else if(j==4) {
									Double d4=Double.parseDouble(st3);
									mmm+=d4;
									lblNewLabel_13.setText(df2.format((mmm/synolo)*100)+"%");
								}
								else if(j==5) {
									Double d5=Double.parseDouble(st3);
									rouxa+=d5;
									lblNewLabel_14.setText(df2.format((rouxa/synolo)*100)+"%");
								}
								else if(j==6) {
									Double d6=Double.parseDouble(st3);
									ugeia+=d6;
									lblNewLabel_15.setText(df2.format((ugeia/synolo)*100)+"%");
								}
								else {
									Double d7=Double.parseDouble(st3);
									allo+=d7;
									lblNewLabel_16.setText(df2.format((allo/synolo)*100)+"%");
								}
								j++;
								
								
							}
							
						}
						
						
						
					}
					}
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		JButton btnNewButton = new JButton("\u03A0\u03AF\u03C3\u03C9");
		btnNewButton.setBounds(0, 0, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StatisticsGUI s = new StatisticsGUI();
				s.Statistics();
				close();
			}
		});
		contentPane.add(btnNewButton);
		
		
		
	}
	public void close(){
		this.setVisible(false);
		 this.dispose();
		
	}
}

