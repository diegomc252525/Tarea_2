
package Algoritmos;

//ejercicio numero 21
public class Ejer_3 {
    //funcion para pedir datos y sumarlas
    public int sumar(int[] dinero){
        int resultado;//suma total
        resultado=dinero[0]*1;//monedas de 1 sol
        resultado+=dinero[1]*2;//monedas de 2 soles
        resultado+=dinero[2]*5;//monedas de 5 soles
        resultado+=dinero[3]*10;//billetes de 10 soles
        resultado+=dinero[4]*20;//billetes de 20 soles
        resultado+=dinero[5]*50;//billetes de 50 soles
        
        return resultado;
    }
}
