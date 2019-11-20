import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class Page2_B_ForgetPW extends JFrame {

	private JPanel contentPane;
	private JTextField txtStudentID;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page2_B_ForgetPW frame = new Page2_B_ForgetPW();
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
	public Page2_B_ForgetPW() {
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
		
		JLabel lblResetPassword = new JLabel("RESET Password");
		lblResetPassword.setFont(new Font("Stencil", Font.PLAIN, 30));
		lblResetPassword.setBounds(120, 13, 260, 65);
		panel_1.add(lblResetPassword);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setFont(new Font("Stencil", Font.PLAIN, 25));
		lblStudentId.setBounds(32, 137, 160, 40);
		panel_1.add(lblStudentId);
		
		JLabel lblEmailAddress = new JLabel("E-Mail Address");
		lblEmailAddress.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblEmailAddress.setBounds(32, 202, 160, 40);
		panel_1.add(lblEmailAddress);
		
		txtStudentID = new JTextField();
		txtStudentID.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		txtStudentID.setFont(new Font("Stencil", Font.PLAIN, 20));
		txtStudentID.setBounds(207, 137, 235, 30);
		panel_1.add(txtStudentID);
		txtStudentID.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		txtEmail.setFont(new Font("Stencil", Font.PLAIN, 20));
		txtEmail.setBounds(207, 205, 235, 30);
		panel_1.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setFont(new Font("Stencil", Font.PLAIN, 25));
		btnNewButton.setBounds(144, 280, 201, 30);
		panel_1.add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		btnBack.setFont(new Font("Stencil", Font.PLAIN, 25));
		btnBack.setBounds(341, 347, 100, 40);
		panel_1.add(btnBack);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(50, 328, 400, 2);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(50, 70, 400, 2);
		panel_1.add(separator_1);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// create new instance of page user log in
				Page2_UserLogIN pageuserlogin = new Page2_UserLogIN();
				// show up Page2_UserLogIN
				pageuserlogin.setVisible(true);
				// hide Page2_B_Forget password
				setVisible(false);
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String studentid = txtStudentID.getText();
				String email = txtEmail.getText();
				
				//reset 
				if (studentid.contains("6231305009") && email.contains("6231305009@lamduan.mfu.ac.th") ) {
					txtStudentID.setText(null);
					txtEmail.setText(null);
				
				// create new instance of page user log in
				Page2_BA_NewPassword pagenewpassword = new Page2_BA_NewPassword();
				// show up Page new password
				pagenewpassword.setVisible(true);
				// hide Page2_B_Forget password
				setVisible(false);
				
				}else
					
				if (studentid.contains("6231305022") && email.contains("6231305022@lamduan.mfu.ac.th")) {
					txtStudentID.setText(null);
					txtEmail.setText(null);
					
				// create new instance of page user log in
				Page2_BA_NewPassword pagenewpassword = new Page2_BA_NewPassword();
				// show up Page new password
				pagenewpassword.setVisible(true);
				// hide Page2_B_Foret password
				setVisible(false);
				
				}else
				{
					JOptionPane.showMessageDialog(null, "Invalid Reset Details" , "Reset Error" , JOptionPane.ERROR_MESSAGE);
					txtStudentID.setText(null);
					txtEmail.setText(null);
				
				}
			}
		});
	}

}
