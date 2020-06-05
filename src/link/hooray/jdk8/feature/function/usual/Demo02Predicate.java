package link.hooray.jdk8.feature.function.usual;

import java.util.function.Predicate;

/**
 * 默认方法： and or negate
 *
 *  判断字符串长度大于5，字符串中包含a字符
 */
public class Demo02Predicate {

    private static boolean checkStr(String s, Predicate<String> p1,Predicate<String> p2){
        return p1.and(p2).test(s);
    }

    public static void main(String[] args) {
        String s = "cbcdef";
        boolean a = checkStr(s, s1 -> s1.length() > 5, s2 -> s2.indexOf('a') >= 0);
        System.out.println(s + (a ? "包含a且长度大于5" : "不包含5或者长度不大于5") );
    }

}
