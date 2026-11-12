public class TestCircle
{
public static void main(String a[])
{

Circle c = new Circle(3);
c.area();

}
}


class Circle{

int radius;
final float pi = 3.14f;

public void area(){
System.out.println(pi*radius*2);
System.out.println(radius);
}


public Circle(int r){
radius = r;
}

}