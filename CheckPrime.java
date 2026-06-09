import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check:");
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n<=1) {
            isPrime = false;
        }
        for(int i=2; i <= n/2 ; i++) {
                isPrime = false;
                break;
            }
            if(isPrime) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
        }
    }

