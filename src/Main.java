
import Algoritmos.*;
import Interfaz.*;
import Utilidades.Factorial;
import java.io.IOException;
import java.util.Scanner;




public class Main{
    
    /*public static void pedir() throws IOException, InterruptedException{
        Scanner sd = new Scanner(System.in);
        String[] bufer=new String[100];//bufer de max 100
        int i=0;
        while(true)
        {
            bufer[i]=sd.next();
            
            //System.out.println(i);
            if(bufer[i].equals("x")){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                break;
            }
            i++;
        }
        
        for(int n=0;n<i;n++){
            System.out.println(bufer[n]);
        }
    }*/

    public static void main(String[] args) throws IOException, InterruptedException{

        Imprimir im=new Imprimir();
        im.imprimir();
    }


}
