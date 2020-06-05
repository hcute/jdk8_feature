package link.hooray.jdk8.feature.stream.usual;

import java.util.stream.Stream;

public class Demo01ForEach {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        stream.forEach(s -> System.out.println(s));

    }
}
