package interfaces_1;

public class Alumnos extends Personas {
	
private String curso;
	
	public Alumnos() {
		super();
		
	}
	public Alumnos (String nombre, int anyoNacimiento,int productos,String curso) {
		
		super(nombre,anyoNacimiento,productos);
		this.curso=curso;
		
	}
	/**
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}
	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String toString() {
		return "El nombre del alumno/a es "+ super.getNombre()+ " y esta cursando "+ getCurso() + ". Su "
				+ "año de nacimiento es: "+super.getAnyoNacimiento();
	}
	@Override public double calculaDescuento() {
		return super.getProductos()*0.10;
	}

}
