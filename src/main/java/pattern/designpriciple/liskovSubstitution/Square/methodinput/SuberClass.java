package pattern.designpriciple.liskovSubstitution.Square.methodinput;


import java.util.Map;

public class SuberClass extends Base {
    //重载父类的方法是，入参要比父类的大，不然发生多态调用的时候，就会调用子类重载的方法，不会调用覆盖的方法
    public void getMap(Map map){
        System.out.println("子类map。。。");
    }
}
