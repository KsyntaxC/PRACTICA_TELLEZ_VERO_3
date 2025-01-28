/* Generar una matriz con cruz de ceros y el resto numeros naturales*/
import java.util.Scanner;
public class Ejercicio15{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int f,c,mul;
        int n=1;
        do{System.out.print("f: ");f=sc.nextInt();
        }while(f<=0);
        do{System.out.print("c: ");c=sc.nextInt();
        }while(c<=0);
        int m[][]=new int[f][c];
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                if(i>j){
                    m[i][j]=0;
                }else{
                    mul=n*3;
                    m[i][j]=mul;
                    n++;
                }
            }
        }
        mostrarMatriz(m,f,c);
    }
    private static void mostrarMatriz(int[][]a,int f, int c){
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
}