public class swapno {

    public static void main(String[] args) {

        int a = 10, b = 20, c;

        System.out.println("Before swap");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        c = a;

        a = b;
		
        b = c;

        System.out.println("--After swap--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}