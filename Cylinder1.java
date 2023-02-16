class Cylinder{
    public double radius;
    public double height;
    public double lidArea(){
        return Math.PI * radius * radius;
    }
    public double circumference(){
        return Math.PI * 2 *radius;
    }
    public double totalsurfaceArea(){
        return 2 * lidArea() + circumference() * height;
    }
    public double volumn(){
        return lidArea() * height;
    }

}
public class Cylinder1 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.radius = 7;
        c1.height = 10;
        System.out.println("lidArea1 is: "+ c1.lidArea());
        System.out.println("circumference1 is: "+c1.circumference());
        System.out.println("totalsurfaceArea1 is: "+c1.totalsurfaceArea());
        System.out.println("volumn1 is: "+c1.volumn());
        
    }
}
