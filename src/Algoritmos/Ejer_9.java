
package Algoritmos;


public class Ejer_9 {
    public float sueldo(int hora, int Sueldo,String nombres){
        float sueldo;
        sueldo=hora*Sueldo;
        if(0<sueldo && sueldo<=150){
            sueldo=sueldo*0.05f;
        }else if(150<sueldo && sueldo<=300){
            sueldo=sueldo*0.07f;
        }else if(300<sueldo && sueldo<=450){
            sueldo=sueldo*0.09f;
        }
        return sueldo;
    }
}
