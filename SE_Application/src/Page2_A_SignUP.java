import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Page2_A_SignUP extends JFrame {

	private JPanel contentPane;
	private JTextField txtStudentID;
	private JPasswordField txtPassword;
	private JPasswordField txtConfirmPassword;
	private JTextField txtEmail;
	private JTextField txtFullName;
	private JRadioButton rdbtnMale = null;
	private JRadioButton rdbtnFemale = null;
	private ButtonGroup bg = new ButtonGroup ();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page2_A_SignUP frame = new Page2_A_SignUP();
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
	public Page2_A_SignUP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 147, 61));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(685, 200, 550, 630);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewAccount = new JLabel("NEW Account");
		lblNewAccount.setFont(new Font("Stencil", Font.PLAIN, 30));
		lblNewAccount.setBounds(170, 24, 210, 36);
		panel_2.add(lblNewAccount);
		
		JLabel lblStudentId = new JLabel("STUDENT ID");
		lblStudentId.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblStudentId.setBounds(135, 100, 140, 25);
		panel_2.add(lblStudentId);
		
		txtStudentID = new JTextField();
		txtStudentID.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		txtStudentID.setFont(new Font("Stencil", Font.PLAIN, 20));
		txtStudentID.setBounds(150, 130, 230, 30);
		panel_2.add(txtStudentID);
		txtStudentID.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblPassword.setBounds(135, 170, 122, 25);
		panel_2.add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		txtPassword.setFont(new Font("Stencil", Font.PLAIN, 20));
		txtPassword.setBounds(150, 200, 230, 30);
		panel_2.add(txtPassword);
		
		JLabel lblConfirmPassword = new JLabel("CONFIRM PASSWORD");
		lblConfirmPassword.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblConfirmPassword.setBounds(135, 240, 200, 25);
		panel_2.add(lblConfirmPassword);
		
		txtConfirmPassword = new JPasswordField();
		txtConfirmPassword.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		txtConfirmPassword.setFont(new Font("Stencil", Font.PLAIN, 20));
		txtConfirmPassword.setBounds(150, 270, 230, 30);
		panel_2.add(txtConfirmPassword);
		
		JLabel lblEmailAddress = new JLabel("E-MAIL ADDRESS");
		lblEmailAddress.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblEmailAddress.setBounds(135, 310, 200, 25);
		panel_2.add(lblEmailAddress);
		
		txtEmail = new JTextField();
		txtEmail.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		txtEmail.setFont(new Font("Stencil", Font.PLAIN, 20));
		txtEmail.setBounds(150, 340, 230, 30);
		panel_2.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblFullName = new JLabel("FULL NAME");
		lblFullName.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblFullName.setBounds(135, 380, 150, 25);
		panel_2.add(lblFullName);
		
		txtFullName = new JTextField();
		txtFullName.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		txtFullName.setFont(new Font("Stencil", Font.PLAIN, 20));
		txtFullName.setBounds(150, 410, 230, 30);
		panel_2.add(txtFullName);
		txtFullName.setColumns(10);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblGender.setBounds(135, 469, 100, 25);
		panel_2.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("MALE");
		bg.add(rdbtnMale);
		rdbtnMale.setFont(new Font("Stencil", Font.PLAIN, 20));
		rdbtnMale.setBounds(235, 469, 80, 25);
		panel_2.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("FEMALE");
		bg.add(rdbtnFemale);
		
		rdbtnFemale.setFont(new Font("Stencil", Font.PLAIN, 20));
		rdbtnFemale.setBounds(322, 469, 110, 25);
		panel_2.add(rdbtnFemale);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(100, 507, 350, 2);
		panel_2.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(100, 66, 350, 2);
		panel_2.add(separator_1);
		
		JButton btnSignUp = new JButton("Sign UP");
		btnSignUp.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSignUp.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		btnSignUp.setFont(new Font("Stencil", Font.PLAIN, 20));
		btnSignUp.setBounds(356, 564, 150, 30);
		panel_2.add(btnSignUp);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// create new instance of page sign up complete
				Page2_UserLogIN pageuserlogin = new Page2_UserLogIN();
				// show up Page2_User log in 
				pageuserlogin.setVisible(true);
				// hide Page2_A_SignUP
				setVisible(false);
			}
		});
		btnBack.setVerticalAlignment(SwingConstants.BOTTOM);
		btnBack.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		btnBack.setFont(new Font("Stencil", Font.PLAIN, 20));
		btnBack.setBounds(100, 564, 97, 30);
		panel_2.add(btnBack);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Accept");
		rdbtnNewRadioButton.setFont(new Font("Stencil", Font.PLAIN, 20));
		rdbtnNewRadioButton.setBounds(208, 518, 127, 25);
		panel_2.add(rdbtnNewRadioButton);
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Select accept can next to new page
				boolean isSelect = rdbtnNewRadioButton.isSelected();
				boolean isSelect1 = rdbtnMale.isSelected();
				boolean isSelect2 = rdbtnFemale.isSelected();
				
				if(isSelect1) {
					if(isSelect) {
						// create new instance of page sign up complete
						Page2_AB_SignUPComplete pagesignupcomplete = new Page2_AB_SignUPComplete();
						// show up Page2_AB_SingUPComplete
						pagesignupcomplete.setVisible(true);
						// hide Page2_A_SignUP
						setVisible(false);
					
					}else {
						JPanel jPanel = new JPanel();
						JOptionPane.showMessageDialog(null, " Plase Accept " , " Invalid Sing Up " , JOptionPane.ERROR_MESSAGE);
					}
				}else {
				
				if(isSelect2) {
					if(isSelect) {
						// create new instance of page sign up complete
						Page2_AB_SignUPComplete pagesignupcomplete = new Page2_AB_SignUPComplete();
						// show up Page2_AB_SingUPComplete
						pagesignupcomplete.setVisible(true);
						// hide Page2_A_SignUP
						setVisible(false);
						
					}else {
						JPanel jPanel = new JPanel();
						JOptionPane.showMessageDialog(null, " Plase Accept " , " Invalid Sing Up " , JOptionPane.ERROR_MESSAGE);
					}
				}else {
					JPanel jPanel = new JPanel();
					JOptionPane.showMessageDialog(null, " Plase Select Gender " , " Invalid Sing Up " , JOptionPane.ERROR_MESSAGE);	
				}
				}
			}
		});
	}
}
