package link.hooray.jdk8.feature.function.usual;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Execise01Predicate {

    /**
     * 判断人员信息中的姓名为4，且是女生的人
     * @param persons
     * @param p1
     * @param p2
     * @return
     */
    public static ArrayList<String> fliter(String[] persons, Predicate<String> p1,Predicate<String> p2) {
        ArrayList<String> strings = new ArrayList<>();
        for (String person : persons) {
            boolean test = p1.and(p2).test(person);
            if (test) {
                strings.add(person);
            }
        }
        return strings;
    }

    public static void main(String[] args) {
        String[] arr = {"古力娜扎,女","迪丽热巴,女","马尔扎哈,男","赵丽颖,女"};
        ArrayList<String> results = fliter(arr, s -> s.split(",")[0].length() == 4, s -> s.split(",")[1].equals("女"));
        for (String result : results) {
            System.out.println(result);
        }

    }
}
