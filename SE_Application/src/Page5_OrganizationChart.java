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
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Button;

public class Page5_OrganizationChart extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page5_OrganizationChart frame = new Page5_OrganizationChart();
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
	public Page5_OrganizationChart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				// Create new instance page Home
				Page3_HOME pagehome = new Page3_HOME();
				// show page home
				pagehome.setVisible(true);
				// hide page Organization Chart
				setVisible(false);
		
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBack.setBounds(1650, 957, 100, 30);
		contentPane.add(btnBack);
		
		JPanel panel = new JPanel();
		panel.setBounds(160, 100, 1600, 900);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAjBee = new JLabel("");
		lblAjBee.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\AjBee.png"));
		lblAjBee.setBounds(684, 52, 220, 312);
		panel.add(lblAjBee);
		
		Button buttonAjBee = new Button("Aj. Vittayasak Rujivorakul");
		buttonAjBee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Create new instance page organization1 
				Page5_OrganizationChart1 pageorganizationchart1 = new Page5_OrganizationChart1();
				// Show new page organizationchart1
				pageorganizationchart1.setVisible(true);
				// hide page OrganizationChart
				setVisible(false);
				
			}
		});
		buttonAjBee.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		buttonAjBee.setBounds(665, 370, 270, 40);
		panel.add(buttonAjBee);
		
		JLabel lblAjTew = new JLabel("");
		lblAjTew.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\AjTew.png"));
		lblAjTew.setBounds(287, 450, 225, 290);
		panel.add(lblAjTew);
		
		Button buttonAjTew = new Button("Aj. Tew HongThong");
		buttonAjTew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Create new instance page organizationchart2
				Page5_OrganizationChart2 pageorganizationchart2 = new Page5_OrganizationChart2();
				// Show new page organizationchart2
				pageorganizationchart2.setVisible(true);
				// hide page OrganizationChart
				setVisible(false);
				
			}
		});
		buttonAjTew.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		buttonAjTew.setBounds(287, 750, 225, 40);
		panel.add(buttonAjTew);
		
		JLabel lblAjTan = new JLabel("");
		lblAjTan.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\AjTan.png"));
		lblAjTan.setBounds(684, 443, 220, 297);
		panel.add(lblAjTan);
		
		Button buttonAjTan = new Button("Aj. Dr. Sujitra Arwachananu");
		buttonAjTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Create new instance page organizationchart3
				Page5_OrganizationChart3 pageorganizationchart3 = new Page5_OrganizationChart3();
				// Show new page organizationchart3
				pageorganizationchart3.setVisible(true);
				// hide page OrganizationChart
				setVisible(false);
				
			}
		});
		buttonAjTan.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		buttonAjTan.setBounds(665, 750, 270, 40);
		panel.add(buttonAjTan);
		
		JLabel lblAjPam = new JLabel("");
		lblAjPam.setHorizontalAlignment(SwingConstants.CENTER);
		lblAjPam.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\Ajpam.png"));
		lblAjPam.setBounds(1087, 407, 270, 333);
		panel.add(lblAjPam);
		
		Button buttonAjPam = new Button("Aj. Pattariya Singpant");
		buttonAjPam.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		buttonAjPam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Create new instance page organizationchart4
				Page5_OrganizationChart4 pageorganizationchart4 = new Page5_OrganizationChart4();
				// Show new page organizationchart2
				pageorganizationchart4.setVisible(true);
				// hide page OrganizationChart
				setVisible(false);
				
			}
		});
		buttonAjPam.setBounds(1087, 750, 270, 40);
		panel.add(buttonAjPam);
		
		
	}
}
