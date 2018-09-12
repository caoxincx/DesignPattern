package pattern.creation.factorymethod.ex1.factory;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/8/28
 * @修改人和其它信息
 */
public class Test {
    /*
    工厂方法模式：实现了应用层与具体需要的实体类解耦。
    工厂方法的模式是：如果创建一个实现类，继承或者实现product接口或者抽象类。
                      创建该类对应的工厂

                      应用层直接依赖工厂，如果这个类需要修改，则应用层的代码都不会变动
                      工厂方法是解决不同产品之间的创建问题

                      如果这个产品有产品族，则工厂方法解决不了。

                      工厂方法还有一个缺点就是：一个产品对应一个工厂，如果有多个产品就会有多个工厂。
     */
    public static void main(String[] args) {
        CarFactory carFactory = new BMWFactory();
        carFactory.createCar();

        FLLFactory fllFactory = new FLLFactory();
        fllFactory.createCar();

        JLFactory jlFactory = new JLFactory();
        jlFactory.createCar();
    }
}
