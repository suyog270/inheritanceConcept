package Model;

public class rectangle {
    double length;
    double breadth;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public void area(){
        double area = this.length * this.breadth;
        System.out.println("Area of rectangle: " + area);
    }



}
