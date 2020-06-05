package link.hooray.jdk8.feature.stream.usual;

import java.util.stream.Stream;

public class Demo05Limit {

    public static void main(String[] args) {
        String[] arr = {"美羊羊","喜洋洋","懒洋洋","沸羊羊","灰太狼","红太狼"};
        Stream<String> arr1 = Stream.of(arr);
        Stream<String> limit = arr1.limit(2);
        limit.forEach(System.out::println);
    }
}
