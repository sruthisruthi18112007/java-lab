package shapes;
 public class Cube extends Square {
 public Cube(double s){
super(s);
}
 public double area() {
 double tmp=super.area();
return 6*tmp;
}
 public double volume() {
   return side*side*side;
 }
}