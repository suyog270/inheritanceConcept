package Model;

public class cylinder extends circle{
    double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void areaI() {
        double area = 2 * this.pi * ((this.radius)*(this.radius));
        System.out.println(area);
    }

    public void volume() {
        double volume = this.height * this.pi * ((this.radius)*(this.radius));
        System.out.println(volume);
    }
}

