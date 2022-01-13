import java.util.Iterator;
import java.util.Scanner;

public class MetodosArraysApp9 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Crea un array de números donde le indicamos por teclado el tamaño del array,
//		rellenaremos el array con números aleatorios entre 0 y 9. Al final muestra por pantalla el
//		valor de cada posición y la suma de todos los valores.
//		Tareas a realizar: Haz un método para rellenar el array(que tenga como parámetros los 
//		números entre los que tenga que generar) y otro para mostrar el contenido y la suma del
//		array

		int dimension = pedirDimension();
		int min = pedirMin();
		int max = pedirMax();
		
		int nums[] = new int[dimension];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rellenarArray(min, max);
		}
		
		mostrarArray(nums);
		
	}

	public static int rellenarArray(int min, int max) {
		int num;
		int rango;
		
		rango = (max - min) + 1;
		num = (int)(Math.random() * rango) + min;
		
		return num;
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
