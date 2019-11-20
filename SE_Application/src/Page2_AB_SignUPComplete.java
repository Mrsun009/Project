import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Panel;
import javax.swing.border.MatteBorder;
import java.awt.Font;

public class Page2_AB_SignUPComplete extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page2_AB_SignUPComplete frame = new Page2_AB_SignUPComplete();
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
	public Page2_AB_SignUPComplete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground( new Color(23, 147, 61));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(760, 365, 400, 350);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(55, 87, 290, 2);
		panel_1.add(separator);
		
		JLabel lblComplete = new JLabel("COMPLETE ");
		lblComplete.setBounds(97, 135, 205, 70);
		panel_1.add(lblComplete);
		lblComplete.setFont(new Font("Stencil", Font.PLAIN, 40));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(55, 246, 290, 2);
		panel_1.add(separator_1);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBounds(210, 278, 137, 38);
		panel_1.add(btnNewButton);
		btnNewButton.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		btnNewButton.setFont(new Font("Stencil", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// create new instance of page user log in
				Page2_UserLogIN pageuserlogin = new Page2_UserLogIN();
				// show up page user log in
				pageuserlogin.setVisible(true);
				// hide page sign up complete
				setVisible(false);
				
			}
		});
	}

}
