package link.hooray.jdk8.feature.stream.getstream;

import java.util.*;
import java.util.stream.Stream;

public class Demo01GetStream {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();

        Map<String,String> map = new HashMap<>();
        Set<String> keySet = map.keySet();
        Stream<String> stream2 = keySet.stream();

        Collection<String> values = map.values();
        Stream<String> stream3 = values.stream();

        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream4 = entries.stream();

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        Integer[] arr = {1,2,3,4,5};
        Stream<Integer> arr1 = Stream.of(arr);


    }

}
