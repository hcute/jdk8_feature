package link.hooray.jdk8.feature.function.usual;

import java.util.function.Consumer;

public class Demo01Consumer {

    public static void consume(String name, Consumer<String> con){
        con.accept(name);
    }

    public static void main(String[] args) {
        consume("赵丽颖",(str)-> System.out.println(str));
        consume("赵丽颖",(str)->{
            String name = new StringBuffer(str).reverse().toString();
            System.out.println(name);
        });
    }
}
