package link.hooray.jdk8.feature.methodreference.newMethod;

public class Dem02NewMethod {

    public static int[] createArray(int len,ArrayBuilder ab){
        return ab.build(len);
    }

    public static void main(String[] args) {
        int[] array = createArray(10, int[]::new);
        System.out.println(array.length);
    }
}
