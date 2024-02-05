package Model;

public class cuboid extends rectangle{
    double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
//    @Override
//    public void area() {
//        super.area();
//    }
    public void areaI(){
        double area = 2*((this.length*this.breadth) + (this.breadth* this.height) + (this.height*this.length)); //2(lb+bh+hl),
        System.out.println(area);
    }

    public void volume(){
        double volume = this.length * this.breadth * this.height;
        System.out.println(volume);
    }
}
