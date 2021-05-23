
package Algoritmos;

import Utilidades.Part;

//ejercicio numero 11 en la lista de ejercicios
public class Ejer_2 implements Ejer {
    int x;
    public void set(int exp){
        x=exp;
    }
    public double get(){
        return expNatural();
    }
    //el exponente natural de un numero e=27182  e^x
    public double expNatural(){
        int j=0; //varible de contador
        double r=0; //variable de resultado
        while(j<14){
            r+=Part.part(x,j);//funcion de (x^j/x!)
            j++;
        }
        return r;
    }

}
