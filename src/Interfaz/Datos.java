
package Interfaz;

import Algoritmos.*;
import java.io.IOException;
import java.util.Scanner;

public class Datos {
    Scanner sc = new Scanner(System.in);
    //pause
    public void pause() throws IOException{
        System.in.read();
    }
    //selector
    public String pedirNum(){
        String numero=sc.nextLine();
        return numero;
    }
    //datos problema 1
    public int pedirAngulo(){
        int angulo=sc.nextInt();
        return angulo;
    }
    //datos problema 2
    public int pedirExp(){
        int angulo=sc.nextInt();
        return angulo;
    }
    //datos problema 3
    public int[] pedirDinero(){
        int[] dinero=new int[6];
        int[] m={1,2,5,10,20,50};
        for(int i=0;i<6;i++){
            System.out.print("monedas de "+m[i]+" sol: ");
            dinero[i]=sc.nextInt();
        }
        return dinero;
    }
    //datos problema 4
    //no hay datos por pedir
    //datos problema 5
    //datos problema 6
    
    
    
    
    //datos problema 7
    public int numMult(){
        int num=sc.nextInt();
        return num;
    }
    //datos problema 8
    public void numCubo(){
        System.out.print("cantidad de numeros: ");
        int nNumeros=sc.nextInt();
        int[]nums=new int[nNumeros];
        
        for(int i=0;i<nNumeros;i++){
            System.out.print("numero "+(i+1)+" :");
            nums[i]=sc.nextInt();
            System.out.print(nums[i]+"^3="+Ejer_8.cubo(nums[i])+"\n");
        }
        //return nums;
    }
    //datos problema 9
    public void sueldoTrabajador(){
        int numTrabajadores=sc.nextInt();
        Ejer_9 e=new Ejer_9();
        String []cadenas=new String[numTrabajadores];
        String []nombre=new String[numTrabajadores];
        int [][]horaSueldo=new int[2][numTrabajadores];
        for(int i=0;i<numTrabajadores;i++){
            System.out.print("nombre: ");
            nombre[i]=sc.next();
            System.out.print("horas trabajadas: ");
            horaSueldo[0][i]=sc.nextInt();
            System.out.print("sueldo por hora: ");
            horaSueldo[1][i]=sc.nextInt();
            cadenas[i]="trabajador"+(i+1)+"\nnombre: "+nombre[i]+"\n horas trabajas:"+horaSueldo[0][i]+"\nsueldo por hora: "+horaSueldo[1][i]
                    +"sueldo total: "+e.sueldo(horaSueldo[0][i],horaSueldo[1][i], nombre[i]);
            System.out.println("sueldo total: "+e.sueldo(horaSueldo[0][i],horaSueldo[1][i], nombre[i]));
        }
    }
    //datos problema 10
    public void notas(){
        Ejer_10 e=new Ejer_10();
        System.out.print("numeros de alumnos: ");
        int nAlumnos = sc.nextInt();
        int[] notas=new int[nAlumnos];
        for(int i=0;i<nAlumnos;i++){
            System.out.print("alumno "+(i+1)+":");
            notas[i]=sc.nextInt();
        }
        System.out.print("aprobados: "+e.calificaciones(notas)+"\nno aprobados: "+(nAlumnos-e.calificaciones(notas))+"\n");
    }
    
}
