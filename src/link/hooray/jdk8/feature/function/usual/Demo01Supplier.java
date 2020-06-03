package link.hooray.jdk8.feature.function.usual;

import java.util.function.Supplier;

public class Demo01Supplier {


    // 定一个方法，方法的参数传递Supplier<T> 接口，
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        String string = getString(() -> "胡歌");
        System.out.println(string);
    }
}
