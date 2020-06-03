package link.hooray.jdk8.feature.function.basic.functionparam;

/**
 * Runnable 接口可以使用lambda表达式实现
 */
public class Demo04Runnale {

    public static void startThread(Runnable r){
        new Thread(r).start();
    }

    public static void main(String[] args) {
        startThread(()->System.out.println("我是Runnable的lambda实现方式"));
    }

}
