package link.hooray.jdk8.feature.function.usual;

import java.util.function.Function;

public class Execise01Function {

    public static int change(String s, Function<String,String> f1,Function<String,Integer> f2,Function<Integer,Integer> f3){
        return f1.andThen(f2).andThen(f3).apply(s);
    }

    public static void main(String[] args) {
        String s = "赵丽颖,20";
        int change = change(s, s1 -> s.split(",")[1], s2 -> Integer.parseInt(s2), s3 -> s3 + 100);
        System.out.println(s.split(",")[0] + "已经" +change + "岁了");
    }
}
