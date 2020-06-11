package link.hooray.jdk8.feature.methodreference.newMethod;

public class Demo01NewMethod {

    public static Person buildPerson(String name,PersonBuilder pb){
        return pb.build(name);
    }

    /**
     * 构造方法的引用 类名::new
     * @param args
     */
    public static void main(String[] args) {
        Person person = buildPerson("迪丽热巴", Person::new);
        System.out.println(person.getName());
    }
}
