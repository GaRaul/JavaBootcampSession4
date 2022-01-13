import java.util.Scanner;

public class MetodosArraysApp7 {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Crea un aplicación que nos convierta una cantidad de euros introducida por
		// teclado a otra
//		moneda, estas pueden ser a dolares, yenes o libras. El método tendrá como parámetros, la
//		cantidad de euros y la moneda a pasar que sera una cadena, este no devolverá ningún valor,
//		mostrara un mensaje indicando el cambio (void).
//		El cambio de divisas son:
//		•
//		•
//		•
//		0.86 libras es un 1 €
//		1.28611 $ es un 1 €
//		129.852 yenes es un 1 €

		String moneda = pedirMoneda();
		double euros = pedirCantidad();

		calcularMoneda(moneda, euros);

	}

	public static String pedirMoneda() {
		System.out.println("A que moneda quieres convertir");
		String moneda = teclado.next();

		return moneda;
	}

	public static double pedirCantidad() {
		System.out.println("Que cantidad de € quieres convertir");
		double euros = teclado.nextInt();
		return euros;
	}

	public static void calcularMoneda(String moneda, double euros) {
		switch (moneda) {
		case "Libras":
			double libras = euros * 0.86;
			System.out.println(euros + "€ son " + libras + " libras");
			break;
			
		case "Dolares":
			double dolares = euros * 1.28611;
			System.out.println(euros + "€ son " + dolares + " dolares");
			break;
			
		case "Yenes":
			double yenes = euros * 129.852;
			System.out.println(euros + "€ son " + yenes + " yenes");
			break;
			
		default:
			System.out.println("Has introducido mal la moneda");
			break;
		}
	}

}
