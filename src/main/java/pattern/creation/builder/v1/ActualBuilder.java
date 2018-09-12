package pattern.creation.builder.v1;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/8/29
 * @修改人和其它信息
 */
public class ActualBuilder extends Builder {
    private Computer computer = new Computer();


    @Override
    public void buildDiplayCard(String displayCard) {
        computer.setDisplayCard(displayCard);
    }

    @Override
    public void buildMainBoard(String mainBoard) {
        computer.setMainBoard(mainBoard);
    }

    @Override
    public void buildMemory(String memory) {
        computer.setMemory(memory);
    }

    @Override
    public void buildPower(String power) {
        computer.setPower(power);
    }

    @Override
    public void buildHardStore(String hardStore) {
        computer.setHardStore(hardStore);
    }

    @Override
    public Computer buildComputer() {
        return computer;
    }
}
