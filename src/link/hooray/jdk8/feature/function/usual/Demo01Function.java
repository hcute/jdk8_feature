package link.hooray.jdk8.feature.function.usual;

import java.util.function.Function;

public class Demo01Function {

    public static Integer changeStr(String s, Function<String,Integer> f){
        return f.apply(s);
    }

    public static void main(String[] args) {
        String s = "10";
        Integer integer = changeStr(s, s1 -> Integer.parseInt(s));
        System.out.println(integer);

    }
}
