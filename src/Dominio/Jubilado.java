
package Dominio;

public class Jubilado {
    protected String nom;
    private int numCed;
    private double salario;
    protected int añosTra;
    
    public void men (){
        System.out.println("Datos del Jubilado");
    }

    public Jubilado(String nom, int numCed, double salario, int añosTra) {
        this.nom = nom;
        this.numCed = numCed;
        this.salario = salario;
        this.añosTra = añosTra;
    }

    public String getNom() {
        return nom;
    }

    public int getNumCed() {
        return numCed;
    }

    public double getSalario() {
        return salario;
    }

    public int getAñosTra() {
        return añosTra;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumCed(int numCed) {
        this.numCed = numCed;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setAñosTra(int añosTra) {
        this.añosTra = añosTra;
    }
    
    public String VerDatos(){
        return this.nom+" "+this.numCed+" "+this.salario+" "+this.añosTra;
    }
}
