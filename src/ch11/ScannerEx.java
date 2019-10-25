package ch11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerEx
{
    
    @SuppressWarnings("resource")
    public static void main(String[] args) throws FileNotFoundException
    {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(new File("src\\ch11\\student.txt"));
        StudentZ[] sts = new StudentZ[100];
        int cnt = 0;
        int totalsum = 0;
        System.out.println("IOÁ¤»ó");
        while(sc.hasNextLine())
        {
            String line = sc.nextLine();
            Scanner sc2 = new Scanner(line).useDelimiter(",");
           
           /* int sum = 0;
            sc2.next();
            sc2.next();
            while(sc2.hasNextInt())
            {
                sum += sc2.nextInt();
            }
            System.out.println(line + ", sum = " + sum);
            totalsum += sum;*/
            
            
            sts[cnt] = new StudentZ(sc2.next(), sc2.nextInt(), sc2.nextInt(), sc2.nextInt(),sc2.nextInt());
                    System.out.println(  sts[cnt] );
                    totalsum +=  sts[cnt].sum;
            cnt++;
        }
        System.out.println("Line : " + cnt + ", Total : " + totalsum);
        
        StudentZ[] nsts = Arrays.copyOf(sts,cnt);
        System.out.println(nsts.length);
        
        Arrays.sort(nsts);
        
        for(StudentZ x : nsts)
            System.out.println(x);
                
    }
    
}

class StudentZ implements Comparable
{
    String name;
    int ban;
    int kor;
    int math;
    int eng;
    int sum;
    StudentZ(String name,    int ban,    int kor,    int math,    int eng)
    {
        this.name=name;
        this.ban=ban;
        this.kor=kor;
        this.math=math;
        this.eng=eng;
        this.sum = kor+math+eng;
    }
    @Override
    public int compareTo(Object o)
    {
        // TODO Auto-generated method stub
        StudentZ s = (StudentZ) o;
        return s.eng-eng;
    }
    @Override
    public String toString()
    {
        return "StudentZ [name=" + name + ", ban=" + ban + ", kor=" + kor
                + ", math=" + math + ", eng=" + eng + ", sum=" + sum + "]";
    }
    
    
}
