
package Algoritmos;

public class Ejer_7 {
    //hacer una tabla de multiplicar
    public String mult(int numero){
        String tabla="";
        //converti a texto
        for(int i=0;i<10;i++){
            tabla+=i+"*2="+numero*i+"\n";
        }

        return tabla;
    } 
}
