package ch15;

import java.util.List;
import java.util.Vector;

public class VectorExam
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        List<Board> list = new Vector<Board>();
        list.add(new Board("����1","����1","�۾���1"));
        list.add(new Board("����2","����2","�۾���2"));
        list.add(new Board("����3","����3","�۾���3"));
        list.add(new Board("����4","����4","�۾���4"));
        list.add(new Board("����5","����5","�۾���5"));
        list.remove(2);
        list.remove(3);
        for(int i =0;i<list.size();i++)
        {
            Board b = list.get(i);
            System.out.println(b.subject + ": " + b.content + " : " + b.writer);
        }
    }
    
}
class Board
{
    String subject;
    String content;
    String writer;
    public Board(String subject, String content, String writer)
    {
        super();
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }
    
}