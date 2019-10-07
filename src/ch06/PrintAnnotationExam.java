package ch06;

import java.lang.reflect.Method;

public class PrintAnnotationExam
{

    public static void main(String[] args)
    {

        // Service 클래스로부터 메소드를 불러와서 메소드어레이에 저장
        Method[] declareMethods = Service.class.getDeclaredMethods();

        for(Method method : declareMethods)
        {
            if(method.isAnnotationPresent(PrintAnnotation.class))
            {
                PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

                System.out.println("[" + method.getName() + "]");

                for(int i= 0; i < printAnnotation.number();i++)
                    System.out.print(printAnnotation.value());
                System.out.println();


                try{
                    method.invoke(new Service());
                }catch (Exception e) {
                    System.out.println();
                }
            }

        }


    }

}
