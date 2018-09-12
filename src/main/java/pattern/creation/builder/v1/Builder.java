package pattern.creation.builder.v1;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/8/29
 * @修改人和其它信息
 */
public abstract class Builder {
    public abstract void buildDiplayCard(String displayCard);
    public abstract void buildMainBoard(String mainBoard);
    public abstract void buildMemory(String memory);
    public abstract void buildPower(String power);
    public abstract void buildHardStore(String hardStore);
    public abstract Computer buildComputer();

}
