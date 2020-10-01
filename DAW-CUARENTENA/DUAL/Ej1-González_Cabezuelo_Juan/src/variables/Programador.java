package variables;

public class Programador extends Empleado {
	public Programador(String name){super(name);}
	public int ShowCodEmpl(){return super.getCodEmpl();}
	
	public void vacaciones(int diasUsados) {
		if (diasUsados > 0 && diasUsados <= 21) {
			super.MenosDiasVac(diasUsados);
		} else {
			System.out.println("|=ERROR=| Debe introducir más de 0 y menos de 22.");
		}
	}
}
