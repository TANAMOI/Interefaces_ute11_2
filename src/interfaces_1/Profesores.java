package interfaces_1;

public class Profesores extends Personas {
	
	@Override
	public double calculaDescuento() {
		return super.getProductos()*0.02;
	}
private double salario;
	
	public Profesores() {
		super();
		
	}
	public Profesores (double salar,String nombre,int anyoNacimiento,int productos) {
		
		super(nombre, anyoNacimiento,productos);
		salario = salar;
		
	}
	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String toString() {
		
		return "El nombre del profesor/a es " + super.getNombre()+ " nacido/a en "+super.getAnyoNacimiento()
		+", tiene un salario Cip de "+salario+"€";
	}
	
}
	


