/* Generar una matriz con cruz de ceros y el resto unos*/
import java.util.Scanner;
public class Ejercicio13{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t;
        do{System.out.print("t: ");t=sc.nextInt();
        }while(t<=0);
        int m[][]=new int[t][t];
        for(int i=0;i<t;i++){
            for(int j=0;j<t;j++){
                if(i==t/2 || j==t/2){
                    m[i][j]=0;
                }else{
                    m[i][j]=1;
                }
            }
        }
        mostrarMatriz(m,t,t);
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