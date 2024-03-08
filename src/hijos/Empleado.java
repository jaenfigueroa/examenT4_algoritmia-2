package hijos;

import padre.Trabajador;

public class Empleado extends Trabajador {
	// ATRIBUTOS
	private double sueldoBasico, porcentajeBonificacion;

	// CONTRUCTOR
	public Empleado(String nombre, String apellido, String telefono, double sueldoBasico, double porcentajeBonificacion) {
		super(nombre, apellido, telefono);

		this.sueldoBasico = sueldoBasico;
		this.porcentajeBonificacion = porcentajeBonificacion;
	}
	
	// METODOS
	public double bonificacionSoles() {
		return sueldoBasico * porcentajeBonificacion / 100;
	}
	
	public double sueldoBruto() {
		return sueldoBasico + bonificacionSoles();
	}
	
	public String datosCompletos() {
		String datos = "";
		
		datos += super.datosDelTrabajador();
		datos += "Sueldo basico: S/. " + sueldoBasico + "\n";
		datos += "Bonificación en soles: S/. " + bonificacionSoles() + "\n";
		datos += "Sueldo bruto: S/. " + sueldoBruto() + "\n";
		
		return datos;
	}
}
