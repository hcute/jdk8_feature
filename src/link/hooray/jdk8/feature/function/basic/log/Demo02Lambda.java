package link.hooray.jdk8.feature.function.basic.log;

/**
 * 优化日志
 *  lambda延时加载
 */
public class Demo02Lambda {
    public static void log(int level,MessageBuilder mb){
        if (level == 1) {
            System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        String msg1 = "hello ";
        String msg2 = "world ";
        String msg3 = "java ";

        /*
            说明lambda只有在满足条件的时候才会执行
         */
        log(1,()->{
            System.out.println("只有level是1的时候执行");
            return msg1 + msg2 + msg3;
        });

        log(2,()->{
            System.out.println("只有level是1的时候执行");
            return msg1 + msg2 + msg3;
        });

    }
}
