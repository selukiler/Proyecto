package Pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class General extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					General frame = new General();
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

	public General() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(General.class.getResource("/Imagenes/Logotop.jpg")));
		setTitle("General");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 804, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton BotonMesa1_ = new JButton("");
		BotonMesa1_.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int j=1;
				
				try {
					x.conectar();
					String sentencia = "SELECT * FROM seleccion_producto WHERE Identificador= '1'";
					ResultSet z = x.ejecutarSelect(sentencia);
					
					if(!z.next()) 
					{
						JOptionPane.showMessageDialog(null, "Mesa vacia o cobrada");
					}
					else {
					total = 0;
					mesa = z.getInt("Identificador");
					total=z.getInt("Precio");
					
					while (z.next()) {
						total += z.getInt("Precio");
					}
					Cobro2 b = new Cobro2();
					b.setVisible(true);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
		BotonMesa1_.setOpaque(false);
		BotonMesa1_.setContentAreaFilled(false);
		BotonMesa1_.setBorderPainted(false);
		BotonMesa1_.setBounds(24, 23, 118, 102);
		contentPane.add(BotonMesa1_);

		JButton BotonMesa2 = new JButton("");
		BotonMesa2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int j=2;
				
				try {
					x.conectar();
					String sentencia = "SELECT * FROM seleccion_producto WHERE Identificador= '2'";
					ResultSet z = x.ejecutarSelect(sentencia);
					
					if(!z.next()) 
					{
						JOptionPane.showMessageDialog(null, "Mesa vacia o cobrada");
					}
					else {
					total = 0;
					total=z.getInt("Precio");
					mesa = 0;
					while (z.next()) {
						mesa = z.getInt("Identificador");
						total += z.getInt("Precio");
					}
					Cobro2 b = new Cobro2();
					b.setVisible(true);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		BotonMesa2.setOpaque(false);
		BotonMesa2.setContentAreaFilled(false);
		BotonMesa2.setBorderPainted(false);
		BotonMesa2.setBounds(191, 23, 118, 102);
		contentPane.add(BotonMesa2);

		JButton BotonMesa3 = new JButton("");
		BotonMesa3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int j=3;
				
				try {
					x.conectar();
					String sentencia = "SELECT * FROM seleccion_producto WHERE Identificador= '3'";
					ResultSet z = x.ejecutarSelect(sentencia);
					
					if(!z.next()) 
					{
						JOptionPane.showMessageDialog(null, "Mesa vacia o cobrada");
					}
					else {
					total = 0;
					total=z.getInt("Precio");
					mesa = 0;
					while (z.next()) {
						mesa = z.getInt("Identificador");
						total += z.getInt("Precio");
					}
					Cobro2 b = new Cobro2();
					b.setVisible(true);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		BotonMesa3.setOpaque(false);
		BotonMesa3.setContentAreaFilled(false);
		BotonMesa3.setBorderPainted(false);
		BotonMesa3.setBounds(360, 23, 118, 102);
		contentPane.add(BotonMesa3);

		JButton BotonMesa4 = new JButton("");
		BotonMesa4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int j=4;
				
				try {
					x.conectar();
					String sentencia = "SELECT * FROM seleccion_producto WHERE Identificador= '4'";
					ResultSet z = x.ejecutarSelect(sentencia);
					
					if(!z.next()) 
					{
						JOptionPane.showMessageDialog(null, "Mesa vacia o cobrada");
					}
					else {
					total = 0;
					total=z.getInt("Precio");
					mesa = 0;
					while (z.next()) {
						mesa = z.getInt("Identificador");
						total += z.getInt("Precio");
					}
					Cobro2 b = new Cobro2();
					b.setVisible(true);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		BotonMesa4.setOpaque(false);
		BotonMesa4.setContentAreaFilled(false);
		BotonMesa4.setBorderPainted(false);
		BotonMesa4.setBounds(579, 23, 118, 102);
		contentPane.add(BotonMesa4);

		JButton BotonMesa5 = new JButton("");
		BotonMesa5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int j=5;
				
				try {
					x.conectar();
					String sentencia = "SELECT * FROM seleccion_producto WHERE Identificador= '5'";
					ResultSet z = x.ejecutarSelect(sentencia);
					
					if(!z.next()) 
					{
						JOptionPane.showMessageDialog(null, "Mesa vacia o cobrada");
					}
					else {
					total = 0;
					total=z.getInt("Precio");
					mesa = 0;
					while (z.next()) {
						mesa = z.getInt("Identificador");
						total += z.getInt("Precio");
					}
					Cobro2 b = new Cobro2();
					b.setVisible(true);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				}
			
		});
		BotonMesa5.setOpaque(false);
		BotonMesa5.setContentAreaFilled(false);
		BotonMesa5.setBorderPainted(false);
		BotonMesa5.setBounds(191, 333, 129, 102);
		contentPane.add(BotonMesa5);

		JButton BotonMesa6 = new JButton("");
		BotonMesa6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int j=6;
				
				try {
					x.conectar();
					String sentencia = "SELECT * FROM seleccion_producto WHERE Identificador= '6'";
					ResultSet z = x.ejecutarSelect(sentencia);
					
					if(!z.next()) 
					{
						JOptionPane.showMessageDialog(null, "Mesa vacia o cobrada");
					}
					else {
					total = 0;
					total=z.getInt("Precio");
					mesa = 0;
					while (z.next()) {
						mesa = z.getInt("Identificador");
						total += z.getInt("Precio");
					}
					Cobro2 b = new Cobro2();
					b.setVisible(true);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		BotonMesa6.setOpaque(false);
		BotonMesa6.setContentAreaFilled(false);
		BotonMesa6.setBorderPainted(false);
		BotonMesa6.setBounds(360, 333, 118, 102);
		contentPane.add(BotonMesa6);

		JButton BotonMesaAlta1 = new JButton("");
		BotonMesaAlta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int j=10;
				
				try {
					x.conectar();
					String sentencia = "SELECT * FROM seleccion_producto WHERE Identificador= '10'";
					ResultSet z = x.ejecutarSelect(sentencia);
					
					if(!z.next()) 
					{
						JOptionPane.showMessageDialog(null, "Mesa vacia o cobrada");
					}
					else {
					total = 0;
					total=z.getInt("Precio");
					mesa = 0;
					while (z.next()) {
						mesa = z.getInt("Identificador");
						total += z.getInt("Precio");
					}
					Cobro2 b = new Cobro2();
					b.setVisible(true);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		BotonMesaAlta1.setOpaque(false);
		BotonMesaAlta1.setContentAreaFilled(false);
		BotonMesaAlta1.setBorderPainted(false);
		BotonMesaAlta1.setBounds(660, 160, 106, 102);
		contentPane.add(BotonMesaAlta1);

		JButton BotonMesaAlta2 = new JButton("");
		BotonMesaAlta2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int j=11;
				
				try {
					x.conectar();
					String sentencia = "SELECT * FROM seleccion_producto WHERE Identificador= '11'";
					ResultSet z = x.ejecutarSelect(sentencia);
					
					if(!z.next()) 
					{
						JOptionPane.showMessageDialog(null, "Mesa vacia o cobrada");
					}
					else {
					total = 0;
					total=z.getInt("Precio");
					mesa = 0;
					while (z.next()) {
						mesa = z.getInt("Identificador");
						total += z.getInt("Precio");
					}
					Cobro2 b = new Cobro2();
					b.setVisible(true);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		BotonMesaAlta2.setOpaque(false);
		BotonMesaAlta2.setContentAreaFilled(false);
		BotonMesaAlta2.setBorderPainted(false);
		BotonMesaAlta2.setBounds(505, 308, 100, 102);
		contentPane.add(BotonMesaAlta2);

		JButton BotonMesa7 = new JButton("");
		BotonMesa7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int j=7;
				
				try {
					x.conectar();
					String sentencia = "SELECT * FROM seleccion_producto WHERE Identificador= '7'";
					ResultSet z = x.ejecutarSelect(sentencia);
					
					if(!z.next()) 
					{
						JOptionPane.showMessageDialog(null, "Mesa vacia o cobrada");
					}
					else {
					total = 0;
					total=z.getInt("Precio");
					mesa = 0;
					while (z.next()) {
						mesa = z.getInt("Identificador");
						total += z.getInt("Precio");
					}
					Cobro2 b = new Cobro2();
					b.setVisible(true);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		BotonMesa7.setOpaque(false);
		BotonMesa7.setContentAreaFilled(false);
		BotonMesa7.setBorderPainted(false);
		BotonMesa7.setBounds(38, 502, 118, 125);
		contentPane.add(BotonMesa7);

		JButton BotonMesa8 = new JButton("");
		BotonMesa8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int j=8;
				
				try {
					x.conectar();
					String sentencia = "SELECT * FROM seleccion_producto WHERE Identificador= '8'";
					ResultSet z = x.ejecutarSelect(sentencia);
					
					if(!z.next()) 
					{
						JOptionPane.showMessageDialog(null, "Mesa vacia o cobrada");
					}
					else {
					total = 0;
					total=z.getInt("Precio");
					mesa = 0;
					while (z.next()) {
						mesa = z.getInt("Identificador");
						total += z.getInt("Precio");
					}
					Cobro2 b = new Cobro2();
					b.setVisible(true);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		BotonMesa8.setOpaque(false);
		BotonMesa8.setContentAreaFilled(false);
		BotonMesa8.setBorderPainted(false);
		BotonMesa8.setBounds(261, 457, 118, 102);
		contentPane.add(BotonMesa8);

		JButton BotonMesa9 = new JButton("");
		BotonMesa9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int j=9;
				
				try {
					x.conectar();
					String sentencia = "SELECT * FROM seleccion_producto WHERE Identificador= '9'";
					ResultSet z = x.ejecutarSelect(sentencia);
					
					if(!z.next()) 
					{
						JOptionPane.showMessageDialog(null, "Mesa vacia o cobrada");
					}
					else {
					total = 0;
					total=z.getInt("Precio");
					mesa = 0;
					while (z.next()) {
						mesa = z.getInt("Identificador");
						total += z.getInt("Precio");
					}
					Cobro2 b = new Cobro2();
					b.setVisible(true);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		BotonMesa9.setOpaque(false);
		BotonMesa9.setContentAreaFilled(false);
		BotonMesa9.setBorderPainted(false);
		BotonMesa9.setBounds(261, 583, 118, 117);
		contentPane.add(BotonMesa9);

		JButton BotonMesaAlta3 = new JButton("");
		BotonMesaAlta3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int j=12;
				
				try {
					x.conectar();
					String sentencia = "SELECT * FROM seleccion_producto WHERE Identificador= '12'";
					ResultSet z = x.ejecutarSelect(sentencia);
					
					if(!z.next()) 
					{
						JOptionPane.showMessageDialog(null, "Mesa vacia o cobrada");
					}
					else {
					total = 0;
					total=z.getInt("Precio");
					mesa = 0;
					while (z.next()) {
						mesa = z.getInt("Identificador");
						total += z.getInt("Precio");
					}
					Cobro2 b = new Cobro2();
					b.setVisible(true);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		BotonMesaAlta3.setOpaque(false);
		BotonMesaAlta3.setContentAreaFilled(false);
		BotonMesaAlta3.setBorderPainted(false);
		BotonMesaAlta3.setBounds(648, 308, 118, 102);
		contentPane.add(BotonMesaAlta3);

		JButton BotonMesaAlta4 = new JButton("");
		BotonMesaAlta4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int j=13;
				
				try {
					x.conectar();
					String sentencia = "SELECT * FROM seleccion_producto WHERE Identificador= '13'";
					ResultSet z = x.ejecutarSelect(sentencia);
					
					if(!z.next()) 
					{
						JOptionPane.showMessageDialog(null, "Mesa vacia o cobrada");
					}
					else {
					total = 0;
					total=z.getInt("Precio");
					mesa = 0;
					while (z.next()) {
						mesa = z.getInt("Identificador");
						total += z.getInt("Precio");
					}
					Cobro2 b = new Cobro2();
					b.setVisible(true);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		BotonMesaAlta4.setOpaque(false);
		BotonMesaAlta4.setContentAreaFilled(false);
		BotonMesaAlta4.setBorderPainted(false);
		BotonMesaAlta4.setBounds(660, 442, 118, 102);
		contentPane.add(BotonMesaAlta4);

		JButton BotonMesaAlta5 = new JButton("");
		BotonMesaAlta5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int j=14;
				
				try {
					x.conectar();
					String sentencia = "SELECT * FROM seleccion_producto WHERE Identificador= '14'";
					ResultSet z = x.ejecutarSelect(sentencia);
					
					if(!z.next()) 
					{
						JOptionPane.showMessageDialog(null, "Mesa vacia o cobrada");
					}
					else {
					total = 0;
					total=z.getInt("Precio");
					mesa = 0;
					while (z.next()) {
						mesa = z.getInt("Identificador");
						total += z.getInt("Precio");
					}
					Cobro2 b = new Cobro2();
					b.setVisible(true);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		BotonMesaAlta5.setOpaque(false);
		BotonMesaAlta5.setContentAreaFilled(false);
		BotonMesaAlta5.setBorderPainted(false);
		BotonMesaAlta5.setBounds(648, 583, 118, 102);
		contentPane.add(BotonMesaAlta5);

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
