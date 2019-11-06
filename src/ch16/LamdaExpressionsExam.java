package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LamdaExpressionsExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        List<Student> list = Arrays.asList(new Student("신용권",92),new Student("홍길동",90));
        Stream<Student> stream = list.stream();
        stream.forEach( s-> {
            String name = s.getName();
            int scroe = s.getScore();
            System.out.println(name+ "-" + scroe);
        });
    }
    
}
class Student implements Comparable<Student>
{
    private String name;
    private int score;
    public Student(String name, int score)
    {
        super();
        this.name = name;
        this.score = score;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getScore()
    {
        return score;
    }
    public void setScore(int score)
    {
        this.score = score;
    }
    @Override
    public int compareTo(Student o)
    {
        // TODO Auto-generated method stub
        return Integer.compare(score, o.score);
    }
    
}
