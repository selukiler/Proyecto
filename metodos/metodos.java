package metodos;

import java.sql.ResultSet;

import java.sql.SQLException;

import Pantallas.Cobro2;
import Pantallas.mesas_cobro;
import Pantallas.MesaResumen;
import Pantallas.Restaurante;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

public class metodos{

	public void mesas(int a) 
	{
		ConexionBasedeDatos.ConexionMySQL x = new ConexionBasedeDatos.ConexionMySQL("root", "", "Registro");

		try {
			x.conectar();
			String sentencia = "SELECT * FROM seleccion_producto WHERE Identificador= '"+a+"'";
			ResultSet z = x.ejecutarSelect(sentencia);
			Restaurante.total = 0;
			Restaurante.mesa = 0;
			String Producto = "";
			Restaurante.mensaje = "           Producto      " + "              Precio";
			while (z.next()) {

				Restaurante.mensaje += "\n          " + z.getString("Producto") + "                      "
						+ z.getInt("Precio");
				Restaurante.total += z.getInt("Precio");
				Restaurante.mesa = z.getInt("Identificador");
				

			}
			MesaResumen y = new MesaResumen();
			y.setVisible(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	public void resumencobro(int v) 
	{
		ConexionBasedeDatos.ConexionMySQL x = new ConexionBasedeDatos.ConexionMySQL("root", "", "Registro");
		

		try {
			x.conectar();
			String sentencia = "SELECT * FROM seleccion_producto WHERE Identificador= '"+v+"'";
			ResultSet z = x.ejecutarSelect(sentencia);
			
			if(!z.next()) 
			{
				JOptionPane.showMessageDialog(null, "Mesa vacia o cobrada");
			}
			else {
			mesas_cobro.total = 0;
			mesas_cobro.mesa= z.getInt("Identificador");
			mesas_cobro.total=z.getInt("Precio");
			
			while (z.next()) {
				mesas_cobro.total += z.getInt("Precio");
			}
			Cobro2 b = new Cobro2();
			b.setVisible(true);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	
	}

