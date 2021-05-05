package OpinionPoll_03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OpinionPoll_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<ClassOpinionPoll> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String name = input.split("\\s+")[0];
            int age = Integer.parseInt(input.split("\\s+")[1]);
            ClassOpinionPoll person = new ClassOpinionPoll(name, age);
            if (age > 30) {
                persons.add(person);
            }
        }
        List<ClassOpinionPoll> filteredList = persons.stream().filter(p -> p.age() > 30).collect(Collectors.toList());
        filteredList.sort(Comparator.comparing(ClassOpinionPoll::name).thenComparing(ClassOpinionPoll::age));
        for (ClassOpinionPoll person : filteredList ) {
            System.out.println(person);
        }
    }
}
