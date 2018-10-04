package it.caoxin.designpriciple.Compositionaggregation;

public class OracleConnection extends DBConnection {
    @Override
    public void getConnection() {
        System.out.println("返回OracleConnection");
    }
}
