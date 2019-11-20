import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.Button;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.Label;
import javax.swing.border.MatteBorder;
import javax.swing.JToggleButton;
import java.awt.Cursor;
import java.awt.Font;

public class Page3_HOME extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page3_HOME frame = new Page3_HOME();
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
	public Page3_HOME() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 147, 61));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(new Rectangle(0, 0, 5, 0));
		panel.setBackground(new Color(59, 180, 74));
		panel.setBounds(10, 874, 1882, 159);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Create new instance of page admin log in
				Page8_A_AdminLogIN adminlogin = new Page8_A_AdminLogIN();
				// show new page admin log in
				adminlogin.setVisible(true);
				// hide page home
				setVisible(false);
				
				
			}
		});
		btnAdmin.setFont(new Font("Snap ITC", Font.PLAIN, 30));
		btnAdmin.setBounds(659, 28, 150, 50);
		panel.add(btnAdmin);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Create new instance of page user log in
				Page2_UserLogIN pageuserlogin = new Page2_UserLogIN();
				// show new page user log in
				pageuserlogin.setVisible(true);
				// hide page home
				setVisible(false);
				
			}
		});
		btnLogout.setFont(new Font("Snap ITC", Font.PLAIN, 30));
		btnLogout.setBounds(1109, 28, 150, 50);
		panel.add(btnLogout);
		
		JButton btnAbout = new JButton("About Software Engineering");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Create new instance of page AboutSE
				Page4_AboutSE pageaboutse = new Page4_AboutSE();
				// show new page About SE
				pageaboutse.setVisible(true);
				// hide page home
				setVisible(false);
			}
		});
		btnAbout.setFont(new Font("Snap ITC", Font.PLAIN, 17));
		btnAbout.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnAbout.setBackground(new Color(241, 235, 25));
		btnAbout.setBounds(468, 284, 300, 40);
		contentPane.add(btnAbout);
		
		JButton btnOC = new JButton("Oraganization Chart");
		btnOC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Create new instance of page organization chart
				Page5_OrganizationChart pageoc = new Page5_OrganizationChart();
				// show new page organization chart
				pageoc.setVisible(true);
				// hide page home
				setVisible(false);
				
			}
		});
		btnOC.setFont(new Font("Snap ITC", Font.PLAIN, 17));
		btnOC.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnOC.setBackground(new Color(255, 0, 51));
		btnAbout.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnAbout.setBackground(new Color(241, 235, 35));
		btnOC.setBounds(1148, 284, 300, 40);
		contentPane.add(btnOC);
		
		JButton btnProfession = new JButton("Profession");
		btnProfession.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Create new instance of page profession
				Page6_Profession pageprofession = new Page6_Profession();
				// show new page publish
				pageprofession.setVisible(true);
				// hide page home
				setVisible(false);
				
			}
		});
		btnProfession.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnProfession.setBackground(new Color(106, 187, 69));
		btnProfession.setFont(new Font("Snap ITC", Font.PLAIN, 17));
		btnProfession.setBounds(1148, 389, 300, 40);
		contentPane.add(btnProfession);
		
		JButton btnPublish = new JButton("Publish");
		btnPublish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Create new instance of page publish
				Page7_Publish pagepublish = new Page7_Publish();
				// show new page publish
				pagepublish.setVisible(true);
				// hide page home
				setVisible(false);
				
			}
		});
		btnPublish.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnPublish.setBackground(new Color(56, 82, 166));
		btnPublish.setFont(new Font("Snap ITC", Font.PLAIN, 17));
		btnPublish.setBounds(468, 389, 300, 40);
		contentPane.add(btnPublish);
		
		JLabel lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\LOGOSE.png"));
		lblImage.setBounds(719, 325, 482, 431);
		contentPane.add(lblImage);
	}
}
