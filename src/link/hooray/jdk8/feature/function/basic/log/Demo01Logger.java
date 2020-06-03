package link.hooray.jdk8.feature.function.basic.log;

/**
 * 存在的问题：
 *      传入日志的方法是一个字符串，如果等级不是1，就不会打印字符串，所以存在资源浪费
 */
public class Demo01Logger {

    private static void log(int level,String log){
        if (level == 1) {
            System.out.println(log);
        }
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello ");
        sb.append("world ");
        sb.append("java!");
        log(1,sb.toString());
    }
}
