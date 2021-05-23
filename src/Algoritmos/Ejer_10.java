
package Algoritmos;

//erjercicio numero 14
public class Ejer_10 {
    private int aprobados=0;
    public int calificaciones(int[] notas){
        for(int i=0;i<notas.length;i++){
            if(notas[i]>11){
                aprobados++;
            }
        }
        return aprobados;
    }
}
