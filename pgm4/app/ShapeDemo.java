package app;
import shapes.*;
 public class ShapeDemo {
 public static void main(String[] args){

Shape s;
s=new Cube(3);
System.out.println("Cube Area="+s.area());
System.out.println("Cube Volume="+s.volume());

s=new Sphere(3);
System.out.println("Sphere Area="+s.area());
System.out.println("Sphere Volume="+s.volume());

System.out.println("Square Area(static)="+ Square.area(5));
System.out.println("Square Area(static int)="+ Square.area(6));
System.out.println("Circle Area(static)="+ Circle.area(4));
}
}