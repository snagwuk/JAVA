package ch13;

public class ProductExam
{
    public static void main(String[] args)
    {
        Product<Tv,String> product1 = new Product<Tv,String>();
        
        product1.setKind(new Tv());
        product1.setModel("½º¸¶Æ®TV");
        Tv tv = product1.getKind();
        String tvModel = product1.getModel();
        
        Product<Car, String> product2 = new  Product<Car, String>();
        product2.setKind(new Car());
        product2.setModel("µðÁ©");
        Car car = product2.getKind();
        String tvModel2 = product2.getModel();
    }
}

class Product<T,M>
{
    private T kind;
    private M model;
    public T getKind()
    {
        return kind;
    }
    public void setKind(T kind)
    {
        this.kind = kind;
    }
    public M getModel()
    {
        return model;
    }
    public void setModel(M model)
    {
        this.model = model;
    }
}
class Car
{
    
}
class Tv
{
    
}
