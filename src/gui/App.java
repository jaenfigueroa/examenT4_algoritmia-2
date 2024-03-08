package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import hijos.Contratado;
import hijos.Empleado;
import padre.Trabajador;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;

public class App extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea ta_salida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
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
	public App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 507);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_procesar = new JButton("Procesar");
		btn_procesar.setFont(new Font("Arial", Font.BOLD, 12));
		btn_procesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
				
				Empleado empleado = new Empleado("Jose", "Figueroa", "916458785", 2500, 5 );
				Contratado contratado = new Contratado("Maria", "Salvatore", "931332854", 168, 10);
				
				mostrarDatos(empleado);
				mostrarDatos(contratado);
			}
		});
		btn_procesar.setBounds(10, 10, 130, 35);
		contentPane.add(btn_procesar);
		
		ta_salida = new JTextArea();
		ta_salida.setFont(new Font("Arial", Font.PLAIN, 16));
		ta_salida.setBounds(10, 55, 384, 405);
		contentPane.add(ta_salida);
	}
	
	// METODOS	
	public void imprimir(String texto) {
		ta_salida.append(texto);
	}
	
	public void limpiar() {
		ta_salida.setText("");
	}
	
	public void mostrarDatos(Empleado e) {
		String datos = ">>>>>>>>> EMPLEADO <<<<<<<<<\n\n";
		datos += e.datosCompletos() + "\n";
		
		imprimir(datos);
	}
	
	public void mostrarDatos(Contratado c) {
		String datos = ">>>>>>>>> CONTRATADO <<<<<<<<<\n\n";
		datos += c.datosCompletos() + "\n";
		
		imprimir(datos);
	}
}
