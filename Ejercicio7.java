/*Dado un número X generar dos vectores uno con los dígitos impares y otro con los dígitos
pares
Ejm: X=142356789  */
import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,d,cd;
        int i=0;
        int j=0;
        do{System.out.println("Intro n: ");n=sc.nextInt();
        }while(n<=0);
        cd=(int)Math.log10(n)+1;
        int x[]=new int[cd];
        int y[]=new int[cd];
        while(n>0){
            d=n/(int)Math.pow(10,(cd-1)); 
            n=n%(int)Math.pow(10,(cd-1));
            cd=cd-1;
            if (d%2==0){
                x[i]=d; i++;
            }else{
                y[j]=d; j++;
            }
        }
        System.out.println("Pares");
        mostrarVec(x,i);
        System.out.println("Impares");
        mostrarVec(y,j);
    }
    private static void mostrarVec(int[]a,int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}