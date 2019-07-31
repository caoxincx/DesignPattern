package pattern.behaviour.observer.v1;



/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/7/31
 * 功能描述:
 * 修改日期:2019/7/31
 * 修改描述:
 */
public class Spy extends Thread {
    private HanFeizi hanFeizi;
    private LiShi liShi;
    private String type;

    public Spy() {
    }

    public Spy(HanFeizi hanFeizi, LiShi liShi, String type) {
        this.hanFeizi = hanFeizi;
        this.liShi = liShi;
        this.type = type;
    }

    @Override
    public void run() {
        while (true){
            if ("breakfast".equals(type)){
                if (hanFeizi.isHavingBreakfast()){
                    liShi.update("韩非子在吃饭");
                    hanFeizi.setHavingBreakfast(false);
                }
            }else {
                if (hanFeizi.isHavingFun()){
                    liShi.update("韩非子在娱乐");
                    hanFeizi.setHavingFun(false);
                }
            }
        }
    }
}
