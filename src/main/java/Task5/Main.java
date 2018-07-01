package Task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Student> students = new ArrayList<>();
        students.add(new Student(23, 88, "David Goodman"));
        students.add(new Student(25, 82, "Mark Rose"));
        students.add(new Student(22, 90, "Jane Doe"));
        students.add(new Student(25, 90, "Jane Dane"));


        System.out.println(sort(students));

    }

    public static String sort(List<Student> students) {


        String names = students
                .stream()
                .sorted(
                        Comparator
                                .comparing(Student::getGpa).reversed()
                                .thenComparingInt(o -> o.getFullName().split(" ")[1].charAt(0))
                                .thenComparing(Student::getAge))
                .map(x -> x.getFullName() + ",")
                .reduce("", String::concat);

        return names.replaceAll("[, ]+$", "");
    }
}


//        Collections.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());
//        Collections.sort(students, (o1, o2) -> (o1.getFullName().split(" ")[1].charAt(0) - (o2.getFullName().split(" ")[1].charAt(0))));
//        Collections.sort(students, (o1, o2) -> o2.getGpa() - o1.getGpa());
//