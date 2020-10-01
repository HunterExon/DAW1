public class ordenador {
    protected int mac;
    protected int ram;
    protected String micro;
    protected String grafica;

    public ordenador(int mac, int ram, String micro, String grafica) {
        this.mac = mac;
        this.ram = ram;
        this.micro = micro;
        this.grafica = grafica;
    }

    public int getMac(){return mac;}
    public void setMac(int mac){this.mac = mac;}
    public String getGrafica(){return grafica;}
    public void setGrafica(String grafica){this.grafica = grafica;}
    public String getMicro(){return micro;}
    public void setMicro(String micro){this.micro = micro;}
    public int getRam(){return ram;}
    public void setRam(int ram){this.ram = ram;}
}
