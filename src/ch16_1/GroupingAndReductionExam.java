package ch16_1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingAndReductionExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        List<Student> totalList =  Arrays.asList(new Student("홍길동", 10, Student.Sex.MALE),new Student("김수애", 8, Student.Sex.FEMALE)
                                                 ,new Student("신용권", 9, Student.Sex.MALE),new Student("박수미", 6, Student.Sex.FEMALE));
        
        Stream<Student> totalStream = totalList.stream();
        Function<Student,Student.Sex> classifier = Student :: getSex;
        ToDoubleFunction<Student> mapper = Student :: getScore;
        Collector<Student, ? , Double> collector1 = Collectors.averagingDouble(mapper);
        Collector<Student, ?, Map<Student.Sex,Double>> collector2 = Collectors.groupingBy(classifier,collector1);
        Map<Student.Sex,Double> mapBySex = totalStream.collect(collector2);
        
        System.out.println("남학생 평균 : " + mapBySex.get(Student.Sex.MALE)  );
        System.out.println("여학생 평균 : " + mapBySex.get(Student.Sex.FEMALE)  );
        
        Map<Student.Sex,String> mapByName = totalList.stream()
                .collect(
                         Collectors.groupingBy(
                                               Student :: getSex, 
                                               Collectors.mapping(
                                                                  Student :: getName, 
                                                                  Collectors.joining(","))));
        
        System.out.println("남학생 전체이름 : " + mapByName.get(Student.Sex.MALE)  );
        System.out.println("여학생 전체이름 : " + mapByName.get(Student.Sex.FEMALE)  );
            
        }
    }
    

