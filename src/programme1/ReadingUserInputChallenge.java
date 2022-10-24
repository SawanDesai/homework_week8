package programme1;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int i = 1;
        int sum = 0;

        while(i<=10){
            System.out.println("Enter number # : " + 1);
            boolean validNumber = num.hasNextInt();
            if(validNumber){
                int number = num.nextInt();
                sum += number;
                i++;
            } else{
                System.out.println("Invalid Number");

            }
            num.nextLine();

        }
        System.out.println("Sum of all numbers = "+ sum);
        num.close();
    }
}
