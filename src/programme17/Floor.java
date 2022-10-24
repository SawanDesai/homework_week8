package programme17;

public class Floor {
    double length,width;

    public Floor(double length,double width){
        if(width < 0 && length < 0){
            this.width = width = 0;
            this.length = length =0;
        }
        else{
            this.width = width;
            this.length = length;
        }

    }
    public double getArea(){
        double area;
        area = length * width;
        return area;
    }

}
