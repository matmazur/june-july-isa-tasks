package Task10;



import java.util.List;
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

        Map<String, List<String>> map = getStudentNamesByDepartment(str);

        System.out.println(map.entrySet());

    }


    public static Map<String, List<String>> getStudentNamesByDepartment(Stream<Student> students) {


        Map<String, List<String>> map = students
                .collect(Collectors
                        .groupingBy(s->s.getDepartment(),
                                Collectors.mapping(s->s.getName(),Collectors.toList())));
        return map;

    }
}
