package ch11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.DateFormat.Field;

class Car2
{
    String model;
    String color;
    Car2(){}
    Car2(String model)
    {
        this.model=model;
    }
    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
   
}
public class ReflactionExam
{
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class clazz = Class.forName("ch11.Car2");
        System.out.println("클래스이름");
        System.out.println(clazz.getName());
        System.out.println();
        System.out.println("생성자 정보");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for(Constructor constructor : constructors)
        {
            System.out.println(constructor.getName() );
            Class[] para = constructor.getParameterTypes();
            printParameters(para);
            System.out.println();
        }
        System.out.println();
        System.out.println("필드정보");
        java.lang.reflect.Field[] fields = clazz.getDeclaredFields();
        for(java.lang.reflect.Field field : fields)
        {
            System.out.println(field.getType().getSimpleName() + " " + field.getName());
            
        }
        System.out.println();
        System.out.println("메소드정보");
        Method[] methods  = clazz.getDeclaredMethods();
        for(Method method : methods)
        {
            System.out.println(method.getName());
            Class[] paramaters = method.getParameterTypes();
            printParameters(paramaters);
            
        }
        
        
    }

    @SuppressWarnings("rawtypes")
    private static void printParameters(Class[] para)
    {
        // TODO Auto-generated method stub
        for(int i = 0; i < para.length;i++)
        {
            System.out.println(para[i].getName());
            if(i<para.length-1)
                System.out.println(",");
            
        }
       
    }
}
