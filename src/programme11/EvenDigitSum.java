package programme11;

/**
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 */
public class EvenDigitSum {
    public static int getEvendigitsum(int number) {
        if (number < 0) {
            return -1;
        }
        int finalNumber = 0;
        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                finalNumber += number % 10;

            }
            number = number / 10;

        }
        return finalNumber;
    }

    public static void main(String[] args) {
        System.out.println(getEvendigitsum(123456789));
        System.out.println(getEvendigitsum(252));
        System.out.println(getEvendigitsum(-22));
    }
}
