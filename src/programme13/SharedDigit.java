package programme13;

/**Write a method named hasSharedDigit with two parameters of type int.
 Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 within the range, the method should return false.
 The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 otherwise, the method should return false.

 */
public class SharedDigit {
    public static boolean hasSharedDigit (int a, int b){
        if(a<=10 || b>=99)
            return false;
        int x = a % 10;
        int y = b % 10;

        a /= 10;
        b /= 10;
        return ( a==b || a==y || x==b || x==y );

    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }
}
