package pattern.structure.decorate.v2;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/9/12
 * @修改人和其它信息
 */
public class PancakeDecorate extends PancakeInterface{
    protected PancakeInterface pancake;

    public PancakeDecorate(PancakeInterface pancake) {
        this.pancake = pancake;
    }

    @Override
    public String decription() {
        return pancake.decription();
    }

    @Override
    public int price() {
        return pancake.price();
    }
}
