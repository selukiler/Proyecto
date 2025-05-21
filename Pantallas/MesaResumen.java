package Pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Toolkit;

public class MesaResumen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MesaResumen frame = new MesaResumen();
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
	public MesaResumen() {
		setTitle("Resumen de mesa");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MesaResumen.class.getResource("/Imagenes/Logotop.jpg")));
		ConexionBasedeDatos.ConexionMySQL x = new ConexionBasedeDatos.ConexionMySQL("root", "", "Registro");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea text_resumen = new JTextArea();
		text_resumen.setBackground(new Color(255, 255, 255));
		text_resumen.setFont(new Font("Calibri", Font.BOLD, 28));
		text_resumen.setBounds(197, 119, 489, 423);
		contentPane.add(text_resumen);
		text_resumen.setText(Restaurante.mensaje);

		JButton btn_generarcuenta = new JButton("Generar Cuenta");
		btn_generarcuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					x.conectar();
					if (Restaurante.total == 0) {
						JOptionPane.showMessageDialog(null, "Mesa vacia o cobrada");
					} else {
						Cobro c = new Cobro();
						c.setVisible(true);
						dispose();
					}

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btn_generarcuenta.setBounds(343, 559, 197, 44);
		contentPane.add(btn_generarcuenta);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MesaResumen.class.getResource("/Imagenes/marmolnegro.jpg")));
		lblNewLabel.setBounds(0, 0, 884, 661);
		contentPane.add(lblNewLabel);

	}
}
