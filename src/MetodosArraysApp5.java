import java.util.Scanner;

public class MetodosArraysApp5 {
	static Scanner teclado = new Scanner(System.in);	
	public static void main(String[] args) {
		// ) Crea una aplicación que nos convierta un número en base decimal a binario. Esto lo
//		realizara un método al que le pasaremos el numero como parámetro, devolverá un String
//		con el numero convertido a binario. Para convertir un numero decimal a binario, debemos
//		dividir entre 2 el numero y el resultado de esa división se divide entre 2 de nuevo hasta que
//		no se pueda dividir mas, el resto que obtengamos de cada división formara el numero
//		binario, de abajo a arriba
		
		int num = pedirDatos();	
		String numBinario = convertirEnBinario(num);
		mostrarDatos(num, numBinario);
		
	}
	
	public static String convertirEnBinario(int num) {
		String numBinario = "";
		int resto;
		char cero = '0';
		char uno = '1';
		
		// StringBuilder da mas opciones para manejar Strings
		StringBuilder str = new StringBuilder(numBinario);
		
		do {
			resto = num % 2;
			num = num / 2;
			
			if (resto == 0) {
				str.append(cero);
			} else if (resto == 1){
				str.append(uno);
			}

		} while (num > 0);
		
		numBinario = str.reverse().toString();
		
		return numBinario;
	}
	
	public static int pedirDatos() {
		System.out.println("Decimal a binario, introduce el numero");
		int num = teclado.nextInt();
		
		return num;
	}
	
	public static void mostrarDatos(int num, String numBinario) {
		System.out.println("El numero " + num + " en binario es: " + numBinario);
	}

}
