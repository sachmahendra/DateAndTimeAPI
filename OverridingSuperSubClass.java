class Super{
    public void display(){
     System.out.println("Super class display");
 
    }
 }
 class Sub extends Super{
     public void display(){
         System.out.println("Sub class display");
     }
 }
 
 public class OverridingSuperSubClass {
     public static void main(String[] args) {
         Super su= new Super();
         su.display();
         Sub sub = new Sub();
         sub.display();
         
         // DYNAMIC METHOD DISPATCH USES HERE ESLIYE SUB CLASS IS CALLED HERE NOT SUPER CLASS
 
         Super s = new Sub();
         s.display();
     }
 }