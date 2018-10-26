package pattern.designpriciple.singleresponsibility.singleclass;

public class Bird {
    public static void birdMainMove(String bridName){
        //在修改原来的类的时候，如果类不是单一职责原则，很容易导致修改发生bug
        if (bridName.equals("鸵鸟")){
            System.out.println(bridName+"会走");
        }
        System.out.println(bridName+"会飞");
    }
    public static void main(String[] args) {
        /*
        类，接口，方法职责单一
         */
        birdMainMove("鸟");
        birdMainMove("鸵鸟");
    }
}
