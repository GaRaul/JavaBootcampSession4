import java.util.Scanner;

public class MetodosArraysApp12 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Crea un array de números de un tamaño pasado por teclado, el array contendrá
//		números aleatorios entre 1 y 300 y mostrará aquellos números que acaben en un dígito que
//		nosotros le indiquemos por teclado (debes controlar que se introduce un numero correcto),
//		estos deben guardarse en un nuevo array.
//		Por ejemplo, en un array de 10 posiciones le indicamos mostrar los números acabados en 5,
//		podría salir 155, 25, etc

		int[] nums = new int[pedirDimension()];
		int digitoFinal = pedirDigito();
		
		nums = rellenarArray(nums);
		
		int[] numsConDigitoFinal = rellenarArrayConDigitoFinal(digitoFinal, nums);
		
		mostrarArrays(nums, numsConDigitoFinal, digitoFinal);

	}

	public static int[] rellenarArray(int[] nums) {
		int min = 1;
		int max = 300;
		int rango;
		rango = (max - min) + 1;

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * rango) + min;
		}

		return nums;
	}

	public static int[] rellenarArrayConDigitoFinal(int digito, int[] nums) {
		int contador = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (ultimoDigito(nums[i]) == digito) {
				contador++;
			}
		}
		
		int[] numsConDigitoFinal = new int[contador];
		contador = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (ultimoDigito(nums[i]) == digito) {
				numsConDigitoFinal[contador] = nums[i];
				contador++;
			}
		}
		
		return numsConDigitoFinal;
	}

	// El resto de cualquier numero entre 10 es su ultimo digito
	public static int ultimoDigito(int num) {
		num = num % 10;

		return num;
	}

	public static int pedirDimension() {
		System.out.println("Dimension del array");
		int num = teclado.nextInt();

		return num;
	}

	public static int pedirDigito() {
		int num;
		do {
			System.out.println("Digito final entre 0 y 9");
			num = teclado.nextInt();
		} while (num > 9 || num < 0);

		return num;
	}
	
	public static void mostrarArrays(int[] nums, int[] numsConMismoDigitoFinal, int digito) {
		
		System.out.println("Array completo");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("---------\nArray con numeros terminados en " + digito);
		
		for (int i = 0; i < numsConMismoDigitoFinal.length; i++) {
			System.out.println(numsConMismoDigitoFinal[i]);
		}
		
	}
}
