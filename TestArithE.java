public class TestArithE
{
public static void main(String a[])
{
Arith arith = new Arith();

arith.add(3,2);
int c = Integer.parseInt(a[0]);
int d = Integer.parseInt(a[1]);

try{
System.out.println("Div: " + arith.div(c,d));
}

catch(Exception e)
{
System.out.println(e);
System.out.println("ADD: " + arith.add(c,d)); 
}


}
}
