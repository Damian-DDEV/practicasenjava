

public class Ejercicio_2 {

	public static void main(String[] args) {
		String nombre;
		final double salario;
		final double dolar;
		float salario_en_dolares;
		
		nombre= "Manuel";
		salario=  2125.7;
		dolar= 1.137;;
		salario_en_dolares=(float) (salario*dolar);
		
		System.out.println("El salario de " + nombre + " " + "en dolares es:" + salario_en_dolares) ;
		
	}

}
