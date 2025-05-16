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
import java.awt.Font;
import java.awt.Toolkit;

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
		setTitle("Registrar productos");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistroProductos.class.getResource("/Imagenes/Logotop.jpg")));
		ConexionBasedeDatos.ConexionMySQL x = new ConexionBasedeDatos.ConexionMySQL("root", "", "Registro");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Descripcion = new JLabel("Descripcion");
		Descripcion.setFont(new Font("Tahoma", Font.BOLD, 14));
		Descripcion.setBounds(403, 395, 78, 14);
		contentPane.add(Descripcion);
		
		JLabel Precio = new JLabel("Precio");
		Precio.setFont(new Font("Tahoma", Font.BOLD, 14));
		Precio.setBounds(419, 292, 46, 14);
		contentPane.add(Precio);
		
		JLabel Producto = new JLabel("Producto");
		Producto.setFont(new Font("Tahoma", Font.BOLD, 14));
		Producto.setBounds(405, 195, 73, 14);
		contentPane.add(Producto);
		
		textField = new JTextField();
		textField.setBounds(347, 238, 189, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(347, 332, 189, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(346, 424, 191, 44);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel CuadroChico1 = new JLabel("");
		CuadroChico1.setIcon(new ImageIcon(RegistroProductos.class.getResource("/Imagenes/CajaTextoChico.png")));
		CuadroChico1.setBounds(329, 215, 225, 77);
		contentPane.add(CuadroChico1);
		
		JLabel CuadroChico1_1 = new JLabel("");
		CuadroChico1_1.setIcon(new ImageIcon(RegistroProductos.class.getResource("/Imagenes/CajaTextoChico.png")));
		CuadroChico1_1.setBounds(329, 303, 225, 93);
		contentPane.add(CuadroChico1_1);
		
		JLabel CuadroChico1_2 = new JLabel("");
		CuadroChico1_2.setIcon(new ImageIcon(RegistroProductos.class.getResource("/Imagenes/CajaTextoChico.png")));
		CuadroChico1_2.setBounds(329, 395, 225, 105);
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
		lblNewLabel_1.setIcon(new ImageIcon(RegistroProductos.class.getResource("/Imagenes/inicio 2.0.png")));
		lblNewLabel_1.setBounds(291, 150, 301, 436);
		contentPane.add(lblNewLabel_1);
		
		JLabel FondoPantalla = new JLabel("");
		FondoPantalla.setIcon(new ImageIcon(RegistroProductos.class.getResource("/Imagenes/fondoelegante.jpg")));
		FondoPantalla.setBounds(0, 0, 884, 650);
		contentPane.add(FondoPantalla);
	}
}
