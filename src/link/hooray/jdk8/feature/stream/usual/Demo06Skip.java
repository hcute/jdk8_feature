package link.hooray.jdk8.feature.stream.usual;

import java.util.stream.Stream;

public class Demo06Skip {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("喜洋洋", "美羊羊", "红太狼", "灰太狼");
        Stream<String> skip = stream.skip(3);
        skip.forEach(System.out::println);
    }
}
