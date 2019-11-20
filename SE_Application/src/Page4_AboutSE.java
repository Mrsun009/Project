import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Page4_AboutSE extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page4_AboutSE frame = new Page4_AboutSE();
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
	public Page4_AboutSE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(241, 235, 25));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(310, 40, 1300, 950);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(1188, 907, 100, 30);
		panel.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Create new instance page Home
				Page3_HOME pagehome = new Page3_HOME();
				// show page home
				pagehome.setVisible(true);
				// hide page AboutSE
				setVisible(false);
						
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel Bacelor = new JLabel("");
		Bacelor.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\Bacelor.png"));
		Bacelor.setHorizontalAlignment(SwingConstants.LEFT);
		Bacelor.setBounds(128, 24, 1043, 495);
		panel.add(Bacelor);
		
		JLabel Objective = new JLabel("");
		Objective.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\Objective.png"));
		Objective.setHorizontalAlignment(SwingConstants.CENTER);
		Objective.setBounds(128, 525, 1043, 381);
		panel.add(Objective);
	}
}
