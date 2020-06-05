package link.hooray.jdk8.feature.function.usual;

import java.util.function.Predicate;

/**
 * 用于判断
 */
public class Demo01Predicate {

    public static boolean checkString(String str, Predicate<String> p){
        return p.test(str);
    }

    public static void main(String[] args) {
        String str = "hello java";
        boolean b = checkString(str, param -> param.length() > 5);
        System.out.println(str + "的长度" + (b ? "大于5" : "不大于5"));
    }
}
