//Dados tres vectores intercalar sus elementos en un cuarto vector
import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3;
        int i=0; int j=0; int k=0;
        do{System.out.println("Tamaño del primer Vector:");n1=sc.nextInt();
        }while(n1<=0);
        int x[]=new int[n1];
        leerVec(x,n1);
        do{System.out.println("Tamaño del Segundo Vector:");n2=sc.nextInt();
        }while(n2<=0);
        int y[]=new int[n2];
        leerVec(y,n2);
        do{System.out.println("Tamaño del tercer Vector:");n3=sc.nextInt();
        }while(n3<=0);
        int z[]=new int[n3];
        leerVec(z,n3);
        int t=n1+n2+n3;
        int vec[]=new int[t];
        while(i<n1||j<n2||k<n3){
            if(i<n1){vec[i+j+k]=x[i];i++;}
            if(j<n2){vec[i+j+k]=y[j];j++;}
            if(k<n3){vec[i+j+k]=z[k];k++;}
        }
        mostrarVec(vec,t);
    }
    private static void leerVec(int[] a, int n){
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