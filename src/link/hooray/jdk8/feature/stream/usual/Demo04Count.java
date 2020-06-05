package link.hooray.jdk8.feature.stream.usual;

import java.util.ArrayList;
import java.util.List;


public class Demo04Count {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        long count = list.stream().count();
        System.out.println(count);
    }
}
