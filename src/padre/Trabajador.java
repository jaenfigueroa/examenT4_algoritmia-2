package padre;

public class Trabajador {
	// ATRIBUTOS
	protected String nombre, apellido, telefono;

	// CONTRUCTOR
	public Trabajador(String nombre, String apellido, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}
	
	// METODOS
	public String codigoGenerado() {
		String primer_caracter = nombre.charAt(0) + "";
		String ultimo_caracter = apellido.charAt(apellido.length() - 1) + "";
		
		String codigo = primer_caracter + ultimo_caracter + telefono;
		return codigo;
	}
	
	public String datosDelTrabajador() {
		String datos = "";
		
		datos += "Codigo generado: " + codigoGenerado() + "\n";
		datos += "Nombre: " + nombre + "\n";
		datos += "Apellido: " + apellido + "\n";
		datos += "Telefono: " + telefono + "\n";
		
		return datos;
	}
}
