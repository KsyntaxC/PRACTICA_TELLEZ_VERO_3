//Utilizando modularidad, Dado un vector X, invertir los números pares:
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n;
        do{System.out.println("Tamaño del vector: ");n=sc.nextInt();}while(n<=0);
        int x[]=new int[n];
        int y[]=new int[n];
        LeerVec(x,n);
        mostrarVec(x,n);
        System.out.println();
        for(int i=0;i<n;i++){
            if (x[i]%2==0){
                y[i]=invertir(x[i]);
            }else{
                y[i]=x[i];
            }
        }
        System.out.println("Nuevo vector: ");
        mostrarVec(y,n);
    }
    private static void LeerVec(int[] a, int n){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
    }
    private static void mostrarVec(int[] a, int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    private static int invertir(int x){
        int y=0;
        while(x>0){
            int d=x%10;
            x=x/10;
            y=y*10+d;
        }
        return y;
    }
}