package link.hooray.jdk8.feature.function.basic.functionreturn;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 方法的返回参数是一个函数接口，那么直接可以返回一个lambda表达式
 */
public class Demo05Comparator {
    public static Comparator<String> getComparator(){
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length() - o1.length();
//            }
//        };

        return (o1, o2)->o2.length()-o1.length();
    }

    public static void main(String[] args) {

        String[] strings = new String[]{"aaa","b","cccc","dddddddd"};
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings,getComparator());
        System.out.println(Arrays.toString(strings));
    }
}
