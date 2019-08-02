package pattern.behaviour.responsibility.v2;

import pattern.behaviour.responsibility.v2.Father;
import pattern.behaviour.responsibility.v2.Husband;
import pattern.behaviour.responsibility.v2.IWomen;
import pattern.behaviour.responsibility.v2.Son;
import pattern.behaviour.responsibility.v2.Women;

import java.util.ArrayList;
import java.util.Random;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/8/2
 * 功能描述:
 * 修改日期:2019/8/2
 * 修改描述:
 */
public class Main {
    public static void main(String[] args) {
        //随机挑选几个女性
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList();
        for(int i=0;i<5;i++){
            arrayList.add(new Women(rand.nextInt(4),"我要出去逛街"));
        }
        Father father = new Father(1);
        Husband husband = new Husband(2);
        Son son = new Son(3);
        father.setNext(husband);
        husband.setNext(son);
        for (IWomen iWomen : arrayList) {
           father.handlerMessage(iWomen);
        }
    }
}
