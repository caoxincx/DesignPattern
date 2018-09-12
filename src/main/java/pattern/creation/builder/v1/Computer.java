package pattern.creation.builder.v1;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/8/29
 * @修改人和其它信息
 */
public class Computer {
    private String mainBoard;
    private String hardStore;
    private String memory;
    private String power;
    private String displayCard;

    public String getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public String getHardStore() {
        return hardStore;
    }

    public void setHardStore(String hardStore) {
        this.hardStore = hardStore;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getDisplayCard() {
        return displayCard;
    }

    public void setDisplayCard(String displayCard) {
        this.displayCard = displayCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "mainBoard:'" + mainBoard + '\'' +
                ", hardStore:'" + hardStore + '\'' +
                ", memory:'" + memory + '\'' +
                ", power:'" + power + '\'' +
                ", displayCard:'" + displayCard + '\'' +
                '}';
    }
}
