package it.caoxin.designpriciple.liskovSubstitution.Square.methodoutput;

import java.util.HashMap;
import java.util.Map;

public class Base {
    public Map method(){
        System.out.println("父类method()方法");
        return new HashMap();
    }
}
