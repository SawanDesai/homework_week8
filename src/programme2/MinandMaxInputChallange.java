package programme2;

import java.util.Scanner;

public class MinandMaxInputChallange {
    public static void main(String[] args) {

        Scanner mm = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {
            System.out.println("Enter number:  ");
            boolean isNum = mm.hasNextInt();
            if (isNum) {
                int digit = mm.nextInt();
                if (digit > max) {
                    max = digit;
                }
            } else {
                System.out.println("Invalid Number");
                break;

            }
            mm.nextLine();
        }

        System.out.println("Max = " + max + " and =" + min);
    }


}

