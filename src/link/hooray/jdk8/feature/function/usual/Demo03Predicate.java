package link.hooray.jdk8.feature.function.usual;

import java.util.function.Predicate;

/**
 * predicate or 方法和 negate方法
 */
public class Demo03Predicate {

    public static boolean checkStr(String s , Predicate<String> p1,Predicate<String> p2){
        return p1.or(p2).test(s);
    }

    public static boolean checkStrByNegate(String s,Predicate<String> p) {
        return p.negate().test(s);
    }

    public static void main(String[] args) {
        String str = "abcdef";
        boolean a = checkStr(str, s -> s.length() > 5, s -> s.indexOf('a') >= 0);
        System.out.println(a);
        boolean b = checkStrByNegate(str, s -> s.length() > 5);
        System.out.println(b);
    }
}
