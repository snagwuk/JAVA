package ch11;
interface Action
{
    public void excute();
}
class ReciveAction implements Action
{
    public void excute()
    {
        System.out.println("�����͸� �޽��ϴ�.");
    }
}
class sendAction implements Action
{
    public void excute()
    {
        System.out.println("�����͸� �����ϴ�.");
    }
}
public class NewInstanceExam
{
    
    @SuppressWarnings("rawtypes")
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        try
        {
            Class clazz = Class.forName("ch11.sendAction");
            Action action = (Action) clazz.newInstance();
            action.excute();
        }
        catch (ClassNotFoundException e)
        {
            // TODO: handle exception
            e.printStackTrace();
        }
        catch (InstantiationException e)
        {
            // TODO: handle exception
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    
}
