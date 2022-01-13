import java.util.Iterator;
import java.util.Scanner;

public class MetodosArraysApp8 {
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos por teclado.
		// Muestra por
//		consola el indice y el valor al que corresponde. Haz dos métodos, uno para rellenar valores y
//		otro para mostrar.

		int nums[] = new int[10];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rellenarArray();
		}
		
		mostrarArray(nums);
		
	}

	public static int rellenarArray() {
		int num;
		
		System.out.println("Introduce un numero");
		num = teclado.nextInt();
		
		return num;
		
	}

	public static void mostrarArray(int nums[]) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Posicion [" + i + "] Valor [" + nums[i] + "]");
		}
	}
}
