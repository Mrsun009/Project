import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.Label;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Page2_UserLogIN extends JFrame {

	private JPanel contentPane;
	private JTextField txtStudentID;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page2_UserLogIN frame = new Page2_UserLogIN();
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
	public Page2_UserLogIN() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 147, 61));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(610, 300, 760, 400);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnSingIN = new JButton("Sing IN");
		btnSingIN.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSingIN.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		btnSingIN.setBounds(400, 317, 109, 25);
		panel_2.add(btnSingIN);
		btnSingIN.setFont(new Font("Stencil", Font.PLAIN, 20));
		
		JButton btnForgetPassword = new JButton("Forget Password");
		btnForgetPassword.setVerticalAlignment(SwingConstants.BOTTOM);
		btnForgetPassword.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		btnForgetPassword.setBounds(553, 316, 181, 25);
		panel_2.add(btnForgetPassword);
		btnForgetPassword.setFont(new Font("Stencil", Font.PLAIN, 15));
		
		JButton btnLogIN = new JButton("LOG IN");
		btnLogIN.setVerticalAlignment(SwingConstants.BOTTOM);
		btnLogIN.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		btnLogIN.setBounds(493, 263, 97, 25);
		panel_2.add(btnLogIN);
		btnLogIN.setFont(new Font("Stencil", Font.PLAIN, 20));
		
		JLabel lblLogIN = new JLabel("LOG IN System");
		lblLogIN.setBounds(433, 40, 224, 36);
		panel_2.add(lblLogIN);
		lblLogIN.setFont(new Font("Stencil", Font.PLAIN, 30));
		
		JLabel lblStudentID = new JLabel("STUDENT ID");
		lblStudentID.setVerticalAlignment(SwingConstants.BOTTOM);
		lblStudentID.setBounds(400, 145, 150, 30);
		panel_2.add(lblStudentID);
		lblStudentID.setFont(new Font("Stencil", Font.PLAIN, 20));
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setVerticalAlignment(SwingConstants.BOTTOM);
		lblPassword.setBounds(400, 205, 150, 30);
		panel_2.add(lblPassword);
		lblPassword.setFont(new Font("Stencil", Font.PLAIN, 20));
		
		txtStudentID = new JTextField();
		txtStudentID.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 19));
		txtStudentID.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.activeCaptionBorder));
		txtStudentID.setBounds(553, 145, 145, 30);
		panel_2.add(txtStudentID);
		txtStudentID.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 19));
		txtPassword.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.activeCaptionBorder));
		txtPassword.setBounds(553, 205, 145, 30);
		panel_2.add(txtPassword);
		
		JLabel lblImage = new JLabel("");
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\software.jpg"));
		lblImage.setBounds(38, 65, 348, 277);
		panel_2.add(lblImage);
		btnLogIN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			String studentid = txtStudentID.getText();
			String password = txtPassword.getText();
			
			//log in system
			if (studentid.contains("6231305009") && password.contains("6231305009") ) {
				txtStudentID.setText(null);
				txtPassword.setText(null);
				
				// create new instance of page home 
				Page3_HOME pagehome = new Page3_HOME();
				// show up Page3_HOME
				pagehome.setVisible(true);
				// hide Page2_UserLogIN
				setVisible(false);
			}else
			if (studentid.contains("6231305022") && password.contains("6231305022") ) {
				txtStudentID.setText(null);
				txtPassword.setText(null);
					
				// create new instance of page home 
				Page3_HOME paghome = new Page3_HOME();
				// show up Page3_HOME
				paghome.setVisible(true);
				// hide Page2_UserLogIN
				setVisible(false);
			}	
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid Login Details" , "Login Error" , JOptionPane.ERROR_MESSAGE);
				txtStudentID.setText(null);
				txtPassword.setText(null);
			}
			}
		});
		btnForgetPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// create new instance of page forget password
				Page2_B_ForgetPW pageforgetpassword = new Page2_B_ForgetPW();
				// show up Page2_B_Forget password
				pageforgetpassword.setVisible(true);
				// hide Page2_UserLogIN
				setVisible(false);
				
			}
		});
		btnSingIN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// create new instance of page sign up
				Page2_A_SignUP pagesignup = new Page2_A_SignUP();
				// show up Page3_HOME
				pagesignup.setVisible(true);
				// hide Page2_UserLogIN
				setVisible(false);
				
			}
		});
	}
}
