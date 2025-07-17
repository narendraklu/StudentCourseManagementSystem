import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n== Student Course Management ==");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) addStudent();
            else if (choice == 2) listStudents();
            else if (choice == 3) break;
            else System.out.println("Invalid option.");
        }
    }

    static void addStudent() {
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        students.add(new Student(id, name, email));
        System.out.println("✅ Student added.");
    }

    static void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
}
