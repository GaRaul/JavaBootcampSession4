import java.util.Scanner;

public class MetodosArraysApp4 {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Crea una aplicación que nos calcule el factorial de un número pedido por teclado, lo
//		realizara mediante un método al que le pasamos el número como parámetro. Para calcular
//		el factorial, se multiplica los números anteriores hasta llegar a uno. Por ejemplo, si
//		introducimos un 5, realizara esta operación 5*4*3*2*1=120.
		
		int num = pedirDatos();
		mostrarDatos(calcularFactorial(num), num);
		
	}
	
	public static int pedirDatos() {
		System.out.println("De que numero quieres saber el factorial");
		int num = teclado.nextInt();
		
		return num;
	}
	
	public static void mostrarDatos(int factorial, int num) {
		System.out.println("El factorial de " + num + " es = " + factorial);
	}
	
	public static int calcularFactorial(int num) {
		int factorial = num;
		
		for (int i = num-1; i > 0; i--) {
			factorial *= i;
		}
		
		return factorial;
	}
	
}
