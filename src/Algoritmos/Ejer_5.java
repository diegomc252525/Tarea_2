
package Algoritmos;

//ejercicio 
public class Ejer_5 {
    public float promedio(int[] edades){
        float promedio=0;
        for(int i=0;i<edades.length;i++){
            promedio+=edades[i];
        }
        return promedio/edades.length;
    }
}
