package parallelStream;

import java.util.Arrays;
import java.util.List;

class Student
{
    String name;
    int score;

    Student(String name , int score)
    {
        this.name=name;
        this.score=score;
    }
    public String getName()
    {
        return this.name;
    }
    public int getScore()
    {
        return  this.score;
    }
}

public class ParallelStreamDemo1 {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("David" , 82),
                new Student("Bob" , 90),
                new Student("John" , 65),
                new Student("Canedy" , 55),
                new Student("Eric" , 85),
                new Student("Smith" , 88),
                new Student("Scott" , 50)
        );

        //using sequential stream
        studentList.stream().filter(s->s.getScore()>=80)
                .limit(3)
                .forEach(stu->System.out.println(stu.getName()+" "+stu.getScore()));

        //using parallel stream
        studentList.parallelStream().filter(s->s.getScore()>=80)
                .limit(3)
                .forEach(stu->System.out.println(stu.getName()+" "+stu.getScore()));

        //converting sequential stream into parallel stream
        studentList.stream().parallel().filter(s->s.getScore()>=80)
                .limit(3)
                .forEach(stu->System.out.println(stu.getName()+" "+stu.getScore()));

    }
}
