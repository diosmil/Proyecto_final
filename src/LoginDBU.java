import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class LoginDBU extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginDBU frame = new LoginDBU();
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
	public LoginDBU() {
		setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 26));
		setTitle("DBU");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\diosm\\Downloads\\logo_small_icon_only_inverted.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 318);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 137, 367);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\diosm\\Downloads\\logo_small_icon_only_inverted.png"));
		lblNewLabel.setBounds(-82, -46, 232, 367);
		panel.add(lblNewLabel);
		
		JLabel lblSuario = new JLabel("Usuario");
		lblSuario.setForeground(SystemColor.activeCaption);
		lblSuario.setFont(new Font("Lucida Fax", Font.BOLD, 20));
		lblSuario.setBounds(156, 97, 105, 31);
		contentPane.add(lblSuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setForeground(SystemColor.activeCaption);
		lblContrasea.setFont(new Font("Lucida Fax", Font.BOLD, 20));
		lblContrasea.setBounds(156, 153, 150, 31);
		contentPane.add(lblContrasea);
		
		textUsuario = new JTextField();
		textUsuario.setForeground(SystemColor.activeCaption);
		textUsuario.setBounds(306, 106, 86, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(SystemColor.activeCaption);
		passwordField.setBounds(306, 153, 86, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Inicio");
		btnNewButton.setForeground(SystemColor.activeCaptionText);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Usu= textUsuario.getText();
				String Cont= passwordField.getText();
				
				if (Usu.equals("admin")&&Cont.equals("123")) {
					
					JOptionPane.showMessageDialog(null, "Bienvenido " + Usu);
			}
				else {
					JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrecta");
				}
					
				
			}
		});
		btnNewButton.setBounds(245, 212, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\diosm\\Downloads\\1__1_-removebg-preview.png"));
		lblNewLabel_2.setBounds(249, 21, 70, 65);
		contentPane.add(lblNewLabel_2);
	}
}
