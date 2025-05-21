package Pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import metodos.metodos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Restaurante extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurante frame = new Restaurante();
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
	public static String mensaje = "";
	public static int total = 0;
	public static int mesa = 0;
	ConexionBasedeDatos.ConexionMySQL x = new ConexionBasedeDatos.ConexionMySQL("root", "", "Registro");
	metodos metodo = new metodos();

	public Restaurante() {

////////////////////////////////////////////////////////////////////////////////////AJUSTES DE PANTALLA////////////////////////////////////////////////////////////////////////////////////
		setIconImage(Toolkit.getDefaultToolkit().getImage(Restaurante.class.getResource("/Imagenes/Logotop.jpg")));
		setTitle("Mapa restaurante");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 804, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

/////////////////////////////////////////////////////////////////////////////////////MULTIPLES BOTONES/////////////////////////////////////////////////////////////////////////////////////
		JButton btn_mesa1 = new JButton("");
		btn_mesa1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mesa = 1;
				metodo.mesas(mesa);
			}
		});
		btn_mesa1.setOpaque(false);
		btn_mesa1.setContentAreaFilled(false);
		btn_mesa1.setBorderPainted(false);
		btn_mesa1.setBounds(24, 23, 118, 102);
		contentPane.add(btn_mesa1);

		JButton btn_mesa2 = new JButton("");
		btn_mesa2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mesa = 2;
				metodo.mesas(mesa);
			}
		});
		btn_mesa2.setOpaque(false);
		btn_mesa2.setContentAreaFilled(false);
		btn_mesa2.setBorderPainted(false);
		btn_mesa2.setBounds(191, 23, 118, 102);
		contentPane.add(btn_mesa2);

		JButton btn_mesa3 = new JButton("");
		btn_mesa3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mesa = 3;
				metodo.mesas(mesa);
			}
		});
		btn_mesa3.setOpaque(false);
		btn_mesa3.setContentAreaFilled(false);
		btn_mesa3.setBorderPainted(false);
		btn_mesa3.setBounds(360, 23, 118, 102);
		contentPane.add(btn_mesa3);

		JButton btn_mesa4 = new JButton("");
		btn_mesa4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mesa = 4;
				metodo.mesas(mesa);
			}
		});
		btn_mesa4.setOpaque(false);
		btn_mesa4.setContentAreaFilled(false);
		btn_mesa4.setBorderPainted(false);
		btn_mesa4.setBounds(579, 23, 118, 102);
		contentPane.add(btn_mesa4);

		JButton btn_mesa5 = new JButton("");
		btn_mesa5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mesa = 5;
				metodo.mesas(mesa);
			}
		});
		btn_mesa5.setOpaque(false);
		btn_mesa5.setContentAreaFilled(false);
		btn_mesa5.setBorderPainted(false);
		btn_mesa5.setBounds(191, 333, 129, 102);
		contentPane.add(btn_mesa5);

		JButton btn_mesa6 = new JButton("");
		btn_mesa6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mesa = 6;
				metodo.mesas(mesa);
			}
		});
		btn_mesa6.setOpaque(false);
		btn_mesa6.setContentAreaFilled(false);
		btn_mesa6.setBorderPainted(false);
		btn_mesa6.setBounds(360, 333, 118, 102);
		contentPane.add(btn_mesa6);

		JButton btn_mesa7 = new JButton("");
		btn_mesa7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mesa = 7;
				metodo.mesas(mesa);
			}
		});
		btn_mesa7.setOpaque(false);
		btn_mesa7.setContentAreaFilled(false);
		btn_mesa7.setBorderPainted(false);
		btn_mesa7.setBounds(38, 502, 118, 125);
		contentPane.add(btn_mesa7);

		JButton btn_mesa8 = new JButton("");
		btn_mesa8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mesa = 8;
				metodo.mesas(mesa);
			}
		});
		btn_mesa8.setOpaque(false);
		btn_mesa8.setContentAreaFilled(false);
		btn_mesa8.setBorderPainted(false);
		btn_mesa8.setBounds(261, 457, 118, 102);
		contentPane.add(btn_mesa8);

		JButton btn_mesa9 = new JButton("");
		btn_mesa9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mesa = 9;
				metodo.mesas(mesa);
			}
		});
		btn_mesa9.setOpaque(false);
		btn_mesa9.setContentAreaFilled(false);
		btn_mesa9.setBorderPainted(false);
		btn_mesa9.setBounds(261, 583, 118, 117);
		contentPane.add(btn_mesa9);

		JButton btn_mesa10 = new JButton("");
		btn_mesa10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mesa = 10;
				metodo.mesas(mesa);
			}
		});
		btn_mesa10.setOpaque(false);
		btn_mesa10.setContentAreaFilled(false);
		btn_mesa10.setBorderPainted(false);
		btn_mesa10.setBounds(660, 160, 106, 102);
		contentPane.add(btn_mesa10);

		JButton btn_mesa11 = new JButton("");
		btn_mesa11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mesa = 11;
				metodo.mesas(mesa);
			}
		});
		btn_mesa11.setOpaque(false);
		btn_mesa11.setContentAreaFilled(false);
		btn_mesa11.setBorderPainted(false);
		btn_mesa11.setBounds(505, 308, 100, 102);
		contentPane.add(btn_mesa11);

		JButton btn_mesa12 = new JButton("");
		btn_mesa12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mesa = 12;
				metodo.mesas(mesa);
			}
		});
		btn_mesa12.setOpaque(false);
		btn_mesa12.setContentAreaFilled(false);
		btn_mesa12.setBorderPainted(false);
		btn_mesa12.setBounds(648, 308, 118, 102);
		contentPane.add(btn_mesa12);

		JButton btn_mesa13 = new JButton("");
		btn_mesa13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mesa = 13;
				metodo.mesas(mesa);
			}
		});
		btn_mesa13.setOpaque(false);
		btn_mesa13.setContentAreaFilled(false);
		btn_mesa13.setBorderPainted(false);
		btn_mesa13.setBounds(660, 442, 118, 102);
		contentPane.add(btn_mesa13);

		JButton btn_mesa14 = new JButton("");
		btn_mesa14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mesa = 14;
				metodo.mesas(mesa);
			}
		});
		btn_mesa14.setOpaque(false);
		btn_mesa14.setContentAreaFilled(false);
		btn_mesa14.setBorderPainted(false);
		btn_mesa14.setBounds(648, 583, 118, 102);
		contentPane.add(btn_mesa14);

		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVolver.setOpaque(false);
		btnVolver.setContentAreaFilled(false);
		btnVolver.setBorderPainted(false);
		btnVolver.setBounds(0, 225, 118, 227);
		contentPane.add(btnVolver);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Restaurante.class.getResource("/Imagenes/DistribucionBarEscalado.png")));
		lblNewLabel.setBounds(0, 0, 864, 700);
		contentPane.add(lblNewLabel);
	}

}
