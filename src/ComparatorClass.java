import java.util.Comparator;

public class ComparatorClass implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        Integer std1 = o1.getScore();
        Integer std2 = o2.getScore();

        return std2.compareTo(std1);
    }
}
