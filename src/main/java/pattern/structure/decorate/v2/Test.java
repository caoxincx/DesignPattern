package pattern.structure.decorate.v2;

import java.io.*;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/9/12
 * @修改人和其它信息
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException {
        //装饰器模式
        Pancake pancake = new Pancake();
        PancakeInterface pancakeInterface = new PancakeWithNEggDecorate(new PancakeWithNSausageDecorate(new PancakeWithNEggDecorate(new Pancake())));
        System.out.println(pancakeInterface.decription());
        System.out.println(pancakeInterface.price());

        //BufferedReader看非常的像，不是像是一样
        FileInputStream in = new FileInputStream("/xxxx");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

    }
}
