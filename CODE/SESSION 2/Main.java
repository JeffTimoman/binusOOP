public class Main {
    public static void main(String[] args) {
        String str = "Hello world";
        // String str = new String("Hello World");
        System.out.println(str == "Hello world");
        System.out.println(str.equals("Hello world")); 
        System.out.println(str == "Hello" + " world");
        System.out.println(str.toLowerCase());
        str = str.replace("w", "W");
        str = str.replace("l", "y");
        str = str.replace("He","Ha");
        System.out.println(str.getClass());
        System.out.println(str);

        int a = Integer.parseInt("123456789");
        int b = Integer.valueOf("123456789");
        System.out.println(a + 11);
        System.out.println(b + 11);

        int c = -123;
        System.out.println(Math.abs(c));
        System.out.println(Math.random() * 100);
        System.out.println(Math.round(3.14));
        System.out.println(Math.round(Math.random() * 100));
    }
}
