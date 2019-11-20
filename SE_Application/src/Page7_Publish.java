import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;

public class Page7_Publish extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page7_Publish frame = new Page7_Publish();
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
	public Page7_Publish() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(56, 82, 166));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(160, 60, 1600, 900);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(1488, 857, 100, 30);
		panel.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				// Create new instance page Home
				Page3_HOME pagehome = new Page3_HOME();
				// show page home
				pagehome.setVisible(true);
				// hide page Publish
				setVisible(false);
				
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JPanel Publish1 = new JPanel();
		Publish1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		Publish1.setBounds(92, 47, 400, 460);
		panel.add(Publish1);
		Publish1.setLayout(null);
		
		JLabel lblBarCamp = new JLabel("Bar Camp");
		lblBarCamp.setFont(new Font("Stencil", Font.BOLD, 30));
		lblBarCamp.setBounds(115, 205, 170, 50);
		Publish1.add(lblBarCamp);
		
		JPanel Publish2 = new JPanel();
		Publish2.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		Publish2.setBounds(497, 47, 300, 225);
		panel.add(Publish2);
		Publish2.setLayout(null);
		
		JLabel lblByeNior = new JLabel("Bye Nior");
		lblByeNior.setFont(new Font("Stencil", Font.BOLD, 30));
		lblByeNior.setBounds(70, 52, 160, 50);
		Publish2.add(lblByeNior);
		
		JPanel Publish3 = new JPanel();
		Publish3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		Publish3.setBounds(802, 47, 300, 225);
		panel.add(Publish3);
		Publish3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Educate");
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 30));
		lblNewLabel.setBounds(75, 63, 150, 50);
		Publish3.add(lblNewLabel);
		
		JPanel Publish4 = new JPanel();
		Publish4.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		Publish4.setBounds(497, 282, 605, 225);
		panel.add(Publish4);
		Publish4.setLayout(null);
		
		JLabel lblHackathon = new JLabel("Hackathon 2019");
		lblHackathon.setFont(new Font("Stencil", Font.BOLD, 30));
		lblHackathon.setBounds(152, 95, 300, 50);
		Publish4.add(lblHackathon);
		
		JPanel Publish5 = new JPanel();
		Publish5.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		Publish5.setBounds(1107, 47, 400, 460);
		panel.add(Publish5);
		Publish5.setLayout(null);
		
		JLabel lblCodeCamp = new JLabel("Code Camp 2019");
		lblCodeCamp.setFont(new Font("Stencil", Font.BOLD, 30));
		lblCodeCamp.setBounds(65, 205, 270, 50);
		Publish5.add(lblCodeCamp);
	}
}
