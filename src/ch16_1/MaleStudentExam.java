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
        List<Student> totalList =  Arrays.asList(new Student("홍길동", 10, Student.Sex.MALE,Student.City.Seoul)
                                                 ,new Student("김수애", 6, Student.Sex.FEMALE,Student.City.Pusan)
                                                 ,new Student("신용권", 10, Student.Sex.MALE,Student.City.Seoul)
                                                 ,new Student("박수진", 6, Student.Sex.FEMALE,Student.City.Seoul)
                                                 ,new Student("김순이", 6, Student.Sex.FEMALE,Student.City.Pusan)
                                                 ,new Student("신용재", 10, Student.Sex.MALE,Student.City.Pusan)
                                                 ,new Student("박상욱", 6, Student.Sex.MALE,Student.City.Seoul));
        
        MaleStudent malestudent = totalList.stream().filter(s -> s.getSex()==Student.Sex.MALE)
                .collect(()->new MaleStudent(),
                         (r, t) -> r.accumulate(t),
                         (r1, r2) -> r1.combine(r2));
     
        malestudent.getList().stream().forEach(s ->    System.out.println(s.getName()));
        
        Map<Student.Sex,List<Student>> mapBySex = totalList.stream()
                .collect(Collectors.groupingBy(Student :: getSex));
        
        System.out.println("[남학생]");
        mapBySex.get(Student.Sex.MALE).stream().forEach(s ->    System.out.println(s.getName()+" "));
        System.out.println("\n[여학생]");
        mapBySex.get(Student.Sex.FEMALE).stream().forEach(s ->    System.out.println(s.getName()+" "));
        System.out.println();
        
        Map<Student.City,List<String>> mapByCity = totalList.stream()
                .collect(Collectors.groupingBy(Student :: getCity,
                                               Collectors.mapping(Student :: getName, Collectors.toList())));
        
        System.out.println("[서울]");
        mapByCity.get(Student.City.Seoul).stream().forEach(s ->    System.out.println(s+" "));
        System.out.println("\n[부산]");
        mapByCity.get(Student.City.Pusan).stream().forEach(s ->    System.out.println(s+" "));
        System.out.println();
        
    }
    
}
