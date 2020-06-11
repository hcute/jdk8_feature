package link.hooray.jdk8.feature.methodreference.thismethod;

public class Husband {

    public void buyHouse() {
        System.out.println("杭州武林门买一套大平层");
    }

    public void marry(Richable r) {
        r.buy();
    }

    public void soHappy() {
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        Husband h = new Husband();
        h.soHappy();
    }
}
