
package Dominio;

public class JubilacionInicial extends Jubilado{
    protected int porcentaje;
    
    public JubilacionInicial (String nom, int numCed, double salario,int añosTra, int porcentaje){
        super(nom, numCed, salario, añosTra);
        this.porcentaje=porcentaje;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    @Override
    public String VerDatos(){
        return super.VerDatos()+" "+this.porcentaje;
    }
    
}
