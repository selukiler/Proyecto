package Pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Font;

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
	public RegistroProductos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistroProductos.class.getResource("/Imagenes/Logotop.jpg")));
		setTitle("Registro de producto");
		ConexionBasedeDatos.ConexionMySQL x = new ConexionBasedeDatos.ConexionMySQL("root", "", "Registro");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Producto");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(396, 199, 82, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Precio");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(407, 295, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Descripción");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(389, 395, 82, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel logo = new JLabel("New label");
		logo.setIcon(new ImageIcon(RegistroProductos.class.getResource("/Imagenes/Logotop.jpg")));
		logo.setBounds(296, 46, 360, 93);
		contentPane.add(logo);
		
		textField = new JTextField();
		textField.setBounds(335, 238, 189, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(335, 332, 189, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(335, 424, 191, 44);
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
		GuardarProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					x.conectar();
					String sentencia="INSERT INTO carta(producto, precio, descripcion) VALUES('"+textField.getText()+"','"+textField_1.getText()+"','"+textField_2.getText()+"')";
					String nombre=textField.getText();
					String precio=textField_1.getText();
					String descripcion=textField_2.getText();
					if(nombre.isEmpty()||precio.isEmpty()||descripcion.isEmpty()) 
					{
						JOptionPane.showMessageDialog(null, "Rellene todos los campos para poder registrar");
					}
					
					else 
					{
						x.ejecutarInsertDeleteUpdate(sentencia);
					}
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		GuardarProductos.setBounds(389, 519, 89, 23);
		contentPane.add(GuardarProductos);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(RegistroProductos.class.getResource("/Imagenes/inicio 2.0 (2).png")));
		lblNewLabel_1.setBounds(280, 150, 449, 436);
		contentPane.add(lblNewLabel_1);
		
		JLabel FondoPantalla = new JLabel("");
		FondoPantalla.setIcon(new ImageIcon(RegistroProductos.class.getResource("/Imagenes/marmolnegro (1).jpg")));
		FondoPantalla.setBounds(0, 0, 884, 650);
		contentPane.add(FondoPantalla);
	}
}
