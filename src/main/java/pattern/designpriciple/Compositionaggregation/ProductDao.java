package it.caoxin.designpriciple.Compositionaggregation;

public class ProductDao {
    DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        dbConnection.getConnection();
        System.out.println("增加产品");
    }
}
