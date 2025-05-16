package Pantallas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Toolkit;

public class Primera extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Primera frame = new Primera();
					frame.setLocationRelativeTo(null);
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
	public Primera() {
		setTitle("Inicio");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Primera.class.getResource("/Imagenes/Logotop.jpg")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton GenerarCuenta = new JButton("Generar cuenta");
		GenerarCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				General g =new General();
				g.setVisible(true);
			}
		});
		GenerarCuenta.setOpaque(false);
		GenerarCuenta.setFont(new Font("Calibri", Font.PLAIN, 20));
		GenerarCuenta.setContentAreaFilled(false);
		GenerarCuenta.setBorderPainted(false);
		GenerarCuenta.setBounds(345, 458, 220, 60);
		contentPane.add(GenerarCuenta);
		
		JLabel CajaTexto4 = new JLabel("");
		CajaTexto4.setIcon(new ImageIcon(Primera.class.getResource("/Imagenes/CajaTextoChico.png")));
		CajaTexto4.setBounds(345, 455, 220, 72);
		contentPane.add(CajaTexto4);
		
		JButton RegistrarProducto = new JButton("Registrar Producto");
		RegistrarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroProductos r= new RegistroProductos();
				r.setVisible(true);
			}
		});
		RegistrarProducto.setOpaque(false);
		RegistrarProducto.setFont(new Font("Calibri", Font.PLAIN, 20));
		RegistrarProducto.setContentAreaFilled(false);
		RegistrarProducto.setBorderPainted(false);
		RegistrarProducto.setBounds(345, 282, 220, 60);
		contentPane.add(RegistrarProducto);
		
		JLabel CajaTexto2 = new JLabel("New label");
		CajaTexto2.setIcon(new ImageIcon(Primera.class.getResource("/Imagenes/CajaTextoChico.png")));
		CajaTexto2.setBounds(345, 275, 220, 72);
		contentPane.add(CajaTexto2);
		
		JButton General = new JButton("General");
		General.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Restaurante r= new Restaurante();
				r.setVisible(true);
			}
		});
		General.setFont(new Font("Calibri", Font.PLAIN, 20));
		General.setOpaque(false);
		General.setContentAreaFilled(false);
		General.setBorderPainted(false);
		General.setBounds(345, 191, 220, 60);
		contentPane.add(General);
		
		JLabel CajaTexto1 = new JLabel("New label");
		CajaTexto1.setIcon(new ImageIcon(Primera.class.getResource("/Imagenes/CajaTextoChico.png")));
		CajaTexto1.setBounds(345, 185, 220, 72);
		contentPane.add(CajaTexto1);
		
		JLabel logo = new JLabel("");
		logo.setBackground(Color.BLACK);
		logo.setIcon(new ImageIcon(Primera.class.getResource("/Imagenes/Logotop.jpg")));
		logo.setBounds(329, 29, 289, 96);
		contentPane.add(logo);
		
		JButton TomarNota = new JButton("Tomar Nota");
		TomarNota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mesas m = new Mesas();
				m.setVisible(true);
			}
			
		});
		TomarNota.setOpaque(false);
		TomarNota.setFont(new Font("Calibri", Font.PLAIN, 20));
		TomarNota.setContentAreaFilled(false);
		TomarNota.setBorderPainted(false);
		TomarNota.setBounds(345, 367, 220, 60);
		contentPane.add(TomarNota);
		
		JLabel CajaTexto3 = new JLabel("Tomar Nota");
		CajaTexto3.setIcon(new ImageIcon(Primera.class.getResource("/Imagenes/CajaTextoChico.png")));
		CajaTexto3.setBounds(345, 360, 220, 72);
		contentPane.add(CajaTexto3);
		
		JLabel lbl_FondoTotal = new JLabel("New label");
		lbl_FondoTotal.setIcon(new ImageIcon(Primera.class.getResource("/Imagenes/marmolnegro.jpg")));
		lbl_FondoTotal.setBounds(0, 0, 884, 661);
		contentPane.add(lbl_FondoTotal);
	}
}
