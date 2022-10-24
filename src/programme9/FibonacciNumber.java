package programme9;

public class FibonacciNumber {
    public static void main(String[] args) {
       int count = 11, num1 = 1, num2 = 1;
        System.out.println("Fibonacci Series of : " + count + "numbers");

    for (int i= 1; i<= count; ++i){
            System.out.println(num1 +"");

            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;


        }

    }

}
