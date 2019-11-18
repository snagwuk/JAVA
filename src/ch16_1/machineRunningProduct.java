package ch16_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class machineRunningProduct
{
    
    public static void main(String[] args) throws FileNotFoundException
    {
        String comment1 = "�ƹݶ��� ��ǰ ��Ȳ";
        String comment2 = "�׷����� ����";
        String comment3 = "�ƹݶ��� ��ǰ ������ �׳��̿�";
        String comment4 = "BMW";
        String comment5 = "�ƹݶ��� ��ǰ ������ �����";
        String comment6 = "";
        deepLearning(comment5);
        
    }

    private static void deepLearning(String comment) throws FileNotFoundException
    {
        String process1 = "#�ƹݶ�#�׷���#BMW#����#�󼼶�#�����#�Ⱦ��#�׳��̿�";
        String process2 = "#����#�Ǹ�#��ǰ";
        String process3 = "#�����#�Ⱦ��#�׳��̿�";
        
        
        String prokey1 = "";
        String prokey2 = "";
        String prokey3 = "";
        if(comment.contains("����"))
            prokey3 = "����";
        String tab[] = comment.split(" ");
        for (String tline : tab)
        {
            tline = tline.replace("��", "");
            tline = tline.replace("��", "");
            tline = tline.replace("��", "");
            tline = tline.replace("��Ȳ", "");
            if(tline.trim().length()!=0)
            {
                if(process1.contains(tline))
                    prokey1 = tline;
                if(process2.contains(tline))
                    prokey2 = tline; 
            }
        }
        int con = 0;
        switch (prokey2)
        {
            case "����":
                con = 1;
                break;
            case "�Ǹ�":
                con = 2;
                break;
            case "��ǰ":
                con = 3;
                break;
            
            default:
                con = 0;
                break;
        }
        
        Stream <Product> st = makeStream(prokey1).map( s -> {
            String [] str = s.split(",");
            String temp = "";
            try
            {
                temp = str[4];
            }
            catch (Exception e)
            {
                temp = "";
            }
            return new Product(Integer.parseInt(str[0]), Integer.parseInt(str[1]),
                               str[2], Integer.parseInt(str[3]), temp);
        });
        
        if(prokey3.equals("����"))
        {
           Map<Integer, Long> productMap = makeCon(con,st)
           .collect(Collectors.groupingBy(Product :: getMonth, Collectors.summingLong(Product :: getQty)));
           
           productMap.entrySet().stream().map(s -> {
               String temp=s.getKey()+"";
               if(s.getKey()<10)
                   temp="0"+temp;
               return (temp+"�� " +s.getValue());
           })
           .sorted() .forEach(s ->     System.out.println(s));
        }
        else
        {
            makeCon(con,st).forEach(s -> System.out.println(s));
        }        
    }

    public static Stream<Product> makeCon(int con, Stream<Product> st)
    {
        if (con!=0)
        return st.filter(s -> s.getCon()==con);
        else
            return st;
    }

    public static Stream<String> makeStream(String name) throws FileNotFoundException
    {
        Path path = Paths.get("src/ch16_1/product.txt");
        Stream <String> stream;
        File file = path.toFile();
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        
        return br.lines().filter(s -> s.contains(name));
    }
    
}
