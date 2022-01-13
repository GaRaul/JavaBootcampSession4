import java.util.Scanner;

public class MetodosArraysApp2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo. Pediremos
//		que figura queremos calcular su área y según lo introducido pedirá los valores necesarios
//		para calcular el área. Crea un método por cada figura para calcular cada área, este devolverá
//		un número real. Muestra el resultado por pantalla.
//		Aquí te mostramos que necesita cada figura:
//		•
//		•
//		•
//		Circulo: (radio^2)*PI
//		Triangulo: (base * altura) / 2
//		Cuadrado: lado * lado
		
		System.out.println("Introduce la figura de la que quieres saber el area");
		System.out.println("[Circulo]\n[Triangulo]\n[Cuadrado]");
		String figura = teclado.next();
		
		double resultado = 0;
		
		switch (figura) {
		case "Circulo":
			System.out.println("Introduce el radio");
			double radio = teclado.nextDouble();
			resultado = areaCirculo(radio);
			break;
		case "Triangulo":
			System.out.println("Introduce la base");
			double base = teclado.nextDouble();
			System.out.println("introduce la altura");
			double altura = teclado.nextDouble();
			resultado = areaTriangulo(base, altura);
			break;
		case "Cuadrado":
			System.out.println("Introduce el lado");
			double lado = teclado.nextDouble();
			resultado = areaCuadrado(lado);
			break;
		default:
			System.out.println("Error al introducir los datos");
			break;
		}
		
		System.out.println("El area es: " + resultado);
	}
	
	public static double areaCirculo(double radio) {
		
		double resultado = Math.pow(radio, 2)*Math.PI;
		
		return resultado;
	}
	
	public static double areaTriangulo(double base, double altura) {
		
		double resultado = (base * altura) / 2;
		
		return resultado;
	}
	
	public static double areaCuadrado(double lado) {
		
		double resultado = lado * lado;
		
		return resultado;
	}

}
