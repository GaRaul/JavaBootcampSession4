import java.util.Scanner;

public class MetodosArraysApp6 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Crea una aplicación que nos cuente el número de cifras de un número entero positivo
//		(hay que controlarlo) pedido por teclado. Crea un método que realice esta acción, pasando
//		el número por parámetro, devolverá el número de cifras
	
		int num = pedirDatos();
		int cifras = contarCifras(num);
		mostrarDatos(num, cifras);
	}
	
	public static int contarCifras(int num) {
		int contador = 0;
		
		while (num > 0) {
			num /= 10;
			contador++;
		}
		
		return contador;
	}
	
	public static int pedirDatos() {
		System.out.println("Introduce el numero para saber la cantidad de cifras");
		int num = teclado.nextInt();
		
		return num;
	}

	public static void mostrarDatos(int num, int cifras) {
		System.out.println("El numero " + num + " tiene " + cifras + " cifras");
	}
}
