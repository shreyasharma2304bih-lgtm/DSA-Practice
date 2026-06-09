import java.util.*;
public class DecimalToBinaryLogicalOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter decimal digit:");
        int n = sc.nextInt();
String binary = "";
while(n>0){
    binary = (n & 1) + binary;
    n = n >> 1;
}
System.out.println(binary);
    }
    
}
