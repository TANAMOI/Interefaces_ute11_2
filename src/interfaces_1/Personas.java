package interfaces_1;

public abstract class Personas {
	
	private String nombre;
	private int anyoNacimiento;
	private int productos;
	
	public Personas () {//constructor de la clase vacio
		
	}

	public Personas (String nombre, int anyoNacimiento,int productos) {//constructor al que le pasamos dos parametros
		
		this.nombre = nombre;
		this.anyoNacimiento = anyoNacimiento;
		this.productos=productos;
		
	}

	/**
	 * @return the productos
	 */
	public int getProductos() {
		return productos;
	}

	/**
	 * @param productos the productos to set
	 */
	public void setProductos(int productos) {
		this.productos = productos;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the anyoNacimiento
	 */
	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}

	/**
	 * @param anyoNacimiento the anyoNacimiento to set
	 */
	public void setAnyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}
	
	public abstract double calculaDescuento();

	

	
	}
	


