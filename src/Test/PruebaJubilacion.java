
package Test;

import Dominio.JubilacionInicial;
import Dominio.ValorJubInicial;
import java.util.Scanner;

public class PruebaJubilacion {
  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n=0;
        String nom;
        int numCed;
        double salario;
        int añosTra;
        int porcentaje;
        double valor;
        int op;
        double jv;
        double jd;
        double jp;
        
        System.out.println("Numero de jubilados: ");
        n = entrada.nextInt();
        JubilacionInicial [] empleados = new JubilacionInicial[n];
        
        for(int i=0;i<n;i++){
            System.out.println("Nombre del Jubilado "+(i+1)+" :");
            nom = entrada.next();
            System.out.println("Cedula del Jubilado "+(i+1)+" :");
            numCed = entrada.nextInt();
            System.out.println("Salario del Jubilado "+(i+1)+" :");
            salario = entrada.nextDouble();
            System.out.println("Años Trabajoados del Jubilado "+(i+1)+" :");
            añosTra = entrada.nextInt();
            
            if(añosTra<11){
            porcentaje=50;
            }
            else{
                if(añosTra<21){
                porcentaje=60;
                }
                else{
                    if (añosTra<31){
                    porcentaje=70;
                    }
                    else{
                        if(añosTra<36){
                        porcentaje=80;
                        }
                        else{
                            if(añosTra<40){
                            porcentaje=90;
                            }
                            else{
                            porcentaje=100;
                                }
                            }
                        }
                    }
                empleados[i]= new JubilacionInicial(nom,numCed,salario,añosTra,porcentaje);
                }
        }  
        
        ValorJubInicial [] jubilados = new ValorJubInicial[n];
        
        //System.out.println("Listado de Jubilados");
        for(int i=0;i<n;i++){
            //System.out.println("Jubilado "+(i+1));
            //System.out.println("Nombre Cedula Salario Años Trabajados %de J. Inicial");
            //System.out.println(empleados[i].VerDatos());
            valor=empleados[i].getSalario()*(empleados[i].getPorcentaje()/100);
            
            jubilados[i] = new ValorJubInicial (empleados[i].getNom(),empleados[i].getNumCed(),empleados[i].getSalario(),empleados[i].getAñosTra(),empleados[i].getPorcentaje(),valor);
        }
        
        for(int i=0;i<n;i++){
            System.out.println("Escoja el tipo de Jubilacion:");
            System.out.println("1=J. por Vejez");
            System.out.println("2=J. por Discapacidad");
            System.out.println("3=J. Patronal");
            op=entrada.nextInt();
        
            switch(op){
                case 1: 
                    //jv = jubilados[i].getSalario()*(0,15);
            }
        }
        
    } 
}
    
