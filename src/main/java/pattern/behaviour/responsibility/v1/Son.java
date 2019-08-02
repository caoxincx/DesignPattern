package pattern.behaviour.responsibility.v1;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/8/2
 * 功能描述:
 * 修改日期:2019/8/2
 * 修改描述:
 */
public class Son implements IHander {
    @Override
    public void handlerMessage(IWomen iWomen) {
        System.out.println("丈夫死了的女子:"+iWomen.getRequest());
        System.out.println("同意");
    }
}
