import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.ScrollPane;
import java.awt.Panel;
import java.awt.ComponentOrientation;
import java.awt.Rectangle;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Page5_OrganizationChart1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page5_OrganizationChart1 frame = new Page5_OrganizationChart1();
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
	public Page5_OrganizationChart1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBackground(Color.WHITE);
		panel.setBounds(300, 100, 1320, 780);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblProfile = new JLabel("Profile");
		lblProfile.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 50));
		lblProfile.setBounds(555, 19, 210, 117);
		panel.add(lblProfile);
		
		JLabel lblPicture = new JLabel("");
		lblPicture.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\AjBee.png"));
		lblPicture.setBounds(150, 118, 221, 312);
		panel.add(lblPicture);
		
		JLabel lblAjbee = new JLabel("Aj. Bee");
		lblAjbee.setFont(new Font("Bodoni MT Black", Font.PLAIN, 20));
		lblAjbee.setBounds(224, 447, 79, 46);
		panel.add(lblAjbee);
		
		JLabel lblName = new JLabel("NAME : Mr. Vittayasak  Rujivorakul");
		lblName.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		lblName.setBounds(430, 150, 764, 62);
		panel.add(lblName);
		
		JLabel lblBirthday = new JLabel("Birthday : June 1 , 1977");
		lblBirthday.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		lblBirthday.setBounds(430, 200, 714, 62);
		panel.add(lblBirthday);
		
		JLabel lblPosition = new JLabel("Position : Lecturer");
		lblPosition.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		lblPosition.setBounds(430, 250, 714, 62);
		panel.add(lblPosition);
		
		JLabel lblTeachingCourses = new JLabel("Teaching Courses ");
		lblTeachingCourses.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		lblTeachingCourses.setBounds(430, 300, 714, 62);
		panel.add(lblTeachingCourses);
		
		JLabel lbllblCourse1 = new JLabel("1305307 : Enterprise Application Development");
		lbllblCourse1.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lbllblCourse1.setBounds(480, 350, 778, 62);
		panel.add(lbllblCourse1);
		
		JLabel lblCourse2 = new JLabel("1305405 : Enterprise Architrcture ");
		lblCourse2.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblCourse2.setBounds(480, 375, 585, 62);
		panel.add(lblCourse2);
		
		JLabel lblCourse3 = new JLabel("1305392 : Seminar in Software Engineering");
		lblCourse3.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblCourse3.setBounds(480, 400, 714, 62);
		panel.add(lblCourse3);
		
		JLabel lblContact = new JLabel("Contact ");
		lblContact.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		lblContact.setBounds(430, 450, 714, 62);
		panel.add(lblContact);
		
		JLabel lblFackbook = new JLabel("Fackbook : Vittayasak  Rujivorakul");
		lblFackbook.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblFackbook.setBounds(480, 500, 714, 62);
		panel.add(lblFackbook);
		
		JLabel lblEmail = new JLabel("Email : vittayasak@mfu.ac.th");
		lblEmail.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblEmail.setBounds(480, 525, 714, 62);
		panel.add(lblEmail);
		
		JLabel lblTel = new JLabel("Tel : ");
		lblTel.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblTel.setBounds(480, 550, 714, 62);
		panel.add(lblTel);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// create new instance of page Organization Chart
				Page5_OrganizationChart pageorganizationchart = new Page5_OrganizationChart();
				// show up page Organization Chart
				pageorganizationchart.setVisible(true);
				// hide page Organization Chart 1
				setVisible(false);
				
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack.setBounds(80, 707, 100, 30);
		panel.add(btnBack);
		
		JButton btnNext = new JButton("< 2 >");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// create new instance of page Organization Chart 2
				Page5_OrganizationChart2 pageorganizationchart2 = new Page5_OrganizationChart2();
				// show up page Organization Chart 2
				pageorganizationchart2.setVisible(true);
				// hide page Organization Chart 1
				setVisible(false);
				
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNext.setBounds(1135, 707, 100, 30);
		panel.add(btnNext);
	}
}
