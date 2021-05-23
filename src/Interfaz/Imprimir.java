
package Interfaz;

import Algoritmos.*;
import java.io.IOException;


public class Imprimir {
    Datos dt=new Datos();
    public void imprimir() throws IOException, InterruptedException{
        Datos dt=new Datos();
        int d=0;
        while(true){
            borrar();
            System.out.print("Ingrese numero del problema: ");
            int num=0;
            String n=dt.pedirNum();
            try{num=Integer.parseInt(n);}
            catch(NumberFormatException ex){
            borrar();if(n.equals(" ")){break;}}
            //if(num.equals("\n")){break;}
            switch(num){
                case 1:
                    e1();
                    dt.pause();
                    break;
                case 2:
                    e2();
                    dt.pause();
                    break;
                case 3:
                    e3();
                    dt.pause();
                    break;
                case 4:
                    borrar();
                    e4();
                    dt.pause();
                    break;  
                case 5:
                    borrar();
                    e5();
                    dt.pause();
                    break;
                case 6:
                    borrar();
                    e6();
                    dt.pause();
                    break;
                case 7:
                    borrar();
                    e7();
                    dt.pause();
                    break;   
                case 8:
                    borrar();
                    e8();
                    dt.pause();
                    break;    
                case 9:
                    borrar();
                    e9();
                    dt.pause();
                    break;
                case 10:
                    borrar();
                    e10();
                    dt.pause();
                    break;
                default:
                    borrar();
                    d=1;
     
            }
            //if(d==1){break;}
        }
 
    }
    private void e1(){
        Ejer_1 e=new Ejer_1();
        System.out.println("Ejercicio num 20");
        System.out.print("Angulo en grados: ");
        int x=dt.pedirAngulo();
        e.set(x);
        String cad=cad="Sen("+x+")="+e.get();
        System.out.println(cad);
    }
    private void e2(){
        Ejer_2 e=new Ejer_2();
        System.out.println("Ejercicio num 20");
        System.out.print("exponente de e: ");
        int x=dt.pedirExp();
        e.set(x);
        String cad=cad="e^"+x+"="+e.get();
        System.out.println(cad);
    }
    private void e3(){
        Ejer_3 e=new Ejer_3();
        System.out.println("Ejercicio num 20");
        System.out.print("cantidad de monedas y billetes de 1,2,5,10,20,50:\n");
        int[] x=dt.pedirDinero();
        String cad;
        cad="total de dinero en soles: "+e.sumar(x);
        System.out.println(cad);
    }
    private void e4(){
        Ejer_4 e=new Ejer_4();
        System.out.println("Ejercicio num 20");
        System.out.println("interes compuesto de 1500$ en un periodo de 80años a una tasa del 15% ");
        System.out.println("1500(1+0.15)^80="+e.interes());

    }
    private void e5(){
        Ejer_2 e=new Ejer_2();
        System.out.println("Ejercicio num 20");
        System.out.print("exponente de e: ");
        int x=dt.pedirExp();
        e.set(x);
        String cad=cad="e^"+x+"="+e.get();
        System.out.println(cad);
    }
    private void e6(){
        Ejer_2 e=new Ejer_2();
        System.out.println("Ejercicio num 20");
        System.out.print("exponente de e: ");
        int x=dt.pedirExp();
        e.set(x);
        String cad=cad="e^"+x+"="+e.get();
        System.out.println(cad);
    }
    private void e7(){
        Ejer_7 e=new Ejer_7();
        System.out.println("Ejercicio num 20");
        System.out.print("tabla de multiplicar: ");
        System.out.println(e.mult(dt.numMult()));
    }
    private void e8(){
        System.out.println("Ejercicio num 20");
        System.out.println("ponga numeros para sacarle el cubo:");
        dt.numCubo();
    }
    private void e9(){
        System.out.println("Ejercicio num 20");
        System.out.print("trabajadores: ");
        dt.sueldoTrabajador();
    }
    private void e10(){
        System.out.println("Ejercicio num 20");
        System.out.print("notas: ");
        dt.notas();
    }
    private void borrar() throws IOException, InterruptedException{new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();}
    
}
