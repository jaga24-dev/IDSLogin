package ventana;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaLogin extends JFrame{
	public VentanaLogin() {
		// Ventana 
		this.setSize(1200, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("Mi ventana");
		this.setLocation(100,100);
		this.setLayout(null);
		
		// Mostrar ventana al final 
		this.setVisible(true);
	}
	public void login() {
		// Panel con fondo 
		JPanel fondo = new JPanel();
		fondo.setLayout(null);
		fondo.setBackground(Color.decode("#6A5ACD"));
		this.setContentPane(fondo);
		
		// Panel centrado 
		JPanel contenedor = new JPanel();
		contenedor.setBackground(Color.decode("#7E1FA3"));
		contenedor.setBounds(350, 80, 500, 400);
		contenedor.setLayout(null);
		contenedor.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		fondo.add(contenedor);
				
		// Label título 
		JLabel title_login = new JLabel("Sesión de Inicio", JLabel.CENTER);
		title_login.setBounds(350, 20, 500, 30);
		title_login.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
		title_login.setForeground(Color.white); 
		fondo.add(title_login); 
				
		// Ícono de candado
		ImageIcon loginIcon = new ImageIcon("src/iconlogin.png");
		JLabel candadoLabel = new JLabel(loginIcon);
		candadoLabel.setBounds(218, 40, 64, 64); // posición y tamaño
		candadoLabel.setBackground(Color.BLACK); 
		contenedor.add(candadoLabel);

				
		// Usuario 
		ImageIcon userIcon = new ImageIcon("src/usuario.png");
		JLabel iconUser = new JLabel(userIcon);
		iconUser.setBounds(68, 180, 32, 32);
		contenedor.add(iconUser);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(100, 150, 200, 30);
		lblUsuario.setFont(new Font("Arial", Font.ITALIC, 18));
		lblUsuario.setForeground(Color.black);
		contenedor.add(lblUsuario);
		
		JTextField username = new JTextField();
		username.setBounds(100, 180, 300, 32);
		username.setFont(new Font("Arial", Font.PLAIN, 18));
		contenedor.add(username);
				
		// Contraseña 
		ImageIcon passIcon = new ImageIcon("src/llave.png");
		JLabel passUser = new JLabel(passIcon);
		passUser.setBounds(68, 260, 32, 32);
		contenedor.add(passUser);
		
		JLabel lblPassword = new JLabel("Contraseña:");
		lblPassword.setBounds(100, 230, 200, 30);
		lblPassword.setFont(new Font("Arial", Font.ITALIC, 18));
		lblPassword.setForeground(Color.black); 
		contenedor.add(lblPassword);
		
		JPasswordField password = new JPasswordField();
		password.setBounds(100, 260, 300, 32);
		password.setFont(new Font("Arial", Font.PLAIN, 18));
		contenedor.add(password); 
				
		// CheckBox 
		JCheckBox recordar = new JCheckBox("Recordarme");
		recordar.setBounds(100, 300, 120, 30);
		recordar.setFont(new Font("Arial", Font.PLAIN, 16));
		recordar.setForeground(Color.black); 
		recordar.setBackground(Color.decode("#7E1FA3")); 
		recordar.setFocusPainted(false);
		contenedor.add(recordar);
				
		// Link "¿Olvidó su contraseña?" 
		JLabel forgotPass = new JLabel("¿Olvidó su contraseña?");
		forgotPass.setBounds(230, 300, 250, 30);
		forgotPass.setFont(new Font("Arial", Font.PLAIN, 16));
		forgotPass.setForeground(Color.BLUE);
		contenedor.add(forgotPass);

		// Botón
		JButton acceder = new JButton("Acceder");
		acceder.setBounds(100, 340, 300, 50);
		acceder.setFont(new Font("Arial", Font.BOLD, 22));
		acceder.setForeground(Color.white);
		acceder.setBackground(Color.decode("#6A5ACD"));
		contenedor.add(acceder);
		
		// Texto y botón Registrarse 
		JLabel lblNoAccount = new JLabel("¿No tienes una cuenta?"); 
		lblNoAccount.setBounds(520, 490, 200, 30); 
		lblNoAccount.setFont(new Font("Arial", Font.PLAIN, 14)); 
		lblNoAccount.setForeground(Color.white);
		fondo.add(lblNoAccount); 
		
		JButton btnRegister = new JButton("Registrarse"); 
		btnRegister.setBounds(520, 520, 150, 30); 
		btnRegister.setBackground(Color.decode("#7E1FA3")); 
		btnRegister.setForeground(Color.white); 
		fondo.add(btnRegister);
		
		contenedor.repaint();
		contenedor.revalidate();
		fondo.repaint();
		fondo.revalidate();
	}
	public void registro() {
		//contenedor registro
		JPanel register_container = new JPanel();
		register_container.setBounds(50, 50, 500, 500);
		register_container.setLocation(600, 50);
		register_container.setOpaque(true);
		register_container.setBackground(Color.decode("#27F5D6"));
		register_container.setLayout(null);
		this.add(register_container);
				
		// Título 
		JLabel titulo = new JLabel("REGISTRO", JLabel.CENTER);
		titulo.setBounds(100, 10, 300, 40);
		titulo.setFont(new Font("Arial", Font.BOLD, 28));
		titulo.setForeground(Color.BLACK); register_container.add(titulo);
				
		// Nombre de usuario 
		JLabel user_tag = new JLabel("NOMBRE DE USUARIO:"); 
		user_tag.setBounds(100, 60, 250, 30); 
		user_tag.setFont(new Font("Arial", Font.BOLD, 18)); 
		register_container.add(user_tag);

		JTextField new_user = new JTextField("Ingresa tu nombre de usuario"); 
		new_user.setBounds(100, 90, 300, 30);
		new_user.setFont(new Font("Arial", Font.PLAIN, 14));
		new_user.setForeground(Color.GRAY);
		register_container.add(new_user);

		// BIO 
		JLabel bio_tag = new JLabel("BIO"); 
		bio_tag.setBounds(100, 130, 250, 30); 
		bio_tag.setFont(new Font("Arial", Font.BOLD, 18)); 
		register_container.add(bio_tag); 
				
		JTextArea bio = new JTextArea("Cuéntanos sobre ti..."); 
		bio.setBounds(100, 160, 300, 100);
		bio.setFont(new Font("Arial", Font.PLAIN, 14)); 
		bio.setForeground(Color.GRAY); 
		bio.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
		register_container.add(bio);
				
		// Preferencias 
		JLabel pref_tag = new JLabel("PREFERENCIAS", JLabel.CENTER); 
		pref_tag.setBounds(100, 270, 250, 30); 
		pref_tag.setFont(new Font("Arial", Font.BOLD, 18)); 
		register_container.add(pref_tag); 
				
		JCheckBox sweet_option = new JCheckBox("Dulces"); 
		sweet_option.setBounds(100, 300, 100, 30); 
		sweet_option.setBackground(Color.decode("#27F5D6")); 
		register_container.add(sweet_option);
				
		JCheckBox salty_option = new JCheckBox("Salado"); 
		salty_option.setBounds(200, 300, 100, 30); 
		salty_option.setBackground(Color.decode("#27F5D6")); 
		register_container.add(salty_option); 
				
		JCheckBox healthy = new JCheckBox("Saludable"); 
		healthy.setBounds(300, 300, 120, 30); 
		healthy.setBackground(Color.decode("#27F5D6")); 
		register_container.add(healthy);
				
		sweet_option.setBackground(Color.decode("#27F5D6"));
		salty_option.setBackground(Color.decode("#27F5D6"));
		healthy.setBackground(Color.decode("#27F5D6"));
				
		// Términos 
		JLabel terms_tag = new JLabel("TÉRMINOS", JLabel.CENTER); 
		terms_tag.setBounds(100, 340, 250, 30); 
		terms_tag.setFont(new Font("Arial", Font.BOLD, 18)); 
		register_container.add(terms_tag); 
				
		JRadioButton accept_terms = new JRadioButton("Acepto los términos"); 
		accept_terms.setBounds(100, 370, 150, 30);
		accept_terms.setBackground(Color.decode("#27F5D6")); 
		register_container.add(accept_terms);
				
		JRadioButton reject_terms = new JRadioButton("Rechazo los términos");
		reject_terms.setBounds(250, 370, 150, 30); 
		reject_terms.setBackground(Color.decode("#27F5D6")); 
		register_container.add(reject_terms);
				
		ButtonGroup terms=new ButtonGroup();
		accept_terms.setBackground(Color.decode("#27F5D6"));
		reject_terms.setBackground(Color.decode("#27F5D6"));
		terms.add(accept_terms);
		terms.add(reject_terms);
				
		// Dropdown de colonias 
		String[] colonias = {"Camino Real", "La Fuente", "Villas"}; 
		JComboBox<String> list = new JComboBox<>(colonias);
		list.setBounds(150, 400, 200, 30); 
		register_container.add(list); 
				
		// Botón 
		JButton crearCuenta = new JButton("Crear cuenta"); 
		crearCuenta.setBounds(150, 440, 200, 40);
		crearCuenta.setFont(new Font("Arial", Font.BOLD, 20));
		crearCuenta.setBackground(Color.YELLOW); 
		crearCuenta.setForeground(Color.BLACK); 
		register_container.add(crearCuenta);
		
		register_container.repaint();
		register_container.revalidate();
	}
}
