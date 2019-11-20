import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Page6_Profession extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page6_Profession frame = new Page6_Profession();
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
	public Page6_Profession() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(106, 187, 69));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(461, 80, 1000, 902);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblProfession = new JLabel("Profession");
		lblProfession.setBounds(365, 20, 270, 58);
		lblProfession.setFont(new Font("Perpetua", Font.PLAIN, 70));
		panel.add(lblProfession);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(47, 125, 800, 320);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblsoftwareEngineer = new JLabel("");
		lblsoftwareEngineer.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\JOBSE.png"));
		lblsoftwareEngineer.setBounds(-23, -63, 1071, 400);
		panel_1.add(lblsoftwareEngineer);
		
		JLabel lblCareer = new JLabel("Career");
		lblCareer.setVerticalAlignment(SwingConstants.TOP);
		lblCareer.setHorizontalAlignment(SwingConstants.CENTER);
		lblCareer.setFont(new Font("Stencil", Font.PLAIN, 40));
		lblCareer.setBounds(47, 86, 160, 33);
		panel.add(lblCareer);
		
		JLabel lblCompany = new JLabel("Company");
		lblCompany.setVerticalAlignment(SwingConstants.TOP);
		lblCompany.setFont(new Font("Stencil", Font.PLAIN, 40));
		lblCompany.setBounds(47, 456, 187, 35);
		panel.add(lblCompany);
		
		JLabel lblDst = new JLabel("DST Worldwide Services");
		lblDst.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblDst.setBounds(200, 515, 400, 35);
		panel.add(lblDst);
		
		JLabel lblGAble = new JLabel("G able");
		lblGAble.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblGAble.setBounds(200, 565, 200, 35);
		panel.add(lblGAble);
		
		JLabel lblITone = new JLabel("ITone");
		lblITone.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblITone.setBounds(200, 615, 100, 35);
		panel.add(lblITone);
		
		JLabel lblManaoSoftware = new JLabel("Manao Software");
		lblManaoSoftware.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblManaoSoftware.setBounds(200, 665, 300, 35);
		panel.add(lblManaoSoftware);
		
		JLabel lblMycosTechnologies = new JLabel("mYcos Technologies");
		lblMycosTechnologies.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblMycosTechnologies.setBounds(200, 715, 400, 35);
		panel.add(lblMycosTechnologies);
		
		JLabel lblOutsourcify = new JLabel("Outsourcify");
		lblOutsourcify.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblOutsourcify.setBounds(200, 765, 200, 35);
		panel.add(lblOutsourcify);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Create new instance page Home
				Page3_HOME pagehome = new Page3_HOME();
				// show page home
				pagehome.setVisible(true);
				// hide page Profession
				setVisible(false);
				
			}
		});
		btnBack.setVerticalAlignment(SwingConstants.TOP);
		btnBack.setFont(new Font("Stencil", Font.PLAIN, 25));
		btnBack.setBounds(836, 846, 100, 35);
		panel.add(btnBack);
		
		JLabel lblPictureDST = new JLabel("");
		lblPictureDST.setHorizontalAlignment(SwingConstants.CENTER);
		lblPictureDST.setBounds(66, 207, 368, 248);
		contentPane.add(lblPictureDST);
		lblPictureDST.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\DST.png"));
		
		JLabel lblPictureGAble = new JLabel("");
		lblPictureGAble.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\G-able.png"));
		lblPictureGAble.setBounds(92, 522, 318, 159);
		contentPane.add(lblPictureGAble);
		
		JLabel lblPictureITone = new JLabel("");
		lblPictureITone.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\ITone.png"));
		lblPictureITone.setBounds(145, 743, 200, 200);
		contentPane.add(lblPictureITone);
		
		JLabel lblPictureManao = new JLabel("");
		lblPictureManao.setBounds(1563, 207, 224, 224);
		contentPane.add(lblPictureManao);
		lblPictureManao.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\manaosoftware.jpg"));
		
		JLabel lblPicturemYcos = new JLabel("");
		lblPicturemYcos.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\mYcos.jpg"));
		lblPicturemYcos.setBounds(1495, 522, 380, 75);
		contentPane.add(lblPicturemYcos);
		
		JLabel lblPictureOutsourcify = new JLabel("");
		lblPictureOutsourcify.setBounds(1563, 743, 300, 200);
		contentPane.add(lblPictureOutsourcify);
		lblPictureOutsourcify.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\outsourcifyDEMO.jpg"));
	}
}
