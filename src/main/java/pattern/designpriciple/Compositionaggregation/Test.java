package it.caoxin.designpriciple.Compositionaggregation;

public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new MySqlConnection());
        productDao.addProduct();

        productDao.setDbConnection(new OracleConnection());
        productDao.addProduct();
    }
}
