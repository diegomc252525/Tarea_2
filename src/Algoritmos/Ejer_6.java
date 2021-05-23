
package Algoritmos;

public class Ejer_6 {
    
    public static float totalP(int categoria,float valor)//lo que va a pagar
    {
        float cat1=0.10f;
        float cat2=0.07f;
        float cat3=0.05f;
        switch(categoria){
            case 1:
                valor*=cat1;
                break;
            case 2:
                valor*=cat2;
                break;
            case 3:
                valor*=cat3;
                break;
        }
        return valor;
    }
}
