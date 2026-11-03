public class calulator {
    public static void main(String[] args) {

        System.out.println("Add: " + add(20,10));
        System.out.println("Subtract: " + sub(20,10));
        System.out.println("Multiple: " + mul(20,10));
        System.out.println("Divide: " + div(20,10));
    }

    static int add(int a, int b){
        return a+b;
    }

    static int sub(int a, int b){
        return a-b;
    }

    static int mul(int a, int b){
        return a*b;
    }

    static int div(int a, int b){
        return a/b;
    }

}