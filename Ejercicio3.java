//Dados dos vectores de n elementos, sumar sus elementos 1 a 1
import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        do{System.out.println("Tamaño de los vectores: ");n=sc.nextInt();
        }while(n<=0);
        int x[]=new int[n];
        int y[]=new int[n];
        int z[]=new int[n];
        System.out.println("Vector 1: ");
        LeerVec(x, n);
        System.out.println("Vector 2: ");
        LeerVec(y, n);
        for(int i=0;i<n;i++){
            z[i]=x[i]+y[i];
        }
        System.out.println("Vector suma: ");
        mostrarVec(z,n);
    }
    private static void LeerVec(int[]a, int n){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
    }
    private static void mostrarVec(int[]a,int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}