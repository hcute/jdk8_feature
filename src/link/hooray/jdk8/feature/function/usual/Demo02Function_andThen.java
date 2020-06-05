package link.hooray.jdk8.feature.function.usual;

import java.util.function.Function;

public class Demo02Function_andThen {

    public static int change(String s, Function<String,Integer> f1,Function<Integer,Integer> f2){
        return f1.andThen(f2).apply(s);
    }

    public static void main(String[] args) {
        String s = "10";
        int change = change(s, s1 -> Integer.parseInt(s), s2 -> s2 + 10);
        System.out.println(change);
    }
}
