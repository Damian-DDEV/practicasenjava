
import javax.swing.*;

public class Bucle_While {

	public static void main(String[] args) {
		
		String clave="pedro";
		
		String pass="";
		
		while (clave.equals(pass)==false) {
			
			pass= JOptionPane.showInputDialog("Introduce una clave");
			
			if (clave.equals(pass)==false) {
				
				System.out.println("clave incorrecta") ;
			}
			
		}
		System.out.println("Bienvenido");
	}

}
