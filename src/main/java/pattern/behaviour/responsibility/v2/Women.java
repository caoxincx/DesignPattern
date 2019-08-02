package pattern.behaviour.responsibility.v2;

import pattern.behaviour.responsibility.v2.IWomen;

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
        //为了便于显示，在这里做了点处理
        switch (this.type) {
            case 1:
                this.request = "女儿的请求是：" + request;
                break;
            case 2:
                this.request = "妻子的请求是：" + request;
                break;
            case 3:
                this.request = "母亲的请求是：" + request;
        }

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
