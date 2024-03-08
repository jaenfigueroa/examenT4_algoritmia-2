package hijos;

import padre.Trabajador;

public class Contratado extends Trabajador {
	// ATRIBUTOS
	private double horas, tarifaHora;

	// CONTRUCTOR
	public Contratado(String nombre, String apellido, String telefono, double horas, double tarifaHora) {
		super(nombre, apellido, telefono);

		this.horas = horas;
		this.tarifaHora = tarifaHora;
	}
	
	// METODOS
	public double sueldoBruto() {
		return horas * tarifaHora;
	}
	
	public String datosCompletos() {
		String datos = "";
		datos += super.datosDelTrabajador();
		datos += "Sueldo bruto: S/. " + sueldoBruto() + "\n";
		
		return datos;
	}
}
