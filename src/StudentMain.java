import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student st1 = new Student(120, "Ruth", 99);
        Student st2 = new Student(116, "Afi", 96);
        Student st3 = new Student(110,"Meklit", 90);
        Student st4 = new Student(112, "Mena", 100);
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);

        System.out.println(st1.equals(st2));

        ComparatorClass c = new ComparatorClass();
        Collections.sort(students,c);
        System.out.println(students);






    }
}
