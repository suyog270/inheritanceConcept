import Model.circle;
import Model.cuboid;
import Model.cylinder;
import Model.rectangle;
public class Main{
    public static void main(String[] args) {
        circle c1 = new circle();
        cuboid c2 = new cuboid();
        cylinder c3 = new cylinder();
        rectangle r2  = new rectangle();

        c1.setRadius(5);
        c1.area();
    }
}