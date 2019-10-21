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
        System.out.println(file+"읽습니다.");
    }
    public void close() throws Exception
    {
        System.out.println(file+"닫습니다.");
    }
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
    }
    
}
