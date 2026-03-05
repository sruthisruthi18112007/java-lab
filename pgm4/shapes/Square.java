package shapes;

public class Square  implements Shape {
protected double side; 
public Square(double s) {
 side=s;
}

public double area(){
 return side*side;
}
 public static double area(double s) {
 return s*s;
}
 public static double area(int s){
 return s*s;
}
 public double volume() {
return 0;
}
}