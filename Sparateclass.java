public class Sparateclass{

    //create a object sparate class.
    public static void main(String[] args) {

        objectCreating obj = new objectCreating();

        System.out.println("1. Add: " + obj.add(20,10));
    }


}

 class objectCreating {

     int add(int a, int b){
        System.out.println("2. Sub: "+sub(20,10));
        return a+b;
    }

     int sub(int a, int b){
        System.out.println("3. Mul: "+mul(20,10));
        return a-b;
    }

     int mul(int a, int b){
        System.out.println("4. Div: "+div(20,10));
        return a*b;
    }

     int div(int a, int b){
        return a/b;
    }
}