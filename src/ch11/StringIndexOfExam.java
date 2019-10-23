package ch11;

public class StringIndexOfExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String sub = "자바 프로그래밍";
        
        int location = sub.indexOf("프로그래밍");
        System.out.println(location);
        
        if(sub.indexOf("자바") != -1)
        {
            System.out.println("자바와 관련된 책이군요");
        }
        else
            System.out.println("자바와 관련없는 책이군요");
        
        String oldstr = "자바는 객체지향언어입니다. 자바는 풍부한API를 지원합니다.";
        String s1 = oldstr.replace("자바", "JAVA");
        String s2 = oldstr.replace('A', 'a');
        System.out.println(oldstr);
        System.out.println(s1);
        System.out.println(s2);
        
                }
    
}
