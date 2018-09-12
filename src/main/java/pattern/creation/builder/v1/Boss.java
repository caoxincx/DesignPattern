package pattern.creation.builder.v1;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/8/29
 * @修改人和其它信息
 */
public class Boss {
    private ActualBuilder actualBuilder;

    public Boss() {

    }
    public void setActualBuilder(ActualBuilder actualBuilder){
        this.actualBuilder = actualBuilder;
    }
    public Computer getComputer(String displayCard,String mainBoard,String memory,String power,String hardStore){
        actualBuilder.buildDiplayCard(displayCard);
        actualBuilder.buildMainBoard(mainBoard);
        actualBuilder.buildPower(power);
        actualBuilder.buildMemory(memory);
        actualBuilder.buildHardStore(hardStore);
        return actualBuilder.buildComputer();
    }
}
