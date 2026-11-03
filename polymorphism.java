public class polymorphism {
    public static void main(String a[]) {
        
        System.out.println("main method.");
        main();
        main(10,20);
        main('a');
    }

    public static void main() {
        System.out.println("No parameter.");
    }

    public static void main(int a, int b) {
        System.out.println("Two parameter.");
    }

    public static void main(char a) {
        System.out.println("char parameter.");
    }
    

}
