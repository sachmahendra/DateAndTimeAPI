class Circle{   
    //parent class or super class

    public double radius;
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return Math.PI * 2 * radius;
    }
    public double circumference(){
        return perimeter();
    }

}
//child calss or subclass
class Cylinder extends Circle{
    public double height;
    public double volume(){
        return area()*height;
    }

}

public class CircleCylinderInheritance {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.radius = 7;
        c.height = 10;
        System.out.println("Area is: "+c.area());
        System.out.println("volume is: "+c.volume());
    }
}