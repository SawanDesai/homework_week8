package programme4;

public class DigitSumChallenge {
    public static int sumDigits(int number) {
        int num = 0;
        int addSum = 0;

        if (number < 10 && number <= -1) {
            return -1;
        } else {
            while (number > 0) {
                num = number % 10;
                number = number / 10;
                addSum = addSum + num;
            }
            return addSum;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumDigits( 125));
    }
}

