package fpdualeveris;

import estructurasdedatos.Arrays;

public class FPDual {

	public static void main(String[] args) {
		FPDual.practicaEstructurasArrays();
	}
	private static void practicaEstructurasArrays() {
		String cadena;
		Arrays array = new Arrays();
		String[][] EdificioFpDual = array.getEdificio();
		
		System.out.println("|==================================|");
		System.out.println("|==       EDIFICIO FP DUAL       ==|");
		System.out.println("|==================================|");
		for (int piso = 0; piso < EdificioFpDual.length; piso++) {
			for (int puerta = 0; puerta < EdificioFpDual[piso].length; puerta++) {
				if (piso == 0) {
					if (puerta == 0) {
						cadena = "| Bajo     - Puerta A - " + EdificioFpDual[piso][puerta];
						System.out.println(cadena);
					} else if (puerta == 1) {
						cadena = "| Bajo     - Puerta B - " + EdificioFpDual[piso][puerta];
						System.out.println(cadena);
					}
				} else if (piso == 4) {
					if (puerta == 0) {
						cadena = "| Ático    - Puerta A - " + EdificioFpDual[piso][puerta];
						System.out.println(cadena);
					} else if (puerta == 1) {
						cadena = "| Ático    - Puerta B - " + EdificioFpDual[piso][puerta];
						System.out.println(cadena);
					}
				} else {
					if (EdificioFpDual[piso][puerta] == null) {
						cadena = "| Planta " + piso + " - Piso vacío ";
						System.out.println(cadena);
					} else if(puerta == 0) {
						cadena = "| Planta " + piso + " - Puerta A - " + EdificioFpDual[piso][puerta];
						System.out.println(cadena);
					} else if (puerta == 1) {
						cadena = "| Planta " + piso + " - Puerta B - " + EdificioFpDual[piso][puerta];
						System.out.println(cadena);
					} else if (puerta == 2) {
						cadena = "| Planta " + piso + " - Puerta C - " + EdificioFpDual[piso][puerta];
						System.out.println(cadena);
					} else if (puerta == 3) {
						cadena = "| Planta " + piso + " - Puerta D - " + EdificioFpDual[piso][puerta];
						System.out.println(cadena);
					}
				}
			}
			System.out.println("|==================================|");
		}

	}

}