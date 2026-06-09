import java.util.*;
public class BinaryToDecimalLogicalOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary digit:");
        String binary = sc.next();
        int decimal = 0;

        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal << 1;
            if (binary.charAt(i) == '1') {
                decimal = decimal + 1;
            }
        }

        System.out.println(decimal);
    }
}
