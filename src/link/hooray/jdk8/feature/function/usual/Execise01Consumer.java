package link.hooray.jdk8.feature.function.usual;

import java.util.function.Consumer;

public class Execise01Consumer {

    public static void printInfo(String[] arr, Consumer<String> con1,Consumer<String> con2){
        for (String s : arr) {
            con1.andThen(con2).accept(s);
        }
    }
    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女","古力娜扎,女","玛尔扎哈,男"};
        printInfo(arr,(str)-> System.out.print("姓名：" + str.split(",")[0]),
                (str) ->System.out.println("，性别：" + str.split(",")[1]));
    }
}
