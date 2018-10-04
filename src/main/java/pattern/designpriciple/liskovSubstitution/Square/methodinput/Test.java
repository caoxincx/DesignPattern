package it.caoxin.designpriciple.liskovSubstitution.Square.methodinput;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Base subClass = new SuberClass();
        subClass.getMap(new HashMap());
    }
}
