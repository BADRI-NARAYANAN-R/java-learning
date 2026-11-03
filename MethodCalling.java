public class MethodCalling {
    //Method call a another method.
    public static void main(String[] args) {
        System.out.println("1. Add: "+add(20,10));
    }

    static int add(int a, int b){
        System.out.println("2. Sub: "+sub(20,10));
        return a+b;
    }

    static int sub(int a, int b){
        System.out.println("3. Mul: "+mul(20,10));
        return a-b;
    }

    static int mul(int a, int b){
        System.out.println("4. Div: "+div(20,10));
        return a*b;
    }

    static int div(int a, int b){
        return a/b;
    }
}