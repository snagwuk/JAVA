package ch13;

import java.util.Arrays;
class Person
{
    private String name;
    public Person(String name)
    {
        // TODO Auto-generated constructor stub
        this.name = name;
    }
    String getName()
    {
        return name;
    }
    public String toString()
    {
        return name;
    }
}
class Worker extends Person
{
    public Worker(String name)
    {
        // TODO Auto-generated constructor stub
        super(name);
    }
}
class Student extends Person
{

    public Student(String name)
    {
        super(name);
        // TODO Auto-generated constructor stub
    }
    
}
class HighStudent extends Student
{

    public HighStudent(String name)
    {
        super(name);
        // TODO Auto-generated constructor stub
    }
    
}
class Course<T>
{
    private String name;
    private T[] students;
    
    public Course(String name,int capacity)
    {
        // TODO Auto-generated constructor stub
        this.name = name;
        students = (T[]) (new Object[capacity]);
                
    }
    String getName(){return name;}
    T[] getStudents(){return students;}
    void add(T t)
    {
        for(int i = 0 ; i<students.length;i++)
        {
            if(students[i] == null)
            {
                students[i] = t;
                break;
            }
        }
    }
}

public class WildCardExam
{
    static void registerCourse(Course<?> course)
    {
        System.out.println(course.getName() + " ������ : " + Arrays.toString(course.getStudents()));
    }
    static void registerCourseStudent(Course<? extends Student>  course)
    {
        System.out.println(course.getName() + " ������ : " + Arrays.toString(course.getStudents()));
    }
    static void registerCourseWorker(Course<? super Worker> course)
    {
        System.out.println(course.getName() + " ������ : " + Arrays.toString(course.getStudents()));
    }
    
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Course<Person> personCourse = new Course<Person>("�Ϲ��ΰ���",5);
        personCourse.add(new Person("�Ϲ���"));
        personCourse.add(new Worker("������"));
        personCourse.add(new Student("�л�"));
        personCourse.add(new HighStudent("����л�"));
        
        
        Course<Worker> workerCourse = new Course<Worker>("�����ΰ���",5);
        workerCourse.add(new Worker("������"));
        
        Course<Student> studentCourse = new Course<Student>("�л�����",5);
        studentCourse.add(new Student("�л�"));
        studentCourse.add(new HighStudent("����л�"));
        
        Course<Student> higstudentCourse = new Course<Student>("����л�����",5);
        higstudentCourse.add(new HighStudent("����л�"));
        
        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(higstudentCourse);
        System.out.println();
        
        //registerCourseStudent(personCourse);
       // registerCourseStudent(workerCourse);
        registerCourseStudent(studentCourse);
        registerCourseStudent(higstudentCourse);
        
        registerCourseWorker(personCourse);
        registerCourseWorker(workerCourse);
        
        
        
        
        
    }
    
}














