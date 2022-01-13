import java.util.Scanner;

public class MetodosArraysApp2 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		//  Crea una aplicaci�n que nos genere una cantidad de n�meros enteros aleatorios que
//		nosotros le pasaremos por teclado. Crea un m�todo donde pasamos como par�metros entre
//		que n�meros queremos que los genere, podemos pedirlas por teclado antes de generar los
//		n�meros. Este m�todo devolver� un n�mero entero aleatorio. Muestra estos n�meros por
//		pantalla.
		
		System.out.println("Introduce la cantidad de numeros aleatorios que quieres generar");
		int cantidad = teclado.nextInt();
		
		System.out.println("Rango\nMinimo:");
		int min = teclado.nextInt();
		System.out.println("Maximo:");
		int max = teclado.nextInt();
		
		int numeros[] = new int[cantidad];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = generarNum(min, max);
			System.out.println(numeros[i]);
		}
		
	}
	
	public static int generarNum(int min, int max) {
		int num;
		int rango;
		
		rango = (max - min) + 1;
		
		num = (int)(Math.random() * rango) + min;
		
		return num;
	}

}
