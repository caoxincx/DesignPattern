package pattern.creation.simplefactory.ex1;

/**
 * @描述 测试简单工厂
 * @创建人 caoxin
 * @创建时间 2018/8/28
 * @修改人和其它信息
 */
public class Test {
    /*
    ex1中看类图，可以看出第一种方法实现的简单工厂模式违反了依赖导致原则，
    上层不应该依赖下层，下层不应该依赖上层，上下层都应该依赖接口，如何改变

    使用的是：反射
     */

    public static void main(String[] args) {
        Car bmw = SimpleFactory.CarFactory("BMW");
        bmw.showCar();

        Car fll = SimpleFactory.CarFactory("FLL");
        fll.showCar();

        Car jl = SimpleFactory.CarFactory("JL");
        jl.showCar();
    }
}
