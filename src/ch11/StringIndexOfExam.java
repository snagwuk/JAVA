package ch11;

public class StringIndexOfExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String sub = "�ڹ� ���α׷���";
        
        int location = sub.indexOf("���α׷���");
        System.out.println(location);
        
        if(sub.indexOf("�ڹ�") != -1)
        {
            System.out.println("�ڹٿ� ���õ� å�̱���");
        }
        else
            System.out.println("�ڹٿ� ���þ��� å�̱���");
        
        String oldstr = "�ڹٴ� ��ü�������Դϴ�. �ڹٴ� ǳ����API�� �����մϴ�.";
        String s1 = oldstr.replace("�ڹ�", "JAVA");
        String s2 = oldstr.replace('A', 'a');
        System.out.println(oldstr);
        System.out.println(s1);
        System.out.println(s2);
        
                }
    
}
