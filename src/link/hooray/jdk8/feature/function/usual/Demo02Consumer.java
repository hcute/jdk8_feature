package link.hooray.jdk8.feature.function.usual;

import java.util.function.Consumer;

/**
 * andThen方法，组合两个Consumer接口来消费
 */
public class Demo02Consumer {

    public static void consume(String name, Consumer<String> con1,Consumer<String> con2){
        con1.andThen(con2).accept(name);
    }

    public static void main(String[] args) {
        String name = "java";
        consume(name,(str1)->{
            System.out.println(str1.toUpperCase());
        },(str2)->{
            System.out.println(str2.toLowerCase());
        });

//        Student student = new Student();
//        student.setName(name);
//        consume(student.getName(),str -> student.setName("world " + str),str -> student.setName("hello " + str));
//
//        System.out.println(student.getName());

    }
}
