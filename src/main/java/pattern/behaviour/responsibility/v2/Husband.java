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
public class Husband extends Hander {
    public Husband(int _level) {
        super(_level);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("出嫁的女子:"+women.getRequest());
        System.out.println("同意");
    }
}
