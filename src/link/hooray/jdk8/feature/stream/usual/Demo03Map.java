package link.hooray.jdk8.feature.stream.usual;

import java.util.stream.Stream;


public class Demo03Map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");

        Stream<Integer> integerStream = stream.map(s -> Integer.parseInt(s) + 10);

    }
}
