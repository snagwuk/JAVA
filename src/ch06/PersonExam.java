package ch06;

public class PersonExam
{

    public static void main(String[] args)
    {
        Person p1 = new Person("123456-1234567", "���");
        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        //p1.nation = "usa";
        p1.name ="��������";
        System.out.println(p1.name);


    }

}
