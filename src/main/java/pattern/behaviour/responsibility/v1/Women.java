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
public class Women implements IWomen {
    private int type = 0;
    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        this.request = request;
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public String getRequest() {
        return request;
    }
}
