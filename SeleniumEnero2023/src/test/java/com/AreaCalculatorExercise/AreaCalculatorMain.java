package com.AreaCalculatorExercise;

import java.util.Scanner;

public class AreaCalculatorMain {

	public static void main(String[] args) {
		int opc = 0;
		Area areaCirculo = new Area();
		Area areaRectangulo = new Area();
		Area menuArea = new Area();
		Scanner leerValor = new Scanner(System.in);

		do {
			menuArea.mostrarMenu();
			opc = leerValor.nextInt();
			switch (opc) {
			case 1:
				areaCirculo.leerDatosCirculo();
				areaCirculo.area(0);
				areaCirculo.mostrarDatosCirculo();
				break;
			case 2:
				areaRectangulo.leerDatosRectangulo();
				areaRectangulo.area(0, 0);
				areaRectangulo.mostrarDatosRectangulo();
				break;
			case 3:
				System.out.println("�GRACIAS POR USAR EL SISTEMA!");
				break;
			default:
				System.out.println("�VALOR INGRESADO NO VALIDO!");
				break;
			}
		} while (opc != 3);
		leerValor.close();
	}
}
