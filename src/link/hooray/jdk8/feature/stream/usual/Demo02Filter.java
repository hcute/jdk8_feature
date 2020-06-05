package link.hooray.jdk8.feature.stream.usual;

import java.util.stream.Stream;

public class Demo02Filter {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        Stream<String> stream1 = stream.filter(s -> s.startsWith("张"));
        stream1.forEach(s -> System.out.println(s));
    }
}
