import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField_usuario;
	private JPasswordField passwordField;

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login DBU");
		setBackground(SystemColor.activeCaption);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\diosm\\Downloads\\logo_small_icon_only-removebg-preview.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 407);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 165, 0));
		panel.setBounds(10, 11, 564, 359);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(215, 0, 349, 359);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lblNewLabel_1.setBounds(84, 186, 113, 27);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lblNewLabel_2.setBounds(84, 256, 129, 31);
		panel_1.add(lblNewLabel_2);
		
		textField_usuario = new JTextField();
		textField_usuario.setBounds(235, 192, 86, 20);
		panel_1.add(textField_usuario);
		textField_usuario.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(235, 264, 86, 20);
		panel_1.add(passwordField);
		
		JButton btnNewButton = new JButton("Iniciar Seccion");
		btnNewButton.setSelectedIcon(new ImageIcon("C:\\Users\\diosm\\OneDrive\\Escritorio\\inicio.jfif"));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Usu= textField_usuario.getText();
				String Cont= passwordField.getText();
				
				if (Usu.equals("admin")&&Cont.equals("123")) {
					
					JOptionPane.showMessageDialog(null, "Bienvenido " + Usu);
			}
				else {
					JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrecta");
				}
					
				}
			
			
		});
		btnNewButton.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnNewButton.setBounds(117, 317, 158, 31);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(149, 34, 86, 106);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\diosm\\Downloads\\logo_large (2).png"));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(-80, 0, 300, 359);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 300, 359);
		panel_2.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\diosm\\Downloads\\logo_small_icon_only_inverted (3).png"));
	}
}
