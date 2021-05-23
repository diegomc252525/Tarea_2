
package Utilidades;

public class InteresCompuesto {
    //pedir datos para calcular el interes compuesto
    public static float interes(float capital,float interes,int periodos){
        float capitalTotal=0;//valor total del dinero invertido
        //operacion de ct=ci(1+i)^n
        capitalTotal=capital*(float)(Math.pow((1+interes),periodos));
        
        return capitalTotal;
    }
}
