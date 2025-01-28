/*Dada una matriz ingresada desde teclado, sumar sus columnas en un vector */
import java.util.Scanner;
public class Ejercicio12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int f,c;
        do{System.out.print("f: ");f=sc.nextInt();
        }while(f<=0);
        do{System.out.print("c: ");c=sc.nextInt();
        }while(c<=0);
        int m[][]=new int[f][c];
        int x[]=new int[c];
        leerMatriz(m,f,c);
        System.out.println("Matriz: ");
        mostrarMatriz(m,f,c);
        for(int j=0;j<c;j++){
            int s=0;
            for(int i=0;i<f;i++){
                s=s+m[i][j];
            }
            x[j]=s;
        }
        System.out.println("Vector suma de columnas: ");
        mostrarVec(x,c);
    }
    private static void leerMatriz(int[][]a,int f,int c){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
    }
    private static void mostrarMatriz(int[][]a,int f, int c){
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static void mostrarVec(int[]a,int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}