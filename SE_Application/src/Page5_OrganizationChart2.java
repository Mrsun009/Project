import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;

public class Page5_OrganizationChart2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page5_OrganizationChart2 frame = new Page5_OrganizationChart2();
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
	public Page5_OrganizationChart2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBackground(Color.WHITE);
		panel.setBounds(300, 100, 1320, 780);
		contentPane.add(panel);
		
		JLabel lblPicture = new JLabel("");
		lblPicture.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\AjTew.png"));
		lblPicture.setBounds(150, 120, 225, 290);
		panel.add(lblPicture);
		
		JLabel lblProfile = new JLabel("Profile");
		lblProfile.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 50));
		lblProfile.setBounds(555, 19, 210, 117);
		panel.add(lblProfile);
		
		JLabel lblAjTew = new JLabel("Aj. Tew");
		lblAjTew.setFont(new Font("Bodoni MT Black", Font.PLAIN, 20));
		lblAjTew.setBounds(224, 423, 79, 46);
		panel.add(lblAjTew);
		
		JLabel lblNameTew = new JLabel("NAME : Mr. Tew  Hongthong");
		lblNameTew.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		lblNameTew.setBounds(430, 150, 714, 62);
		panel.add(lblNameTew);
		
		JLabel lblBirthday = new JLabel("Birthday : April 9, ");
		lblBirthday.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		lblBirthday.setBounds(430, 200, 714, 62);
		panel.add(lblBirthday);
		
		JLabel lblPosition = new JLabel("Position : Lecturer");
		lblPosition.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		lblPosition.setBounds(430, 250, 714, 62);
		panel.add(lblPosition);
		
		JLabel lblTeachingCourse = new JLabel("Teaching Courses ");
		lblTeachingCourse.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		lblTeachingCourse.setBounds(430, 300, 714, 62);
		panel.add(lblTeachingCourse);
		
		JLabel lblCourse1 = new JLabel("1305105 : Software Engineering Practice 1");
		lblCourse1.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblCourse1.setBounds(480, 350, 778, 62);
		panel.add(lblCourse1);
		
		JLabel lblCourse2 = new JLabel("1305215 : Web Application Development");
		lblCourse2.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblCourse2.setBounds(480, 375, 585, 62);
		panel.add(lblCourse2);
		
		JLabel lblCourse3 = new JLabel("1305392 : Seminar in Software Engineering");
		lblCourse3.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblCourse3.setBounds(480, 400, 714, 62);
		panel.add(lblCourse3);
		
		JLabel lblCourse4 = new JLabel("1305493 : Software Engineering Case Studies");
		lblCourse4.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblCourse4.setBounds(480, 425, 714, 62);
		panel.add(lblCourse4);
		
		JLabel lblContact = new JLabel("Contact ");
		lblContact.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		lblContact.setBounds(430, 475, 714, 62);
		panel.add(lblContact);
		
		JLabel lblFackbook = new JLabel("Fackbook : Tew Hongthong");
		lblFackbook.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblFackbook.setBounds(480, 525, 714, 62);
		panel.add(lblFackbook);
		
		JLabel lblEmail = new JLabel("Email : tew.hon@mfu.ac.th");
		lblEmail.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblEmail.setBounds(480, 550, 714, 62);
		panel.add(lblEmail);
		
		JLabel lblTel = new JLabel("Tel : ");
		lblTel.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblTel.setBounds(480, 575, 714, 62);
		panel.add(lblTel);
		
		JButton buttonBack = new JButton("< 1 >");
		buttonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// create new instance of page Organization Chart 1
				Page5_OrganizationChart1 pageorganizationchart1 = new Page5_OrganizationChart1();
				// show up page Organization Chart 1
				pageorganizationchart1.setVisible(true);
				// hide page Organization Chart 2
				setVisible(false);
				
			}
		});
		buttonBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonBack.setBounds(1030, 707, 100, 30);
		panel.add(buttonBack);
		
		JButton buttonNext = new JButton("< 3 >");
		buttonNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// create new instance of page Organization Chart 3
				Page5_OrganizationChart3 pageorganizationchart3 = new Page5_OrganizationChart3();
				// show up page Organization Chart 3
				pageorganizationchart3.setVisible(true);
				// hide page Organization Chart 2
				setVisible(false);
				
			}
		});
		buttonNext.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonNext.setBounds(1135, 707, 100, 30);
		panel.add(buttonNext);
		
		Button button = new Button("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// create new instance of page Organization Chart 3
				Page5_OrganizationChart pageorganizationchart = new Page5_OrganizationChart();
				// show up page Organization Chart 
				pageorganizationchart.setVisible(true);
				// hide page Organization Chart 2
				setVisible(false);
				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBounds(70, 707, 79, 30);
		panel.add(button);
	}

}
