import java.util.*;
public class TransposeOfMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row,col;
        System.out.println("Enter no. of rows:");
        row = sc.nextInt();
        System.out.println("Enter no. of columns:");
        col = sc.nextInt();
        int a[][] = new int[row][col];
        System.out.println("Enter matrix elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose of matrix:");
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }

    }
    
}
