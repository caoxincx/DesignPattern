package pattern.designpriciple.Compositionaggregation;

public class MySqlConnection extends DBConnection{

    @Override
    public void getConnection() {
        System.out.println("返回MysqlConnection");
    }
}
