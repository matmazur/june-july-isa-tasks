package Task11;



import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {


    public static void main(String[] args) {


        Student galina = new Student("Galina", 95, "Philology", Student.Gender.FEMALE);
        Student anton = new Student("Anton", 90, "CS", Student.Gender.MALE);
        Student jack = new Student("Jack", 82, "Philology", Student.Gender.MALE);
        Student mike = new Student("Mike", 60, "Philology", Student.Gender.MALE);
        Student jane = new Student("Jane", 65, "CS", Student.Gender.FEMALE);

        Stream<Student> str = Stream.of(galina, anton, jack, mike, jane);

        Map<String, Map<Student.Gender, Long>> map = getTheNumberOfStudentsByGenderForEachDepartment(str);

        System.out.println(map.entrySet());

    }


    public static Map<String, Map<Student.Gender, Long>> getTheNumberOfStudentsByGenderForEachDepartment(Stream<Student> students) {

        //code here...



        Map<String, Map<Student.Gender, Long>> map = students
                .collect(Collectors
                        .groupingBy(s->s.getDepartment(),Collectors
                                .groupingBy(Student::getGender,Collectors.counting())));
        return map;

    }
}
