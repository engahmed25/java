public class xz {
    public static void main(String[] args){
        Circle c = new Circle(3);
        System.out.println(c.getArea());
    }
}

class Circle {
    private double radius;
    public Circle(){
    radius = 1;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
    return radius*radius*Math.PI;
    }
}