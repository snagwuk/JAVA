package ch16_1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaleStudentExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        List<Student> totalList =  Arrays.asList(new Student("ȫ�浿", 10, Student.Sex.MALE,Student.City.Seoul)
                                                 ,new Student("�����", 6, Student.Sex.FEMALE,Student.City.Pusan)
                                                 ,new Student("�ſ��", 10, Student.Sex.MALE,Student.City.Seoul)
                                                 ,new Student("�ڼ���", 6, Student.Sex.FEMALE,Student.City.Seoul)
                                                 ,new Student("�����", 6, Student.Sex.FEMALE,Student.City.Pusan)
                                                 ,new Student("�ſ���", 10, Student.Sex.MALE,Student.City.Pusan)
                                                 ,new Student("�ڻ��", 6, Student.Sex.MALE,Student.City.Seoul));
        
        MaleStudent malestudent = totalList.stream().filter(s -> s.getSex()==Student.Sex.MALE)
                .collect(()->new MaleStudent(),
                         (r, t) -> r.accumulate(t),
                         (r1, r2) -> r1.combine(r2));
     
        malestudent.getList().stream().forEach(s ->    System.out.println(s.getName()));
        
        Map<Student.Sex,List<Student>> mapBySex = totalList.stream()
                .collect(Collectors.groupingBy(Student :: getSex));
        
        System.out.println("[���л�]");
        mapBySex.get(Student.Sex.MALE).stream().forEach(s ->    System.out.println(s.getName()+" "));
        System.out.println("\n[���л�]");
        mapBySex.get(Student.Sex.FEMALE).stream().forEach(s ->    System.out.println(s.getName()+" "));
        System.out.println();
        
        Map<Student.City,List<String>> mapByCity = totalList.stream()
                .collect(Collectors.groupingBy(Student :: getCity,
                                               Collectors.mapping(Student :: getName, Collectors.toList())));
        
        System.out.println("[����]");
        mapByCity.get(Student.City.Seoul).stream().forEach(s ->    System.out.println(s+" "));
        System.out.println("\n[�λ�]");
        mapByCity.get(Student.City.Pusan).stream().forEach(s ->    System.out.println(s+" "));
        System.out.println();
        
    }
    
}
