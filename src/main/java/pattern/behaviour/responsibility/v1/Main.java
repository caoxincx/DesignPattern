package pattern.behaviour.responsibility.v1;

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

        Father father = new Father();
        Husband husband = new Husband();
        Son son = new Son();
        for (IWomen iWomen : arrayList) {
            if (1 == iWomen.getType()){
                father.handlerMessage(iWomen);
            }else if(2 == iWomen.getType()){
                husband.handlerMessage(iWomen);
            }else if(3 == iWomen.getType()){
                son.handlerMessage(iWomen);
            }else {

            }
        }
    }
}
