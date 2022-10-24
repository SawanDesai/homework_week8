package programme5;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner nm = new Scanner(System.in);
        System.out.println("Input a number");
        int n = nm.nextInt();
        int sum = 0,r;
        int temp = n;
        boolean result;

        while (n>0){
            r = n%10;
            sum = (sum*10) +r;
            n = n/10;

        }
    if ( temp == sum)
        System.out.println("isPalindrome: True");
    else
        System.out.println("isPalindrome:false");


    }
}
