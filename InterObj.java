import pkg.Shape;
class InterObj{
public static void main(String []a) {

Shape s = new Square(20);
s.area();
s= new Rectangle(10, 30);
s.area();
s= new Circle(3);
s.area();



}
}


class Square implements Shape{
int len;

public void area(){
System.out.println(len*len);
}

public Square(int length){
len = length;
}
}

class Rectangle implements Shape{
int len;
int breath;

public void area(){
System.out.println(len*breath);
}

public Rectangle(int length, int bth){
len = length;
breath = bth;
}

}

class Circle implements Shape {
final double pi = 3.14;
int radius;

public void area(){
System.out.println(pi*radius*radius);
}

public Circle(int r){
radius = r;
}

}
