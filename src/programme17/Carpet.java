package programme17;

public class Carpet {
    double cost;

    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = cost = 0;
        }
        this.cost = cost;
    }

    public double getCost() {
        return this.cost;

    }
}
