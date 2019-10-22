package ch11;

import java.util.ArrayList;

import javax.print.attribute.standard.PresentationDirection;

public class ShallowDeepExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        ArrayList<Person> arryOrg = new ArrayList<Person>();
        
        //원본객체
        Person personOrg = new Person();
        personOrg.setName("홍길동");
        arryOrg.add(personOrg);
        
        //Shallow Copy
        ArrayList<Person> arryShallow =  (ArrayList<Person>)arryOrg.clone();
        
        System.out.println("[Shallow Copy]");
        System.out.println("변경 전 원본 > " + arryShallow.get(0).getName());
        System.out.println("변경 전 복사본 > " + arryShallow.get(0).getName());
        
        //원본변경
        personOrg = arryShallow.get(0);
        personOrg.setName("이순신");
        arryShallow.set(0, personOrg);
        System.out.println("원본 변경 후 > " + arryOrg.get(0).getName());
        System.out.println("원본 변경 후 복사본 > " + arryShallow.get(0).getName());
        
        //Deep Copy
        ArrayList<Person> arryDeep =  new ArrayList<Person>();
        
        Person objDeep = new Person();
        objDeep.setName(arryOrg.get(0).getName());
        arryDeep.add(objDeep);
       
        System.out.println("[Deep Copy]");
        System.out.println("변경 전 원본 > " + arryOrg.get(0).getName());
        System.out.println("변경 전 복사본 > " + arryDeep.get(0).getName());
        
        //원본변경
        personOrg = arryOrg.get(0);
        personOrg.setName("세종대왕");
        arryOrg.set(0, personOrg);
        System.out.println("원본 변경 후 > " + arryOrg.get(0).getName());
        System.out.println("원본 변경 후 복사본 > " + arryDeep.get(0).getName());
        
    }
    
}
class Person
{
    String name;
    String getName()
    {
        return name;
    }
    void setName(String name)
    {
        this.name = name;
    }
}
