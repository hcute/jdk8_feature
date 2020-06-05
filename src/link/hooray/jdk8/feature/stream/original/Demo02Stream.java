package link.hooray.jdk8.feature.stream.original;

import java.util.ArrayList;
import java.util.List;

public class Demo02Stream {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("赵敏");
        list.add("周芷若");
        list.add("张三丰");
        list.add("张强");
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
    }
}
