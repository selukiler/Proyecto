package Pantallas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Toolkit;

public class Cobro2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_total2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cobro2 frame = new Cobro2();
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
	ConexionBasedeDatos.ConexionMySQL x = new ConexionBasedeDatos.ConexionMySQL("root", "", "Registro");

	public Cobro2() {
		setTitle("cobro");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Cobro2.class.getResource("/Imagenes/Logotop.jpg")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btn_pago2 = new JButton("Pagar");
		btn_pago2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_pago2.setBackground(SystemColor.info);
		btn_pago2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					x.conectar();
					String sentencia = "DELETE FROM seleccion_producto WHERE Identificador= '" + mesas_cobro.mesa + "'";
					x.ejecutarInsertDeleteUpdate(sentencia);
					dispose();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btn_pago2.setBounds(343, 476, 197, 55);
		contentPane.add(btn_pago2);

		txt_total2 = new JTextField();
		txt_total2.setHorizontalAlignment(SwingConstants.CENTER);
		txt_total2.setFont(new Font("Calibri", Font.BOLD, 77));
		txt_total2.setBackground(new Color(255, 255, 255));
		txt_total2.setBounds(305, 280, 254, 101);
		contentPane.add(txt_total2);
		txt_total2.setColumns(10);
		txt_total2.setText(Integer.toString(mesas_cobro.total) + "€");

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Cobro2.class.getResource("/Imagenes/marmolnegro.jpg")));
		lblNewLabel.setBounds(0, 0, 884, 661);
		contentPane.add(lblNewLabel);

	}
}
