//Utilizando modularidad,Dado un vector de n elementos, promediar los elementos primos
import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n;
        do{System.out.println("Tamaño del Vector: ");n=sc.nextInt();}while(n<=0);
        int x[]=new int[n];
        LeerVec(x,n);
        mostrarVec(x,n);
        System.out.println();
        int c=0; int s=0;
        for(int i=0;i<n;i++){
            if(esPrimo(x[i])){
                s=s+x[i]; c++;
            }
        }
        double prom=s/c;
        System.out.println("El promedio es de los elementos primos es: "+prom);
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
    private static boolean esPrimo(int x){
        int c=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){c++;}
        }
        if(c==2){return(true);
        }else{return(false);}
    }
}