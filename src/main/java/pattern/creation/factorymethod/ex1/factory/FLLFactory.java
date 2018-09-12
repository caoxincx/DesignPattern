package pattern.creation.factorymethod.ex1.factory;


/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/8/28
 * @修改人和其它信息
 */
public class FLLFactory implements CarFactory {
    public Car createCar() {
        return new FLL();
    }
}
