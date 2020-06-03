package link.hooray.jdk8.feature.function.basic;

public class Test {

    public static void show(MyFunctionInterface myInter){
        myInter.method();
    }

    public static void main(String[] args) {
        // 使用匿名内部类，会生产一个class 文件
        show(new MyFunctionInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写方法");
            }
        });

        // 使用lambda 不会产生一个class 文件，效率会高一点
        show(() -> {
            System.out.println("使用lambda方式重写方法");
        });

        // 简化lambda使用
        show(()->System.out.println("使用简化lambda方式重写方法"));
    }
}
