package pattern.creation.singleton.hungrysingleton;

import pattern.creation.singleton.doubleCheck.T;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @描述  序列化破环单例 加 public Object resloveRead()方法
 *        反射攻击 饿汉式可以防止，懒汉式不可以防止
 * @创建人 caoxin
 * @创建时间 2018/8/30
 * @修改人和其它信息
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        HungrySingleton singleton = HungrySingleton.getInstance();
//
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("singleton"));
//        objectOutputStream.writeObject(singleton);
//
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("singleton"));
//        HungrySingleton newInstance = (HungrySingleton) objectInputStream.readObject();
//
//        System.out.println(singleton == newInstance);

        HungrySingleton singleton = HungrySingleton.getInstance();

        Class clazz = HungrySingleton.class;
        Constructor constructor =
                clazz.getDeclaredConstructor();
        constructor.setAccessible(true);

        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
        System.out.println(singleton == newInstance);

    }
}
