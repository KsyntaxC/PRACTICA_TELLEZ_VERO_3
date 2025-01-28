/*Dado un vector de cadenas, mostrar cuantas veces aparece el elemento X en el vector */
import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n;
        do{System.out.println("Intro n: ");n=sc.nextInt();
        }while(n<=0);
        String vecCad[]=new String[n];
        leerVec(vecCad,n);
        System.out.println("Introduce el elemento a buscar: ");
        String x=sc.nextLine();
        int c=contarVec(vecCad,n,x);
        System.out.println("El elemento '"+x+"'aparece "+c+" veces en el vector.");
    }
    private static void leerVec(String[] a,int n){
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<n;i++) {
            a[i]=sc.nextLine();
        }
    }
    private static int contarVec(String[] a,int n,String x) {
        int c=0;
        for (int i=0;i<n;i++){
            if (a[i].equals(x)){
                c++;
            }
        }
        return c;
    }
}
