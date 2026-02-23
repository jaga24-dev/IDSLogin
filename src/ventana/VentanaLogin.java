package ventana;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
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
		contenedor.setBackground(Color.WHITE);
		contenedor.setBounds(50, 50, 500, 500);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		// Label título 
		JLabel title_login = new JLabel("Iniciar Sesión", JLabel.CENTER);
		title_login.setBounds(150, 110, 200, 30);
		title_login.setFont(new Font("Arial", Font.BOLD, 22));
		title_login.setForeground(Color.black); 
		contenedor.add(title_login); 
		
		// Ícono de candado
		ImageIcon candadoIcon = new ImageIcon("src/candado.png");
		JLabel candadoLabel = new JLabel(candadoIcon);
		candadoLabel.setBounds(218, 40, 64, 64); // posición y tamaño
		candadoLabel.setBackground(Color.BLACK); 
		contenedor.add(candadoLabel);

		
		// Usuario 
		JLabel lblUsuario = new JLabel("Nombre de usuario:");
		lblUsuario.setBounds(100, 150, 200, 30);
		lblUsuario.setFont(new Font("Arial", Font.BOLD, 18));
		lblUsuario.setForeground(Color.black);
		contenedor.add(lblUsuario);
		JTextField username = new JTextField();
		username.setBounds(100, 180, 300, 30);
		username.setFont(new Font("Arial", Font.PLAIN, 18));
		contenedor.add(username);
		
		// Contraseña 
		JLabel lblPassword = new JLabel("Contraseña:");
		lblPassword.setBounds(100, 230, 200, 30);
		lblPassword.setFont(new Font("Arial", Font.BOLD, 18));
		lblPassword.setForeground(Color.black); 
		contenedor.add(lblPassword);
		JPasswordField password = new JPasswordField();
		password.setBounds(100, 260, 300, 30);
		password.setFont(new Font("Arial", Font.PLAIN, 18));
		contenedor.add(password); 
		
		// CheckBox 
		JCheckBox recordar = new JCheckBox("Recordarme");
		recordar.setBounds(100, 290, 120, 30);
		recordar.setFont(new Font("Arial", Font.PLAIN, 16));
		recordar.setForeground(Color.black); 
		recordar.setBackground(Color.white); 
		recordar.setFocusPainted(false);
		contenedor.add(recordar);
		
		// Link "¿Olvidó su contraseña?" 
		JLabel forgotPass = new JLabel("¿Olvidó su contraseña?");
		forgotPass.setBounds(230, 290, 250, 30);
		forgotPass.setFont(new Font("Arial", Font.PLAIN, 16));
		forgotPass.setForeground(Color.RED);
		contenedor.add(forgotPass);

		// Botón
		JButton acceder = new JButton("Acceder");
		acceder.setBounds(100, 340, 300, 50);
		acceder.setFont(new Font("Arial", Font.BOLD, 22));
		acceder.setForeground(Color.white);
		acceder.setBackground(Color.blue);
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
