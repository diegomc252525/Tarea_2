package Algoritmos;

import Utilidades.Factorial;
import Utilidades.Part;


//ejercicio numero 20 en la lista de ejrcicios
public class Ejer_1 implements Ejer{
    //variable
	private int anguloSexagecimales;
	private double x;//angulo en radianes
 
	public void set(int angulo){
            anguloSexagecimales=angulo;
            x=Math.toRadians(anguloSexagecimales);
        }
	//sen de un angulo pasado por argumento de tipo double ne rad
	public double sen(){
		x=Part.part(x,1)-Part.part(x,3)+Part.part(x,5)-Part.part(x,7);
		return x;
	}
        public double get(){
            return sen();
        }
        /*//sen de un angulo sin argumentos
	public double sen(){
		double x=anguloRadianes;
		x=Part.part(x,1)-Part.part(x,3)+Part.part(x,5)-Part.part(x,7);
		return x;
	}*/
	
}
