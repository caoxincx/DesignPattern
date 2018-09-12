package pattern.creation.builder.v2;

import pattern.creation.builder.v1.Builder;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/8/30
 * @修改人和其它信息
 */
public class Computer {
    /*
        存贮传入的数据，属性
     */
    private String mainBoard;
    private String hardStore;
    private String memory;
    private String power;
    private String displayCard;

    /*

     */

    public Computer(ComputerBuilder computerBuilder) {
        this.mainBoard =  computerBuilder.mainBoard;
        this.displayCard = computerBuilder.displayCard;
        this.hardStore = computerBuilder.hardStore;
        this.memory = computerBuilder.memory;
        this.power = computerBuilder.power;
    }

    public static class ComputerBuilder {
        private String mainBoard;
        private String hardStore;
        private String memory;
        private String power;
        private String displayCard;

        public ComputerBuilder buildDiplayCard(String displayCard) {
            this.displayCard = displayCard;
            return this;
        }

        public ComputerBuilder buildMainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }

        public ComputerBuilder buildMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public ComputerBuilder buildPower(String power) {
            this.power = power;
            return this;
        }

        public ComputerBuilder buildHardStore(String hardStore) {
            this.hardStore = hardStore;
            return this;
        }
        public Computer buildComputer(){
            return new Computer(this);
        }
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
