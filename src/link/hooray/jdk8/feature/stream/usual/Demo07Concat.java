package link.hooray.jdk8.feature.stream.usual;

import java.util.stream.Stream;

public class Demo07Concat {
    public static void main(String[] args) {
        String[] arr = {"美羊羊","喜洋洋","懒洋洋","沸羊羊","灰太狼","红太狼"};

        Stream<String> stream1 = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");

        Stream<String> stream2 = Stream.of(arr);

        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach(System.out::println);
    }



}
