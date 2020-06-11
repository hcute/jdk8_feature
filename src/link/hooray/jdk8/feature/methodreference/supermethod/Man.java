package link.hooray.jdk8.feature.methodreference.supermethod;

public class Man extends Human {

    @Override
    public void sayHello() {
        System.out.println("hello man");
    }

    public void method(Greetable g){
        g.greet();
    }

    /**
     * 子类中的方法method 如果入参是 函数接口，子类中的show方法调用method方法
     *      入参可以使用super::sayHello 调用父类成员方法
     *      入参也可以用this::sayHello 调用本类的成员方法
     */
    public void show(){
        method(super::sayHello);
        method(this::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
