package it.caoxin.designpriciple.singleresponsibility.singleclass;

public class Test {
    public static void main(String[] args) {
        FlyBrid flyBrid = new FlyBrid();
        flyBrid.Fly("鸟");

        WalkBrid walkBrid = new WalkBrid();
        walkBrid.walk("鸵鸟");
    }
}
