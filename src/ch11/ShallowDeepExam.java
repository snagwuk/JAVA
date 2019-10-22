package ch11;

import java.util.ArrayList;

import javax.print.attribute.standard.PresentationDirection;

public class ShallowDeepExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        ArrayList<Person> arryOrg = new ArrayList<Person>();
        
        //������ü
        Person personOrg = new Person();
        personOrg.setName("ȫ�浿");
        arryOrg.add(personOrg);
        
        //Shallow Copy
        ArrayList<Person> arryShallow =  (ArrayList<Person>)arryOrg.clone();
        
        System.out.println("[Shallow Copy]");
        System.out.println("���� �� ���� > " + arryShallow.get(0).getName());
        System.out.println("���� �� ���纻 > " + arryShallow.get(0).getName());
        
        //��������
        personOrg = arryShallow.get(0);
        personOrg.setName("�̼���");
        arryShallow.set(0, personOrg);
        System.out.println("���� ���� �� > " + arryOrg.get(0).getName());
        System.out.println("���� ���� �� ���纻 > " + arryShallow.get(0).getName());
        
        //Deep Copy
        ArrayList<Person> arryDeep =  new ArrayList<Person>();
        
        Person objDeep = new Person();
        objDeep.setName(arryOrg.get(0).getName());
        arryDeep.add(objDeep);
       
        System.out.println("[Deep Copy]");
        System.out.println("���� �� ���� > " + arryOrg.get(0).getName());
        System.out.println("���� �� ���纻 > " + arryDeep.get(0).getName());
        
        //��������
        personOrg = arryOrg.get(0);
        personOrg.setName("�������");
        arryOrg.set(0, personOrg);
        System.out.println("���� ���� �� > " + arryOrg.get(0).getName());
        System.out.println("���� ���� �� ���纻 > " + arryDeep.get(0).getName());
        
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
