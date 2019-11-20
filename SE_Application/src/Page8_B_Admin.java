import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Button;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Page8_B_Admin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page8_B_Admin frame = new Page8_B_Admin();
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
	public Page8_B_Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 147, 61));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(160, 50, 1600, 970);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel AddPublish = new JPanel();
		AddPublish.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		AddPublish.setBounds(100, 10, 1400, 430);
		panel.add(AddPublish);
		AddPublish.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_8.setBounds(new Rectangle(3, 3, 3, 3));
		panel_8.setBounds(12, 13, 1376, 45);
		AddPublish.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(12, 13, 56, 16);
		panel_8.add(lblTitle);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_9.setBounds(new Rectangle(3, 3, 3, 3));
		panel_9.setBounds(12, 55, 1376, 45);
		AddPublish.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(12, 13, 56, 16);
		panel_9.add(lblDate);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBounds(new Rectangle(3, 3, 3, 3));
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_10.setBounds(12, 95, 1376, 45);
		AddPublish.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBounds(new Rectangle(3, 3, 3, 3));
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_11.setBounds(12, 135, 1376, 242);
		AddPublish.add(panel_11);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(10, 0, 1356, 235);
		panel_11.add(editorPane);
		
		Button button_1 = new Button("Complete");
		button_1.setFont(new Font("Stencil", Font.PLAIN, 20));
		button_1.setBounds(1290, 383, 100, 30);
		AddPublish.add(button_1);
		
		JPanel CheckPublish = new JPanel();
		CheckPublish.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		CheckPublish.setBounds(100, 445, 1400, 450);
		panel.add(CheckPublish);
		CheckPublish.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_1.setBounds(0, 0, 1400, 45);
		CheckPublish.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPublish = new JLabel("Publish");
		lblPublish.setHorizontalAlignment(SwingConstants.CENTER);
		lblPublish.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblPublish.setBounds(600, 10, 200, 35);
		panel_1.add(lblPublish);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_2.setBounds(0, 0, 50, 450);
		CheckPublish.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_3.setBounds(0, 40, 1400, 45);
		CheckPublish.add(panel_3);
		
		JLabel lblBarCamp = new JLabel("Bar Camp 2019");
		lblBarCamp.setVerticalAlignment(SwingConstants.BOTTOM);
		lblBarCamp.setHorizontalAlignment(SwingConstants.LEFT);
		lblBarCamp.setFont(new Font("Stencil", Font.BOLD, 30));
		lblBarCamp.setBounds(60, 5, 250, 35);
		panel_3.add(lblBarCamp);
		
		Button buttonEdit1 = new Button("Edit");
		buttonEdit1.setFont(new Font("Forte", Font.PLAIN, 25));
		buttonEdit1.setFocusTraversalKeysEnabled(false);
		buttonEdit1.setBounds(1214, 10, 80, 25);
		panel_3.add(buttonEdit1);
		
		Button buttonDelete1 = new Button("Delete");
		buttonDelete1.setBounds(new Rectangle(3, 3, 3, 3));
		buttonDelete1.setFont(new Font("Forte", Font.PLAIN, 25));
		buttonDelete1.setFocusTraversalKeysEnabled(false);
		buttonDelete1.setBounds(1300, 10, 80, 25);
		panel_3.add(buttonDelete1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_4.setBounds(0, 80, 1400, 45);
		CheckPublish.add(panel_4);
		
		JLabel lblByeNior = new JLabel("Bye Nior 2019");
		lblByeNior.setVerticalAlignment(SwingConstants.BOTTOM);
		lblByeNior.setHorizontalAlignment(SwingConstants.LEFT);
		lblByeNior.setFont(new Font("Stencil", Font.BOLD, 30));
		lblByeNior.setBounds(60, 5, 250, 35);
		panel_4.add(lblByeNior);
		
		Button buttonEdit2 = new Button("Edit");
		buttonEdit2.setFont(new Font("Forte", Font.PLAIN, 25));
		buttonEdit2.setFocusTraversalKeysEnabled(false);
		buttonEdit2.setBounds(1214, 10, 80, 25);
		panel_4.add(buttonEdit2);
		
		Button buttonDelete2 = new Button("Delete");
		buttonDelete2.setFont(new Font("Forte", Font.PLAIN, 25));
		buttonDelete2.setFocusTraversalKeysEnabled(false);
		buttonDelete2.setBounds(new Rectangle(3, 3, 3, 3));
		buttonDelete2.setBounds(1300, 10, 80, 25);
		panel_4.add(buttonDelete2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_5.setBounds(0, 120, 1400, 45);
		CheckPublish.add(panel_5);
		
		JLabel lblEducate = new JLabel("Educate");
		lblEducate.setVerticalAlignment(SwingConstants.BOTTOM);
		lblEducate.setHorizontalAlignment(SwingConstants.LEFT);
		lblEducate.setFont(new Font("Stencil", Font.BOLD, 30));
		lblEducate.setBounds(60, 5, 200, 35);
		panel_5.add(lblEducate);
		
		Button buttonEdit3 = new Button("Edit");
		buttonEdit3.setFont(new Font("Forte", Font.PLAIN, 25));
		buttonEdit3.setFocusTraversalKeysEnabled(false);
		buttonEdit3.setBounds(1214, 10, 80, 25);
		panel_5.add(buttonEdit3);
		
		Button buttonDelete3 = new Button("Delete");
		buttonDelete3.setFont(new Font("Forte", Font.PLAIN, 25));
		buttonDelete3.setFocusTraversalKeysEnabled(false);
		buttonDelete3.setBounds(new Rectangle(3, 3, 3, 3));
		buttonDelete3.setBounds(1300, 10, 80, 25);
		panel_5.add(buttonDelete3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 160, 1400, 45);
		CheckPublish.add(panel_6);
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		
		JLabel lblHackathon = new JLabel("Hackathon 2019");
		lblHackathon.setVerticalAlignment(SwingConstants.BOTTOM);
		lblHackathon.setHorizontalAlignment(SwingConstants.LEFT);
		lblHackathon.setFont(new Font("Stencil", Font.BOLD, 30));
		lblHackathon.setBounds(60, 5, 300, 35);
		panel_6.add(lblHackathon);
		
		Button buttonEdit4 = new Button("Edit");
		buttonEdit4.setFont(new Font("Forte", Font.PLAIN, 25));
		buttonEdit4.setFocusTraversalKeysEnabled(false);
		buttonEdit4.setBounds(1214, 10, 80, 25);
		panel_6.add(buttonEdit4);
		
		Button buttonDelete4 = new Button("Delete");
		buttonDelete4.setFont(new Font("Forte", Font.PLAIN, 25));
		buttonDelete4.setFocusTraversalKeysEnabled(false);
		buttonDelete4.setBounds(new Rectangle(3, 3, 3, 3));
		buttonDelete4.setBounds(1300, 10, 80, 25);
		panel_6.add(buttonDelete4);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_7.setBounds(0, 200, 1400, 45);
		CheckPublish.add(panel_7);
		
		JLabel lblCodeCamp = new JLabel("Code Camp 2019");
		lblCodeCamp.setVerticalAlignment(SwingConstants.BOTTOM);
		lblCodeCamp.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodeCamp.setFont(new Font("Stencil", Font.BOLD, 30));
		lblCodeCamp.setBounds(60, 5, 300, 35);
		panel_7.add(lblCodeCamp);
		
		Button buttonEdit5 = new Button("Edit");
		buttonEdit5.setFont(new Font("Forte", Font.PLAIN, 25));
		buttonEdit5.setFocusTraversalKeysEnabled(false);
		buttonEdit5.setBounds(1214, 10, 80, 25);
		panel_7.add(buttonEdit5);
		
		Button buttonDelete5 = new Button("Delete");
		buttonDelete5.setFont(new Font("Forte", Font.PLAIN, 25));
		buttonDelete5.setFocusTraversalKeysEnabled(false);
		buttonDelete5.setBounds(new Rectangle(3, 3, 3, 3));
		buttonDelete5.setBounds(1300, 10, 80, 25);
		panel_7.add(buttonDelete5);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Create new instance page Home
				Page3_HOME pagehome = new Page3_HOME();
				// show page home
				pagehome.setVisible(true);
				// hide page Admin
				setVisible(false);
				
			}
		});
		btnHome.setFont(new Font("Stencil", Font.PLAIN, 20));
		btnHome.setBounds(1455, 927, 120, 30);
		panel.add(btnHome);
	}
}
