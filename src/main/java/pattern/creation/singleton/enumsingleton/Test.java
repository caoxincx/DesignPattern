package pattern.creation.singleton.enumsingleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.Seriable序列化不会破坏
        EnumSingleton instance = EnumSingleton.getInstance();
//        序列化
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("/abc")));
        out.writeObject(instance);
//        反序列化
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("/abc"));
        EnumSingleton newInstance = (EnumSingleton) in.readObject();
        System.out.println("instance:"+instance);
        System.out.println("newInstance:"+newInstance);
        System.out.println(instance == newInstance);



        //2.反射攻击---也是不行的
//        Class<? extends EnumSingleton> clazz = instance.getClass();
//        Constructor<? extends EnumSingleton> constructor = clazz.getDeclaredConstructor(String.class,int.class);
//        EnumSingleton newInstance = constructor.newInstance("曹欣",666);
//        System.out.println("instance:"+instance);
//        System.out.println("newInstance:"+newInstance);
//        System.out.println(instance == newInstance);
//        E:\eclipseOxgenWorkspace\DesignPattern\src\it\caoxin\create\singleton\Test.java
        instance.testPrint();

    }
}
