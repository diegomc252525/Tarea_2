
package Utilidades;

public class Part {
    //operacion basica
	public static double part(double base,int exp){
		double valor;
		valor = Math.pow(base,exp)/Factorial.factorial(exp);
		return valor;
	
    }
}
