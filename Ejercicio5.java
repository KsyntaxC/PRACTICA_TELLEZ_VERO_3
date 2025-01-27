/* Generar un vector con los dígitos pares de un número:
   Ejm: X=234563421 --> vec= 2 4 6 4 2*/
import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n,d,cd;
        int i=0;
        do{System.out.println("Intro n: ");n=sc.nextInt();
        }while(n<=0);
        cd=(int)Math.log10(n)+1;
        int x[]=new int[cd];
        while(n>0){
            d=n%10; n=n/10;
            if (d%2==0){
                x[i]=d; i++;
            }
        }
        mostrarVec(x,i);
    }
    private static void mostrarVec(int[]a,int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
