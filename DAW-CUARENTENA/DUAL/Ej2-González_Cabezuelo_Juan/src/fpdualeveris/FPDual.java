package fpdualeveris;
import operadores.Pinball;

public class FPDual {
	public static void main(String[] args) {	
		FPDual.PrOp();
	}
	
	private static void PrOp() {
		Pinball pinball = new Pinball();
		boolean bandera;
		
		bandera = pinball instanceof Pinball ? true : false;
		
		if(bandera) {
			pinball.shoot();
		} else {
			System.out.println("|=ERROR=| Hay que tener una variable PINBALL");
		}
		
	}

}