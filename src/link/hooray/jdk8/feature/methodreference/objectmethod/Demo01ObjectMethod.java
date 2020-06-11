package link.hooray.jdk8.feature.methodreference.objectmethod;

public class Demo01ObjectMethod {

    public static void printStr(Printable p) {
        p.print("Hello");
    }

    /**
     * 对象的非静态成员方法，使用对象的名::方法名来进行方法引用的实现
     * @param args
     */
    public static void main(String[] args) {
        ObjectMethod objectMethod = new ObjectMethod();
        printStr(objectMethod::printUpperCaseStr);
    }
}
