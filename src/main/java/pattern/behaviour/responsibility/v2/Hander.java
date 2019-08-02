package pattern.behaviour.responsibility.v2;

import java.util.logging.Handler;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/8/2
 * 功能描述:
 * 修改日期:2019/8/2
 * 修改描述:
 */
public abstract class Hander implements IHander {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;
    //能处理的级别
    private int level = 0;
    //责任传递，下一个人责任人是谁
    private Hander nextHandler;
    //每个类都要说明一下自己能处理哪些请求
    public Hander(int _level){
        this.level = _level;
    }

    @Override
    public final void handlerMessage(IWomen iWomen) {
        if (level == iWomen.getType()){
            response(iWomen);
        }else {
            if (nextHandler != null){
                nextHandler.handlerMessage(iWomen);
            }else {
                System.out.println("no one can handler");
            }
        }
    }

    @Override
    public void setNext(Hander handler) {
        nextHandler = handler;
    }

    public abstract void response(IWomen women);
}
