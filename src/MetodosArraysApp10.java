import java.util.Iterator;
import java.util.Scanner;

public class MetodosArraysApp10 {
	static Scanner teclado = new Scanner(System.in);
	
//	Crea un array de números de un tamaño pasado por teclado, el array contendrá
//	números aleatorios primos entre los números deseados, por último nos indicar cual es el
//	mayor de todos.
//	Haz un método para comprobar que el número aleatorio es primo, puedes hacer todos lo
//	métodos que necesites.

	public static void main(String[] args) {


		int dimension = pedirDimension();
		int min = pedirMin();
		int max = pedirMax();
		
		int nums[] = new int[dimension];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rellenarArray(min, max);
		}
		
		mostrarArray(nums);
		numeroMayor(nums);
	}

	public static int rellenarArray(int min, int max) {
		int num;
		int rango;
		rango = (max - min) + 1;
		do {
			num = (int)(Math.random() * rango) + min;
			
		} while (!esPrimo(num));
		
		return num;
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
	
	public static int numeroMayor(int nums[]) {
		int numMayor = nums[0];
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > numMayor) {
				numMayor = nums[i];
			}
		}
		
		System.out.println("El valor mas alto es: " + numMayor);
		
		return numMayor;
	}
	
	public static int pedirDimension() {
		System.out.println("Introduce que dimension quieres que tenga el array");
		int dimension = teclado.nextInt();
		return dimension;
	}
	
	public static int pedirMin() {
		System.out.println("Introduce el minimo");
		int min = teclado.nextInt();
		return min;
	}
	
	public static int pedirMax() {
		System.out.println("Introduce el maximo");
		int max = teclado.nextInt();
		return max;
	}
	
	public static void mostrarArray(int nums[]) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Posicion [" + i + "] Valor [" + nums[i] + "]" );
		}
	}
	
}
