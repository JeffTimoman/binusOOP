import java.io.File;
import java.io.FileReader;

class Code1 {

    public static void null_pointer_exception() {
        String a = null;
        System.out.println(a.length());
        // throw new NullPointerException();
    }

    public static void array_index_out_of_bound_exception() {
        int[] a = new int[5];
        System.out.println(a[5]);
        // throw new ArrayIndexOutOfBoundsException();
    } 

    public static void arithmetic_exception() {
        int a = 5;
        int b = 0;
        System.out.println(a/b);
        // throw new ArithmeticException();
    }

    public static void stack_overflow_error() {
        main(null);
        // throw new StackOverflowError();
    }

    public static void string_out_of_bound_exception() {
        String a = "Hello World";
        System.out.println(a.charAt(12));
        // throw new StringIndexOutOfBoundsException();
    }

    public static void number_format_exception() {
        String a = "Hello World";
        int b = Integer.parseInt(a);
        System.out.println(b);
        // throw new NumberFormatException();
    }

    public static void negative_array_size_exception() {
        int[] a = new int[-5];
        System.out.println(a);
        // throw new NegativeArraySizeException();
    }

    public static void infinite_loop() {
        while(true) {
            // System.out.println("Hello World");
        }
    }


    public static void main(String[] args) {
        // a. Null pointer exception
        // null_pointer_exception();

        // b. Array index out of bound exception
        // array_index_out_of_bound_exception();

        // c. Arithmetic exception
        // arithmetic_exception();

        // d. Stack overflow error
        // stack_overflow_error();

        // e. Syntax error / Typo error / Compile time error
        // System.out.println("Hello World")

        // f. String out of bound exception
        // string_out_of_bound_exception();

        // g. Number format exception
        // number_format_exception();

        // h. Negative array size exception
        // negative_array_size_exception();

        // i. Interrupted exception
        // Thread.sleep(1000);

        // j. File not found exception
        // File file = new File("C:\\Users\\HP\\Desktop\\Java\\SELF LEARNING 2\\1\\Code1.java");
        
    }
}