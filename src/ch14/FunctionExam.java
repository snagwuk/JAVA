package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExam
{
    private static List<Student> list = Arrays.asList(new Student("홍길동",90,96), new Student("신용권",95,93));
    
    public static void printString(Function<Student, String> function) 
    {
        for(Student s : list)
        {
            System.out.print(function.apply(s) + " ");
        }
        System.out.println();
            
    }
    public static void printInt(ToIntFunction<Student> function)
    {
        for(Student s : list)
        {
            System.out.print(function.applyAsInt(s) + " ");
        }
        System.out.println();
    }
    public static double avg(ToIntFunction<Student> function)
    {
        int sum = 0;
        for(Student s : list)
            sum+= function.applyAsInt(s);
        
        double avg = (double) sum / list.size();
        return avg;
    }
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.println("학생이름 : ");
        printString(t -> t.getName());
        System.out.println("영어점수 : ");
        printInt(t -> t.getEnglishScore());
        System.out.println("수학 점수 : ");
        printInt(t -> t.getMathScore());
        
        double egavg = avg( s -> s.getEnglishScore());
        System.out.println("영어 평균 점수 : " + egavg );
        
        double mtavg = avg( s -> s.getMathScore());
        System.out.println("수학 평균 점수 : " + mtavg );
    }
    
}
class Student
{

    String name;
    int englishScore;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getEnglishScore()
    {
        return englishScore;
    }
    public void setEnglishScore(int englishScore)
    {
        this.englishScore = englishScore;
    }
    public int getMathScore()
    {
        return mathScore;
    }
    public void setMathScore(int mathScore)
    {
        this.mathScore = mathScore;
    }
    int mathScore;
    public Student(String name, int englishScore, int mathScore)
    {
        super();
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }
  
    
}