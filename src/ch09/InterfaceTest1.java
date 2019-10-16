package ch09;
interface Parseable
{
    void parse(String filename);
}
class ParseManager
{
    public static Parseable getParser(String type)
    {
     if(type.equals("XML"))
         return new XMLParser();
     else
         return new HTMLParser();
    }
}
class XMLParser implements Parseable
{

    @Override
    public void parse(String filename)
    {
        // TODO Auto-generated method stub
        System.out.println(filename + "=> XML parsing");
    }
    
}
class HTMLParser implements Parseable
{

    @Override
    public void parse(String filename)
    {
        // TODO Auto-generated method stub
        System.out.println(filename + "=> HTML parsing");
    }
    
}

public class InterfaceTest1
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Parseable p = ParseManager.getParser("XML");
        p.parse("doc.xml");
        p=ParseManager.getParser("HTML");
        p.parse("doc.html");
    }
    
}
