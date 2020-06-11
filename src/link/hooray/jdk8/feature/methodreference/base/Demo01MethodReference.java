package link.hooray.jdk8.feature.methodreference.base;

public class Demo01MethodReference {

    public static void printStr(Printable p) {
        p.print("Hello World!");
    }

    public static void main(String[] args) {
        printStr( s -> {
            System.out.println(s);
        });

        printStr(System.out::println);
    }
}
