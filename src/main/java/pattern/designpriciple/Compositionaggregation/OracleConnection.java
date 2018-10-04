package pattern.designpriciple.Compositionaggregation;

import pattern.designpriciple.Compositionaggregation.DBConnection;

public class OracleConnection extends DBConnection {
    @Override
    public void getConnection() {
        System.out.println("返回OracleConnection");
    }
}
