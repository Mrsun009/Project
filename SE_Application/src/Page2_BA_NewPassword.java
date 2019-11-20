import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.Font;
import javax.swing.border.MatteBorder;

public class Page2_BA_NewPassword extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtNewpassword;
	private JPasswordField txtConfirmpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page2_BA_NewPassword frame = new Page2_BA_NewPassword();
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
	public Page2_BA_NewPassword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 147, 61));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(710, 340, 500, 400);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewPassword = new JLabel("NEW Password");
		lblNewPassword.setBounds(133, 32, 235, 40);
		lblNewPassword.setFont(new Font("Stencil", Font.PLAIN, 30));
		panel_1.add(lblNewPassword);
		
		JLabel lblNewPassword_1 = new JLabel("New Password ");
		lblNewPassword_1.setBounds(50, 100, 200, 30);
		lblNewPassword_1.setFont(new Font("Stencil", Font.PLAIN, 25));
		panel_1.add(lblNewPassword_1);
		
		txtNewpassword = new JPasswordField();
		txtNewpassword.setBounds(140, 140, 250, 30);
		txtNewpassword.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		txtNewpassword.setFont(new Font("Stencil", Font.PLAIN, 20));
		panel_1.add(txtNewpassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setBounds(50, 200, 266, 30);
		lblConfirmPassword.setFont(new Font("Stencil", Font.PLAIN, 25));
		panel_1.add(lblConfirmPassword);
		
		txtConfirmpassword = new JPasswordField();
		txtConfirmpassword.setBounds(140, 240, 250, 30);
		txtConfirmpassword.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		txtConfirmpassword.setFont(new Font("Stencil", Font.PLAIN, 20));
		panel_1.add(txtConfirmpassword);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBounds(350, 334, 100, 30);
		btnNewButton.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		btnNewButton.setFont(new Font("Stencil", Font.PLAIN, 20));
		panel_1.add(btnNewButton);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(50, 70, 400, 2);
		panel_1.add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(50, 319, 400, 2);
		panel_1.add(separator);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// create new instance of page reset complete
				Page2_BB_ResetComplete pageresetcomplete = new Page2_BB_ResetComplete();
				// show  Page2_BB_Reset complete
				pageresetcomplete.setVisible(true);
				// hide Page2_BA_New password 
				setVisible(false);
				
			}
		});
	}

}
