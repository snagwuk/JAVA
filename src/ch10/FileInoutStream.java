package ch10;

public class FileInoutStream
{
    private String file;
    public FileInoutStream(String file)
    {
        this.file = file;
    }
    public void read()
    {
        System.out.println(file+"�н��ϴ�.");
    }
    public void close() throws Exception
    {
        System.out.println(file+"�ݽ��ϴ�.");
    }
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
    }
    
}
