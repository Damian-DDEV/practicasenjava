
import java.util.*;

public class Input_Ejemplo1 {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre=entrada.nextLine();
		System.out.println("Introduce tu edad");
		int edad=entrada.nextInt();
		
		System.out.println("Hola," +nombre+ "el doble de tu edad es:" +edad*2);
		
		}

}
