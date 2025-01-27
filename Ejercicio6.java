/*Generar un vector de N elementos, que contenga los números de Fibonacci en las posiciones
impares y los números primos en las posiciones pares*/
import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n;
        int f=0;
        int p=1;
        do{System.out.println("Introduce tamaño del Vector: ");n=sc.nextInt();
        }while(n<=0);
        int x[]=new int[n];
        for(int i=0;i<n;i++){
            if (i%2==0){
                x[i]=nFibo(f); f++;
            }else{
                x[i]=nPrimo(p); p++;
            }
        }
        System.out.println("Vector Fibo-Primo: ");
        mostrarVec(x,n);
    }
    private static void mostrarVec(int[]a,int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    private static int nFibo(int x){
        if(x==0){return(0);
        }else if(x==1){return(1);
        }else{return(nFibo(x-1)+nFibo(x-2));}
    }
    private static int nPrimo(int x) {
        int c=0;
        int p=2;
        while(true){
            if(esPrimo(p)) {c++;
                if(c==x){return p;}
            } p++;
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