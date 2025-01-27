//Generar un vector con los números de finacci:
import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        do{System.out.println("Tamaño del Vector: ");n=sc.nextInt();
        }while(n<=0);
        int x[]=new int[n];
        for(int i=0;i<n;i++){
            x[i]=fibo(i);
        }
        System.out.println("Vector Fibonnaci: ");
        mostrarVec(x,n);
    }
    private static int fibo(int x){
        if(x==0){return(0);
        }else if(x==1){return(1);
        }else{return(fibo(x-1)+fibo(x-2));}
    }
    private static void mostrarVec(int[]a,int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
} 