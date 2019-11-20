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
import javax.swing.border.MatteBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

public class Page2_BB_ResetComplete extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page2_BB_ResetComplete frame = new Page2_BB_ResetComplete();
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
	public Page2_BB_ResetComplete() {
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
		panel.setBounds(760, 365, 400, 350);
		contentPane.add(panel);
		
		JLabel lblComplete = new JLabel("Complete ^ ^");
		lblComplete.setBounds(100, 114, 200, 30);
		panel.add(lblComplete);
		lblComplete.setFont(new Font("Stencil", Font.PLAIN, 30));
		
		JButton btnEnter = new JButton("Enter ");
		btnEnter.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		btnEnter.setBounds(202, 269, 150, 30);
		panel.add(btnEnter);
		btnEnter.setVerticalAlignment(SwingConstants.TOP);
		btnEnter.setFont(new Font("Stencil", Font.PLAIN, 25));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(50, 207, 300, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(50, 68, 300, 2);
		panel.add(separator_1);
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// create new instance of page user log in
				Page2_UserLogIN pageuserlogin = new Page2_UserLogIN();
				// show up page user log in
				pageuserlogin.setVisible(true);
				// hide page reset complete
				setVisible(false);
				
			}
		});
	}

}
