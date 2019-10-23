package ch11;

public class SystemEnvExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String javahome = System.getenv("JAVA_HOME");
        System.out.println(javahome);
        String test = System.getenv("PATH");
        System.out.println(test);
    }
    
}
