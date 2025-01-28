/*Dado un vector X, generar un segundo vector con los números invertidos de X y un tercer
vector con los dígitos centrales */
import java.util.Scanner;
public class Ejercicio9{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n;
        do{System.out.println("Introduce tamaño del vector: ");n=sc.nextInt();
        }while(n<=0);
        int x[]=new int[n];
        int in[]=new int[n];
        int dc[]=new int[n];
        leerVec(x,n);
        for(int i=0;i<n;i++){
            in[i]=invertir(x[i]);
            dc[i]=digCentral(x[i]);
        }
        System.out.println();
        mostrarVec(in,n);
        System.out.println();
        mostrarVec(dc,n);
    }
    private static void leerVec(int[]a, int n){
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
    private static int invertir(int x) {
        int y=0,d;
        while (x!=0){
            d=x%10;
            x=x/10;
            y=y*10+d;
        }
        return y;
    }
    private static int digCentral(int x) {
        int cd=(int)Math.log10(x)+1,dc;
        if (cd%2==0) {
            x=x/(int)Math.pow(10,(cd/2-1));
            dc=x%100;
        } else {
            x=x/(int)Math.pow(10,(cd/2));
            dc=x%10;
        }
        return dc;
    }    
}