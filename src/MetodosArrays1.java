import java.util.Iterator;
import java.util.Scanner;

public class MetodosArrays1 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Crea una aplicación que nos pida un número por teclado y con un método se lo pasamos
//		por parámetro para que nos indique si es o no un número primo, debe devolver true si es
//		primo sino false.
//		Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
//		primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
		
		int num;
		
		num = pedirDatos();
		resultado(esPrimo(num), num);

	}
	
	public static boolean esPrimo(int num) {
		boolean esPrimo = true;
		
		for (int i = 2; i < num/2; i++) {
			if (num % i == 0) {
				esPrimo = false;
			}
			
			if (!esPrimo) {
				return esPrimo;
			}
		}
		
		return esPrimo;
	}
	
	public static void resultado(boolean esPrimo, int num) {
		
		if (esPrimo) {
			System.out.println(num + " ES PRIMO");
		} else {
			System.out.println(num + " NO ES PRIMO");
		}
		
	}
	
	public static int pedirDatos() {
		System.out.println("Que numero quieres comprobar");
		int num = teclado.nextInt();
		
		return num;
	}

}
