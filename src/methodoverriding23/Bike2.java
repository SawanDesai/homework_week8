package methodoverriding23;

public class Bike2 extends Vehicle{
    public void run(){
        System.out.println("bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 obj = new Bike2();
        obj.run();
    }
}
