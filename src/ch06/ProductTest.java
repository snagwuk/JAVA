package ch06;
class Product
{

    public static int count = 0;
    public int serialNo;
    Product()
    {
        serialNo = ++count;
    }

}
public class ProductTest
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        System.out.println("p1의 제품번호(serial no)는" + p1.serialNo);
        System.out.println("p1의 제품번호(serial no)는" + p2.serialNo);
        System.out.println("p1의 제품번호(serial no)는" + p3.serialNo);
        System.out.println("생산된 제품의 수는 모두 " + Product.count + "개입니다.");

    }

}
