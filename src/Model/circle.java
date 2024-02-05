package Model;

public class circle{
    double pi = 3.14;
    double radius;

    public double getPi() {
        return pi;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void area(){
        double area = this.pi * ((this.radius) * (this.radius));
        System.out.println(area);
    }

}
