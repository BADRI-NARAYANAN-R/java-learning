
class Arith {

     int add(int a, int b){
        System.out.println("2. Sub: "+sub(a,b));
        return a+b;
    }

     int sub(int a, int b){
        System.out.println("3. Mul: "+mul(a,b));
        return a-b;
    }

     int mul(int a, int b){
        System.out.println("4. Div: "+div(a,b));
        return a*b;
    }

     int div(int a, int b){
        return a/b;
    }
}
