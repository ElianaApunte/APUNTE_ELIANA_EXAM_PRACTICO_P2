
package Dominio;

public class ValorJubInicial extends JubilacionInicial {
    private double valor;
    
    public ValorJubInicial (String nom, int numCed, double salario,int añosTra, int porcentaje, double valor){
        super(nom, numCed, salario, añosTra, porcentaje);
        this.valor=valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    @Override
    public String VerDatos(){
        return super.VerDatos()+" "+this.valor;
    }
}
