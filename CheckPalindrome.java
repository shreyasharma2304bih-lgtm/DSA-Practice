import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check: ");
        int n = sc.nextInt();
        int temp = n;
        int  rev = 0 ,rem ;
        
        while(temp>0){ 
            rem = temp % 10;
            rev = (rev * 10) + rem;
            temp=temp/10;
        }
        temp=n;
        if(temp == rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
        sc.close();
    }
}
