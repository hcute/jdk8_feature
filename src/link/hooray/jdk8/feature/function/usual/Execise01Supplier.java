package link.hooray.jdk8.feature.function.usual;

import java.util.function.Supplier;

public class Execise01Supplier {

    //获取int类型数组的最大值，方法的参数传递Supplier<Integer>
    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {100,0,-50,88,99,22,60};

        int result = getMax(() -> {
            // 获取数组的最大值，
            int max = 0;
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println(result);
    }
}
