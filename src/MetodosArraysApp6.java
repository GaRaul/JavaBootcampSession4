import java.util.Scanner;

public class MetodosArraysApp6 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Crea una aplicaci�n que nos cuente el n�mero de cifras de un n�mero entero positivo
//		(hay que controlarlo) pedido por teclado. Crea un m�todo que realice esta acci�n, pasando
//		el n�mero por par�metro, devolver� el n�mero de cifras
	
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
