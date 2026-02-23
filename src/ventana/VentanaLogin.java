package ventana;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VentanaLogin extends JFrame{
	public VentanaLogin() {
		// Ventana 
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("Mi ventana");
		this.setLocation(100,100);
		this.setLayout(null);
		
		// Panel 
		JPanel contenedor = new JPanel();
		contenedor.setBackground(Color.BLUE);
		contenedor.setBounds(50, 50, 500, 500);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		// Label título 
		JLabel title_login = new JLabel("Bienvenido", JLabel.CENTER);
		title_login.setBounds(150, 40, 200, 30);
		title_login.setFont(new Font("Arial", Font.BOLD, 22));
		title_login.setForeground(Color.WHITE);
		title_login.setBackground(Color.BLACK); 
		contenedor.add(title_login); 
		
		// Usuario 
		JLabel lblUsuario = new JLabel("Nombre de usuario:");
		lblUsuario.setBounds(100, 90, 200, 30);
		lblUsuario.setFont(new Font("Arial", Font.BOLD, 18));
		lblUsuario.setForeground(Color.WHITE);
		contenedor.add(lblUsuario);
		JTextField username = new JTextField();
		username.setBounds(100, 120, 300, 30);
		username.setFont(new Font("Arial", Font.PLAIN, 18));
		contenedor.add(username);
		
		// Contraseña 
		JLabel lblPassword = new JLabel("Contraseña:");
		lblPassword.setBounds(100, 170, 200, 30);
		lblPassword.setFont(new Font("Arial", Font.BOLD, 18));
		lblPassword.setForeground(Color.WHITE); contenedor.add(lblPassword);
		JPasswordField password = new JPasswordField();
		password.setBounds(100, 200, 300, 30);
		password.setFont(new Font("Arial", Font.PLAIN, 18));
		contenedor.add(password); 
		
		// CheckBox 
		JCheckBox recordar = new JCheckBox("Recordarme");
		recordar.setBounds(100, 250, 120, 30);
		recordar.setFont(new Font("Arial", Font.PLAIN, 16));
		recordar.setForeground(Color.WHITE); 
		recordar.setBackground(Color.BLUE); 
		recordar.setFocusPainted(false);
		contenedor.add(recordar);
		
		// Link "¿Olvidó su contraseña?" 
		JLabel forgotPass = new JLabel("¿Olvidó su contraseña?");
		forgotPass.setBounds(230, 250, 250, 30);
		forgotPass.setFont(new Font("Arial", Font.PLAIN, 16));
		forgotPass.setForeground(Color.RED);
		contenedor.add(forgotPass);

		// Botón
		JButton acceder = new JButton("Acceder");
		acceder.setBounds(160, 350, 180, 50);
		acceder.setFont(new Font("Arial", Font.BOLD, 22));
		contenedor.add(acceder);
		
		// Acción del botón
		acceder.addActionListener(e -> {
			String user = username.getText();
			String pass = new String(password.getPassword());
			boolean recordarUsuario = recordar.isSelected();
			System.out.println("Usuario: " + user);
			System.out.println("Contraseña: " + pass);
			System.out.println("Recordar: " + recordarUsuario);
		});
		
		// Mostrar ventana al final 
		this.setVisible(true);
	}
}
