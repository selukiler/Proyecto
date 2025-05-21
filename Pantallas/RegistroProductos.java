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
	private JTextField txt_producto;
	private JTextField txt_precio;
	private JTextField txt_descripcion;

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
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(RegistroProductos.class.getResource("/Imagenes/Logotop.jpg")));
		ConexionBasedeDatos.ConexionMySQL x = new ConexionBasedeDatos.ConexionMySQL("root", "", "Registro");

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(RegistroProductos.class.getResource("/Imagenes/Logotop.jpg")));
		logo.setBounds(308, 14, 265, 125);
		contentPane.add(logo);

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

		txt_producto = new JTextField();
		txt_producto.setBounds(347, 238, 189, 32);
		contentPane.add(txt_producto);
		txt_producto.setColumns(10);

		txt_precio = new JTextField();
		txt_precio.setBounds(347, 332, 189, 32);
		contentPane.add(txt_precio);
		txt_precio.setColumns(10);

		txt_descripcion = new JTextField();
		txt_descripcion.setBounds(347, 428, 191, 40);
		contentPane.add(txt_descripcion);
		txt_descripcion.setColumns(10);

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
					String sentencia = "INSERT INTO carta(producto, precio, descripcion) VALUES('"
							+ txt_producto.getText() + "','" + txt_precio.getText() + "','" + txt_descripcion.getText()
							+ "')";
					String nombre = txt_producto.getText();
					String precio = txt_precio.getText();
					String descripcion = txt_descripcion.getText();
					if (nombre.isEmpty() || precio.isEmpty() || descripcion.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Rellene todos los campos para poder registrar");
					}

					else {
						x.ejecutarInsertDeleteUpdate(sentencia);
						dispose();
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
		FondoPantalla.setIcon(new ImageIcon(RegistroProductos.class.getResource("/Imagenes/marmolnegro.jpg")));
		FondoPantalla.setBounds(0, 0, 884, 650);
		contentPane.add(FondoPantalla);
	}
}
