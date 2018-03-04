package interfaces_1;


public class MainPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personas al = new Alumnos("Luzmila",2000,100,"Primero");
		Personas pr = new Profesores (1500.0,"Jonay",1977,80);
		
		System.out.println(al.toString()+". Tiene un descuento en secretaria por su compra de "+
				al.calculaDescuento()+"€");
		
		System.out.println(pr.toString()+". Tiene un descuento en secretaria por su compra de "+
		pr.calculaDescuento()+"€");
		

	}

}
