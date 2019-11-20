import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import java.awt.Panel;
import java.awt.Canvas;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JProgressBar;

public class Page1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page1 frame = new Page1();
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
	public Page1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
						
		JButton btnNextPage2 = new JButton("");
		btnNextPage2.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\DEMO.jpg"));
		btnNextPage2.setForeground(new Color(0, 128, 0));
		btnNextPage2.setBackground(new Color(0, 128, 0));
		btnNextPage2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			// create new instance of UserLogIN
			Page2_UserLogIN UserLogIN = new Page2_UserLogIN();
			// show up Page UserLogIN
			UserLogIN.setVisible(true);
			// hide Page1
			setVisible(false);
			}
	});
						
		btnNextPage2.setBounds(-21, -38, 1953, 1089);
		contentPane.add(btnNextPage2);
	}
}
