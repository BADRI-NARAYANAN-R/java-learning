
public class ArithE {

     int add(int a, int b){
        System.out.println("2. Sub: "+sub(a,b));
        return a+b;
    }

     int sub(int a, int b){
        System.out.println("3. Mul: "+mul(a, 
        b));
        return a-b;
    }

     int mul(int a, int b){
 
        return a*b;
    }

     int div(int a, int b){
     int res = 0;

     if (b < 0)
	{
	ArithmeticException e = new ArithmeticException("divider cannot be zero");
	throw e;
	}
	else{
    	 res = a/b;
	}
     return res;

    }
}









