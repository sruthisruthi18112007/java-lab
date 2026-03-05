package shapes;
 public class Circle implements Shape {
 protected double radius;
public Circle(double r){
 radius = r;
}
public double area() {
 return Math.PI * radius * radius;
}
 public static double area(double r) {
  return Math.PI * r * r;
}
 public double volume() {
return 0;
 }
}