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

public class Page5_OrganizationChart3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page5_OrganizationChart3 frame = new Page5_OrganizationChart3();
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
	public Page5_OrganizationChart3() {
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
		
		JLabel lblProfile = new JLabel("Profile");
		lblProfile.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 50));
		lblProfile.setBounds(555, 19, 210, 117);
		panel.add(lblProfile);
		
		JLabel lblPicture = new JLabel("");
		lblPicture.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\AjTan.png"));
		lblPicture.setBounds(150, 120, 220, 297);
		panel.add(lblPicture);
		
		JLabel lblAjTew = new JLabel("Aj. Tan");
		lblAjTew.setFont(new Font("Bodoni MT Black", Font.PLAIN, 20));
		lblAjTew.setBounds(224, 423, 79, 46);
		panel.add(lblAjTew);
		
		JLabel lblName = new JLabel("NAME : Dr. Sujitra  Arwachananu");
		lblName.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		lblName.setBounds(430, 150, 714, 62);
		panel.add(lblName);
		
		JLabel lblBirthday = new JLabel("Birthday : November 14 , 1981");
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
		
		JLabel lblCourses1 = new JLabel("1301122 : Introduction to Pragramming");
		lblCourses1.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblCourses1.setBounds(480, 350, 778, 62);
		panel.add(lblCourses1);
		
		JLabel lblCourses2 = new JLabel("1305103 : User Interface Design");
		lblCourses2.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblCourses2.setBounds(480, 375, 585, 62);
		panel.add(lblCourses2);
		
		JLabel lblCourses3 = new JLabel("1305392 : Seminar in Software Engineering");
		lblCourses3.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblCourses3.setBounds(480, 400, 714, 62);
		panel.add(lblCourses3);
		
		JLabel lblCourses4 = new JLabel("1305497 : Selected Topics in Software Engineering 2 ");
		lblCourses4.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblCourses4.setBounds(480, 425, 714, 62);
		panel.add(lblCourses4);
		
		JLabel lblContact = new JLabel("Contact ");
		lblContact.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		lblContact.setBounds(430, 475, 714, 62);
		panel.add(lblContact);
		
		JLabel lblFacebook = new JLabel("Fackbook : Tan Sujitra");
		lblFacebook.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblFacebook.setBounds(480, 525, 714, 62);
		panel.add(lblFacebook);
		
		JLabel lblEmail = new JLabel("Email : sujitra.arw@mfu.ac.th");
		lblEmail.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblEmail.setBounds(480, 550, 714, 62);
		panel.add(lblEmail);
		
		JLabel lblTel = new JLabel("Tel : ");
		lblTel.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblTel.setBounds(480, 575, 714, 62);
		panel.add(lblTel);
		
		JButton buttonBack = new JButton("< 2 >");
		buttonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// create new instance of page Organization Chart 2
				Page5_OrganizationChart2 pageorganizationchart2 = new Page5_OrganizationChart2();
				// show up page Organization Chart 2
				pageorganizationchart2.setVisible(true);
				// hide page Organization Chart 3
				setVisible(false);
				
			}
		});
		buttonBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonBack.setBounds(1030, 707, 100, 30);
		panel.add(buttonBack);
		
		JButton buttonNext = new JButton("< 4 >");
		buttonNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// create new instance of page Organization Chart 4
				Page5_OrganizationChart4 pageorganizationchart4 = new Page5_OrganizationChart4();
				// show up page Organization Chart 4
				pageorganizationchart4.setVisible(true);
				// hide page Organization Chart 3
				setVisible(false);
				
			}
		});
		buttonNext.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonNext.setBounds(1135, 707, 100, 30);
		panel.add(buttonNext);
		
		Button button = new Button("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// create new instance of page Organization Chart 
				Page5_OrganizationChart pageorganizationchart = new Page5_OrganizationChart();
				// show up page Organization Chart 
				pageorganizationchart.setVisible(true);
				// hide page Organization Chart 3
				setVisible(false);
				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBounds(70, 707, 79, 30);
		panel.add(button);
	}

}
