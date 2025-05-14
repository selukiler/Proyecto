package Pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

public class RegistroProductos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroProductos frame = new RegistroProductos();
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
	public RegistroProductos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(335, 238, 189, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(335, 332, 189, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(335, 424, 191, 49);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel CuadroChico1 = new JLabel("");
		CuadroChico1.setIcon(new ImageIcon(RegistroProductos.class.getResource("/Imagenes/CajaTextoChico.png")));
		CuadroChico1.setBounds(321, 215, 262, 77);
		contentPane.add(CuadroChico1);
		
		JLabel CuadroChico1_1 = new JLabel("");
		CuadroChico1_1.setIcon(new ImageIcon(RegistroProductos.class.getResource("/Imagenes/CajaTextoChico.png")));
		CuadroChico1_1.setBounds(321, 303, 274, 93);
		contentPane.add(CuadroChico1_1);
		
		JLabel CuadroChico1_2 = new JLabel("");
		CuadroChico1_2.setIcon(new ImageIcon(RegistroProductos.class.getResource("/Imagenes/CajaTextoChico.png")));
		CuadroChico1_2.setBounds(321, 395, 234, 105);
		contentPane.add(CuadroChico1_2);
		
		JButton GuardarProductos = new JButton("Guardar");
		GuardarProductos.setBounds(389, 519, 89, 23);
		contentPane.add(GuardarProductos);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(RegistroProductos.class.getResource("/Imagenes/inicio 2.0 (2).png")));
		lblNewLabel_1.setBounds(280, 150, 449, 436);
		contentPane.add(lblNewLabel_1);
		
		JLabel FondoPantalla = new JLabel("");
		FondoPantalla.setIcon(new ImageIcon(RegistroProductos.class.getResource("/Imagenes/fondopestana.jpg")));
		FondoPantalla.setBounds(0, 0, 884, 650);
		contentPane.add(FondoPantalla);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(75, 361, 46, 14);
		contentPane.add(lblNewLabel);
	}
}
