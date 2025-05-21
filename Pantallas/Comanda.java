package Pantallas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;

public class Comanda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Comanda frame = new Comanda();
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
	ConexionBasedeDatos.ConexionMySQL x = new ConexionBasedeDatos.ConexionMySQL("root", "", "Registro");

	public Comanda() {
		setTitle("Comanda");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Comanda.class.getResource("/Imagenes/Logotop.jpg")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 804, 692);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JLabel txt_comanda = new JLabel("Comanda");
		txt_comanda.setForeground(new Color(255, 255, 255));
		txt_comanda.setBackground(new Color(255, 255, 255));
		txt_comanda.setFont(new Font("Tahoma", Font.BOLD, 14));
		txt_comanda.setBounds(365, 236, 72, 14);
		contentPane.add(txt_comanda);

		JLabel logo_1 = new JLabel("New label");
		logo_1.setIcon(new ImageIcon(Comanda.class.getResource("/Imagenes/Logotop.jpg")));
		logo_1.setBounds(265, 68, 265, 115);
		contentPane.add(logo_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(265, 261, 258, 130);
		getContentPane().add(scrollPane);

		String[] productos = null;

		try {
			int contador = 0;
			x.conectar();
			String sentencia = "SELECT producto FROM carta";
			ResultSet z = x.ejecutarSelect(sentencia);

			while (z.next()) {
				contador++;
			}

			contentPane.setLayout(null);
			productos = new String[contador];
			ResultSet y = x.ejecutarSelect(sentencia);

			for (int i = 0; i < productos.length; i++) {
				y.next();
				productos[i] = y.getString("producto");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		JList<String> txt_carta = new JList<>(productos);
		scrollPane.setViewportView(txt_carta);
		txt_carta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		JButton btn_agregarmesa = new JButton("Agregar");
		btn_agregarmesa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ArrayList<String> seleccionados = (ArrayList<String>) txt_carta.getSelectedValuesList();
				for (String u : seleccionados) {

					try {
						x.conectar();
						String busqueda = "SELECT * FROM carta WHERE producto = '" + u + "'";
						ResultSet w = x.ejecutarSelect(busqueda);
						w.next();
						String busqueda2 = "INSERT INTO seleccion_producto (Identificador, Producto, Precio) VALUES ('"
								+ Mesas.mesa + "', '" + w.getString("Producto") + "','" + w.getInt("Precio") + "')";
						x.ejecutarInsertDeleteUpdate(busqueda2);
						dispose();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}

			}
		});
		btn_agregarmesa.setBounds(349, 425, 89, 23);
		contentPane.add(btn_agregarmesa);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Comanda.class.getResource("/Imagenes/marmolnegro.jpg")));
		lblNewLabel.setBounds(0, 0, 788, 661);
		contentPane.add(lblNewLabel);

	}
}
