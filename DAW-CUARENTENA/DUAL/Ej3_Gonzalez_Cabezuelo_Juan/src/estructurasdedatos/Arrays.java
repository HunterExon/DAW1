package estructurasdedatos;

public class Arrays {
	private static String[][] edificio;
	
	public String[][] getEdificio() {
		return edificio;
	}
	
	public Arrays() {
		Arrays.edificio = new String[5][];
		
		Arrays.edificio[0] = new String[2];
		Arrays.edificio[1] = new String[4];
		Arrays.edificio[2] = new String[4];
		Arrays.edificio[3] = new String[4];
		Arrays.edificio[4] = new String[2];

		/*BAJO*/
		Arrays.edificio[0][0] = "Pablo";
		Arrays.edificio[0][1] = "Joaquin";

		/*PISO 1*/
		Arrays.edificio[1][0] = "Alicia";
		Arrays.edificio[1][1] = "Francisco";
		Arrays.edificio[1][2] = "Raúl";
		Arrays.edificio[1][3] = "Samuel";

		/*PISO 2*/
		Arrays.edificio[2][0] = "Abraham";
		Arrays.edificio[2][1] = "Salvador";
		Arrays.edificio[2][2] = "Ana María";
		Arrays.edificio[2][3] = "Noelia";

		/*PISO 3*/
		Arrays.edificio[3][0] = "Yi";
		Arrays.edificio[3][1] = "Alicia";
		Arrays.edificio[3][3] = "David";

		/*ÁTICO*/
		Arrays.edificio[4][0] = "Jesús";
		Arrays.edificio[4][1] = "Isabel";
	}
}
