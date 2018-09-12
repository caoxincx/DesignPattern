package pattern.creation.singleton.hungrysingleton;

import java.io.Serializable;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/8/30
 * @修改人和其它信息
 */
public class HungrySingleton implements Serializable {
    private  static final HungrySingleton hungrySingleton = new HungrySingleton();
//    或者在静态代码块中初始化
    static {
        if (hungrySingleton != null) {
           throw  new RuntimeException("不能使用构造器初始化话");
        }
    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
//
//    public Object readResolve(){
//        return hungrySingleton;
//    }
}
