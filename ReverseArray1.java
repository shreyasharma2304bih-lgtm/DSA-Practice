import java.util.*;
public class ReverseArray1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Reversed array:");
        for(int i=n-1;i>=0;i--){
            System.out.print(a[i] + " ");
        }
    }
    
}
