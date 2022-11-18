package example;

public class MethodOverloading {
    public static void main(String[] args) {
    	main("hello");
        System.out.println("main with String[] Array");
    }

    public static void main(String args) {
        System.out.println("Overloading main with String");
    }

    public static void main() {
        System.out.println("Overloading main without args");
    }
}