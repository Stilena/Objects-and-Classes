package Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List< Students_05> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String studentsData = scanner.nextLine();
            //"Lakia Eason 3.90" -> split(" ") -> ["Lakia", "Eason", "3.90"]
            String[] splittedData = studentsData.split("\\s+"); //["Lakia", "Eason", "3.90"]
            String firstName = splittedData[0];
            String lastName = splittedData[1];
            double grade = Double.parseDouble(splittedData[2]);

            Students_05 student = new  Students_05(firstName, lastName, grade);
            students.add(student);
        }

        List< Students_05> sortedList = students.stream()
                .sorted(Comparator.comparing( Students_05::getGrade).reversed())
                .collect(Collectors.toList());

        for ( Students_05 student : sortedList) {
            System.out.println(student.toString());
        }
    }
}

