package pattern.behaviour.responsibility.v2;



/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/8/2
 * 功能描述:
 * 修改日期:2019/8/2
 * 修改描述:
 */
public interface IHander {
     void handlerMessage(IWomen iWomen);
     void setNext(Hander handler);
     void response(IWomen women);

}
