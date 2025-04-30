package Pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

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
	public Restaurante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BotonMesa1 = new JButton("");
		BotonMesa1.setOpaque(false);
		BotonMesa1.setContentAreaFilled(false);
		BotonMesa1.setBorderPainted(false);
		BotonMesa1.setBounds(24, 23, 118, 102);
		contentPane.add(BotonMesa1);
		
		JButton BotonMesa2 = new JButton("");
		BotonMesa2.setOpaque(false);
		BotonMesa2.setContentAreaFilled(false);
		BotonMesa2.setBorderPainted(false);
		BotonMesa2.setBounds(191, 23, 118, 102);
		contentPane.add(BotonMesa2);
		
		JButton BotonMesa3 = new JButton("");
		BotonMesa3.setOpaque(false);
		BotonMesa3.setContentAreaFilled(false);
		BotonMesa3.setBorderPainted(false);
		BotonMesa3.setBounds(360, 23, 118, 102);
		contentPane.add(BotonMesa3);
		
		JButton BotonMesa4 = new JButton("");
		BotonMesa4.setOpaque(false);
		BotonMesa4.setContentAreaFilled(false);
		BotonMesa4.setBorderPainted(false);
		BotonMesa4.setBounds(579, 23, 118, 102);
		contentPane.add(BotonMesa4);
		
		JButton BotonMesa5 = new JButton("");
		BotonMesa5.setOpaque(false);
		BotonMesa5.setContentAreaFilled(false);
		BotonMesa5.setBorderPainted(false);
		BotonMesa5.setBounds(191, 333, 129, 102);
		contentPane.add(BotonMesa5);
		
		JButton BotonMesa6 = new JButton("");
		BotonMesa6.setOpaque(false);
		BotonMesa6.setContentAreaFilled(false);
		BotonMesa6.setBorderPainted(false);
		BotonMesa6.setBounds(360, 333, 118, 102);
		contentPane.add(BotonMesa6);
		
		JButton BotonMesaAlta1 = new JButton("");
		BotonMesaAlta1.setOpaque(false);
		BotonMesaAlta1.setContentAreaFilled(false);
		BotonMesaAlta1.setBorderPainted(false);
		BotonMesaAlta1.setBounds(660, 160, 106, 102);
		contentPane.add(BotonMesaAlta1);
		
		JButton BotonMesaAlta2 = new JButton("");
		BotonMesaAlta2.setOpaque(false);
		BotonMesaAlta2.setContentAreaFilled(false);
		BotonMesaAlta2.setBorderPainted(false);
		BotonMesaAlta2.setBounds(505, 308, 100, 102);
		contentPane.add(BotonMesaAlta2);
		
		JButton BotonMesa7 = new JButton("");
		BotonMesa7.setOpaque(false);
		BotonMesa7.setContentAreaFilled(false);
		BotonMesa7.setBorderPainted(false);
		BotonMesa7.setBounds(38, 502, 118, 125);
		contentPane.add(BotonMesa7);
		
		JButton BotonMesa8 = new JButton("");
		BotonMesa8.setOpaque(false);
		BotonMesa8.setContentAreaFilled(false);
		BotonMesa8.setBorderPainted(false);
		BotonMesa8.setBounds(261, 457, 118, 102);
		contentPane.add(BotonMesa8);
		
		JButton BotonMesa9 = new JButton("");
		BotonMesa9.setOpaque(false);
		BotonMesa9.setContentAreaFilled(false);
		BotonMesa9.setBorderPainted(false);
		BotonMesa9.setBounds(261, 583, 118, 117);
		contentPane.add(BotonMesa9);
		
		JButton BotonMesaAlta3 = new JButton("");
		BotonMesaAlta3.setOpaque(false);
		BotonMesaAlta3.setContentAreaFilled(false);
		BotonMesaAlta3.setBorderPainted(false);
		BotonMesaAlta3.setBounds(648, 308, 118, 102);
		contentPane.add(BotonMesaAlta3);
		
		JButton BotonMesaAlta4 = new JButton("");
		BotonMesaAlta4.setOpaque(false);
		BotonMesaAlta4.setContentAreaFilled(false);
		BotonMesaAlta4.setBorderPainted(false);
		BotonMesaAlta4.setBounds(660, 442, 118, 102);
		contentPane.add(BotonMesaAlta4);
		
		JButton BotonMesaAlta5 = new JButton("");
		BotonMesaAlta5.setOpaque(false);
		BotonMesaAlta5.setContentAreaFilled(false);
		BotonMesaAlta5.setBorderPainted(false);
		BotonMesaAlta5.setBounds(648, 583, 118, 102);
		contentPane.add(BotonMesaAlta5);
		
		JButton btnVolver = new JButton("Volver");
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
