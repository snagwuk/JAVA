package ch06;

public class BlockTest
{
    static
    {
        System.out.println("static {}");
    }

    public BlockTest()
    {
        System.out.println("������");
    }
    {
        System.out.println("{ }");
    }
    public static void main(String[] args)
    {

        System.out.println("BlockTest bt = new BlockTest(); ");
        BlockTest bt = new BlockTest();
        System.out.println("BlockTest bt2 = new BlockTest(); ");
        BlockTest bt2 = new BlockTest();

    }

}
