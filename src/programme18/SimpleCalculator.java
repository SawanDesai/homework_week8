package programme18;

public class SimpleCalculator {
double firstNumber, secondNumber;

public double getFirstNumber(){
    return firstNumber;

}
public double getSecondNumber(){
    return secondNumber;

}
public void setFirstNumber(double firstNumber){
    this.firstNumber = firstNumber;

}
public void setSecondNumber(double secondNumber){
    this.secondNumber = secondNumber;

}

public double getadditionresult(){
    double add = this.firstNumber + this.secondNumber;
    return add;
}

public double getSubtractionResult(){
    double sub = this.firstNumber - this.secondNumber;
    return sub;

}

public double getMultiplicationResult(){
    double multiply = this.firstNumber*secondNumber;
    return multiply;

}
public double getDivisionResult(){
    double division = this.secondNumber/this.firstNumber;
    return division;
}

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getadditionresult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());





    }



}
