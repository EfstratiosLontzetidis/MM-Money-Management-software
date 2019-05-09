import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class SavingsGUI  extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void Savings() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SavingsGUI frame = new SavingsGUI();
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
	public SavingsGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u03A4\u03BF \u03BC\u03B7\u03BD\u03B9\u03B1\u03AF\u03BF \u03B4\u03B9\u03B1\u03B8\u03AD\u03C3\u03B9\u03BC\u03BF \u03C5\u03C0\u03CC\u03BB\u03BF\u03B9\u03C0\u03BF \u03B5\u03AF\u03BD\u03B1\u03B9: ");
		lblNewLabel.setBounds(115, 112, 252, 27);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u0391\u03C0\u03BF\u03C4\u03B1\u03BC\u03AF\u03B5\u03C5\u03C3\u03B7");
		label.setBounds(97, 11, 258, 112);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.BOLD, 24));
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u03A4\u03BF \u03C3\u03CD\u03BD\u03BF\u03BB\u03BF \u03C4\u03C9\u03BD \u03C0\u03C1\u03BF\u03B7\u03B3\u03BF\u03CD\u03BC\u03B5\u03BD\u03C9\u03BD \u03B1\u03C0\u03BF\u03C4\u03B1\u03BC\u03B9\u03B5\u03CD\u03C3\u03B5\u03C9\u03BD \u03B5\u03B9\u03BD\u03B1\u03B9:");
		label_1.setBounds(36, 176, 313, 14);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u0395\u03B9\u03C3\u03AC\u03B3\u03B5\u03C4\u03B5 \u03C4\u03BF \u03B5\u03C0\u03B9\u03C0\u03BB\u03AD\u03BF\u03BD \u03C0\u03BF\u03C3\u03BF \u03C0\u03BF\u03C5 \u03B8\u03AD\u03BB\u03B5\u03C4\u03B5 \u03BD\u03B1 \u03B1\u03C0\u03BF\u03C4\u03B1\u03BC\u03B9\u03B5\u03CD\u03C3\u03B5\u03C4\u03B5:");
		label_2.setBounds(15, 238, 308, 14);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(308, 235, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(327, 118, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(327, 176, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		try {
			BufferedReader brd = new BufferedReader(new FileReader("date.txt"));
			String std;
			while((std=brd.readLine())!=null){
			File f = new File(std + "_yp.txt");
			
			
			if (!f.exists()){
						try {
						BufferedReader br=new BufferedReader(new FileReader("date.txt"));
				        String st;
				        while((st=br.readLine())!=null){
				        	
				        	BufferedReader br1=new BufferedReader(new FileReader(st+"_tbe.txt"));
				        	BufferedReader br2=new BufferedReader(new FileReader(st+"_tde.txt"));
				        	String st1,st2;
				        	while((st1=br1.readLine())!=null){
				        		double be=Double.parseDouble(st1);
				        		while((st2=br2.readLine())!=null){
			        				double de = Double.parseDouble(st2);
				        		
			        				double te = be + de;
				        		
			        		
			        		PrintWriter output = new PrintWriter(new File(st+"_te.txt"));
			        		output.print(String.valueOf(te));
				        	output.close();
				        	
				        	BufferedReader br3=new BufferedReader(new FileReader(st+"_ti.txt"));
			        		String st3;
			        		while((st3=br3.readLine())!=null){
			        			double inc = Double.parseDouble(st3);
			        			double ypoloipo = inc - te;
			        		 
			        			PrintWriter output1=new PrintWriter(st+"_yp.txt");
			        			output1.print(ypoloipo);
			        			output1.close();
			        			
			        			BufferedReader br4 = new BufferedReader(new FileReader(st+"_yp.txt"));
			        			String st4;
			        			while ((st4=br4.readLine())!=null){
			        				lblNewLabel_1.setText(st4);
			        			}
			        			
			        			BufferedReader br5=new BufferedReader(new FileReader("savings.txt"));
			        			String st5;
			        			while((st5=br5.readLine())!=null){
			        				lblNewLabel_1.setText(st5);
			        			
			        		}
				        			
				        		}
				        	}
				        	
				        	
				        }
					}
				        }catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				}else{
					
					
					BufferedReader br;
					try {
						br = new BufferedReader(new FileReader("date.txt"));
						String st;
						
						 while((st=br.readLine())!=null){
						BufferedReader br6 = new BufferedReader(new FileReader(st+"_yp.txt"));
						String st6;
						while ((st6=br6.readLine())!=null){
							lblNewLabel_1.setText(st6);
						}
						
						BufferedReader br7=new BufferedReader(new FileReader("savings.txt"));
						String st7;
						while((st7=br7.readLine())!=null){
							lblNewLabel_2.setText(st7);
						
					}
						 }
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
		}} catch (NumberFormatException | IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
			

		
		
		JButton button = new JButton("\u03A0\u03AF\u03C3\u03C9");
		button.setBounds(0, 0, 89, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu m = new Menu();
				m.MenuScreen();
				close();
			}
		});
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B7\u03C3\u03B7");
		button_1.setBounds(327, 302, 127, 49);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = textField_2.getText();
				String yp=lblNewLabel_1.getText();
				
				
				try {
					
					BufferedReader br1=new BufferedReader(new FileReader("date.txt"));
			        String st;
			       
			      
					try {
						
						BufferedReader br=new BufferedReader(new FileReader("savings.txt"));
						String sav;
						while((st=br1.readLine())!=null){
							while((sav=br.readLine())!=null){
								PrintWriter output = new PrintWriter("savings.txt");
							
								
								double dyp = Double.parseDouble(yp);
								double dsav = Double.parseDouble(sav);
								double ds = Double.parseDouble(s);
								
								double n = ds + dsav;
								double ypo = dyp - ds;
								
								
								output.print(n);
								output.close();
								
								BufferedReader br2=new BufferedReader(new FileReader(st+"_yp.txt"));
								String st2;
								while((st2=br2.readLine())!=null) {
									PrintWriter output3=new PrintWriter(st+"_yp.txt");
									output3.print(ypo);
									output3.close();
								}
							
							
							
							
						}
}
						
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				
				
				
				Savings2GUI s2 = new Savings2GUI();
				s2.Savings2();
				close();
			}
		});
		contentPane.add(button_1);
		
		
	}
	
	public void close(){
		this.setVisible(false);
		 this.dispose();
		
	}
}