package fpdualeveris;
import java.util.ArrayList;
import java.util.Scanner;
import variables.Programador;

public class FPDual {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int nProg;
		do {
			System.out.println("Número de empleados a introducir: ");
			 nProg = teclado.nextInt();
			teclado.nextLine();
			
			if(nProg<=0){
				System.out.println("|=ERROR=| Introduzca un número entero positivo.");
			}
		}while(nProg<=0);
		
		ArrayList<Programador> aProg = new ArrayList<>();
		aProg = FPDual.practicaVariables(nProg);
		if(aProg.size() >= 2) {
			aProg.get(1).vacaciones(2);
		}

		for(int i = 0; i < aProg.size(); i++)	{
			Programador p = aProg.get(i);
			System.out.println("|==============================================|");
			System.out.println("|====Emmpleado: "+p.getName()+" | "+p.getCodEmpl());
			System.out.println("|====Vacaciones disfrutables: "+p.getVac());
			System.out.println("|==============================================|");
		}
	}
	
	private static ArrayList<Programador> practicaVariables(int numProgramadores) {

		ArrayList<Programador> aProg = new ArrayList<>();

		if (numProgramadores > 0 && numProgramadores <= 15) {
			for (int i = 0; i < numProgramadores; i++) {

				System.out.println("Nombre "+(i + 1)+":");
				String nombre = teclado.nextLine();
				aProg.add(new Programador(nombre));
				Programador p = aProg.get(i);

				if (p.getCodEmpl() == 1 || p.getCodEmpl() == 4) {
					System.out.println("|================================");
					System.out.println("|====Num. Empleados: "+p.totalEmpl());
					System.out.println("|================================");
				}
			}
		} else {
			System.out.println("|=ERROR=| Introduzca un número menor que 16 positivo.");
		}
		return aProg;
	}

}
