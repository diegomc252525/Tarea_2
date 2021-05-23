
package Algoritmos;

import Utilidades.InteresCompuesto;


public class Ejer_4 {
    //resolucion del problea planteado
    public int año=1961;//año en la que vendio su terreno
    public float capInicial=1500;//dinero invertido
    public float interes=(float)0.15;//interes
    public int periodo=2021-año;// periodo
    float dineroTotal;
    //aplicar operacion de interes
    public float interes(){
        dineroTotal=InteresCompuesto.interes(capInicial, interes, periodo);
        return dineroTotal;
    }
}
