package pattern.designpriciple.openclose;

public interface ICourse {
    Integer getId();
    String getName();
    Double getPrice();
// 不可取 Double  getDiscountPrice();
}
