package pattern.designpriciple.interfacesgregation;

public class Dog implements IAnimalsAction {
    @Override
    public void eat() {

    }

    @Override
    public void fly() {
        //狗不会飞，这里是空实现
    }

    @Override
    public void swim() {

    }
}
