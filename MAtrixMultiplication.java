import java.util.*;
public class MAtrixMultiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row1,col1,row2,col2;
        System.out.println("Enter no. of rows for first matrix:");
        row1 = sc.nextInt();
        System.out.println("Enter no. of columns for first matrix:");
        col1 = sc.nextInt();
        System.out.println("Enter no. of rows for second matrix:");
        row2 = sc.nextInt();
        System.out.println("Enter no. of columns for second matrix:");
        col2 = sc.nextInt();
        if(col1 != row2){
            System.out.println("Matrix multiplication not possible");
            return;
        }
        int a[][] = new int[row1][col1];
        int b[][] = new int[row2][col2];
        int c[][] = new int[row1][col2];
        System.out.println("Enter elements of first matrix:");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix:");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                b[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                c[i][j] = 0;
                for(int k=0;k<col1;k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Result of matrix multiplication:");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
