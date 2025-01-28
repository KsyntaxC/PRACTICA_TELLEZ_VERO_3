/*Dada una matriz ingresada desde teclado, reemplazar los negativos por ceros */
import java.util.Scanner;
public class Ejercicio11{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int f, c;
        do{System.out.print("f: ");f=sc.nextInt();
        }while(f<=0);
        do{System.out.print("c: ");c=sc.nextInt();
        }while(c<=0);
        int m[][]=new int[f][c];
        leerMatriz(m,f,c);
        System.out.println();
        mostrarMatriz(m,f,c);
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                if(m[i][j]<0){
                    m[i][j]=0;
                }
            }
        }
        System.out.println();
        mostrarMatriz(m,f,c);
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
}