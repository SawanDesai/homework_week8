package programme14;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N (half number of rows) : ");
        int n=sc.nextInt();
        sc.close();

        int i=1;
        int j;
        while(i<=n)
        {
            j=1;
            while(j++<=n-i)

            {
                System.out.print("");

            }
            j=1;
            while(j++<=i*2-1)
            {
                System.out.print("*");
            }

            System.out.println();
            i++;
        }
        i=n-1;
        while(i>0)
        {
            j=1;
            while(j++<=n-i)
            {
                System.out.print("");
            }
            j=1;
            while(j++<=i*2-1)
            {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }

}
