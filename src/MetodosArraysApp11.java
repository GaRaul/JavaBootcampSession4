import java.util.Iterator;
import java.util.Scanner;

public class MetodosArraysApp11 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Crea dos arrays de n�meros con la dimensi�n pasada por teclado.
//		Uno de ellos estar� rellenado con n�meros aleatorios y el otro apuntara al array anterior,
//		reasigna los valores del segundo array con valores aleatorios.
//		Despu�s, crea un m�todo que tenga como par�metros, los dos arrays y devuelva uno nuevo
//		con la multiplicaci�n de la posici�n 0 del array1 con el del array2 y as� sucesivamente.
//		Por �ltimo, muestra el contenido de cada array

		// Declaro dos arrays
		int[] nums = new int[pedirDimension()];
		int[] nums2 = nums.clone();
		
		// Relleno ambos arrays con numeros aleatorios
		nums = rellenarArray(nums);
		nums2 = rellenarArray(nums2);
		
		// Declaro un tercer array y lo relleno con la multiplicacion entre los dos anteriores
		int[] nums3 = multiplicacionArrays(nums, nums2);
		
		// Los muestro por consola
		mostrarDatos(nums, nums2, nums3);
		
	}

	public static int[] rellenarArray(int[] nums) {
		int min = 1;
		int max = 10;
		int rango;
		rango = (max - min) + 1;
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * rango) + min;
		}

		return nums;
	}

	public static int pedirDimension() {
		System.out.println("Dimension del array");
		int num = teclado.nextInt();

		return num;
	}
	
	public static int[] multiplicacionArrays(int[] nums, int[] nums2) {
		int nums3[] = new int[nums.length];
		
		for (int i = 0; i < nums3.length; i++) {
			nums3[i] = nums[i] * nums2[i]; 
		}
		
		return nums3;
	}
	
	public static void mostrarDatos(int[] nums, int[] nums2, int[] nums3) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(i + ". [" + nums[i] + "] * [" + nums2[i] + "] = [" + nums3[i] + "]");
		}
	}

}
