package link.hooray.jdk8.feature.methodreference.classmethod;

public class Demo01ClassMethod {

    public static int method(int a,Calcable c){
        return c.calsAbs(a);
    }

    public static void main(String[] args) {
        int method = method(-10, n -> Math.abs(n));
        System.out.println(method);

        int method1 = method(-10, Math::abs);
        System.out.println(method1);

    }
}
