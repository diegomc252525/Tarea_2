
package Utilidades;


public class Factorial {
    public static int factorial(int numero){
	
		if (numero>1){
			numero*=factorial(--numero);
		}
                else if(numero==0){
                    return 1;
                }
                
		return numero;
	}
}
