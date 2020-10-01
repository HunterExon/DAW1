package variables;

public class Empleado {
	private String name;
	private int codEmpl;
	private static final String empresa = "EVERIS";
	private int vac;
	private static int numEmpl = 0;

	public Empleado(String name) {
		if(name.length() <= 40) {
			this.name = name;
			this.codEmpl = Empleado.numEmpl + 1;
			this.vac = 21;
			Empleado.numEmpl++;
		} else {
			System.out.println("|==ERROR==| El nombre introducido es demasiado largo");
		}
	}
	
	public int totalEmpl(){return Empleado.numEmpl;}
	public void redEmpl(){Empleado.numEmpl--;}
	
	public void MenosNumEmpl(int redEmpl){
		if(redEmpl > 0 && redEmpl <= Empleado.numEmpl) {
			Empleado.numEmpl -= redEmpl;
		} else {
			System.out.println("|==ERROR==| Número introducido incorrecto, por favor, verifíquelo.");
		}
	}
	protected void MenosDiasVac(int MenosDias){this.vac -= MenosDias;}


	public String getName(){return name;}
	public void setName(String name){this.name = name;}
	public int getCodEmpl(){return codEmpl;}
	public void setCodEmpl(int codEmpl){this.codEmpl = codEmpl;}
	public static String getEmpresa(){return empresa;}
	public int getVac(){return vac;}
	public void setVac(int vac){this.vac = vac;}
	public static int getNumEmpl(){return numEmpl;}
	public static void setNumEmpl(int numEmpl){Empleado.numEmpl = numEmpl;}

	@Override
	public String toString() {
		return "Empleado{NOMBRE: "+name+" | COD: "+codEmpl+" | Empresa: "+empresa+" | VACACIONES: "+vac+"}\n";
	}
}
