package pattern.creation.simplefactory.ex2;


/**
 * @描述 测试简单工厂
 * @创建人 caoxin
 * @创建时间 018/8/8
 * @修改人和其它信息
 */
public class Test {
   
    public static void main(String[] args) {
        Car car = CarFactory.CarFactory(BMW.class);
        car.showCar();

        Car fLL = CarFactory.CarFactory(FLL.class);
        fLL.showCar();

        Car jL = CarFactory.CarFactory(JL.class);
        jL.showCar();
    }
}
