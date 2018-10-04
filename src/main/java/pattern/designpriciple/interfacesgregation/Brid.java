package it.caoxin.designpriciple.interfacesgregation;

public class Brid implements IAnimalsAction {
    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {
        //鸟不会游泳在游泳，这里是空实现
    }
}
