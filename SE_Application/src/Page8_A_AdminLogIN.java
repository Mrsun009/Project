import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Page8_A_AdminLogIN extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page8_A_AdminLogIN frame = new Page8_A_AdminLogIN();
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
	public Page8_A_AdminLogIN() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 147, 61));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 0)));
		panel.setBounds(710, 350, 500, 350);
		contentPane.add(panel);
		
		JLabel lblAdminLoginSystem = new JLabel("Admin Log-IN System");
		lblAdminLoginSystem.setVerticalAlignment(SwingConstants.BOTTOM);
		lblAdminLoginSystem.setFont(new Font("Stencil", Font.PLAIN, 30));
		lblAdminLoginSystem.setBounds(75, 43, 350, 39);
		panel.add(lblAdminLoginSystem);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setVerticalAlignment(SwingConstants.TOP);
		lblUser.setFont(new Font("Stencil", Font.PLAIN, 30));
		lblUser.setBounds(75, 127, 150, 30);
		panel.add(lblUser);
		
		txtUser = new JTextField();
		txtUser.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtUser.setBounds(213, 124, 212, 30);
		panel.add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setVerticalAlignment(SwingConstants.BOTTOM);
		lblPassword.setFont(new Font("Stencil", Font.PLAIN, 25));
		lblPassword.setBounds(75, 188, 137, 30);
		panel.add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtPassword.setBounds(213, 186, 212, 30);
		panel.add(txtPassword);
		
		JButton btnLogIn = new JButton("LOG IN");
		btnLogIn.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		btnLogIn.setVerticalAlignment(SwingConstants.TOP);
		btnLogIn.setFont(new Font("Stencil", Font.PLAIN, 30));
		btnLogIn.setBounds(175, 247, 150, 30);
		panel.add(btnLogIn);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(75, 95, 350, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(75, 290, 350, 2);
		panel.add(separator_1);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Create new instance of page home
				Page3_HOME pagehome = new Page3_HOME();
				// show up Page3_Home
				pagehome.setVisible(true);
				// hide page8_A_Admin
				setVisible(false);
				
			}
		});
		btnBack.setVerticalAlignment(SwingConstants.BOTTOM);
		btnBack.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		btnBack.setFont(new Font("Stencil", Font.PLAIN, 20));
		btnBack.setBounds(327, 300, 97, 30);
		panel.add(btnBack);
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				String user = txtUser.getText();
				String password = txtPassword.getText();
				
				//log in system
				 
				if (user.contains("Ajbee") && password.contains("6765") ) {
					txtUser.setText(null);
					txtPassword.setText(null);
					
					// create new instance of page Page8_B_Admin
					Page8_B_Admin pagehome = new Page8_B_Admin();
					// show up Page8_A_Admin
					pagehome.setVisible(true);
					// hide Page8_A_Admin
					setVisible(false);
					
				}else
				if (user.contains("Ajtew") && password.contains("6747") ) {
					txtUser.setText(null);
					txtPassword.setText(null);
						
					// create new instance of page Page8_B_Admin
					Page8_B_Admin pagehome = new Page8_B_Admin();
					// show up Page8_A_Admin
					pagehome.setVisible(true);
					// hide Page8_A_Admin
					setVisible(false);
						
				}else		
				if (user.contains("Ajtan") && password.contains("6765") ) {
					txtUser.setText(null);
					txtPassword.setText(null);
							
					// create new instance of page Page8_B_Admin
					Page8_B_Admin pagehome = new Page8_B_Admin();
					// show up Page8_A_Admin
					pagehome.setVisible(true);
					// hide Page8_A_Admin
					setVisible(false);
							
				}else			
				if (user.contains("Ajpam") && password.contains("6748") ) {
					txtUser.setText(null);
					txtPassword.setText(null);
								
								
					// create new instance of page Page8_B_Admin
					Page8_B_Admin pagehome = new Page8_B_Admin();
					// show up Page8_A_Admin
					pagehome.setVisible(true);
					// hide Page8_A_Admin
					setVisible(false);
				
				}else			
				if (user.contains("Mrsun") && password.contains("009") ) {
					txtUser.setText(null);
					txtPassword.setText(null);
									
									
					// create new instance of page Page8_B_Admin
					Page8_B_Admin pagehome = new Page8_B_Admin();
					// show up Page8_A_Admin
					pagehome.setVisible(true);
					// hide Page8_A_Admin
					setVisible(false);
					
				}else			
				if (user.contains("Mraudi") && password.contains("022") ) {
					txtUser.setText(null);
					txtPassword.setText(null);
										
										
					// create new instance of page Page8_B_Admin
					Page8_B_Admin pagehome = new Page8_B_Admin();
					// show up Page8_A_Admin
					pagehome.setVisible(true);
					// hide Page8_A_Admin
					setVisible(false);
					
				}	
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Login Details" , "Login Error" , JOptionPane.ERROR_MESSAGE);
					txtUser.setText(null);
					txtPassword.setText(null);
				
				}
				
			}
		});
	}
}
