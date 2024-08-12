import java.util.*;

public class mat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE NO. OF ROWS AND COLUMNS OF FIRST MATRIX: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.println("ENTER THE NO. OF ROWS AND COLUMNS OF SECOND MATRIX: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if(c1 != r2){
            System.out.println("MATRIX MULTIPLICATION NOT POSSIBLE");
        }

        int A[][] = new int[r1][c1];
        int B[][] = new int[r2][c2];
        int C[][] = new int[r1][c2];

        System.out.println("READ MATRIX A: ");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("READ MATRIX B: ");
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                B[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                C[i][j] = 0;
                for(int k = 0; k < c2; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("PRODUCT MATRIX C");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                System.out.println(C[i][j]+"\t");
            }
            System.out.println();
        }

        sc.close();
    }
}